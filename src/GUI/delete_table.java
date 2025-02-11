/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Connect;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author nafiz
 */
public class delete_table extends javax.swing.JFrame {

    /**
     * Creates new form delete_table
     * @param
     */
    public delete_table() {
        initComponents();
    }
    public delete_table(Connect conn, ResultSet rset) throws SQLException {
        initComponents();
        connLocal = conn;
        rSet = rset;

        while (rSet.next()) {
            System.out.println("In while block");
            try {
                System.out.println("In try block");
                String temp = rSet.getString("table_name");
                System.out.println(temp);
                TableNameCombo.addItem(temp);
            } catch (SQLException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TableNameCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        attrTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        selectTable = new javax.swing.JButton();
        backButton = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 0));
        jLabel1.setText("Delete Table");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 140, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Table Name :");

        TableNameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        attrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Attributes", "Data Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(attrTable);

        deleteButton.setBackground(new java.awt.Color(255, 140, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    deleteButtonMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        selectTable.setBackground(new java.awt.Color(255, 140, 0));
        selectTable.setForeground(new java.awt.Color(255, 255, 255));
        selectTable.setText("Ok");
        selectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    selectTableMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        selectTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableActionPerformed(evt);
            }
        });

        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(new Splash().backButtonLocation));
        if(imageIcon!=null)
        {backButton.setIcon(imageIcon);}
        else{
            System.out.println("hi");// NOI18N
        }
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(TableNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(44, 44, 44)
                                                                                .addComponent(selectTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(11, 11, 11)
                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(45, 45, 45)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(backButton))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TableNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(selectTable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setSize(new java.awt.Dimension(890, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_deleteButtonMouseClicked
        int result = JOptionPane.showConfirmDialog(null,"Are you Sure You want to delete this table ?");
        if(result == YES_OPTION)
        {
            try {
                String selectedTable = TableNameCombo.getSelectedItem().toString();
                if(selectedTable != "") {
                    Statement stmnt = connLocal.conn.createStatement();
                    stmnt.executeUpdate("drop table " + selectedTable);
                    JOptionPane.showMessageDialog(null, "Table deleted successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please select a table");
                }
            }catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Deletion failed!");
                System.out.println("Exception: " + ex);
            }
            //modelAttrTable.addRow(new Object[]{addAttribute, attributeType});
            //use a back button here. not the delete one.
            MainActivity mainAct = new MainActivity();
            dispose();
            mainAct.setVisible(true);

        }
        else if(result == NO_OPTION){
            MainActivity mainAct = new MainActivity();
            dispose();
            mainAct.setVisible(true);
        }
        else{
            //DO NOTHING;

        }


    }//GEN-LAST:event_deleteButtonMouseClicked


    private void selectTableMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {
        String selectedTable = TableNameCombo.getSelectedItem().toString();
        DefaultTableModel modelAttrTable = (DefaultTableModel)attrTable.getModel();
        modelAttrTable.setRowCount(0);
        Statement stmnt1 = connLocal.conn.createStatement();

        ResultSet rSet = stmnt1.executeQuery("select * from " + selectedTable);
        ResultSetMetaData rsmd = rSet.getMetaData();
        rSet.next();
        for(int i = 1; i<=rsmd.getColumnCount(); i++) {
            modelAttrTable.addRow(new Object[]{rsmd.getColumnName(i), rsmd.getColumnTypeName(i)});
        }
        //MainActivity mainAct = new MainActivity();
        //dispose();
        //mainAct.setVisible(true);// TODO add your handling code here:
    }

    private void selectTableActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {
        MainActivity mainAct = new MainActivity();
        dispose();
        mainAct.setVisible(true);// TODO add your handling code here:
    }
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
            java.util.logging.Logger.getLogger(delete_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> TableNameCombo;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable attrTable;
    private javax.swing.JTextArea jTextArea1;
    public Connect connLocal;
    public  ResultSet rSet;
    private javax.swing.JButton selectTable;
    private javax.swing.JLabel backButton;
    // End of variables declaration//GEN-END:variables
}
