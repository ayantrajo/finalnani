/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import admin.adminDashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Publisher extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Publisher() {
        initComponents();
        Connect();
       Publisher_Load();
        
    }
    
    Connection con;
    PreparedStatement pat;
    ResultSet rst;
    
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/sample_dbs", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
           
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        author = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        phone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Publisher", "Address", "Phone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(author);
        author.setBounds(140, 130, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Publisher Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 140, 120, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Address:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 180, 120, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Phone:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 230, 120, 20);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(140, 171, 160, 40);
        jPanel2.add(phone);
        phone.setBounds(140, 220, 160, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PUBLISHER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 310, 64);

        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 70, 71, 23);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(230, 70, 71, 23);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(120, 70, 70, 23);

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(230, 320, 79, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(711, 711, 711))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         adminDashboard adb = new adminDashboard();
        adb.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String name = author.getText();
    String addr = address.getText();
    String ph = phone.getText();
    if (name.isEmpty() || addr.isEmpty() || ph.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Missing Information", JOptionPane.WARNING_MESSAGE);
        return;
    }
    try {
        pat = con.prepareStatement("INSERT INTO publisher(name, address, phone) VALUES (?, ?, ?)");
        pat.setString(1, name);
        pat.setString(2, addr);
        pat.setString(3, ph);

        int k = pat.executeUpdate();
        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Publisher Created!");
            author.setText("");
            address.setText("");
            phone.setText("");
            author.requestFocus();
            Publisher_Load();
        } else {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_jButton1ActionPerformed

     public void Publisher_Load(){
        
        int c;
        
        try {
            pat = con.prepareStatement("select * from publisher");
            rst = pat.executeQuery();
            
            ResultSetMetaData rsd = rst.getMetaData();
            c = rsd.getColumnCount();
            
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rst.next()){
                Vector v2 = new Vector();
                for(int i = 1; i<= c; i++ ){
                    v2.add(rst.getString("id"));
                    v2.add(rst.getString("name"));
                    v2.add(rst.getString("address"));
                    v2.add(rst.getString("phone"));
                }
                d.addRow(v2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
     
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: 
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
       author.setText(d1.getValueAt(selectIndex, 1).toString());
        address.setText(d1.getValueAt(selectIndex, 2).toString());
         phone.setText(d1.getValueAt(selectIndex, 3).toString());
        
        jButton1.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectIndex = jTable1.getSelectedRow();

    if (selectIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());

    try {
        pat = con.prepareStatement("DELETE FROM publisher WHERE id = ?");
        pat.setInt(1, id);

        int k = pat.executeUpdate();

        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Publisher Deleted!");
            author.setText("");
            address.setText("");
            phone.setText("");
            author.requestFocus();
            jButton1.setEnabled(true);
            
           Publisher_Load();
        } else {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectIndex = jTable1.getSelectedRow();

    if (selectIndex == -1) { 
        JOptionPane.showMessageDialog(this, "Please select a row to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());
    String name = author.getText();
    String addr = address.getText();
    String ph = phone.getText();

    try {
        pat = con.prepareStatement("UPDATE publisher SET name = ?, address = ?, phone = ? WHERE id = ?");
        pat.setString(1, name);
        pat.setString(2, addr);
        pat.setString(3, ph);
        pat.setInt(4, id);

        int k = pat.executeUpdate();

        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Publisher Updated!");
            author.setText("");
            address.setText("");
            phone.setText("");
            author.requestFocus();
            jButton1.setEnabled(true);
            Publisher_Load();
        } else {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    
    
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
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publisher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField author;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
