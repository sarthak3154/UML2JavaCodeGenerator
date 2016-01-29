package umlmodeling;

import java.io.File;
import javax.swing.JFrame;


public class frmMenu extends javax.swing.JFrame {
    
    /* Creates new form frmMenu */
    public frmMenu() {
        initComponents();
        fc.addChoosableFileFilter(new MyFilter());
    }
    
    class MyFilter extends javax.swing.filechooser.FileFilter {       
        public String getDescription() {
            return "*.uml";
        }

        @Override
        public boolean accept(File f) {
            String filename = f.getName();
            return filename.endsWith(".uml");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdUML = new javax.swing.JToggleButton();
        cmdExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fc = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdUML.setText("New UML/Use Case");
        cmdUML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUMLActionPerformed(evt);
            }
        });

        cmdExit.setText("Good Bye");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("UML/Use Case Modelling Tool");

        fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdExit, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdUML))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(cmdUML)
                .addGap(18, 18, 18)
                .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdUMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUMLActionPerformed
        // TODO add your handling code here:
        frmUML frm=new frmUML("");
        frm.setExtendedState(frm.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        frm.setVisible(true);
        
    }//GEN-LAST:event_cmdUMLActionPerformed

    private void fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcActionPerformed
        // TODO add your handling code here:
        if(fc.getSelectedFile()!=null){
            frmUML frm=new frmUML(fc.getSelectedFile().getPath());
            frm.setExtendedState(frm.getExtendedState()|JFrame.MAXIMIZED_BOTH);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_fcActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JToggleButton cmdUML;
    private javax.swing.JFileChooser fc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}