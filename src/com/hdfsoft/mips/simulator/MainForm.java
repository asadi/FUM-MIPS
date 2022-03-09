/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package com.hdfsoft.mips.simulator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame 
{
    FumMips fumMips = new FumMips();
   
    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jTable5 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnLoadFromFile = new javax.swing.JButton();
        btnInitialize = new javax.swing.JButton();
        btnStep = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        edtCommandBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("pnlCode"); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setName("npl"); // NOI18N

        jPanel9.setLayout(new java.awt.CardLayout());

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.getTableHeader().setResizingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jPanel9.add(jTable3, "card2");

        jScrollPane2.setViewportView(jPanel9);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CODE");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setName("pnlCode"); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setBackground(new java.awt.Color(255, 153, 102));
        jScrollPane3.setName("npl"); // NOI18N

        jPanel3.setLayout(new java.awt.CardLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jPanel3.add(jTable1, "card2");

        jScrollPane3.setViewportView(jPanel3);

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTERS");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setName("pnlCode"); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.setName("pnlCode"); // NOI18N
        jPanel20.setLayout(new java.awt.BorderLayout());

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setName("npl"); // NOI18N

        jPanel21.setLayout(new java.awt.CardLayout());

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable5.getTableHeader().setResizingAllowed(false);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jPanel21.add(jTable5, "card2");

        jScrollPane8.setViewportView(jPanel21);

        jPanel20.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(153, 153, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DATA");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.add(jLabel14, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel7.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setName("pnlCode"); // NOI18N
        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.Y_AXIS));

        jPanel18.setBackground(new java.awt.Color(153, 153, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Commands");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(jLabel12);

        btnLoadFromFile.setText("Load From File");
        btnLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFromFileActionPerformed(evt);
            }
        });
        jPanel18.add(btnLoadFromFile);

        btnInitialize.setText("Initialize");
        btnInitialize.setName("btnInitialize"); // NOI18N
        btnInitialize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInitializeMouseClicked(evt);
            }
        });
        btnInitialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitializeActionPerformed(evt);
            }
        });
        jPanel18.add(btnInitialize);

        btnStep.setText("Step ");
        btnStep.setName("btnStep"); // NOI18N
        btnStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStepMouseClicked(evt);
            }
        });
        btnStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStepActionPerformed(evt);
            }
        });
        jPanel18.add(btnStep);

        btnSave.setText("Save To File");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel18.add(btnSave);

        jPanel17.add(jPanel18);

        jScrollPane7.setName("npl"); // NOI18N

        edtCommandBox.setColumns(20);
        edtCommandBox.setRows(30);
        edtCommandBox.setName("edtCode"); // NOI18N
        jScrollPane7.setViewportView(edtCommandBox);

        jPanel17.add(jScrollPane7);

        jPanel1.add(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1693, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        InitUI();

    }//GEN-LAST:event_formWindowOpened

    private void btnStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStepMouseClicked
      

    }//GEN-LAST:event_btnStepMouseClicked

    private void InitUI()
    {
        // create RegisterBank view
        DefaultTableModel model1 = new DefaultTableModel(); 
        jTable1.setModel(model1); 
        model1.addColumn("colName"); 
        model1.addColumn("colValue"); 
        model1.addColumn("decValue"); 
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(240);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        for (int i = 0; i < 32; i++) {
            model1.addRow(new Object[] {"R"+String.valueOf(i), "00000000000000000000000000000000", 0});
        }

        // create data memory view
        DefaultTableModel model2 = new DefaultTableModel(); 
        jTable5.setModel(model2); 
        model2.addColumn("colName"); 
        model2.addColumn("colValue"); 
        model2.addColumn("decValue"); 
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable5.getColumnModel().getColumn(1).setPreferredWidth(240);
        jTable5.getColumnModel().getColumn(2).setPreferredWidth(150);
        for (int i = 0; i < 1024; i++) { //1024 is number of data memory address lines
            model2.addRow(new Object[] {String.valueOf(i), "00000000000000000000000000000000", 0});
        }
        
        // create instrucion memory view
        DefaultTableModel model3 = new DefaultTableModel(); 
        jTable3.setModel(model3); 
        model3.addColumn("colName"); 
        model3.addColumn("colValue"); 
        model3.addColumn("colCode"); 
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(240);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);

        //1024 is number of instruction memory address lines, each line is 4 byte size
        for (int i = 0; i < 1024; i++) { 
            model3.addRow(new Object[] {String.valueOf(i), "00000000000000000000000000000000"});
        }
    }
    
    private void UpdateUI()
    {
        // update register bank view
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < 32; i++) {
            model1.setValueAt("R" + String.valueOf(i), i, 0);
            model1.setValueAt(fumMips.getRegisterStr(i), i, 1);
            model1.setValueAt(fumMips.getRegister(i), i, 2);
        }

        // update data memory view
        DefaultTableModel model2 = (DefaultTableModel) jTable5.getModel();
        for (int i = 0; i < 1024; i++) {
            model2.setValueAt(String.valueOf(i), i, 0);
            model2.setValueAt(fumMips.getDataMemoryStr(i), i, 1);
            model2.setValueAt(fumMips.getDataMemory(i), i, 2);
        }

        // update instrucion memory view
        DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
        for (int i = 0; i < 1024; i++) {
            model3.setValueAt(String.valueOf(i), i, 0);
            model3.setValueAt(fumMips.getInstructionMemoryStr(i), i, 1);
            model3.setValueAt(fumMips.getInstructionMemoryCode(i), i, 2);
        }
        
        jTable3.setRowSelectionInterval(fumMips.ProgramCounter, fumMips.ProgramCounter);
    }
    
    private void btnInitializeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitializeMouseClicked
        
    }//GEN-LAST:event_btnInitializeMouseClicked

    private void btnStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStepActionPerformed
        fumMips.ClockTick();        
        UpdateUI();
    }//GEN-LAST:event_btnStepActionPerformed

    private void btnInitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitializeActionPerformed
  // Initialize Registers in code
/*
        fumMips.InitializeRegister(2, 2000);
        fumMips.InitializeRegister(4, 4000);
        fumMips.InitializeRegister(6, 12345678);
        fumMips.InitializeRegister(8, 8000);
*/
        fumMips.InitializeDataMemory(100, 321);
        fumMips.InitializeDataMemory(104, -12);
        fumMips.InitializeDataMemory(108, 134);
        fumMips.InitializeDataMemory(112, 0);
        fumMips.InitializeDataMemory(116, -2625421);
        fumMips.InitializeDataMemory(120, 1256781);
        fumMips.InitializeDataMemory(124, 3);
        fumMips.InitializeDataMemory(128, 0);
        fumMips.InitializeDataMemory(132, 9);
        fumMips.InitializeDataMemory(136, -23);

      String[] instructions = edtCommandBox.getText().split("\\n");  
      for(int i = 0 ; i< instructions.length; i++)
      {
          if ("".equals(instructions[i]))
              continue;

          String[] commandParts = instructions[i].split("\\t");
          
          if (commandParts.length > 0)
          {
              if (commandParts.length > 1)
                fumMips.InitializeInstructionMemory(i, commandParts[0], commandParts[1]);
              else
                fumMips.InitializeInstructionMemory(i, commandParts[0], "");
                  
          }
      }

      UpdateUI();
    }//GEN-LAST:event_btnInitializeActionPerformed

    private void btnLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFromFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            FileInputStream fis;
            try 
            {
                fis = new FileInputStream(selectedFile);
                byte[] data = new byte[(int) selectedFile.length()];
                fis.read(data);
                fis.close();

                String str = new String(data, "UTF-8");
                edtCommandBox.setText("");
                edtCommandBox.append((str));
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btnLoadFromFileActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedWriter writer = new BufferedWriter( new FileWriter(selectedFile));
                writer.write(edtCommandBox.getText());
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitialize;
    private javax.swing.JButton btnLoadFromFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStep;
    private javax.swing.JTextArea edtCommandBox;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
