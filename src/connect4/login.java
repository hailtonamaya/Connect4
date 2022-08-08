
package connect4;

import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
    

    public login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 29));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, -1));

        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

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
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 40));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String user = userTxt.getText();
        String pass = passTxt.getText();
        if (mainConnect4.people.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No se ha creado ningun jugador, favor crear uno", "Hey!", JOptionPane.ERROR_MESSAGE);
        }else if (searchPerson(user) != null){
            people p = searchPerson(user);
            if (p.getUsername().equals(user) && p.getPassword().equals(pass)){
                JOptionPane.showMessageDialog(null, "Bienvenido " + p.getUsername());
                menuPrincipal menuPrin = new menuPrincipal(p);
                menuPrin.setVisible(true);
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Hey!", JOptionPane.ERROR_MESSAGE);
        }
        
        userTxt.setText("");
        passTxt.setText("");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        menuInicio inicio = new menuInicio();
        inicio.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
