
package connect4;

import javax.swing.JOptionPane;

public class menuPrincipal extends javax.swing.JFrame {

    private people jugador;
    
    public menuPrincipal(people jugador) {
        initComponents();
        setLocationRelativeTo(null);
        this.jugador = jugador;
        jLabel1.setText("Hola " + jugador.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        playButton1 = new javax.swing.JButton();
        reportsButton1 = new javax.swing.JButton();
        profileButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 260, 29));

        logoutButton.setBackground(new java.awt.Color(255, 204, 204));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setText("CERRAR SESION");
        logoutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, 40));

        playButton1.setBackground(new java.awt.Color(255, 204, 204));
        playButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playButton1.setText("JUGAR CONNECT FOUR");
        playButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        playButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(playButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 40));

        reportsButton1.setBackground(new java.awt.Color(255, 204, 204));
        reportsButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reportsButton1.setText("REPORTES");
        reportsButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        reportsButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reportsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(reportsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 40));

        profileButton1.setBackground(new java.awt.Color(255, 204, 204));
        profileButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton1.setText("MI PERFIL");
        profileButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        menuInicio menuInicio = new menuInicio();
        menuInicio.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void playButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButton1ActionPerformed
        // TODO add your handling code here:
        login2 login2 = new login2(jugador);
        login2.setVisible(true);
    }//GEN-LAST:event_playButton1ActionPerformed

    private void reportsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButton1ActionPerformed
        // TODO add your handling code here:
        reportes reportes = new reportes(jugador);
        reportes.setVisible(true);
    }//GEN-LAST:event_reportsButton1ActionPerformed

    private void profileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton1ActionPerformed
        // TODO add your handling code here:
        miPerfil miPerfil = new miPerfil(jugador);
        miPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton playButton1;
    private javax.swing.JButton profileButton1;
    private javax.swing.JButton reportsButton1;
    // End of variables declaration//GEN-END:variables
}
