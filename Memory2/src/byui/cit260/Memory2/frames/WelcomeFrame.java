/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.frames;

import memory2.Player;

/**
 *
 * @author Karalee Foster
 */
public class WelcomeFrame extends javax.swing.JFrame {
Player myPlayer = new Player();
    /**
     * Creates new form WelcomeFrame
     */
    public WelcomeFrame() {
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

        jbWelcome = new javax.swing.JLabel();
        jbGoToMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbWelcome.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jbWelcome.setText("Welcome");

        jbGoToMainMenu.setText("go to main menu");
        jbGoToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jbGoToMainMenu)
                .addContainerGap(129, Short.MAX_VALUE))
            .addComponent(jbWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jbGoToMainMenu)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGoToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoToMainMenuActionPerformed
        this.jbWelcome.setText(
                "Welcome " + myPlayer.name + " to the game of Memory" );
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
         this.dispose();
    }//GEN-LAST:event_jbGoToMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbGoToMainMenu;
    private javax.swing.JLabel jbWelcome;
    // End of variables declaration//GEN-END:variables
}
