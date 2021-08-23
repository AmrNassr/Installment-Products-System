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
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class follow extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
        
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
     public String datee;
     public String fulldatee;
    public int total ;

          String dayy=null;
           String month=null;
           String week=null;
           public  Calendar cal;
    public follow() {
        initComponents();
        
         
         cal = new GregorianCalendar();
             int day = cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
                date.setText(year+"-"+month+"-"+day);
                datee=date.getText().toString();
                cal.setTimeInMillis(System.currentTimeMillis());
 TableCellRenderer rendererFromHeader = tdetails1.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tdetails1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tdetails1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tdetails1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        tdetails1.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        tdetails1.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        tdetails2.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        mokdmat();
        aqsat();
      
       class SayHello extends TimerTask {
    public void run() {
      mokdmat();
        aqsat(); 
    }
}

Timer timer = new Timer();
timer.schedule(new SayHello(), 0, 30000);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdetails1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tdetails2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "التاريخ", "المتبقي", "  السعر", "المقدم", "المنتج", "الاسم"
            }
        ));
        tdetails1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails1.setRowHeight(25);
        tdetails1.setRowMargin(2);
        tdetails1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetails1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tdetails1);
        if (tdetails1.getColumnModel().getColumnCount() > 0) {
            tdetails1.getColumnModel().getColumn(0).setMinWidth(170);
            tdetails1.getColumnModel().getColumn(0).setPreferredWidth(170);
            tdetails1.getColumnModel().getColumn(0).setMaxWidth(170);
            tdetails1.getColumnModel().getColumn(5).setMinWidth(270);
            tdetails1.getColumnModel().getColumn(5).setPreferredWidth(272);
            tdetails1.getColumnModel().getColumn(5).setMaxWidth(270);
        }

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 920, 250));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel10.setText("اقساط");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel9.setText("مقدمات");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 120, 30));

        tdetails2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "التاريخ", "المتبقي", "القسط", "اليوم", "المنتج", "الاسم"
            }
        ));
        tdetails2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails2.setRowHeight(25);
        tdetails2.setRowMargin(2);
        tdetails2.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetails2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tdetails2);
        if (tdetails2.getColumnModel().getColumnCount() > 0) {
            tdetails2.getColumnModel().getColumn(0).setMinWidth(170);
            tdetails2.getColumnModel().getColumn(0).setPreferredWidth(170);
            tdetails2.getColumnModel().getColumn(0).setMaxWidth(170);
            tdetails2.getColumnModel().getColumn(3).setMinWidth(50);
            tdetails2.getColumnModel().getColumn(3).setPreferredWidth(50);
            tdetails2.getColumnModel().getColumn(3).setMaxWidth(50);
            tdetails2.getColumnModel().getColumn(5).setMinWidth(270);
            tdetails2.getColumnModel().getColumn(5).setPreferredWidth(270);
            tdetails2.getColumnModel().getColumn(5).setMaxWidth(270);
        }

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 920, 230));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        date.setText("jLabel1");
        jPanel10.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, -1));

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

    private void tdetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetails1MouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails1.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails1.getSelectedRow();
    }//GEN-LAST:event_tdetails1MouseClicked

    private void tdetails2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetails2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tdetails2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tdetails1;
    private javax.swing.JTable tdetails2;
    // End of variables declaration//GEN-END:variables
   
    
     public void mokdmat()
    {
        try {
           String sqll = "SELECT name,item,dailyprice,remaining,date,(remaining+dailyprice) as c FROM hany.amounts where type='مقدم' "
                   + "AND date like '"+datee+"%'  order by id DESC";
              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails1.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                      rs.getString("date"),
                      rs.getString("remaining"),
                      rs.getString("c"),
                      rs.getString("dailyprice"),
                      rs.getString("item"),
                      rs.getString("name")
                 
                                };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<11;i++)
                {
                 Object rowData[] = {
                       "",
                     "",
                     "",
                     "",
                     "",
                       };
                model.addRow(rowData);
                } 
        }
        catch (SQLException ex) {
            
        }
    }
      public void aqsat()
    {
        try {
           String sqll = "SELECT day,name,item,dailyprice,remaining,fulldate FROM hany.logs where type='قسط' "
                   + "AND date like '%"+datee+"%'  order by id DESC";
              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails2.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        
                      rs.getString("fulldate"),
                      rs.getString("remaining"),
                      rs.getString("dailyprice"),
                      rs.getString("day"),
                      rs.getString("item"),
                      rs.getString("name")
                 
                                };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<11;i++)
                {
                 Object rowData[] = {
                       "",
                     "",
                     "",
                     "",
                     "",
                       };
                model.addRow(rowData);
                } 
        }
        catch (SQLException ex) {
            
        }
    }
}
