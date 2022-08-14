
package connect4;

import javax.swing.JOptionPane;

public class reportes extends javax.swing.JFrame {
    people player1;
    public reportes(people player1) {
        initComponents();
        setLocationRelativeTo(null);
        this.player1 = player1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profileButton3 = new javax.swing.JButton();
        profileButton4 = new javax.swing.JButton();
        profileButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("REPORTES");

        profileButton3.setBackground(new java.awt.Color(255, 204, 204));
        profileButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton3.setText("MIS ULTIMOS JUEGOS");
        profileButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton3ActionPerformed(evt);
            }
        });

        profileButton4.setBackground(new java.awt.Color(255, 204, 204));
        profileButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton4.setText("REGRESAR AL MENU");
        profileButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton4ActionPerformed(evt);
            }
        });

        profileButton5.setBackground(new java.awt.Color(255, 204, 204));
        profileButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileButton5.setText("RANKING");
        profileButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        profileButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(profileButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(profileButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(profileButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton3ActionPerformed
        JOptionPane.showMessageDialog(null, player1.printGames());
    }//GEN-LAST:event_profileButton3ActionPerformed

    private void profileButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_profileButton4ActionPerformed

    private void profileButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButton5ActionPerformed
    }//GEN-LAST:event_profileButton5ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileButton3;
    private javax.swing.JButton profileButton4;
    private javax.swing.JButton profileButton5;
    // End of variables declaration//GEN-END:variables
}
