
package connect4;

import javax.swing.JOptionPane;

public class login2 extends javax.swing.JFrame{

    people player1, player2;
    
    public login2(people player1) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.player1 = player1;
    }
    
    public people searchPerson(String user){
        for (people p: mainConnect4.people){
            if(p.getUsername().equals(user))
                return p;
        }
        return null;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        passTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        profileButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(255, 204, 204));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setText("INICIAR SESION");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESION PLAYER 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 29));

        profileButton3.setBackground(new java.awt.Color(255, 204, 204));
        profileButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton3.setText("REGRESAR AL MENU");
        profileButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String user = userTxt.getText();
        String pass = passTxt.getText();
        
        if (user.equals(player1.getUsername())){
            JOptionPane.showMessageDialog(null, "No se puede iniciar sesion con el mismo jugador", "Hey!", JOptionPane.ERROR_MESSAGE);
            int opcion = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo?", "Elija una opcion", 0);
            if (opcion == 1){
                this.dispose();
            }
        }else {
            if (searchPerson(user) != null){
                people p = searchPerson(user);
                if (p.getUsername().equals(user) && p.getPassword().equals(pass)){
                    JOptionPane.showMessageDialog(null, "Bienvenido " + p.getUsername());
                    player2 = p;
                    connect4Game jugar = new connect4Game(player1, player2);
                    jugar.setVisible(true);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Hey!", JOptionPane.ERROR_MESSAGE);
                    int opcion2 = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo?", "Elija una opcion", 0);
                    if (opcion2 == 1)
                       this.dispose();
            }
        }
        userTxt.setText("");
        passTxt.setText("");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void profileButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();    
    }//GEN-LAST:event_profileButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JButton profileButton3;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
