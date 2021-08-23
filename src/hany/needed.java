/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class needed extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
        
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
    public String datee;
    public String datee3;
      public  Calendar cal;
      public String total;
      String dayyy;
   
    public needed() {
        initComponents();
        
         clear();
         names();
         names1();
         comboxfromcombo3();
         comboxfromcombo2();
        AutoCompleteDecorator.decorate(cmname);
        item.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         cal = new GregorianCalendar();
             
                int monthh=cal.get(Calendar.MONTH)+1;
                int yearr = cal.get(Calendar.YEAR);
                   int dayy =cal.get(Calendar.DAY_OF_MONTH);
             dayyy=String.valueOf(dayy);
 if(dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
         || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9 )
 {
      dayyy=String.valueOf(dayy);
     dayyy="0"+dayyy;
 }
               
           date1.setText(yearr+"-"+monthh+"-"+dayyy);
             datee3=date1.getText().toString(); 
          }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        item1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        item = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmname1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        totall1 = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        save3 = new javax.swing.JButton();
        cmname = new javax.swing.JComboBox();
        totall = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel30.setText("السبب");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 60, -1));

        item1.setColumns(20);
        item1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        item1.setRows(5);
        jScrollPane2.setViewportView(item1);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 270, 60));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel15.setText("دفعات");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 180, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel29.setText("السبب");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 110, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setText("اسم التاجر");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 180, -1));

        item.setColumns(20);
        item.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        item.setRows(5);
        jScrollPane1.setViewportView(item);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 156, 270, 60));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setText("اسم التاجر");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 180, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel26.setText("المجموع");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 90, 30));

        cmname1.setEditable(true);
        cmname1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 270, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel25.setText("القيمه");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 80, 30));

        amount1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 70, 50));

        totall1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(totall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 70, 50));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("حفظ");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 180, 40));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 180, 40));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel24.setText("القيمه");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 80, 30));

        name1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setText("اسم التاجر");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

        save3.setBackground(new java.awt.Color(138, 203, 195));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("اضافه");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel10.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 120, 40));

        cmname.setEditable(true);
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 270, 30));

        totall.setEditable(false);
        totall.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(totall, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 70, 50));

        amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 70, 50));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 770, 230));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 570, 260));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 260));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date1.setText("date");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         TimeZone tz = TimeZone.getTimeZone("GMT+02");
Calendar c = Calendar.getInstance(tz);
String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
            String.format("%02d" , c.get(Calendar.MINUTE));
 String dateee1=datee3+" "+time;
        try
        {
             int amountt = Integer.parseInt(amount.getText());
        
                   if(cmname.getSelectedItem().toString().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم التاجر");
                }
                else
                {
                    String sqll="SELECT name FROM hany.needed where name='"+cmname.getSelectedItem().toString()+"' ";

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs=pst.executeQuery();
                
            if(rs.next()){
               
                 String sqla = "UPDATE hany.needed SET total =total+'"+amountt+"' WHERE name='"+cmname.getSelectedItem().toString()+"'";
                                       pst=(PreparedStatement) DBConnect.con.prepareStatement(sqla);
                                       pst.executeUpdate();
                                       JOptionPane.showMessageDialog(this, "تم اضافه المبلغ");
                                       int total=Integer.parseInt(totall.getText());  
                                       int amounttt=Integer.parseInt(amount.getText()); 
                                       int totalx=total+amountt;
                                        String sqls = "INSERT INTO hany.neededlogs (name,amount,date,total,type,date2,item) VALUES"
                            + " ('"+cmname.getSelectedItem().toString()+"','"+amountt+"','"+dateee1+"','"+totalx+"','بضاعة','"+date1.getText()+"','"+item.getText()+"')";
                            pst = (PreparedStatement)DBConnect.con.prepareStatement(sqls);
                            pst.execute();
                             clear();
            }
            else
            {
                    
                    
                     int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                    if(dialogResult == 0) {
                        try{
                            String sql = "INSERT INTO hany.needed (name,total,date) VALUES"
                            + " ('"+cmname.getSelectedItem().toString()+"','"+amountt+"','"+dateee1+"')";
                            pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "تم اضافه المبلغ");
                              String sqls = "INSERT INTO hany.neededlogs (name,amount,date,total,type,date2,item) VALUES"
                            + " ('"+cmname.getSelectedItem().toString()+"','"+amountt+"','"+dateee1+"','"+amountt+"','بضاعة','"+date1.getText()+"','"+item.getText()+"')";
                            pst = (PreparedStatement)DBConnect.con.prepareStatement(sqls);
                            pst.execute();
                           cmname1.addItem(cmname.getSelectedItem().toString());
                            clear();

                        }
                        catch(Exception e ){
                            JOptionPane.showMessageDialog(null,e);
                        }

                    }
                    else
                    {JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                    }
                }
                    
                }  
                   }
                       catch(Exception e )
                       {
                           JOptionPane.showMessageDialog(this, "المبلغ غير صحيح");
                       }
                
               
                
               
              
                

    }//GEN-LAST:event_saveActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        String namee = name1.getText();

        
            if( name1.getText().trim().isEmpty() )
            {
                JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم التاجر كامله");
            }
            else
            {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                if(dialogResult == 0) {
                    try{
                        String sql = "INSERT INTO hany.neededname (name) VALUES"
                        + " ('"+namee+"')";
                        pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "تم اضافه التاجر بنجاح");
                        cmname.addItem(namee);
                        name1.setText("");
                       

                    }
                    catch(Exception e ){
                        JOptionPane.showMessageDialog(null,e);
                    }

                }
                else
                {JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                }

            }
        
    }//GEN-LAST:event_save3ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
         TimeZone tz = TimeZone.getTimeZone("GMT+02");
Calendar c = Calendar.getInstance(tz);
String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
            String.format("%02d" , c.get(Calendar.MINUTE));
 String dateee2=datee3+" "+time;
        int total1=Integer.parseInt(totall1.getText());  
        int amounttt1=Integer.parseInt(amount1.getText()); 
        if(total1 >= amounttt1)
       {
           
           try {
               String sqla = "UPDATE hany.needed SET total =total-'"+amounttt1+"' WHERE name='"+cmname1.getSelectedItem().toString()+"'";
               pst=(PreparedStatement) DBConnect.con.prepareStatement(sqla);
               pst.executeUpdate();
               JOptionPane.showMessageDialog(this, "تم اضافه المبلغ");
               int totalx=total1-amounttt1;
               String sqls = "INSERT INTO hany.neededlogs (name,amount,date,total,type,date2,item) VALUES"
                       + " ('"+cmname1.getSelectedItem().toString()+"','"+amounttt1+"','"+dateee2+"','"+totalx+"','دفعه','"+date1.getText()+"','"+item1.getText()+"')";
               pst = (PreparedStatement)DBConnect.con.prepareStatement(sqls);
               pst.execute();
               clear();
           } catch (SQLException ex) {
               Logger.getLogger(needed.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        else
        {
            JOptionPane.showMessageDialog(this, " المبلغ اكبر من بضاعة");
        }
    }//GEN-LAST:event_save1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JComboBox cmname;
    private javax.swing.JComboBox cmname1;
    private javax.swing.JLabel date1;
    private javax.swing.JTextArea item;
    private javax.swing.JTextArea item1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name1;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save3;
    private javax.swing.JLabel serialid;
    private javax.swing.JTextField totall;
    private javax.swing.JTextField totall1;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    cmname.setSelectedIndex(0);
    amount.setText("");
    cmname1.setSelectedIndex(0);
    amount1.setText("");
    totall.setText("");
    totall1.setText("");
    item.setText("");
    item1.setText("");
    
    
}
    public void names()
   {
        try {
             String sql="SELECT name  FROM hany.neededname ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmname.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
      public void names1()
   {
        try {
             String sql="SELECT name  FROM hany.needed where total >0 ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmname1.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
 
  
  
public void comboxfromcombo3()
      {
                   cmname.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT * FROM hany.needed where name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 totall.setText(rs.getString("total"));
                 
                 
                 
              
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
public void comboxfromcombo2()
      {
                   cmname1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT * FROM hany.needed where name='"+cmname1.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 totall1.setText(rs.getString("total"));
                 
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }

 
}
