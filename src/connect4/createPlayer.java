
package connect4;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class createPlayer extends javax.swing.JFrame {


    public createPlayer() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Crear Jugador");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        userTxt = new javax.swing.JTextField();
        jDay = new javax.swing.JComboBox<>();
        jMonth = new javax.swing.JComboBox<>();
        jYear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CREAR JUGADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 29));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE COMPLETO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("FECHA DE NACIMIENTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 330, -1));

        createButton.setBackground(new java.awt.Color(255, 204, 204));
        createButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createButton.setText("CREAR JUGADOR");
        createButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 170, 31));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 170, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 330, -1));

        userTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 330, -1));

        jDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 50, -1));

        jMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 50, -1));
        jPanel1.add(jYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        String user = userTxt.getText();
        String pass = passTxt.getText();
        String name = nameTxt.getText();
        String year1 = jYear.getText();
        int year=0;
        
        if (!year1.equals(""))
            year = Integer.parseInt(jYear.getText());

        Calendar fechaNac = Calendar.getInstance();
        
        int day = Integer.parseInt(jDay.getSelectedItem().toString());
        int month = Integer.parseInt(jMonth.getSelectedItem().toString());
        
        fechaNac.set(year, month, day);
        
        if (user.equals("") || pass.equals("") || name.equals("") || year1.equals("")){
            JOptionPane.showMessageDialog(null, "Uno o varios de los campos esta vacio", "Hey!", JOptionPane.ERROR_MESSAGE);
        }else if (mainConnect4.people.isEmpty() == false){
            int i;
            for (i = 0 ; i < mainConnect4.people.size(); i++){
                if (mainConnect4.people.get(i).getUsername().equals(user)){
                    JOptionPane.showMessageDialog(null, "Ya existe un jugador con ese usuario, no se ha creado", "Hey!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            if (i >= mainConnect4.people.size()){
                people j = new people(user, pass, name, fechaNac);
                player p = new player(user, pass, name, fechaNac);
                mainConnect4.people.add(j);
                mainConnect4.players.add(p);
                JOptionPane.showMessageDialog(null, "El jugador se ha creado exitosamente");
            }
            }else{
                people j = new people(user, pass, name, fechaNac);
                player p = new player(user, pass, name, fechaNac);
                mainConnect4.people.add(j);
                mainConnect4.players.add(p);
                JOptionPane.showMessageDialog(null, "El jugador se ha creado exitosamente");
        }
        userTxt.setText("");
        passTxt.setText("");
        nameTxt.setText("");
        jYear.setText("");
    }//GEN-LAST:event_createButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        menuInicio inicio = new menuInicio();
        inicio.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jDay;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jMonth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jYear;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
