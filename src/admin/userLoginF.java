/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import testappnew.loginF;
import config.Session;
import config.dbConnector;
import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
import register.registF;


/**
 *
 * @author User
 */
public class userLoginF extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public userLoginF() {
        initComponents();
         displayData();
       
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_email FROM tbl_user");
            usersOnly.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        ps = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        uid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        us = new javax.swing.JComboBox<>();
        acc_id = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersOnly = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("UserName:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Account Status:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, -1));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, -1));
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 160, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        jPanel1.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 160, -1));
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Account Type:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", " " }));
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, -1));

        acc_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 10));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 270, 60, -1));

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, -1));

        jButton1.setText("Cancel");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 70, -1));

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 330));

        usersOnly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        usersOnly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersOnlyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersOnly);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 430, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashboard db = new dashboard();
        db.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usersOnlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersOnlyMouseClicked
         int rowIndex = usersOnly.getSelectedRow();

        TableModel model = usersOnly.getModel();
        String id = model.getValueAt(rowIndex, 0).toString();
        dbConnector dbc = new dbConnector();
        try{
            ResultSet rs = dbc.getData("SELECT *FROM tbl_user WHERE u_id ='"+id+"'");
            if(rs.next()){
                uid.setText(rs.getString("u_id"));
                fn.setText(rs.getString("u_fname"));
                ln.setText(rs.getString("u_lname"));
                em.setText(rs.getString("u_email"));
               un.setText(rs.getString("u_username"));
               ps.setText(rs.getString("u_password"));
                ut.setSelectedItem(rs.getString("u_type"));
                us.setSelectedItem(rs.getString("u_status"));

            }
        }catch(SQLException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_usersOnlyMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        acc_id.setText(""+sess.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        createduserform crf = new createduserform();
        crf.setVisible(true);
        crf.remove.setEnabled(false);
        crf.select.setEnabled(true); 
        this.dispose();
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowIndex = usersOnly.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
         
            try{
            dbConnector dbc = new dbConnector();
            TableModel tbl = usersOnly.getModel();
            ResultSet rs = dbc.getData("SELECT *FROM tbl_user WHERE u_id ='"+tbl.getValueAt(rowIndex, 0)+"'");
            if(rs.next()){
            createduserform crf = new createduserform();
            crf.uid.setText(""+rs.getInt("u_id"));
            crf.fn.setText(""+rs.getString("u_fname"));
            crf.ln.setText(""+rs.getString("u_lname"));
            crf.mail.setText(""+rs.getString("u_email"));
            crf.us.setText(""+rs.getString("u_username"));
            crf.pw.setText(""+rs.getString("u_password"));
            crf.ut.setSelectedItem(""+rs.getString("u_type"));
            crf.ust.setSelectedItem(""+rs.getString("u_status"));
            crf.image.setIcon(crf.ResizeImage(rs.getString("u_image"), null, crf.image));
            crf.oldpath = rs.getString("u_image");
            crf.path = rs.getString("u_image");
            crf.destination=rs.getString("u_image");
            crf.destination=rs.getString("u_image");
            crf.add.setEnabled(false);
            crf.update.setEnabled(true);
            crf.setVisible(true);
          
            
            if(rs.getString("u_image").isEmpty()){
                crf.select.setEnabled(true);
                crf.remove.setEnabled(false);
            }else{
                crf.select.setEnabled(false);
                crf.select.setEnabled(true);
                
            }
            this.dispose();
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
        }
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        individualPrinting ip = new individualPrinting();
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_printActionPerformed

    /**
     * @
     * 
        /* Create and display the form */
       
    public static void main(String args[]){
        
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userLoginF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JButton print;
    private javax.swing.JTextField ps;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox<String> us;
    private javax.swing.JTable usersOnly;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
