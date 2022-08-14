
package connect4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.JOptionPane;


public final class connect4Game extends javax.swing.JFrame {

    private people player1, player2;
    private int turno=1;
    private static JButton ButtonCol[];
    static int posicionesX[];
    static int posicionesY[];
    static int coordenadasX[];
    static int coordenadasY[];
    static drawCircle1 circulos1[][];
    static drawCircle2 circulos2[][];
    
    public connect4Game(people player1, people player2) {
        initComponents();
        this.player1 = player1;
        this.player2 = player2;
        this.setLocationRelativeTo(null);
        this.setSize(900, 800);
        this.setBackground(Color.yellow);
        crearCirculo();
        GenerarButtons();
        circulos1 = new drawCircle1[7][6];
        circulos2 = new drawCircle2[7][6];
        if(turno == 1)
            Titulo.setText("Turno de "+player1.getUsername());
        else if (turno == 2)
            Titulo.setText("Turno de "+player2.getUsername());
    }

    private void crearCirculo() {
        posicionesX = new int[7];
        posicionesY = new int[6];
        coordenadasX = new int[7];
        coordenadasY = new int[6];
        int x1 = 0;
        for (int x = 100; x < 800; x += 100) {
            int y2 = 0;
            for (int y = 160; y < 760; y += 100) {
                drawCircle crear = new drawCircle();
                mainConnect4.Circulos[x1][y2] = crear;
                mainConnect4.Circulos[x1][y2].setBounds(x, y, 130, 130);
                mainConnect4.Circulos[x1][y2].setText("99");
                mainConnect4.Circulos[x1][y2].setOpaque(false);
                mainConnect4.Circulos[x1][y2].setVisible(true);
                coordenadasX[x1] = x;
                coordenadasY[y2] = y;
                posicionesX[x1] = x1;
                posicionesY[y2] =y2;
                this.add(mainConnect4.Circulos[x1][y2]);
                
                y2++;
            }
            x1++;
        }
    }
    
    private void circulos1(int posX, int posY, int corX, int corY){
        drawCircle1 crear = new drawCircle1();
        drawCircle1 circulo = crear;
        circulo.setBounds(corX, corY, 130, 130);
        circulo.setText("99");
        circulo.setOpaque(false);
        circulo.setVisible(true);
        mainConnect4.Circulos[posX][posY].setVisible(false);
        circulos1[posX][posY] = circulo;
        this.add(circulo);
    }
    
    private void circulos2(int posX, int posY, int corX, int corY){
        drawCircle2 crear = new drawCircle2();
        drawCircle2 circulo = crear;
        circulo.setBounds(corX, corY, 130, 130);
        circulo.setText("99");
        circulo.setOpaque(false);
        circulo.setVisible(true);
        mainConnect4.Circulos[posX][posY].setVisible(false);
        circulos2[posX][posY] = circulo;
        this.add(circulo);
    }

    private void GenerarButtons() {
        ButtonCol = new JButton[7];
        int x = 120;
        for (int i = 0; i < 7; i++) {
            int z = i + 1;
            JButton label = new JButton();
            Border border = LineBorder.createBlackLineBorder();
            ButtonCol[i] = label;
            ButtonCol[i].setBounds(x, 100, 50, 20);
            ButtonCol[i].setText("" + z);
            ButtonCol[i].setHorizontalAlignment(SwingConstants.CENTER);
            ButtonCol[i].setBorder(border);
            ButtonCol[i].setOpaque(true);
            ButtonCol[i].setBackground(Color.decode("#ff6666"));
            ButtonCol[i].setVisible(true);
            ButtonCol[i].addActionListener(accion(i));
            this.add(ButtonCol[i]);
            x+=100;
            
        }
    }
    
    private ActionListener accion(int num){
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                play(num, turno);
            }
        };
        return accion;
    }
    
    private int checkColumns(int col){
        for (int i=5; i >= 0; i--){
            if(mainConnect4.Circulos[col][i].isVisible())
                return i;
        }
        return -1;
    }
    
    private void play(int col, int player){
        if(player == 1){
            if(checkColumns(col) == -1)
                JOptionPane.showMessageDialog(null, "Esa columna ya esta llena");
            else{
                circulos1(col,checkColumns(col), coordenadasX[col], coordenadasY[checkColumns(col)]);
                if (checkWinnerVertical(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if(checkWinnerVertical(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player2.sumarPuntos(3);
                    this.dispose();
                }if (checkWinnerHorizontal(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if(checkWinnerHorizontal(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player2.sumarPuntos(3);
                    this.dispose();
                }if (checkWinnerDiagonal(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if (checkWinnerDiagonal(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }if(checkColumns(0)==-1 && checkColumns(1)==-1 && checkColumns(3)==-1 && checkColumns(4)==-1 && checkColumns(5)==-1 && checkColumns(6)==-1){
                    JOptionPane.showMessageDialog(null, "Se ha empatado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Hubo un empate ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    this.dispose();
                }
                if (turno == 1){
                    turno = 2;
                    Titulo.setText("Turno de "+player2.getUsername());
                }else if (turno == 2){
                    turno = 1;
                    Titulo.setText("Turno de "+player1.getUsername());
                }
            }
        }else if(player == 2){
            if(checkColumns(col) == -1)
                JOptionPane.showMessageDialog(null, "Esa columna ya esta llena");
            else{
                circulos2(col,checkColumns(col), coordenadasX[col], coordenadasY[checkColumns(col)]);
                if (checkWinnerVertical(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if(checkWinnerVertical(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player2.sumarPuntos(3);
                    this.dispose();
                }if (checkWinnerHorizontal(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if(checkWinnerHorizontal(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player2.sumarPuntos(3);
                    this.dispose();
                }if (checkWinnerDiagonal(turno)==1){
                    JOptionPane.showMessageDialog(null, "El jugador 1 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Se le gano a " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player1.sumarPuntos(3);
                    this.dispose();
                }else if (checkWinnerDiagonal(turno)==2){
                    JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Perdi ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    player2.sumarPuntos(3);
                    this.dispose();
                }if(checkColumns(0)==-1 && checkColumns(1)==-1 && checkColumns(3)==-1 && checkColumns(4)==-1 && checkColumns(5)==-1 && checkColumns(6)==-1){
                    JOptionPane.showMessageDialog(null, "Se ha empatado");
                    Calendar fechaActual = Calendar.getInstance();
                    player1.addMessage("Hubo un empate ante " + player2.getUsername());
                    player1.addDate(fechaActual);
                    this.dispose();
                }
                if (turno == 1){
                    turno = 2;
                    Titulo.setText("Turno de "+player2.getUsername());
                }else if (turno == 2){
                    turno = 1;
                    Titulo.setText("Turno de "+player1.getUsername());
                }
            }
        }
    }
    
    private int checkWinnerVertical(int player){
        if (player==1){
            int contador=0;
            for (int x=6; x>=0; x--){
                for (int y=5; y>=0; y--){
                    if(contador==4){
                        return player; 
                    }else{
                        if(circulos1[x][y]!=null)
                           contador++;
                        else if(circulos1[x][y]==null)
                           contador=0;
                    }
                }
            }
        }else if(player==2){
            int contador=0;
            for (int x=6; x>=0; x--){
                for (int y=5; y>=0; y--){
                    if(contador==4){
                        return player; 
                    }else{
                        if(circulos2[x][y]!=null)
                           contador++;
                        else if(circulos2[x][y]==null)
                           contador=0;
                    }
                }
            }
        }
        return 0;
    }
    
    private int checkWinnerHorizontal(int player){
        
        if(player==1){
            int contador=0;
            for (int y=5; y>=0; y--){
                for (int x=6; x>=0; x--){
                    if(contador==4){
                        return player; 
                    }else{
                        if(circulos1[x][y]!=null)
                           contador++;
                        else if(circulos1[x][y]==null)
                           contador=0;
                    }
                }
            }
        }else if(player==2){
            int contador=0;
            for (int y=5; y>=0; y--){
                for (int x=6; x>=0; x--){
                    if(contador==4){
                        return player; 
                    }else{
                        if(circulos2[x][y]!=null)
                           contador++;
                        else if(circulos2[x][y]==null)
                           contador=0;
                    }
                }
            }
        }
        
        return 0;
    }
    
    private int checkWinnerDiagonal(int player){
        if (player ==1){
        for (int i=0; i<=6; i++){
            int x=i;
            int contador=0;
            for (int y=5; y>=0; y--){
                if(x==7)
                    x=0;
                if(contador==4)
                    return player;
                if(circulos1[x][y]!=null)
                    contador++;
                if(circulos1[x][y]==null)
                    contador=0;
                x++;
            }
        }
        
        for (int i=5; i>=0; i--){
            int y=i;
            int contador=0;
            for (int x=0; x<7; x++){
                if(y==-1)
                    y=0;
                if(contador==4)
                    return player;
                if(circulos1[x][y]!=null && y<=circulos1.length && x<=circulos1[0].length)
                    contador++;
                if(circulos1[x][y]==null && y<=circulos1.length && x<=circulos1[0].length)
                    contador=0;
                y--;
            }
        }
        
        for (int i=6; i>=0; i--){
            int x=i;
            int contador=0;
            for (int y=5; y>=0; y--){
                if(x==-1)
                    x=6;
                if(contador==4)
                    return player;
                if(circulos1[x][y]!=null)
                    contador++;
                if(circulos1[x][y]==null)
                    contador=0;
                x--;
            }
        }
        
        for (int i=5; i>=0; i--){
            int y=i;
            int contador=0;
            for (int x=6; x>=0; x--){
                if(y==-1)
                    y=0;
                if(contador==4)
                    return player;
                if(circulos1[x][y]!=null && y<=circulos1.length && x<=circulos1[0].length)
                    contador++;
                if(circulos1[x][y]==null && y<=circulos1.length && x<=circulos1[0].length)
                    contador=0;
                y--;
            }
        }
        }else if(turno == 2){
        for (int i=0; i<=6; i++){
            int x=i;
            int contador=0;
            for (int y=5; y>=0; y--){
                if(x==7)
                    x=0;
                if(contador==4)
                    return player;
                if(circulos2[x][y]!=null)
                    contador++;
                if(circulos2[x][y]==null)
                    contador=0;
                x++;
            }
        }
        
        for (int i=5; i>=0; i--){
            int y=i;
            int contador=0;
            for (int x=0; x<7; x++){
                if(y==-1)
                    y=0;
                if(contador==4)
                    return player;
                if(circulos2[x][y]!=null && y<=circulos1.length && x<=circulos1[0].length)
                    contador++;
                if(circulos2[x][y]==null && y<=circulos1.length && x<=circulos1[0].length)
                    contador=0;
                y--;
            }
        }
        
        for (int i=6; i>=0; i--){
            int x=i;
            int contador=0;
            for (int y=5; y>=0; y--){
                if(x==-1)
                    x=6;
                if(contador==4)
                    return player;
                if(circulos2[x][y]!=null)
                    contador++;
                if(circulos2[x][y]==null)
                    contador=0;
                x--;
            }
        }
        
        for (int i=5; i>=0; i--){
            int y=i;
            int contador=0;
            for (int x=6; x>=0; x--){
                if(y==-1)
                    y=0;
                if(contador==4)
                    return player;
                if(circulos2[x][y]!=null && y<=circulos1.length && x<=circulos1[0].length)
                    contador++;
                if(circulos2[x][y]==null && y<=circulos1.length && x<=circulos1[0].length)
                    contador=0;
                y--;
            }
        } 
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setSize(900,800);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("JUGAR CONNECT4");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 727, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("RETIRARSE");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(923, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea retirarse del juego?", "Elija una opcion", 0);
        if (opcion == 0){
            if (turno == 1){
                Calendar fechaActual = Calendar.getInstance();
                player1.addMessage("Me retire ante " + player2.getUsername());
                player1.addDate(fechaActual);
                player2.sumarPuntos(3);
            }else if (turno == 2){
                Calendar fechaActual = Calendar.getInstance();
                player1.addMessage(player2.getUsername() + " se retiro del juego");
                player1.addDate(fechaActual);
                player1.sumarPuntos(3);
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
