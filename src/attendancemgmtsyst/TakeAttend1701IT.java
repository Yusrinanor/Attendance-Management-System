/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TakeAttend1701IT extends javax.swing.JFrame {

    DefaultTableModel tb;

    public TakeAttend1701IT() {
        initComponents();
        
        Load2But.setVisible(false);
        SaveBut.setVisible(false);
        
        
        MainLoadBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveBut.setVisible(true);

            }
        });
        
         Load2But.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveBut.setVisible(true);

            }
        });
        
        
        
        this.tb = (DefaultTableModel) StudAttendanceTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MainLoadBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudAttendanceTable = new javax.swing.JTable();
        Load2But = new javax.swing.JButton();
        SaveBut = new javax.swing.JButton();
        TimeLab = new javax.swing.JLabel();
        ClassLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("Attendance Marking (UC2F1701IT)");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MainLoadBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        MainLoadBut.setText("Load");
        MainLoadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainLoadButActionPerformed(evt);
            }
        });

        StudAttendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Student ID", "Intake", "Course", "Attendance"
            }
        ));
        jScrollPane2.setViewportView(StudAttendanceTable);

        Load2But.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Load2But.setText("Load");
        Load2But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load2ButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 546, Short.MAX_VALUE)
                .addComponent(Load2But)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainLoadBut)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainLoadBut)
                    .addComponent(Load2But))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaveBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SaveBut.setText("Save Attendance");
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        TimeLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TimeLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ClassLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ClassLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveBut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TimeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SaveBut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainLoadButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainLoadButActionPerformed
        tb.setRowCount(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader("UC2F1701IT.txt"));
            String read = null;
            while ((read = br.readLine()) != null) {
                String[] split = read.split(";");
                for (int i = 0; i < split.length; i++) {
                    tb.addRow(split);
                    break;
                }
            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(TakeAttend1701IT.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableColumn col = StudAttendanceTable.getColumnModel().getColumn(4);
        JComboBox combo = new JComboBox();
        combo.addItem("Present");
        combo.addItem("Absent");
        combo.addItem("Late");
        col.setCellEditor(new DefaultCellEditor(combo));
    }//GEN-LAST:event_MainLoadButActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed

        try {
            FileWriter outputfile = new FileWriter("attendancerecord1701.txt");
            BufferedWriter bw = new BufferedWriter(outputfile);

            for (int i = 0; i < tb.getRowCount(); i++) {
                for (int j = 0; j < tb.getColumnCount(); j++) {
                    bw.write((String) tb.getValueAt(i, j) + ";");
                }

                bw.write("");
                bw.newLine();
            }
            bw.close();
            outputfile.close();
            JOptionPane.showMessageDialog(this, "Attendance is saved");
             this.setVisible(false);
            MarkAttendance ma = new MarkAttendance();
            ma.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(TakeAttend1701IT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveButActionPerformed

    private void Load2ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load2ButActionPerformed
        tb.setRowCount(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader("attendancerecord1704.txt"));
            String read = null;
            while ((read = br.readLine()) != null) {
                String[] split = read.split(";");
                for (int i = 0; i < split.length; i++) {
                    tb.addRow(split);
                    break;
                }
            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(TakeAttend1701IT.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableColumn col = StudAttendanceTable.getColumnModel().getColumn(4);
        JComboBox combo = new JComboBox();
        combo.addItem("Present");
        combo.addItem("Absent");
        combo.addItem("Late");
        col.setCellEditor(new DefaultCellEditor(combo));
    }//GEN-LAST:event_Load2ButActionPerformed

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
            java.util.logging.Logger.getLogger(TakeAttend1701IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeAttend1701IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeAttend1701IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeAttend1701IT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeAttend1701IT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ClassLab;
    public javax.swing.JButton Load2But;
    public javax.swing.JButton MainLoadBut;
    private javax.swing.JButton SaveBut;
    private javax.swing.JTable StudAttendanceTable;
    public javax.swing.JLabel TimeLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
