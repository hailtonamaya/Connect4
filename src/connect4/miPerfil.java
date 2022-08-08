
package connect4;

import javax.swing.JOptionPane;

public class miPerfil extends javax.swing.JFrame {

    private people jugador;
    
    public miPerfil(people jugador) {
        initComponents();
        setLocationRelativeTo(null);
        this.jugador = jugador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profileButton1 = new javax.swing.JButton();
        profileButton2 = new javax.swing.JButton();
        profileButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("MI PERFIL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 29));

        profileButton1.setBackground(new java.awt.Color(255, 204, 204));
        profileButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton1.setText("EDITAR PERFIL");
        profileButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, 40));

        profileButton2.setBackground(new java.awt.Color(255, 204, 204));
        profileButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton2.setText("ELIMINAR CUENTA");
        profileButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, 40));

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
        jPanel1.add(profileButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton1ActionPerformed
        // TODO add your handling code here:
        editarPerfil editarPerfil = new editarPerfil(jugador);
        editarPerfil.setVisible(true);
    }//GEN-LAST:event_profileButton1ActionPerformed

    private void profileButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton2ActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea elimnar su perfil?", "Elija una opcion", 0);
        if (opcion == 0){
            mainConnect4.people.remove(jugador);
            JOptionPane.showMessageDialog(null, "Su usuario se ha removido exitosamente");
            this.dispose();
        }
         
    }//GEN-LAST:event_profileButton2ActionPerformed

    private void profileButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        menuPrincipal menuPrincipal = new menuPrincipal(jugador);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_profileButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileButton1;
    private javax.swing.JButton profileButton2;
    private javax.swing.JButton profileButton3;
    // End of variables declaration//GEN-END:variables
}
