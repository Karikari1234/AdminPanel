package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;

import core.Connect;

/**
 *
 * @author nafiz
 * Readme :
 * The Buttons :
 * doneButton ( bottom of the UI )
 * add ( basically adds the attribute to the table with the data type )
 *
 * The TextFields :
 * TableName1 ( String Containing The Name Of the Table )
 * attributeName ( Name Of the Column u want to add to the table )
 *
 * The ComboBox :
 * jComboBox1 ( contains the data type names of the attribute to be assigned , edit them in 99 no. line)
 *
 *
 * The Table :
 * Attrtable (Contains the attritubes wth their data types in unedittable form , to be in the table to be formed.)
 *
 *
 */
public class CreateTable extends javax.swing.JFrame {

    /**
     * Creates new form CreateTable
     * @param
     */
    public CreateTable(Connect connect) {
        initComponents();
        this.connlocal = connect;
    }
    public CreateTable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        attributeName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TableName1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        AttTableScroll = new javax.swing.JScrollPane();
        Attrtable = new javax.swing.JTable();
        backButton = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        delete.setBackground(new java.awt.Color(255, 140, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 0));
        jLabel1.setText("Create Table");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel3.setText("Set Table Name :");

        attributeName.setText("");
        attributeName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        attributeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attributeNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 140, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel4.setText("Add Attribute :");

        TableName1.setText("");
        TableName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TableName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableName1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "varchar2(255)", "number" }));

        add.setBackground(new java.awt.Color(255, 140, 0));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        doneButton.setBackground(new java.awt.Color(255, 140, 0));
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Done");
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });

        Attrtable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "Attributes", "Data Type"
                }
        ){
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Attrtable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AttTableScroll.setViewportView(Attrtable);

        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backbutton.png"))); // NOI18N
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
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3))
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TableName1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(attributeName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(126, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(AttTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(152, 152, 152)
                                                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2))
                                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(TableName1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(attributeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                .addComponent(AttTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        setSize(new java.awt.Dimension(900, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void attributeNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);        // TODO add your handling code here:
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
        String tableName = TableName1.getText();
        DefaultTableModel attrtableModel = (DefaultTableModel)Attrtable.getModel();
        try{
            int selectedRowIndex = Attrtable.getSelectedRow();
            String columnName = (String) Attrtable.getValueAt(selectedRowIndex, 0);
            Statement stmnt = connlocal.conn.createStatement();
            System.out.println(tableName);
            System.out.println(columnName);
            stmnt.executeUpdate("alter table "+ tableName + " drop column " + columnName);
            attrtableModel.removeRow(selectedRowIndex);
        }catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Could not delete. Exception: " + ex);
        }
        // TODO add your handling code here:
    }
    private void deleteMouseClicked(MouseEvent evt){

    }
    private void addMouseClicked(MouseEvent evt){
        ++count;
        String addTableName = TableName1.getText();
        String addAttribute = attributeName.getText();
        String attributeType = jComboBox1.getSelectedItem().toString();
        if(addTableName != null | addAttribute != null | attributeType != null) {
            if (count == 1) {
                try {
                    Statement stmnt = connlocal.conn.createStatement();
                    stmnt.executeUpdate("create table " + addTableName + "(" + addAttribute + " " + attributeType + ")");
                    System.out.println("Table Added");
                    isCreated = true;
                    stmnt.close();
                    DefaultTableModel modelAttrTable = (DefaultTableModel) Attrtable.getModel();
                    modelAttrTable.addRow(new Object[]{addAttribute, attributeType});

                } catch (Exception sqle) {
                    isCreated = false;
                    JOptionPane.showMessageDialog(null, "Row not added. SQLException : " + sqle);
                    System.out.println("SQLException : " + sqle);
                }
            } else if (count > 1) {
                try {
                    Statement stmnt = connlocal.conn.createStatement();
                    stmnt.executeUpdate("ALTER TABLE " + addTableName + " " +
                            "ADD " + addAttribute + " " + attributeType);
                    System.out.println("Table Altered");
                    isCreated = true;
                    stmnt.close();
                    DefaultTableModel modelAttrTable = (DefaultTableModel) Attrtable.getModel();
                    modelAttrTable.addRow(new Object[]{addAttribute, attributeType});

                } catch (Exception sqle) {
                    isCreated = false;
                    JOptionPane.showMessageDialog(null, "Row not added. SQLException : " + sqle);
                    System.out.println("SQLException : " + sqle);
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "Please fill all the fields.");
        }

    }

    private void TableName1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(isCreated == true) {
            JOptionPane.showMessageDialog(null, "Table created successfully!");
        }else {
            JOptionPane.showMessageDialog(null, "Table is not created");
        }
        MainActivity mainAct = new MainActivity();
        dispose();
        mainAct.setVisible(true); // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(CreateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane AttTableScroll;
    private javax.swing.JTable Attrtable;
    private javax.swing.JTextField TableName1;
    private javax.swing.JButton add;
    private javax.swing.JTextField attributeName;
    private javax.swing.JButton doneButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public Connect connlocal;
    public int count = 0;
    public boolean isCreated = false;
    private javax.swing.JLabel backButton;
    private JButton delete;
    // End of variables declaration
}
