

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janit
 */
public class AddComponent extends javax.swing.JFrame {

    /**
     * Creates new form AddComponent
     */
    public AddComponent() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOBILE PALACE");
        jLabel1.setOpaque(true);

        jLabel11.setText("Janith Thenura, All Right Reserved. (c),2023");

        jButton6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CATEGORY");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VALUE");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NO");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUSTOMER", "DISTRIBUTOR", "BRAND", "MODEL", "BANK ACCOUNT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton3.setText("REMOVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "VALUE", "NO."
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(236, 236, 236))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap())
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AddComponent add = new AddComponent();
        CashierMenu c1 = new CashierMenu();
        AddBanking b = new AddBanking();
        this.setVisible(false);
        b.setVisible(true);
//        c1.show();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String category = jComboBox1.getSelectedItem().toString();
         DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
         try {
           if(category.equals("CUSTOMER")){
             ResultSet rs = DatabaseConnection.search("SELECT * FROM customer");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
//                    jTextField1.setText(null);
//                    jTextField2.setText(null);
                }
           }
                else if(category.equals("DISTRIBUTOR")){
                ResultSet rs = DatabaseConnection.search("SELECT * FROM distributor");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    
                }
            }
            else if(category.equals("BRAND")){
               
                ResultSet rs = DatabaseConnection.search("SELECT * FROM brand");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    dtm.addRow(v);
                   
                }
            }
            
            else if(category.equals("MODEL")){
                ResultSet rs = DatabaseConnection.search("SELECT * FROM model");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    dtm.addRow(v);
                }
            }
            
            else if(category.equals("BANK ACCOUNT")){
                
                ResultSet rs = DatabaseConnection.search("SELECT * FROM bank");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("account");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Please Select Category","ERROR",JOptionPane.ERROR_MESSAGE);
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String category = String.valueOf(jComboBox1.getSelectedItem());
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            int row = jTable1.getSelectedRow();
            String id = String.valueOf(jTable1.getValueAt(row, 0));
            String value = String.valueOf(jTable1.getValueAt(row, 1));
            String no = String.valueOf(jTable1.getValueAt(row, 2));
            if(category.equals("CUSTOMER")){
                DatabaseConnection.iud("UPDATE customer SET `name` = '"+value+"' WHERE `id`='"+id+"' ");
                DatabaseConnection.iud("UPDATE customer SET `contact` = '"+no+"'WHERE `id`='"+id+"' ");
                JOptionPane.showMessageDialog(this,"Customer Updated Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM customer");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("DISTRIBUTOR")){
                DatabaseConnection.iud("UPDATE distributor SET `name` = '"+value+"' WHERE `id`='"+id+"' ");
                DatabaseConnection.iud("UPDATE distributor SET `contact` = '"+no+"'WHERE `id`='"+id+"' ");
                JOptionPane.showMessageDialog(this,"Distributor Updated Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM distributor");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("BRAND")){
                DatabaseConnection.iud("UPDATE brand SET `name` = '"+value+"' WHERE `id`='"+id+"' ");
//                DatabaseConnection.iud("UPDATE customer SET `contact` = '"+no+"'WHERE `id`='"+id+"' ");
                JOptionPane.showMessageDialog(this,"Brand Details Updated Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM brand");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
//                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("MODEL")){
                DatabaseConnection.iud("UPDATE model SET `name` = '"+value+"' WHERE `id`='"+id+"' ");
                
                JOptionPane.showMessageDialog(this,"Model Details Updated Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM model");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
                    
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                   
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("BANK ACCOUNT")){
                DatabaseConnection.iud("UPDATE bank SET `name` = '"+value+"' WHERE `id`='"+id+"' ");
                DatabaseConnection.iud("UPDATE bank SET `account` = '"+no+"'WHERE `id`='"+id+"' ");
                JOptionPane.showMessageDialog(this,"Bank Details Updated Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM bank");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id_new = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("account");
                    Vector v = new Vector();
                    v.add(id_new);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String category = jComboBox1.getSelectedItem().toString();
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        try {
            int row = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(row, 0).toString();
            if(category.equals("CUSTOMER")){
                DatabaseConnection.iud("DELETE FROM customer WHERE `id` = '"+id+"' ");
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(this,"Customer Removed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(category.equals("DISTRIBUTOR")){
                DatabaseConnection.iud("DELETE FROM distributor WHERE `id` = '"+id+"' ");
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(this,"Distributor Removed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            if(category.equals("BRAND")){
                DatabaseConnection.iud("DELETE FROM brand WHERE `id` = '"+id+"' ");
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(this,"Brand Details Removed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            if(category.equals("MODEL")){
                DatabaseConnection.iud("DELETE FROM model WHERE `id` = '"+id+"' ");
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(this,"Model DEtails Removed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            if(category.equals("BANK ACCOUNT")){
                DatabaseConnection.iud("DELETE FROM bank WHERE `id` = '"+id+"' ");
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(this,"Bank Details Removed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
       
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String category = String.valueOf(jComboBox1.getSelectedItem());
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            if(category.equals("CUSTOMER")){
                DatabaseConnection.iud("INSERT INTO customer (`name`,`contact`) VALUES ('"+jTextField1.getText()+"','"+jTextField2.getText()+"')");
                JOptionPane.showMessageDialog(this,"New Customer Added Succesfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM customer");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
                
            }
            else if(category.equals("DISTRIBUTOR")){
                DatabaseConnection.iud("INSERT INTO distributor (`name`,`contact`) VALUES ('"+jTextField1.getText()+"','"+jTextField2.getText()+"')");
                JOptionPane.showMessageDialog(this,"New Distributor Added Succesfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM distributor");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("contact");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("BRAND")){
                DatabaseConnection.iud("INSERT INTO brand (`name`) VALUES ('"+jTextField1.getText()+"')");
                JOptionPane.showMessageDialog(this,"New Brand Added Succesfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM brand");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("MODEL")){
                DatabaseConnection.iud("INSERT INTO model (`name`) VALUES ('"+jTextField1.getText()+"')");
                JOptionPane.showMessageDialog(this,"New Model Added Succesfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM model");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else if(category.equals("BANK ACCOUNT")){
                DatabaseConnection.iud("INSERT INTO bank (`name`,`account`) VALUES ('"+jTextField1.getText()+"','"+jTextField2.getText()+"')");
                JOptionPane.showMessageDialog(this,"New Bank Details Added Succesfully","DONE",JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs = DatabaseConnection.search("SELECT * FROM bank");
                dtm.setRowCount(0);
                while(rs.next()){
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String contact = rs.getString("account");
                    Vector v = new Vector();
                    v.add(id);
                    v.add(name);
                    v.add(contact);
                    dtm.addRow(v);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Please Select Category","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddComponent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
