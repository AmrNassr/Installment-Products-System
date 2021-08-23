/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class pay extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
        
    PreparedStatement pst ;
    ResultSet rs;
    public String y ;
    public String datee;
    public String fulldatee;
    public Double total ;
    String dayy=null;
    String month=null;
    String week=null;
    String dayyy=null;
     String itemmq="";
          String seriall1q="";
           public  Calendar cal;
    public pay() {
        initComponents();
        
         
         cal = new GregorianCalendar();
           int dayy =cal.get(Calendar.DAY_OF_MONTH);
             dayyy=String.valueOf(dayy);
 if(dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
         || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9 )
 {
      dayyy=String.valueOf(dayy);
     dayyy="0"+dayyy;
 }
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
                date.setText(year+"-"+month+"-"+dayyy);
                datee=date.getText().toString();
                cal.setTimeInMillis(System.currentTimeMillis());
        clear();
        Bill_id();
       // customers();
        comboxfromcombo3();
        comboxfromcombo2();
        comboxfromcombo1();
        cmmonth.setSelectedItem(month);
      AutoCompleteDecorator.decorate(cmname);
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
       
   
         cmname.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         cmitem.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         dailyprice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         amount.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        idnumber1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cmitem = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        pagenumber = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        cmname = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        dailyprice = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        idnumber = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        person2 = new javax.swing.JTextField();
        cmweek = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        totalx = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        numberr = new javax.swing.JTextField();
        cmtype = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        save2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdetails1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        save5 = new javax.swing.JButton();
        save4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        buyserial = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        cmmonth = new javax.swing.JComboBox();

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

        idnumber1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        idnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnumber1ActionPerformed(evt);
            }
        });
        idnumber1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idnumber1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idnumber1KeyTyped(evt);
            }
        });
        jPanel10.add(idnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 110, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel31.setText("الاسم");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, 30));

        cmitem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmitemActionPerformed(evt);
            }
        });
        jPanel10.add(cmitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 260, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setText("الصفحه");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 80, 30));

        page.setEditable(false);
        page.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        page.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 70, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setText("المنتج");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 80, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setText("الباقي");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 80, 30));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 70, 30));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 180, 40));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel30.setText("الصفحة");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 30));

        pagenumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pagenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagenumberActionPerformed(evt);
            }
        });
        pagenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagenumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagenumberKeyTyped(evt);
            }
        });
        jPanel10.add(pagenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, 30));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("بحث");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 120, 40));

        cmname.setEditable(true);
        cmname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmnameActionPerformed(evt);
            }
        });
        jPanel10.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 260, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setText("قيمة القسط");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 110, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel19.setText("اليوم");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, 30));

        day.setEditable(false);
        day.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 70, 30));

        dailyprice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel10.add(dailyprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 70, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel29.setText("البطاقة");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, 30));

        idnumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        idnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnumberActionPerformed(evt);
            }
        });
        idnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idnumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idnumberKeyTyped(evt);
            }
        });
        jPanel10.add(idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel27.setText("بالاسبوع");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 110, 30));

        person2.setEditable(false);
        person2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        person2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(person2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 30));

        cmweek.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmweek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " " }));
        jPanel10.add(cmweek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setText("نوع العميل");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, 30));

        totalx.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel10.add(totalx, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 60));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel20.setText("عدد");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 50, 30));

        numberr.setEditable(false);
        numberr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numberr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(numberr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 70, 30));

        cmtype.setEditable(true);
        cmtype.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "عادي", "VIP", "بلوك", "محامي" }));
        jPanel10.add(cmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setText("رقم الضامن");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 30));

        p.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pKeyTyped(evt);
            }
        });
        jPanel10.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 30));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("تفريغ");
        save2.setEnabled(false);
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel10.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 180, 40));

        tdetails1.setBackground(new java.awt.Color(138, 203, 195));
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
                "التاريخ", "المتبقي", "  =", "القسط", "  -", "المبلغ"
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
            tdetails1.getColumnModel().getColumn(0).setMinWidth(250);
            tdetails1.getColumnModel().getColumn(0).setPreferredWidth(250);
            tdetails1.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 920, 220));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setText("العميل");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 80, -1));

        save5.setBackground(new java.awt.Color(156, 166, 187));
        save5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save5.setText("تعديل بيانات");
        save5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save5ActionPerformed(evt);
            }
        });
        jPanel10.add(save5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 40, 30));

        save4.setBackground(new java.awt.Color(138, 203, 195));
        save4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save4.setText("عرض حساب");
        save4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save4ActionPerformed(evt);
            }
        });
        jPanel10.add(save4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 90));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        buyserial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyserial.setForeground(new java.awt.Color(255, 255, 255));
        buyserial.setText("Serial");
        jPanel10.add(buyserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 40));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("الشهر");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 80, 30));

        serial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serial.setForeground(new java.awt.Color(255, 255, 255));
        serial.setText("Serial");
        jPanel10.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        date.setText("date");
        jPanel10.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        id.setText("jLabel1");
        jPanel10.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        cmmonth.setEditable(true);
        cmmonth.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel10.add(cmmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 70, 30));

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
        
         Bill_id();
        double amountt = Double.parseDouble(amount.getText());
                      
                       double dailypricee = Double.parseDouble(dailyprice.getText());
                       total= amountt-dailypricee;
                       String namee = cmname.getSelectedItem().toString();
                       String itemm = itemmq;
                       String pagee = page.getText().toString();
                       String seriall=serial.getText().toString();
                       
                      if(cmweek.getSelectedIndex() == -1)
                       {
                       }
                       else
                       {
                             week=cmweek.getSelectedItem().toString(); 
                       }
                        if(cmmonth.getSelectedIndex() == -1)
                       {
                       }
                       else
                       {
                             month=cmmonth.getSelectedItem().toString(); 
                       }
                        if(!day.getText().trim().isEmpty())
                        {
                          dayy = day.getText().toString();
                        }
                        
                        try
                   {
                       
                      
                       
                       if (amountt < dailypricee)
                       {
                           JOptionPane.showMessageDialog(this, " المبلغ المدفوع اكبر من المتبقي");
                       }
                       else
                           
                       {
                           
                           
                           if( cmname.getSelectedItem().toString().trim().isEmpty()||cmitem.getSelectedItem().toString().trim().isEmpty()||dailyprice.getText().trim().isEmpty()||page.getText().trim().isEmpty() )
                           {
                               JOptionPane.showMessageDialog(this, " اكمل البيانات ");
                           }
                           else
                           {
                               int dialogButton = JOptionPane.YES_NO_OPTION;
                               int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                               if(dialogResult == 0) {
                                   
                                   try{
                                      
                                      
                                       TimeZone tz = TimeZone.getTimeZone("GMT+02");
                     Calendar c = Calendar.getInstance(tz);
                    String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
                    String.format("%02d" , c.get(Calendar.MINUTE));
                    String fulldatee=datee+" "+time;
                                         
                                      
                                  String fullserial=buyserial.getText().toString();
                                       String sql = "INSERT INTO hany.logs (type,buyserial,serial,week,name,item,day,date,month,dailyprice,remaining,page,fulldate,beforee) VALUES"
                                               + " ('قسط','"+buyserial.getText()+"','"+serial.getText()+"',"
                                               + "'"+week+"','"+namee+"','"+itemm+"','"+dayy+"','"+datee+"',"
                                               + "'"+month+"','"+dailypricee+"','"+total+"','"+pagee+"','"+fulldatee+"','"+amountt+"')";
                                       pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
                                       pst.execute();
                                       JOptionPane.showMessageDialog(null, "تم تسجيل القسط");
                                       set();
                                       privatetablelord(fullserial);
                                       cmitem.setEnabled(true);
                                       save.setEnabled(true);
                                      
                                    String sqll = "INSERT INTO hany.amounts (type,buyserial,serial,week,name,item,day,date,month,dailyprice,remaining,page) VALUES"
                                               + " ('قسط','"+buyserial.getText()+"','"+serial.getText()+"','"+week+"',"
                                            + "'"+namee+"','"+itemm+"','"+dayy+"','"+fulldatee+"','"+month+"',"
                                            + "'"+dailypricee+"','"+total+"','"+pagee+"')";
                                       pst = (PreparedStatement)DBConnect.con.prepareStatement(sqll);
                                       pst.execute();
                                    
                                     
                                       String sqla = "UPDATE hany.buy SET total='"+total+"', kest='old' "
                                               + "where name='"+cmname.getSelectedItem().toString()+"' and serial='"+seriall1q+"' and  item='"+itemmq+"'";
                                       pst=(PreparedStatement) DBConnect.con.prepareStatement(sqla);
                                       pst.executeUpdate();
                                  
                                     
                                       String sqlad = "UPDATE hany.buy SET kind='"+cmtype.getSelectedItem().toString()+"' "
                                               + "where  name='"+cmname.getSelectedItem().toString()+"' and page='"+pagee+"'";
                                       pst=(PreparedStatement) DBConnect.con.prepareStatement(sqlad);
                                       pst.executeUpdate();
                                  
                                     
                                       String sqladd = "UPDATE hany.customer SET type='"+cmtype.getSelectedItem().toString()+"' "
                                               + "where name='"+cmname.getSelectedItem().toString()+"' and page='"+pagee+"'";
                                       pst=(PreparedStatement) DBConnect.con.prepareStatement(sqladd);
                                       pst.executeUpdate();
                                       save.setEnabled(false);
                                
                                    
             String sqlp="SELECT sum(total) as z  FROM hany.buy where name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sqlp);
             rs=pst.executeQuery();
             if(rs.next()){
                 totalx.setText(rs.getString("z"));
             }
             Bill_id();
                
            
                                       
                                   }
                                   catch(Exception e ){
                                       JOptionPane.showMessageDialog(null,e);
                                   }
                                    
                                   
                               }
                               else
                               {
                                   JOptionPane.showMessageDialog(this, " تم الغاء العمليه");
                               
                               }
                               
                           }
                           
                       }
                   }
                   catch(Exception e )
                   {
                       JOptionPane.showMessageDialog(this, "خطاء بالمبالغ المدخله");
                   }
                        
        
             
              
                
    }//GEN-LAST:event_saveActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
     
      try

        {

             String sqll="SELECT item,name,serial FROM hany.buy where 1=1 ";

              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs=pst.executeQuery();

            while(rs.next()){

                 String name = rs.getString("item")+":"+rs.getString("serial");

                cmitem.removeItem(name);
                

            }

        }

        catch(Exception ex)

        {
        JOptionPane.showMessageDialog(null,ex);
        }

        try {
            String namee=cmname.getSelectedItem().toString();

            String sql="SELECT item ,name,serial FROM hany.buy where  1=1 and total > 0";

            if(!cmname.getSelectedItem().toString().trim().isEmpty())

                {

                    sql=sql+" AND name ='"+namee+"'";

                }

            pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);

            rs=pst.executeQuery();
          
            while(rs.next()){

                String name = rs.getString("item")+":"+rs.getString("serial");

                cmitem.addItem(name);

               

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);

        }
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        clear();
        get();
    }//GEN-LAST:event_save2ActionPerformed

    private void tdetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetails1MouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails1.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails1.getSelectedRow();
    }//GEN-LAST:event_tdetails1MouseClicked

    private void save4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save4ActionPerformed
                 
            String totall = null;
     try {
             String sql="SELECT sum(total) as x FROM hany.buy where name = '"+cmname.getSelectedItem().toString()+"' group by name;";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                totall = rs.getString("x");
  
             }

         } catch (SQLException ex) {
             
         }
           
            InputStream in=null;
            try {
    String name = cmname.getSelectedItem().toString();
   
                String reportpath= "\\\\192.168.1.27\\hany\\cart.jasper";
               // String reportpath= "D:\\hany\\cart.jasper";
                Map<String,Object> para = new HashMap<String,Object>();
                para.put("name", name);
                para.put("total", totall);
                 JasperPrint j = JasperFillManager.fillReport(reportpath, para,DBConnect.con);
                JasperViewer.viewReport(j,false);
            }
            catch (JRException ex) {
                JOptionPane.showMessageDialog(null,ex);
            } finally {
                 
            }
        

    }//GEN-LAST:event_save4ActionPerformed

    private void save5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save5ActionPerformed
        try {
            String l = cmname.getSelectedItem().toString();
            complete m = new complete(l);
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save5ActionPerformed

    private void idnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnumberActionPerformed

    private void idnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumberKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll="SELECT name  FROM hany.buy ";

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

                String sql="SELECT distinct name  FROM hany.buy  where idnumber like '%"+idnumber.getText()+"%' order by name ";
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
    }//GEN-LAST:event_idnumberKeyPressed

    private void idnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumberKeyTyped

    }//GEN-LAST:event_idnumberKeyTyped

    private void pagenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagenumberActionPerformed

    private void pagenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagenumberKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll="SELECT name  FROM hany.buy ";

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

                String sql="SELECT distinct name  FROM hany.buy  where page like '%"+pagenumber.getText()+"%' order by name ";
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
    }//GEN-LAST:event_pagenumberKeyPressed

    private void pagenumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagenumberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pagenumberKeyTyped

    private void idnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnumber1ActionPerformed

    private void idnumber1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumber1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll="SELECT name  FROM hany.buy ";

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

                String sql="SELECT distinct name  FROM hany.buy  where name like '%"+idnumber1.getText()+"%' order by name ";
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
    }//GEN-LAST:event_idnumber1KeyPressed

    private void idnumber1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumber1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_idnumber1KeyTyped

    private void cmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameActionPerformed

    private void cmitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmitemActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pKeyPressed
                if(evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll="SELECT name  FROM hany.buy ";

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

                String sql="SELECT distinct name  FROM hany.buy  where p1='"+p.getText()+"' or p2='"+p.getText()+"' or p3='"+p.getText()+"' ";
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
    }//GEN-LAST:event_pKeyPressed

    private void pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel buyserial;
    private javax.swing.JComboBox cmitem;
    private javax.swing.JComboBox cmmonth;
    private javax.swing.JComboBox cmname;
    private javax.swing.JComboBox cmtype;
    private javax.swing.JComboBox cmweek;
    private javax.swing.JTextField dailyprice;
    private javax.swing.JLabel date;
    private javax.swing.JTextField day;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idnumber;
    private javax.swing.JTextField idnumber1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numberr;
    private javax.swing.JTextField p;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pagenumber;
    private javax.swing.JTextField person2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save4;
    private javax.swing.JButton save5;
    private javax.swing.JLabel serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails1;
    private javax.swing.JLabel totalx;
    // End of variables declaration//GEN-END:variables
       public void set()
       {
           cmname.setEnabled(false);
           cmitem.setEnabled(false);
           save1.setEnabled(false);
           save.setEnabled(false);
           save2.setEnabled(true);
           dailyprice.setEditable(false);
           cmweek.setEnabled(false);
           cmmonth.setEnabled(false);
           
       }
        public void get()
       {
           cmname.setEnabled(true);
           cmitem.setEnabled(true);
           save1.setEnabled(true);
           save.setEnabled(true);
           save2.setEnabled(false);
           dailyprice.setEditable(true);
           cmweek.setEnabled(true);
           cmmonth.setEnabled(true);
       }
    public void clear()
{
    p.setText("");
    cmname.setSelectedIndex(0);
    page.setText("");
    cmweek.setSelectedIndex(0);
    person2.setText("");
    cmtype.setSelectedIndex(0);
    cmitem.setSelectedIndex(0);
    amount.setText(""); 
    dailyprice.setText(""); 
    pagenumber.setText("");
    idnumber.setText("");
    day.setText("");
    serialid.setText("");
    idnumber1.setText("");
    
}
   public void customers()
   {
        try {
             String sql="SELECT distinct name  FROM hany.customer order by name ";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmname.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
   
     public void comboxfromcombo2()
      {
            cmname.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT page,name,type  FROM hany.customer where name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 page.setText(rs.getString("page"));
                if(rs.getString("type") != null)
                {
                      cmtype.setSelectedItem(rs.getString("type"));
                      String test=rs.getString("type");
                      if(test.equals("بلوك") || test.equals("محامي"))
                 {
                     totalx.setBackground(Color.RED);
                 }
                 else if (test.equals("عادي"))
                 {
                     totalx.setBackground(Color.WHITE);
                 }
                  else if (test.equals("VIP"))
                  {
                      totalx.setBackground(Color.GREEN);
                  }
                 
                    
                }
                else
                {
                    cmtype.setSelectedItem("عادي");
                    totalx.setBackground(Color.YELLOW);
                    
                }
                
                   
                
                
                 
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
       public void comboxfromcombo3()
      {
            cmname.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT sum(total) as z  FROM hany.buy where name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 totalx.setText(rs.getString("z"));
                
              }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
    public void Bill_id(){

         try {
             String sql = "SELECT serial FROM hany.logs where id=(select max(id)FROM hany.logs )";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 String rnno=rs.getString("serial");
                 int co=rnno.length();
                 String txt=rnno.substring(0,3);
                 String num = rnno.substring(3,co);
                 int n = Integer.parseInt(num);
                 n++;
                 String snum=Integer.toString(n);
                 String ftxt=txt+snum;
                serial.setText(ftxt);
             }
             else
             {
               serial.setText("BN-1001");
             }
         } catch (SQLException ex) {
            
         }
    
}
    
    
     public void comboxfromcombo1()
      {
         
                   cmitem.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmitemm = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
                     if(cmitem.getSelectedIndex()==0)
                     {
                  
                     }
                     else
                     {
                           String name = cmitem.getSelectedItem().toString();
                    String[] arrOfStr = name.split(":");
                     itemmq=arrOfStr[0];
                     seriall1q=arrOfStr[1];
                     }
                 
                     
       
             String sql="SELECT id,week,name,price,dailyprice,total,page,day,number,serial,person2 FROM hany.buy where serial='"+seriall1q+"' and  item='"+itemmq+"' and name='"+cmname.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) DBConnect.con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 amount.setText(rs.getString("total"));
                 dailyprice.setText(rs.getString("dailyprice"));
                 day.setText(rs.getString("day"));
                 id.setText(rs.getString("id"));
                 numberr.setText(rs.getString("number"));
                 cmweek.setSelectedItem(rs.getString("week"));
                 buyserial.setText(rs.getString("serial"));
                 person2.setText(rs.getString("person2"));
                 page.setText(rs.getString("page"));
              }
             save.setEnabled(true);

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
     
     public void report(String x)
     {
           InputStream in=null;
            try {
in = this.getClass().getResourceAsStream("/reports/resets.jasper");
                String reportpath= "\\\\192.168.1.15\\\\resets.jasper";
                Map<String,Object> para = new HashMap<String,Object>();
                para.put("buyserial", x);
                 JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
                JasperViewer.viewReport(j,false);
            }
            catch (JRException ex) {
               JOptionPane.showMessageDialog(null, ex);
            } finally {
            }
     }
    
     public void privatetablelord(String x)
    {
        try {
           String sqll = "SELECT beforee,dailyprice,remaining,fulldate  FROM hany.logs where buyserial='"+x+"'";
              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails1.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                       rs.getString("fulldate"),
                      rs.getString("remaining"),
                      "=",
                         rs.getString("dailyprice"),
                         "-",
                       rs.getString("beforee")
                 
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
