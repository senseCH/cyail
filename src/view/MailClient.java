/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author segessemann
 * @version 1.0
 * 
 * Mail Client Ansicht wird erzeugt.
 * 
 * Erstellt mit dem Netbeans Swing Editor
 * Bitte keine Variabeln unbenennen, da sonst der Editor nicht mehr funktioniert
 */
public class MailClient extends javax.swing.JFrame {

    /**
     * Creates new form MailClient
     */
    public MailClient() {
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

        jPanelHeader = new javax.swing.JPanel();
        jToolBarHeader = new javax.swing.JToolBar();
        jButtonNewFolder = new javax.swing.JButton();
        jButtonDeleteFolder = new javax.swing.JButton();
        jButtonNewMail = new javax.swing.JButton();
        jButtonDeleteMail = new javax.swing.JButton();
        jSplitPane = new javax.swing.JSplitPane();
        jScrollPaneMailTree = new javax.swing.JScrollPane();
        jMailTree = new javax.swing.JTree();
        jScrollPaneMailTable = new javax.swing.JScrollPane();
        jMailTable = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemAccSettings = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuSettings = new javax.swing.JMenu();
        jMenuItemVersion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Mail");

        jToolBarHeader.setFloatable(false);
        jToolBarHeader.setRollover(true);
        jToolBarHeader.setBorderPainted(false);

        jButtonNewFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/addfolder.png"))); // NOI18N
        jButtonNewFolder.setText("add Folder");
        jButtonNewFolder.setFocusable(false);
        jButtonNewFolder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNewFolder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNewFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewFolderActionPerformed(evt);
            }
        });
        jToolBarHeader.add(jButtonNewFolder);

        jButtonDeleteFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/delfolder.png"))); // NOI18N
        jButtonDeleteFolder.setText("delete Folder");
        jButtonDeleteFolder.setFocusable(false);
        jButtonDeleteFolder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDeleteFolder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDeleteFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFolderActionPerformed(evt);
            }
        });
        jToolBarHeader.add(jButtonDeleteFolder);

        jButtonNewMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/create.png"))); // NOI18N
        jButtonNewMail.setText("new Mail");
        jButtonNewMail.setFocusable(false);
        jButtonNewMail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNewMail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNewMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewMailActionPerformed(evt);
            }
        });
        jToolBarHeader.add(jButtonNewMail);

        jButtonDeleteMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/delMail.png"))); // NOI18N
        jButtonDeleteMail.setText("delete Mail");
        jButtonDeleteMail.setFocusable(false);
        jButtonDeleteMail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDeleteMail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarHeader.add(jButtonDeleteMail);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBarHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBarHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jMailTree.setDragEnabled(true);
        jMailTree.setEditable(true);
        jMailTree.setName(""); // NOI18N
        jMailTree.setPreferredSize(new java.awt.Dimension(120, 64));
        jMailTree.setShowsRootHandles(true);
        jScrollPaneMailTree.setViewportView(jMailTree);

        jSplitPane.setLeftComponent(jScrollPaneMailTree);

        jMailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Subject", "Sender", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jMailTable.setPreferredSize(new java.awt.Dimension(30, 64));
        jScrollPaneMailTable.setViewportView(jMailTable);

        jSplitPane.setRightComponent(jScrollPaneMailTable);

        jMenuFile.setText("File");

        jMenuItemAccSettings.setText("Account Settings");
        jMenuItemAccSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccSettingsActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemAccSettings);

        jMenuItemExit.setText("Quit");
        jMenuFile.add(jMenuItemExit);

        jMenuBar.add(jMenuFile);

        jMenuSettings.setText("?");

        jMenuItemVersion.setText("Version");
        jMenuSettings.add(jMenuItemVersion);

        jMenuBar.add(jMenuSettings);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewFolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewFolderActionPerformed

    private void jButtonDeleteFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteFolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteFolderActionPerformed

    private void jButtonNewMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewMailActionPerformed

    private void jMenuItemAccSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccSettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAccSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(MailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteFolder;
    private javax.swing.JButton jButtonDeleteMail;
    private javax.swing.JButton jButtonNewFolder;
    private javax.swing.JButton jButtonNewMail;
    private javax.swing.JTable jMailTable;
    private javax.swing.JTree jMailTree;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemAccSettings;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemVersion;
    private javax.swing.JMenu jMenuSettings;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPaneMailTable;
    private javax.swing.JScrollPane jScrollPaneMailTree;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JToolBar jToolBarHeader;
    // End of variables declaration//GEN-END:variables
}
