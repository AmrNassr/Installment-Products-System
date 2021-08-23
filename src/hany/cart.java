/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */

public class cart extends javax.swing.JFrame {
 
    PreparedStatement pst ;
    ResultSet rs;
    Home h ;
    public String datee ; 
    public  String dayOfWeek;
    public String total ;
    
    
    public cart() throws ParseException {
        initComponents();
        
        AutoCompleteDecorator.decorate(cmname);
        customers();
        gettotal();
          Calendar cal = new GregorianCalendar();
             int day = cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
         String dateString = String.format("%d-%d-%d", year, month, day);
           java.util.Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
           date1.setText(year+"-"+month+"-"+day);
           datee=date1.getText().toString();
            dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                int monthh=cal.get(Calendar.MONTH)+1;
                int yearr = cal.get(Calendar.YEAR);
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
        save = new javax.swing.JButton();
        cmname = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("بيانات العميل");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 40));

        cmname.setEditable(true);
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 260, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("العميل");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/64586a0ad51dc03.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jLabel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jLabel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 260));

        date1.setText("jLabel2");
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(474, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
                    try {
             String sql="SELECT sum(total) as x FROM hany.buy where name = '"+cmname.getSelectedItem().toString()+"' group by name;";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                total = rs.getString("x");
  
             }

         } catch (SQLException ex) {
             
         }
           
            InputStream in=null;
            try {
    String name = cmname.getSelectedItem().toString();
    //"\\192.168.1.15\sadam\WHD.jasper"
                String reportpath= "\\\\192.168.1.27\\hany\\cart.jasper";
              //  String reportpath= "D:\\hany\\cart.jasper";
                Map<String,Object> para = new HashMap<String,Object>();
                para.put("name", name);
                para.put("total", total);
                 JasperPrint j = JasperFillManager.fillReport(reportpath, para,DBConnect.con);
                JasperViewer.viewReport(j,false);
            }
            catch (JRException ex) {
                JOptionPane.showMessageDialog(null,ex);
            } finally {
                 
            }
        

    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmname;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
        public void customers()
   {
        try {
             String sql="SELECT name  FROM hany.customer order by name";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmname.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
           public void gettotal()
   {
        try {
             String sql="SELECT sum(total) as x FROM hany.buy where name = '"+cmname.getSelectedItem().toString()+"' group by name;";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                total = rs.getString("x");
  
             }

         } catch (SQLException ex) {
             
         }
   }
}
