
package connect4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public final class connect4Game extends javax.swing.JFrame {

    
    static JButton ButtonCol[];
    static int posicionesX[];
    static int posicionesY[];
    static int coordenadasX[];
    static int coordenadasY[];

    public connect4Game() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(900, 800);
        this.setBackground(Color.yellow);
        crearCirculo();
        GenerarButtons();
        play(1);
    }

    public void crearCirculo() {
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
    
    public void circulos1(int posX, int posY, int corX, int corY){
        drawCircle1 crear = new drawCircle1();
        drawCircle1 circulo = crear;
        circulo.setBounds(corX, corY, 130, 130);
        circulo.setText("99");
        circulo.setOpaque(false);
        circulo.setVisible(true);
        mainConnect4.Circulos[posX][posY].setVisible(false);
        this.add(circulo);
    }
    
    public void circulos2(int posX, int posY, int corX, int corY){
        drawCircle2 crear = new drawCircle2();
        drawCircle2 circulo = crear;
        circulo.setBounds(corX, corY, 130, 130);
        circulo.setText("99");
        circulo.setOpaque(false);
        circulo.setVisible(true);
        mainConnect4.Circulos[posX][posY].setVisible(false);
        this.add(circulo);
    }

    public void GenerarButtons() {
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
            this.add(ButtonCol[i]);
            x+=100;
        }
    }
    
    public int checkColumns(int col){
        for (int i=6; i >= 0; i--){
            if(mainConnect4.Circulos[1][i].isVisible())
                return i;
        }
        return -1;
    }
    
    public void play(int col){
        drawCircle circulos = new drawCircle();
        if(col == 1){
            circulos1(posicionesX[0],posicionesY[0], coordenadasX[0], coordenadasY[0]);
        }else if(col == 2){
            
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setSize(900,800);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JUGAR CONNECT4");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 727, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(969, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
