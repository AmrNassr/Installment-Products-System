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
public final class mokdmat extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
        
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
    public String datee;
      public  Calendar cal;
      public String total;
      String dayyy;
   
    public mokdmat() {
        initComponents();
        
         clear();
         items();
         customers();
         comboxfromcombo3();
         datees();
        AutoCompleteDecorator.decorate(cmitem);
        AutoCompleteDecorator.decorate(cmdate1);
         comboxfromcombo4();
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
           datee=date1.getText().toString(); 
            gettotal();
          }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        save3 = new javax.swing.JButton();
        amount1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        amount3 = new javax.swing.JTextField();
        cmitem = new javax.swing.JComboBox();
        amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cmdate1 = new javax.swing.JComboBox();
        save2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cmitem3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        amount2 = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();
        cmdate = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cmitem2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        delete.setBackground(new java.awt.Color(156, 166, 187));
        delete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("تسليم");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel10.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 180, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setText("اسم العميل");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 180, -1));

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 260, 30));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 180, 40));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel24.setText("القيمه");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 80, 30));

        name1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setText("اسم المنتج");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 110, -1));

        save3.setBackground(new java.awt.Color(138, 203, 195));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("اضافه");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel10.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, 40));

        amount1.setEditable(false);
        amount1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 70, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel25.setText("القيمه");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setText("المنتج");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 100, 60));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel26.setText("صفحة");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 80, 30));

        amount3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 100, 30));

        cmitem.setEditable(true);
        cmitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 210, 30));

        amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 70, 50));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 570, 310));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 220));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("بحث");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 90, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel19.setText("العميل");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 60, -1));

        cmdate1.setEditable(true);
        cmdate1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmdate1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 260, 30));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("بحث");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel10.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 90, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel20.setText("المنتج");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 60, -1));

        cmitem3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmitem3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 260, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setText("المنتج");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 60, -1));

        amount2.setEditable(false);
        amount2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel10.add(amount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 70, 30));

        delete1.setBackground(new java.awt.Color(156, 166, 187));
        delete1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setText("مسح");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel10.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 180, 50));

        cmdate.setEditable(true);
        cmdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 250, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setText("القيمة");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 60, 30));

        cmitem2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmitem2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 250, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel15.setText("العميل");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 60, -1));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 870, 120));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 870, 120));

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
                       try
        {
             int amountt = Integer.parseInt(amount.getText());
        
                   if(name.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم العميل");
                }
                else
                {
                     java.util.Date date = cal.getTime();
                                       TimeZone tz = TimeZone.getTimeZone("GMT+02");
Calendar c = Calendar.getInstance(tz);
String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
            String.format("%02d" , c.get(Calendar.MINUTE));
 String dateee=datee+" "+time;
                     int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                    if(dialogResult == 0) {
                        try{
                            String sql = "INSERT INTO hany.mokdmat (name,amount,item,date,mark,page) VALUES"
                            + " ('"+name.getText()+"','"+amountt+"','"+cmitem.getSelectedItem().toString()+"','"+datee+"','No','"+amount3.getText()+"')";
                            pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "تم اضافه العملية");
                           cmdate.addItem(name.getText());
                           cmdate1.addItem(name.getText());
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
                       catch(Exception e )
                       {
                           JOptionPane.showMessageDialog(this, "المبلغ غير صحيح");
                       }
                
               
                
               
              
                

    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
if(cmitem3.getSelectedItem().toString().trim().isEmpty() && amount1.getText().trim().isEmpty())
{
    JOptionPane.showMessageDialog(this, "اختر المنتج");
}
else
{
                                TimeZone tz = TimeZone.getTimeZone("GMT+02");
Calendar c = Calendar.getInstance(tz);
String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
            String.format("%02d" , c.get(Calendar.MINUTE));
 String dateee=datee+" "+time;
         try
                                 {
                                       String sqla = "UPDATE hany.mokdmat SET smalldonedate='"+datee+"',mark = 'Done',donedate='"+dateee+"' WHERE "
                                               + "amount='"+amount1.getText()+"' and item='"+cmitem3.getSelectedItem().toString()+"' and name='"+cmdate1.getSelectedItem().toString()+"'";
                                       pst=(PreparedStatement) DBConnect.con.prepareStatement(sqla);
                                       pst.executeUpdate();
                                       JOptionPane.showMessageDialog(this, "تم تسليم المبلغ");
                                       cmdate1.setSelectedIndex(0);
                                       amount1.setText("");
                                       cmitem3.setSelectedIndex(0);
                                   }
                                   catch(Exception ex)
                                   {
                                       JOptionPane.showMessageDialog(this, ex);
                                   }
        

}
        
    }//GEN-LAST:event_deleteActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        String namee = name1.getText();

        
            if( name1.getText().trim().isEmpty() )
            {
                JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم المنتج كامله");
            }
            else
            {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                if(dialogResult == 0) {
                    try{
                        String sql = "INSERT INTO hany.item (name) VALUES"
                        + " ('"+namee+"')";
                        pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "تم اضافه المنتج بنجاح");
                        name1.setText("");
                        cmitem.addItem(namee);

                    }
                    catch(Exception e ){
                        JOptionPane.showMessageDialog(null,"المنتج موجود من قبل");
                    }

               

            }
        }
    }//GEN-LAST:event_save3ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

        try

        {

            String sqll="SELECT item FROM hany.mokdmat where 1=1 ";

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem2.removeItem(name);

            }

        }

        catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null,ex);
        }

        try {
            String namee=cmdate.getSelectedItem().toString();

            String sql="SELECT item  FROM hany.mokdmat where  1=1 and mark='No'";

            if(!cmdate.getSelectedItem().toString().trim().isEmpty())

            {

                sql=sql+" AND name ='"+namee+"'";

            }

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem2.addItem(name);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);

        }
    }//GEN-LAST:event_save1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
if(cmitem2.getSelectedItem().toString().trim().isEmpty() && amount2.getText().trim().isEmpty())
{
    JOptionPane.showMessageDialog(this, "اختر المنتج");
}
else
{
        try {
            String sql = "DELETE FROM hany.mokdmat WHERE amount='"+amount2.getText()+"' "
            + "and item='"+cmitem2.getSelectedItem().toString()+"'"
            + " and name = '"+cmdate.getSelectedItem().toString()+"'";
            pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, " تم ازاله المقدم بنجاح");
            cmdate.setSelectedIndex(0);
            cmitem2.setSelectedIndex(0);
             amount2.setText("");
        } catch (SQLException ex) {
        }
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        try

        {

            String sqll="SELECT item FROM hany.mokdmat where 1=1 ";

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem3.removeItem(name);

            }

        }

        catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null,ex);
        }

        try {
            String namee=cmdate1.getSelectedItem().toString();

            String sql="SELECT item  FROM hany.mokdmat where  1=1 and mark='No'";

            if(!cmdate1.getSelectedItem().toString().trim().isEmpty())

            {

                sql=sql+" AND name ='"+namee+"'";

            }

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("item");

                cmitem3.addItem(name);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);

        }
    }//GEN-LAST:event_save2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField amount3;
    private javax.swing.JComboBox cmdate;
    private javax.swing.JComboBox cmdate1;
    private javax.swing.JComboBox cmitem;
    private javax.swing.JComboBox cmitem2;
    private javax.swing.JComboBox cmitem3;
    private javax.swing.JLabel date1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    private javax.swing.JLabel serialid;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    name.setText("");  
    name1.setText(""); 
    cmitem.setSelectedIndex(0);
    amount.setText("");
    
}
    public void items()
   {
        try {
             String sql="SELECT name  FROM hany.item ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmitem.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
    public void customers()
   {
        try {
             String sql="SELECT name  FROM hany.mokdmat  where mark='No' order by name ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmdate1.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
  
    public void gettotal()
    {
          try {
             String sql="select sum(amount) as x from hany.mokdmat where mark='No' And  date ='"+datee+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                total=rs.getString("x");
                 
              }

         } catch (SQLException ex) {
             
         }  
    }
public void comboxfromcombo3()
      {
                   cmitem2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT * FROM hany.mokdmat where name='"+cmdate.getSelectedItem().toString()+"' "
                     + "and item='"+cmitem2.getSelectedItem().toString()+"'  ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 amount2.setText(rs.getString("amount"));
                 
                 
                 
              
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
      public void datees()
   {
        try {
             String sql="SELECT distinct name  FROM hany.mokdmat where mark='No' order by CAST(date AS DATE)  ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmdate.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
     public void comboxfromcombo4()
      {
                   cmitem3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT * FROM hany.mokdmat where name='"+cmdate1.getSelectedItem().toString()+"' "
                     + "and item='"+cmitem3.getSelectedItem().toString()+"'  ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 amount1.setText(rs.getString("amount"));
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
}
