/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
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
import java.sql.Date;
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
public final class customer extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
    PreparedStatement pst;
    ResultSet rs;
    public String y;
    public String check;
    public String datee;
    public Calendar cal;
    public String pphone1;
    public String pphone2;
    public String ppp2;
    public String ppp1;
    public String ttt1;
    public String ttt2;
    String dayyy;

    String fulldatee;

    public customer() throws ParseException {
        try {
            initComponents();
            String sql = "DELETE FROM hany.montgbill WHERE mark='No'";
            pst = (PreparedStatement)DBConnect.con.prepareStatement(sql);
            pst.execute();
            process_id();
            AutoCompleteDecorator.decorate(cmname);
            // customers();
            AutoCompleteDecorator.decorate(cmitem);

            //customers();
            comboxfromcombo3();
            items();
            clear();
            check = "true";

            cal = new GregorianCalendar();
            int dayy = cal.get(Calendar.DAY_OF_MONTH);
            dayyy = String.valueOf(dayy);
            if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                    || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
                dayyy = String.valueOf(dayy);
                dayyy = "0" + dayyy;
            }
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            date1.setText(year + "-" + month + "-" + dayyy);
            datee = date1.getText().toString();

            TimeZone tz = TimeZone.getTimeZone("GMT+02");
            Calendar c = Calendar.getInstance(tz);
            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                    + String.format("%02d", c.get(Calendar.MINUTE));
            fulldatee = datee + " " + time;
            TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tdetails.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            name.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            page.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            phone.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            address.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            p1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            p2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            d1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            d2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            t2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            comboxfromcombo();
            employee();
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        d2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        d3 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        idnumber2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        idnumber3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        idnumber1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        idnumber = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        phone2 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        visa = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cmvisa = new javax.swing.JComboBox();
        work = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        serialid1 = new javax.swing.JLabel();
        logserial = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        monthnumber = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        idnumber4 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        page1 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        cmemployee = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        cmvisa1 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        esalat = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        paid = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmweek = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        visa1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        available = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        cmitem = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmname = new javax.swing.JComboBox();
        save5 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        save2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        person2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        dailyprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phone1 = new javax.swing.JLabel();
        phone3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        idnumber5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmitem1 = new javax.swing.JComboBox();
        number1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        available1 = new javax.swing.JTextField();
        serial1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        phone4 = new javax.swing.JLabel();
        phone5 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        idnumber7 = new javax.swing.JLabel();
        serialid3 = new javax.swing.JLabel();

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

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setText("اسم العميل");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel10.setText("العنوان");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 80, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setText("الصفحه");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 80, 30));

        page.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 70, 30));

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 190, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setText("الضامن 1");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 140, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel15.setText("رقم الضامن");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 120, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setText("العنوان");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 80, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setText("الضامن2 ");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 150, 30));

        t2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 180, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel19.setText("رقم الضامن");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 120, 30));

        p2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 120, 30));

        d2.setColumns(20);
        d2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        d2.setRows(5);
        d2.setText("\n");
        jScrollPane2.setViewportView(d2);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 270, 40));

        d1.setColumns(20);
        d1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        d1.setRows(5);
        d1.setText("\n");
        jScrollPane3.setViewportView(d1);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 270, 40));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 360, 70));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel40.setText("الضامن3 ");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 150, 30));

        t3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 180, 30));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel41.setText("رقم الضامن");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 120, 30));

        p3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 120, 30));

        d3.setColumns(20);
        d3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        d3.setRows(5);
        d3.setText("\n");
        jScrollPane4.setViewportView(d3);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 270, 40));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel42.setText("العنوان");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 80, -1));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel38.setText("رقم قومي");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        idnumber2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(idnumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, 30));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel39.setText("رقم قومي");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 100, 30));

        idnumber3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(idnumber3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 130, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel37.setText("رقم قومي");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, 30));

        idnumber1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(idnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 30));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel35.setText("رقم قومي");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, 30));

        idnumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 130, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel20.setText("العنوان");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 80, -1));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("حفظ");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 180, 40));

        phone2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 30));

        p1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 120, 30));

        t1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 180, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setText("رقم ثاني");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 90, 30));

        phone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel33.setText("رقم");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 30));

        visa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(visa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, 30));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel30.setText("الوظيفة");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel32.setText("النوع");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 80, 40));

        cmvisa.setEditable(true);
        cmvisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "عادي", "فيزا" }));
        jPanel10.add(cmvisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, 30));

        work.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel9.setText("رقم التليفون");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 120, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        serial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serial.setForeground(new java.awt.Color(255, 255, 255));
        serial.setText("Serial");
        jPanel10.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 160, 40));

        date1.setText("date");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        serialid1.setText("jLabel1");
        jPanel10.add(serialid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        logserial.setText("jLabel1");
        jPanel10.add(logserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jTabbedPane1.addTab("العملاء", jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel11.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel45.setText("عدد الشهور");
        jPanel11.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 90, 30));

        monthnumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        monthnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monthnumberKeyReleased(evt);
            }
        });
        jPanel11.add(monthnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 60, 30));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel43.setText("اسم العميل");
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        name2.setEditable(false);
        name2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 180, 30));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel47.setText("رقم قومي");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 100, 30));

        idnumber4.setEditable(false);
        idnumber4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        idnumber4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(idnumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 170, 30));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel48.setText("الصفحه");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 80, 30));

        page1.setEditable(false);
        page1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        page1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(page1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 70, 30));

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 180, 30));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel56.setText("المسئول");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 70, 30));

        cmemployee.setEditable(true);
        cmemployee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmemployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        jPanel11.add(cmemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 160, 30));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel50.setText("الضامن 1");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 120, -1));

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 30));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel52.setText("الضامن 2");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 30));

        cmvisa1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "عادي", "فيزا" }));
        jPanel11.add(cmvisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 120, 30));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel55.setText("النوع");
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 80, 30));

        esalat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        esalat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(esalat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 50));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel31.setText("ايصالات");
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 80, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setText("اليوم");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 80, 30));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel11.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 160, 40));

        paid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel11.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 70, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setText("قيمة القسط");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 90, 30));

        cmweek.setEditable(true);
        cmweek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " " }));
        jPanel11.add(cmweek, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 70, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setText("بالاسبوع");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 110, 30));

        price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 80, 30));

        day.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 70, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setText("سعر المنتج");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 110, 30));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel53.setText("الضامن 3");
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, 30));

        t6.setEditable(false);
        t6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 30));

        visa1.setEditable(false);
        visa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        visa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(visa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, 30));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel44.setText("رقم");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 30));

        available.setEditable(false);
        available.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        available.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 50, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setText("المتاح");
        jPanel11.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 60, 30));

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
        jPanel11.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 190, 30));

        cmitem.setEditable(true);
        cmitem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmitemActionPerformed(evt);
            }
        });
        jPanel11.add(cmitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 240, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setText("العميل");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 70, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setText("اسم العميل");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        cmname.setEditable(true);
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmname.setAutoscrolls(true);
        cmname.setDoubleBuffered(true);
        cmname.setFocusCycleRoot(true);
        cmname.setFocusTraversalPolicyProvider(true);
        cmname.setInheritsPopupMenu(true);
        cmname.setRequestFocusEnabled(true);
        cmname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmnameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmnameMousePressed(evt);
            }
        });
        cmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmnameActionPerformed(evt);
            }
        });
        cmname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmnameKeyTyped(evt);
            }
        });
        jPanel11.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 260, 30));

        save5.setBackground(new java.awt.Color(156, 166, 187));
        save5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save5.setForeground(new java.awt.Color(255, 255, 255));
        save5.setText("جديد");
        save5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save5ActionPerformed(evt);
            }
        });
        jPanel11.add(save5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 30));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("يتبع");
        jPanel11.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 50, -1));

        number.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setText("1");
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        jPanel11.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 70, 30));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("تفريغ");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel11.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 130, 40));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setText("العدد");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 50, 30));

        person2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel11.add(person2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("المنتج");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 80, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setText("المقدم");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 80, 30));

        dailyprice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dailyprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dailyprice.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dailypriceCaretUpdate(evt);
            }
        });
        dailyprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dailypriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dailypriceKeyTyped(evt);
            }
        });
        jPanel11.add(dailyprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 130, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 630, 270));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        phone1.setText("jLabel1");
        jPanel11.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        phone3.setText("jLabel4");
        jPanel11.add(phone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        p4.setText("jLabel1");
        jPanel11.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        p5.setText("jLabel4");
        jPanel11.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, -1, -1));

        p6.setText("jLabel6");
        jPanel11.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, -1, -1));

        idnumber5.setText("jLabel1");
        jPanel11.add(idnumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        jTabbedPane2.addTab("البيع", jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel12.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel8.setText("اسم المنتج");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 120, -1));

        cmitem1.setEditable(true);
        cmitem1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmitem1.setEnabled(false);
        cmitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmitem1ActionPerformed(evt);
            }
        });
        jPanel12.add(cmitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 230, 30));

        number1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        number1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number1.setText("1");
        number1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number1KeyReleased(evt);
            }
        });
        jPanel12.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 70, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel46.setText("العدد");
        jPanel12.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 50, 30));

        price1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        price1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price1KeyReleased(evt);
            }
        });
        jPanel12.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 80, 30));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel49.setText("سعر الشراء");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 120, 30));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setText("المتاح");
        jPanel12.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 60, 30));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel54.setText("اجمالي الفاتورة");
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 130, 40));

        totalbill.setEditable(false);
        totalbill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(totalbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 110, 40));

        available1.setEditable(false);
        available1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        available1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(available1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, 30));

        serial1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serial1.setText("jLabel2");
        jPanel12.add(serial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 40));

        add.setBackground(new java.awt.Color(138, 203, 195));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("اضافة");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel12.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 90, 40));

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "العدد", "السعر", "اسم المنتج", "ID"
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(3).setMinWidth(1);
            tdetails.getColumnModel().getColumn(3).setPreferredWidth(1);
            tdetails.getColumnModel().getColumn(3).setMaxWidth(1);
        }

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 650, 240));

        delete.setBackground(new java.awt.Color(138, 203, 195));
        delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete.setText("مسح العنصر");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel12.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        phone4.setText("jLabel1");
        jPanel12.add(phone4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        phone5.setText("jLabel4");
        jPanel12.add(phone5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        p7.setText("jLabel1");
        jPanel12.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, -1, -1));

        p8.setText("jLabel4");
        jPanel12.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));

        p9.setText("jLabel6");
        jPanel12.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, -1));

        idnumber7.setText("jLabel1");
        jPanel12.add(idnumber7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, -1));

        serialid3.setText("jLabel1");
        jPanel12.add(serialid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, -1, -1));

        jTabbedPane2.addTab("المنتجات", jPanel12);

        jTabbedPane1.addTab("عمليات الشراء", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("الشراء");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

    }//GEN-LAST:event_nameKeyTyped

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        double availablex = Double.parseDouble(available.getText());
        if (availablex < Integer.parseInt(number.getText())) {
            JOptionPane.showMessageDialog(this, "لا يوجد عدد كافي بالمخزن");
        } else {
            Bill_id();
            if (check.equals("true")) {
                try {
                    double pricee = Double.parseDouble(price.getText());
                    String weeek = cmweek.getSelectedItem().toString();
                    double paidd = Double.parseDouble(paid.getText());
                    int numberr = Integer.parseInt(number.getText());
                    double totall = (pricee * numberr) - paidd;
                    String dayy = day.getText().toString();
                    double dailypricee = Double.parseDouble(dailyprice.getText());
                    String namee = cmname.getSelectedItem().toString();
                    String itemm = cmitem.getSelectedItem().toString();
                    String pagee = page.getText().toString();
                    double total = pricee - dailypricee;

                    if (paidd > pricee) {
                        JOptionPane.showMessageDialog(this, " المبلغ المدفوع اكبر من سعر المنتج");
                    } else {

                        if (cmitem.getSelectedItem().toString().trim().isEmpty() || price.getText().trim().isEmpty() || dailyprice.getText().trim().isEmpty() || page1.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(this, " اكمل البيانات ");
                        } else {
                            int dialogButton = JOptionPane.YES_NO_OPTION;
                            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                            if (dialogResult == 0) {

                                try {

                                    if (!itemm.equals("اجهزة")) {
                                        String sql = "INSERT INTO hany.buy (employee,idnumber,person2,kest,week,number,date,day,name,serial,item,page,price,dailyprice,paid,total,phone,phone2,p1,p2,p3,t1,t2,t3)"
                                                + " VALUES "
                                                + "('" + cmemployee.getSelectedItem().toString() + "','" + idnumber5.getText() + "','" + person2.getText() + "','new','" + weeek + "','" + numberr + "','" + date1.getText().toString() + "','" + dayy + "',"
                                                + "'" + namee + "','" + serial.getText() + "','" + itemm + "','" + pagee + "','" + pricee + "',"
                                                + "'" + dailypricee + "','" + paidd + "','" + totall + "','" + phone1.getText() + "','" + phone3.getText() + "','" + p4.getText() + "',"
                                                + "'" + p5.getText() + "','" + p6.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "')";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                                        pst.execute();
                                        String sqll = "INSERT INTO hany.logs (type,buyserial,serial,week,name,item,day,date,dailyprice,remaining,page,fulldate,beforee) VALUES"
                                                + " ('مقدم','" + serial.getText() + "','" + logserial.getText() + "',"
                                                + "'" + cmweek.getSelectedItem().toString() + "','" + namee + "','" + itemm + "','" + dayy + "','" + datee + "',"
                                                + "'" + dailypricee + "','" + total + "','" + pagee + "','" + fulldatee + "','" + price.getText() + "')";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
                                        pst.execute();

                                        // done();
                                        TimeZone tz = TimeZone.getTimeZone("GMT+02");
                                        Calendar c = Calendar.getInstance(tz);
                                        String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                                                + String.format("%02d", c.get(Calendar.MINUTE));
                                        String fulldatee = datee + " " + time;
                                        String sqlz = "INSERT INTO hany.amounts (type,buyserial,name,item,day,date,dailyprice,remaining,page,week) VALUES"
                                                + " ('مقدم','" + serial.getText() + "','" + namee + "','" + itemm + "','" + dayy + "','" + fulldatee + "','" + dailypricee + "','" + totall + "','" + pagee + "','" + weeek + "')";

                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqlz);
                                        pst.execute();
                                        process_id();
                                        String sqla = "UPDATE hany.customer SET esalat='" + esalat.getText() + "' "
                                                + "where  name='" + name.getText() + "' and page='" + pagee + "'";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                                        pst.executeUpdate();

                                        String sqla1d = "UPDATE hany.storeitemlist SET number =number-" + number.getText() + " WHERE  name='" + cmitem.getSelectedItem().toString() + "'";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                                        pst.executeUpdate();
                                        String sqll33 = "INSERT INTO hany.storeitemlogs (name,supplier,number,type,date,fulldate,price) "
                                                + "VALUES('" + cmitem.getSelectedItem().toString() + "','" + name2.getText() + "','" + number.getText() + "','تقسيط','" + datee + "','" + fulldatee + "','" + price.getText() + "')";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                                        pst.execute();

                                        JOptionPane.showMessageDialog(null, "تم الشراء بنجاح");
                                        save.setEnabled(false);

                                    } else {
                                        String sqldaff = "SELECT * FROM hany.montgbill where datee='" + datee + "' and serial='" + serial1.getText() + "'";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaff);
                                        rs = pst.executeQuery();
                                        if (rs.next()) {

                                            String sql = "INSERT INTO hany.buy (smontgat,employee,idnumber,person2,kest,week,number,date,day,name,serial,item,page,price,dailyprice,paid,total,phone,phone2,p1,p2,p3,t1,t2,t3)"
                                                    + " VALUES "
                                                    + "('" + serial1.getText() + "','" + cmemployee.getSelectedItem().toString() + "','" + idnumber5.getText() + "','" + person2.getText() + "','new','" + weeek + "','" + numberr + "','" + date1.getText().toString() + "','" + dayy + "',"
                                                    + "'" + namee + "','" + serial.getText() + "','" + itemm + "','" + pagee + "','" + pricee + "',"
                                                    + "'" + dailypricee + "','" + paidd + "','" + totall + "','" + phone1.getText() + "','" + phone3.getText() + "','" + p4.getText() + "',"
                                                    + "'" + p5.getText() + "','" + p6.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "')";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                                            pst.execute();
                                            String sqll = "INSERT INTO hany.logs (type,buyserial,serial,week,name,item,day,date,dailyprice,remaining,page,fulldate,beforee) VALUES"
                                                    + " ('مقدم','" + serial.getText() + "','" + logserial.getText() + "',"
                                                    + "'" + cmweek.getSelectedItem().toString() + "','" + namee + "','" + itemm + "','" + dayy + "','" + datee + "',"
                                                    + "'" + dailypricee + "','" + total + "','" + pagee + "','" + fulldatee + "','" + price.getText() + "')";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
                                            pst.execute();

                                            // done();
                                            TimeZone tz = TimeZone.getTimeZone("GMT+02");
                                            Calendar c = Calendar.getInstance(tz);
                                            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                                                    + String.format("%02d", c.get(Calendar.MINUTE));
                                            String fulldatee = datee + " " + time;
                                            String sqlz = "INSERT INTO hany.amounts (type,buyserial,name,item,day,date,dailyprice,remaining,page,week) VALUES"
                                                    + " ('مقدم','" + serial.getText() + "','" + namee + "','" + itemm + "','" + dayy + "','" + fulldatee + "','" + dailypricee + "','" + totall + "','" + pagee + "','" + weeek + "')";

                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqlz);
                                            pst.execute();
                                            process_id();
                                            String sqla = "UPDATE hany.customer SET esalat='" + esalat.getText() + "' "
                                                    + "where  name='" + name.getText() + "' and page='" + pagee + "'";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                                            pst.executeUpdate();

                                            String sqla1d = "UPDATE hany.storeitemlist SET number =number-" + number.getText() + " WHERE  name='" + cmitem.getSelectedItem().toString() + "'";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                                            pst.executeUpdate();
                                            String sqll33 = "INSERT INTO hany.storeitemlogs (name,supplier,number,type,date,fulldate,price) "
                                                    + "VALUES('" + cmitem.getSelectedItem().toString() + "','" + name2.getText() + "','" + number.getText() + "','تقسيط','" + datee + "','" + fulldatee + "','" + price.getText() + "')";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                                            pst.execute();
                                            String sqldaf = "SELECT * FROM hany.montgbill where serial='" + serial1.getText() + "' ";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                                            rs = pst.executeQuery();
                                            while (rs.next()) {
                                                String sqla1dd = "UPDATE hany.storeitemlist SET number =number-" + rs.getString("number") + " WHERE  name='" + rs.getString("name") + "'";
                                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1dd);
                                                pst.executeUpdate();
                                                 String sqll333 = "INSERT INTO hany.storeitemlogs (name,supplier,number,type,date,fulldate,price) "
                                                + "VALUES('" +rs.getString("name") + "','" + name2.getText() + "','" + rs.getString("number")  + "','تقسيط','" + datee + "','" + fulldatee + "','" + rs.getString("price") + "')";
                                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll333);
                                        pst.execute();

                                            }

                                            JOptionPane.showMessageDialog(null, "تم الشراء بنجاح");
                                            save.setEnabled(false);
                                            String sqla2 = "UPDATE hany.montgbill SET mark ='Yes' WHERE  serial='" + serial1.getText() + "'";
                                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla2);
                                            pst.executeUpdate();
                                            auto_id();
                                            cmitem1.setEnabled(false);
                                            add.setEnabled(false);
                                            delete.setEnabled(false);
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "اختر المنتجات");
                                        }
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, e);
                                }
                                if (paidd > 0) {

                                }

                            } else {
                                JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                            }

                        }

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "خطاء بالمبالغ المدخله");
                }

            }
        }

    }//GEN-LAST:event_saveActionPerformed

    private void cmnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameMouseClicked

    private void cmnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmnameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameMouseEntered

    private void cmnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmnameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameMousePressed

    private void cmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmnameActionPerformed

    }//GEN-LAST:event_cmnameActionPerformed

    private void cmnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameKeyPressed

    private void cmnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmnameKeyTyped

    }//GEN-LAST:event_cmnameKeyTyped

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void name1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                String sqll = "SELECT name  FROM hany.customer ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");

                    cmname.removeItem(name);

                }
            } catch (SQLException ex) {

            }
            cmname.setSelectedIndex(0);
            try {

                String sql = "SELECT name  FROM hany.customer  where name like '%" + name1.getText() + "%' order by name ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
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

    private void save5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save5ActionPerformed
        try {
            String l = name.getText().toString();
            complete m = new complete(l);
            m.setVisible(true);
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_save5ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        try {
            String idnumberr = idnumber.getText();
            String idnumberr1 = idnumber1.getText();
            String idnumberr2 = idnumber2.getText();
            String idnumberr3 = idnumber3.getText();
            String namee = name.getText();
            String phonee = phone.getText();
            String phonee2 = phone2.getText();
            String adresss = address.getText();
            String pagee = page.getText();
            String tt1 = t1.getText();
            String tt2 = t2.getText();
            String dd1 = d1.getText();
            String dd2 = d2.getText();
            String pp1 = p1.getText();
            String pp2 = p1.getText();
            String dd3 = d3.getText();
            String pp3 = p3.getText();
            String tt3 = t3.getText();
            try {
                if (name.getText().trim().isEmpty() || page.getText().trim().isEmpty() || phone.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, " اكمل البيانات ");
                } else {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                    if (dialogResult == 0) {
                        try {
                            TimeZone tz = TimeZone.getTimeZone("GMT+02");
                            Calendar c = Calendar.getInstance(tz);
                            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                                    + String.format("%02d", c.get(Calendar.MINUTE));
                            String fulldatee = datee + " " + time;
                            String sqll = "INSERT INTO hany.customer (idnumber,type,visa,visanumber,date,esalat,work,phone2,"
                                    + "name,phone,address,page, t1,t2,d1,d2,p1,p2,idnumber1,idnumber2,p3,t3,d3,idnumber3) VALUES"
                                    + " ('" + idnumberr + "','عادي','" + cmvisa.getSelectedItem().toString() + "',"
                                    + "'" + visa.getText() + "','" + datee + "',"
                                    + "'" + esalat.getText() + "','" + work.getText() + "',"
                                    + "'" + phonee2 + "','" + namee + "','" + phonee + "',"
                                    + "'" + adresss + "','" + pagee + "','" + tt1 + "',"
                                    + "'" + tt2 + "','" + dd1 + "','" + dd2 + "','" + pp1 + "','" + pp2 + "',"
                                    + "'" + idnumberr1 + "','" + idnumberr2 + "','" + pp3 + "','" + tt3 + "','" + dd3 + "','" + idnumberr3 + "')";
                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
                            pst.execute();
                            clear();
                            JOptionPane.showMessageDialog(null, "تم تسحجيل العيل بنجاح");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "العميل موجود من قبل");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                    }

                }

            } catch (Exception e) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        clear2();
        save.setEnabled(true);
    }//GEN-LAST:event_save2ActionPerformed

    private void dailypriceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_dailypriceCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_dailypriceCaretUpdate

    private void cmitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmitemActionPerformed
        Object obj = evt.getSource();
        if (obj == cmitem) {
            if (cmitem.getSelectedItem().toString().equals("اجهزة")) {
                try {
                    String sql = "SELECT *  FROM hany.storeitemlist where name ='" + cmitem.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        available.setText(rs.getString("number"));

                    }
                    auto_id();
                    cmitem1.setEnabled(true);
                    add.setEnabled(true);
                    delete.setEnabled(true);
                    totalbill.setText("");
                    tablelord();
                } catch (SQLException ex) {
                    Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    String sql = "SELECT *  FROM hany.storeitemlist where name ='" + cmitem.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        price.setText(rs.getString("total"));
                        available.setText(rs.getString("number"));

                    }

                } catch (SQLException ex) {

                }
            }
        }
    }//GEN-LAST:event_cmitemActionPerformed

    private void monthnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthnumberKeyReleased
        try {
            float mokdm = Float.parseFloat(paid.getText());
            float total = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number.getText());
            float month = Float.parseFloat(monthnumber.getText());
            float quest = ((total * numberr) - mokdm) / month;
            dailyprice.setText("" + quest);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_monthnumberKeyReleased

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        try {
            float mokdm = Float.parseFloat(paid.getText());
            float total = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number.getText());
            float month = Float.parseFloat(monthnumber.getText());
            float quest = ((total * numberr) - mokdm) / month;
            dailyprice.setText("" + quest);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_paidKeyReleased

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        try {
            float mokdm = Float.parseFloat(paid.getText());
            float total = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number.getText());
            float month = Float.parseFloat(monthnumber.getText());
            float quest = ((total * numberr) - mokdm) / month;
            dailyprice.setText("" + quest);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_numberKeyReleased

    private void dailypriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dailypriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dailypriceKeyTyped

    private void dailypriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dailypriceKeyReleased

    }//GEN-LAST:event_dailypriceKeyReleased

    private void number1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number1KeyReleased
        try {
            int numberr = Integer.parseInt(number.getText());
            int pricee = Integer.parseInt(price.getText());
            int totall = numberr * pricee;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_number1KeyReleased

    private void price1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price1KeyReleased
        try {
            int numberr = Integer.parseInt(number.getText());
            int pricee = Integer.parseInt(price.getText());
            int totall = numberr * pricee;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_price1KeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        double availablex = Double.parseDouble(available1.getText());
        if (availablex < Integer.parseInt(number1.getText())) {
            JOptionPane.showMessageDialog(this, "لا يوجد عدد كافي بالمخزن");
        } else {
            double amount = 0;
            if (!cmitem1.getSelectedItem().toString().trim().isEmpty() && !price1.getText().trim().isEmpty() && !number1.getText().trim().isEmpty()) {
                try {

                    double numberr = Double.parseDouble(number1.getText());
                    double pricee = Double.parseDouble(price1.getText());
                    double totall = numberr * pricee;
                    String itemm = cmitem1.getSelectedItem().toString();
                    String seriall = serial1.getText();
                    String sqldaf = "SELECT * FROM hany.montgbill where name='" + itemm + "' and datee='" + datee + "' and serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(rootPane, "العنصر تم اضافتة من قبل");
                        cmitem1.setSelectedItem("-");
                        cmitem1.requestFocus();
                        String sqld = "SELECT total FROM hany.montgbill where datee='" + datee + "' and serial='" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            amount = amount + (rs.getDouble("total"));
                            totalbill.setText("" + amount);
                            price.setText("" + amount);
                            cmitem1.setSelectedIndex(0);
                            number1.setText("1");
                            available1.setText("0");
                            price1.setText("0");
                        }

                    } else {
                        String sql = "INSERT INTO hany.montgbill (serial,name,price,number,total,datee,fulldate) VALUES"
                                + " ('" + seriall + "','" + itemm + "','" + pricee + "','" + numberr + "','" + totall + "','" + datee + "','" + fulldatee + "')";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                        pst.execute();
                        tablelord();
                        String sqld = "SELECT total FROM hany.montgbill where datee='" + datee + "' and serial='" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            amount = amount + (rs.getDouble("total"));
                        }
                        totalbill.setText("" + amount);
                        price.setText("" + amount);
                        cmitem1.setSelectedIndex(0);
                        number1.setText("1");
                        available1.setText("0");
                        price1.setText("0");

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) tdetails.getModel();
        int selectrowindex = tdetails.getSelectedRow();
        serialid3.setText(tmodel.getValueAt(selectrowindex, 3).toString());
    }//GEN-LAST:event_tdetailsMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        double amount = 0;
        if (serialid3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العنصر ");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM hany.montgbill WHERE id='" + serialid3.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    tablelord();
                    serialid3.setText("");
                    String sqld = "SELECT total FROM hany.montgbill where datee='" + datee + "' and serial='" + serial1.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getDouble("total"));
                        totalbill.setText("" + amount);
                        price.setText("" + amount);
                    }
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void cmitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmitem1ActionPerformed
        Object obj = evt.getSource();
        if (obj == cmitem1) {
            try {
                String sql = "SELECT *  FROM hany.storeitemlist where name ='" + cmitem1.getSelectedItem().toString() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    price1.setText(rs.getString("total"));
                    available1.setText(rs.getString("number"));

                }

            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_cmitem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField available;
    private javax.swing.JTextField available1;
    private javax.swing.JComboBox cmemployee;
    private javax.swing.JComboBox cmitem;
    private javax.swing.JComboBox cmitem1;
    private javax.swing.JComboBox cmname;
    private javax.swing.JComboBox cmvisa;
    private javax.swing.JComboBox cmvisa1;
    private javax.swing.JComboBox cmweek;
    private javax.swing.JTextArea d1;
    private javax.swing.JTextArea d2;
    private javax.swing.JTextArea d3;
    private javax.swing.JTextField dailyprice;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField day;
    private javax.swing.JButton delete;
    private javax.swing.JTextField esalat;
    private javax.swing.JTextField idnumber;
    private javax.swing.JTextField idnumber1;
    private javax.swing.JTextField idnumber2;
    private javax.swing.JTextField idnumber3;
    private javax.swing.JTextField idnumber4;
    private javax.swing.JLabel idnumber5;
    private javax.swing.JLabel idnumber7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel logserial;
    private javax.swing.JTextField monthnumber;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField number;
    private javax.swing.JTextField number1;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JTextField page;
    private javax.swing.JTextField page1;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField person2;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JLabel phone3;
    private javax.swing.JLabel phone4;
    private javax.swing.JLabel phone5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save5;
    private javax.swing.JLabel serial;
    private javax.swing.JLabel serial1;
    private javax.swing.JLabel serialid;
    private javax.swing.JLabel serialid1;
    private javax.swing.JLabel serialid3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTable tdetails;
    private javax.swing.JTextField totalbill;
    private javax.swing.JTextField visa;
    private javax.swing.JTextField visa1;
    private javax.swing.JTextField work;
    // End of variables declaration//GEN-END:variables
public void clear() {
        name.setText("");
        serialid.setText("");
        phone.setText("");
        address.setText("");
        page.setText("");
        t1.setText("");
        t2.setText("");
        d1.setText("");
        d2.setText("");
        p1.setText("");
        p2.setText("");
        visa.setText("");
        paid.setText("");
        price.setText("");
        dailyprice.setText("");
        page.setText("");
        esalat.setText("");
        phone2.setText("");
        name2.setText("");
        name1.requestFocus();
        cmname.setSelectedIndex(0);
    }

    public void clear1() {
        name.setText("");
        phone.setText("");
        address.setText("");
        page.setText("");
        t1.setText("");
        t2.setText("");
        d1.setText("");
        p3.setText("");
        t3.setText("");
        d3.setText("");
        idnumber.setText("");
        idnumber1.setText("");
        idnumber2.setText("");
        idnumber3.setText("");
        d2.setText("");
        p1.setText("");
        p2.setText("");
        visa.setText("");
        page.setText("");
        phone2.setText("");
        work.setText("");
    }

    public void clear2() {
        t4.setText("");
        t5.setText("");
        t6.setText("");
        available.setText("0");
        visa1.setText("");
        monthnumber.setText("1");
        number.setText("1");
        name1.requestFocus();
        name1.setText("");
        name2.setText("");
        idnumber4.setText("");
        cmname.setSelectedIndex(0);
        cmitem.setSelectedIndex(0);
        page1.setText("");
        cmweek.setSelectedIndex(0);
        paid.setText("");
        price.setText("");
        dailyprice.setText("");
        page.setText("");
        day.setText("");
        esalat.setText("");
        cmemployee.setSelectedIndex(0);

    }

    public void customers() {
        try {
            String sql = "SELECT name  FROM hany.customer order by name ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmname.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void comboxfromcombo3() {
        cmitem.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                try {
                    String sql = "SELECT * FROM hany.customer where name='" + cmname.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        name.setText(rs.getString("name"));
                        phone.setText(rs.getString("phone"));
                        address.setText(rs.getString("address"));
                        page.setText(rs.getString("page"));
                        p1.setText(rs.getString("p1"));
                        p2.setText(rs.getString("p2"));
                        d1.setText(rs.getString("d1"));
                        d2.setText(rs.getString("d2"));
                        t1.setText(rs.getString("t1"));
                        t2.setText(rs.getString("t2"));
                        work.setText(rs.getString("work"));
                        esalat.setText(rs.getString("esalat"));
                        phone2.setText(rs.getString("phone2"));
                        visa.setText(rs.getString("visanumber"));
                        cmvisa.setSelectedItem(rs.getString("visa"));
                    }

                } catch (SQLException ex) {

                }
            }
        });

    }

    public void comboxfromcombo() {
        cmname.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                try {
                    String sql = "SELECT * FROM hany.customer where name='" + cmname.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        name2.setText(rs.getString("name"));
                        idnumber4.setText(rs.getString("idnumber"));
                        page1.setText(rs.getString("page"));
                        t4.setText(rs.getString("t1"));
                        t5.setText(rs.getString("t2"));
                        t6.setText(rs.getString("t3"));
                        p4.setText(rs.getString("p1"));
                        p5.setText(rs.getString("p2"));
                        p6.setText(rs.getString("p3"));
                        phone1.setText(rs.getString("phone"));
                        phone3.setText(rs.getString("phone2"));
                        idnumber5.setText(rs.getString("idnumber"));
                        esalat.setText(rs.getString("esalat"));
                        visa1.setText(rs.getString("visanumber"));
                        cmvisa1.setSelectedItem(rs.getString("visa"));
                    }

                } catch (SQLException ex) {

                }
            }
        });

    }
    /*
              
              
              
     */

    public void items() {
        try {
            String sql = "SELECT name  FROM hany.storeitemlist where number >0 ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmitem.addItem(name);
                cmitem1.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void process_id() {

        try {
            String sql = "SELECT serial FROM hany.buy where id=(select max(id)FROM hany.buy )";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("serial");
                int co = rnno.length();
                String txt = rnno.substring(0, 3);
                String num = rnno.substring(3, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                serial.setText(ftxt);
            } else {
                serial.setText("PN-1001");
            }
        } catch (SQLException ex) {

        }

    }

    public void done() {
        InputStream in = null;
        try {
            String namee = name.getText();
            String serialll = serial.getText();

            String reportpath = "\\\\192.168.1.15\\sadam\\sellreset.jasper";
            Map<String, Object> para = new HashMap<String, Object>();
            para.put("address", address.getText().toString());
            para.put("esalat", esalat.getText());
            para.put("serial", serial.getText());

            JasperPrint j = JasperFillManager.fillReport(reportpath, para, DBConnect.con);
            JasperViewer.viewReport(j, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {

        }
    }

    public void Bill_id() {

        try {
            String sql = "SELECT serial FROM hany.logs where id=(select max(id)FROM hany.logs )";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("serial");
                int co = rnno.length();
                String txt = rnno.substring(0, 3);
                String num = rnno.substring(3, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                logserial.setText(ftxt);
            } else {
                logserial.setText("BN-1001");
            }
        } catch (SQLException ex) {

        }

    }

    public void employee() {
        try {
            String sql = "SELECT name  FROM hany.employee order by name ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmemployee.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void auto_id() {

        try {
            String sqll = "SELECT serial FROM hany.montgbill where id=(select max(id)FROM hany.montgbill )";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("serial");
                int co = rnno.length();
                String txt = rnno.substring(0, 3);
                String num = rnno.substring(3, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                serial1.setText(ftxt);
            } else {
                serial1.setText("SN-1001");
            }
        } catch (SQLException ex) {

        }

    }

    public void tablelord() {
        try {
            String sqll = "SELECT * FROM hany.montgbill where serial='" + serial1.getText() + "' AND datee='" + datee + "' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tdetails.getModel();
            model.setRowCount(0);
            int x = 1;
            while (rs.next()) {
                Object row[] = {
                    rs.getString("number"),
                    rs.getString("price"),
                    rs.getString("name"),
                    rs.getString("id"),};
                model.addRow(row);
                x++;

            }
            if (x >= 11) {
            } else {
                for (int z = x; z < 13; z++) {
                    Object rowData[] = {
                        "", "", "", "", "",};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException ex) {

        }
    }
}
