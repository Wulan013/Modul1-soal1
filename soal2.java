/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas1pemvis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author 62813
 */
public class soal2 extends javax.swing.JFrame {
    Timer timer;
    
    int angka;
    /**
     * Creates new form soal2
     */
    public soal2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eStop = new javax.swing.JButton();
        eMulai = new javax.swing.JButton();
        eAngka = new javax.swing.JTextField();
        eLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas1pemvis/Picture1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("NANTI GANTENGNYA KELEWATAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("KAMU JANGAN IKUTAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CUKUP ANGKA YANG MUNDUR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        eStop.setText("STOP");
        eStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eStopActionPerformed(evt);
            }
        });
        getContentPane().add(eStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        eMulai.setText("MULAI");
        eMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(eMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        eAngka.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        eAngka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eAngka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eAngkaKeyReleased(evt);
            }
        });
        getContentPane().add(eAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 70));

        eLabel.setBackground(new java.awt.Color(255, 255, 255));
        eLabel.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        eLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(eLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ANGKA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("MENGHITUNG MUNDUR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas1pemvis/WhatsApp Image 2023-09-26 at 17.26.09 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMulaiActionPerformed
        // TODO add your handling code here:
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               if(angka > 0){
                   angka--;
                   eLabel.setText(Integer.toString(angka)); // Update label ehitung
                } else {
                    timer.stop(); // Hentikan timer ketika angka mencapai 0
                    JOptionPane.showMessageDialog(null, "Hitungannya Selesai Kayak Hubungan Kita");
                }
            }
        });
      timer.start();
    }//GEN-LAST:event_eMulaiActionPerformed

    private void eAngkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eAngkaKeyReleased
        // TODO add your handling code here:
        eLabel.setText(""+eAngka.getText());
        angka = Integer.parseInt(eAngka.getText());
    }//GEN-LAST:event_eAngkaKeyReleased

    private void eStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eStopActionPerformed
        // TODO add your handling code here:
         timer.stop();
    }//GEN-LAST:event_eStopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eAngka;
    private javax.swing.JLabel eLabel;
    private javax.swing.JButton eMulai;
    private javax.swing.JButton eStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
