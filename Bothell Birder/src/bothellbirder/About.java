/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bothellbirder;

import java.awt.Toolkit;

/**
 *
 * @author cranzy
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/bothellbirder/images/bird1.jpg"));
        //set aboutOkJButton as default
        this.getRootPane().setDefaultButton(aboutOkJButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutTitleJLabel = new javax.swing.JLabel();
        aboutPictureJLabel = new javax.swing.JLabel();
        aboutCopyrightJLabel = new javax.swing.JLabel();
        aboutOkJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        aboutTitleJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aboutTitleJLabel.setForeground(new java.awt.Color(255, 0, 51));
        aboutTitleJLabel.setText("Bothell Birder About Form");
        aboutTitleJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        aboutPictureJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bothellbirder/images/American Goldfinch.jpg"))); // NOI18N

        aboutCopyrightJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutCopyrightJLabel.setText("Copy Right 2012");

        aboutOkJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutOkJButton.setText("OK");
        aboutOkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutOkJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(aboutTitleJLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutPictureJLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(aboutCopyrightJLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aboutOkJButton)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(aboutTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aboutPictureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(aboutCopyrightJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(aboutOkJButton)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-270)/2, (screenSize.height-199)/2, 270, 199);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutOkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutOkJButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aboutOkJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutCopyrightJLabel;
    private javax.swing.JButton aboutOkJButton;
    private javax.swing.JLabel aboutPictureJLabel;
    private javax.swing.JLabel aboutTitleJLabel;
    // End of variables declaration//GEN-END:variables
}
