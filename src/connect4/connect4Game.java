/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package connect4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author Hailton
 */
public class connect4Game extends javax.swing.JFrame {

    static JLabel LabelCol[];

    /**
     * Creates new form connect4Game
     */
    public connect4Game() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(900, 800);
        this.setBackground(Color.yellow);
        crearCirculo();
        GenerarLabels();
    }

    public void crearCirculo() {
        int x1 = 0;
        for (int x = 100; x < 800; x += 100) {
            int y2 = 0;
            for (int y = 160; y < 760; y += 100) {
                drawCircle crear = new drawCircle();
                mainConnect4.Circulos[x1][y2] = crear;
                mainConnect4.Circulos[x1][y2].setBounds(x, y, 92, 92);
                mainConnect4.Circulos[x1][y2].setText("99");
                mainConnect4.Circulos[x1][y2].setOpaque(false);
                mainConnect4.Circulos[x1][y2].setVisible(true);
                this.add(mainConnect4.Circulos[x1][y2]);
                y2++;
            }
            x1++;
        }
    }

    public void GenerarLabels() {
        LabelCol = new JLabel[7];
        for (int i = 0; i < 7; i++) {
            int y = i + 1;
            JLabel label = new JLabel();
            LabelCol[i] = label;
            LabelCol[i].setBounds(50, 50, 50, 50);
            LabelCol[i].setText("" + y);
            LabelCol[i].setBackground(Color.red);
            LabelCol[i].setOpaque(false);
            LabelCol[i].setVisible(true);
            this.add(LabelCol[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColumn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setSize(900,800);

        jColumn1.setText("1");
        jColumn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColumn1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");

        jButton3.setText("3");

        jButton4.setText("4");

        jButton5.setText("5");

        jButton6.setText("6");

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jColumn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jColumn1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(732, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jColumn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColumn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jColumn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jColumn1;
    // End of variables declaration//GEN-END:variables
}
