/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.JComboBox;
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

public class editamount extends javax.swing.JFrame {
 
    PreparedStatement pst ;
    ResultSet rs;
    Home h ;
    public String datee ; 
    public  String dayOfWeek;
    String totall ;
    
    
    public editamount() throws ParseException {
        initComponents();
        
        comboxfromcombo1();
        AutoCompleteDecorator.decorate(cmname);
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
        jLabel14 = new javax.swing.JLabel();
        cmname = new javax.swing.JComboBox();
        save1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmitem = new javax.swing.JComboBox();
        person2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("العميل");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 60, -1));

        cmname.setEditable(true);
        cmname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, 30));

        save1.setBackground(new java.awt.Color(156, 166, 187));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("بحث");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel1.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("اسم ");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, -1));

        name1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name1KeyTyped(evt);
            }
        });
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 190, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("المنتج");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 60, -1));

        cmitem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 260, 30));

        person2.setEditable(false);
        person2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(person2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("الباقي");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 60, 30));

        amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 30));

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("تعديل القيمة");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 40));

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
        
         int dialogButton = JOptionPane.YES_NO_OPTION;
                               int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                               if(dialogResult == 0) {
                                   
        try
               {
                 String sqla = "UPDATE hany.buy SET total = '"+amount.getText()+"'"
                     + " WHERE item='"+cmitem.getSelectedItem().toString()+"' and name='"+cmname.getSelectedItem().toString()+"'";
                  pst=(PreparedStatement) DBConnect.con.prepareStatement(sqla);
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(this, "تم تعديل المبلغ");
                  cmname.setSelectedIndex(0);
                  cmitem.setSelectedIndex(0);
                   amount.setText("");
                   person2.setText("");
                                   }
                                   catch(Exception ex)
                                   {
                                       JOptionPane.showMessageDialog(this, ex);
                                   }
                               }
                               else
                               {JOptionPane.showMessageDialog(this, " تم الغاء العمليه");
                               
                               }


    }//GEN-LAST:event_saveActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

        try

        {

            String sqll="SELECT item,name FROM hany.buy where 1=1 ";

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem.removeItem(name);

            }

        }

        catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null,ex);
        }

        try {
            String namee=cmname.getSelectedItem().toString();

            String sql="SELECT item ,name FROM hany.buy where  1=1 and total > 0";

            if(!cmname.getSelectedItem().toString().trim().isEmpty())

            {

                sql=sql+" AND name ='"+namee+"'";

            }

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem.addItem(name);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);

        }
    }//GEN-LAST:event_save1ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void name1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll="SELECT name  FROM hany.customer ";

                pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs=pst.executeQuery();

                while(rs.next()){

                    String name = rs.getString("name");

                    cmname.removeItem(name);

                }
            } catch (SQLException ex) {

            }
            cmname.setSelectedIndex(0);
            try {

                String sql="SELECT name  FROM hany.customer  where name like '%"+name1.getText()+"%' order by name ";
                pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
                rs=pst.executeQuery();
                while(rs.next()){
                    String name = rs.getString("name");

                    cmname.addItem(name);
                }

                cmname.requestFocus();

            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_name1KeyPressed

    private void name1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyTyped

    }//GEN-LAST:event_name1KeyTyped

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox cmitem;
    private javax.swing.JComboBox cmname;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField person2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    // End of variables declaration//GEN-END:variables
 
    
     public void comboxfromcombo1()
      {
                   cmitem.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT person2,week,name,price,dailyprice,total,day,number,serial FROM hany.buy where item='"+cmitem.getSelectedItem().toString()+"' and name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 amount.setText(rs.getString("total"));
                 person2.setText(rs.getString("person2"));
              
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
        
}
