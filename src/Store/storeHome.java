/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import hany.*;
import java.awt.ComponentOrientation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class storeHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm l ;
     
    PreparedStatement pst ;
    ResultSet rs; 
    public String y; 
    
    public String type;
    public storeHome(String x) throws IOException, ParseException {
        initComponents();
         
        name11.setText(x);
        name11.setVisible(true);
        jMenuBar1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        y=x;
       checkusertype();
        System.out.print(type);
        if(type2.getText().equals("admin"))
        {
            jMenuItem3.setEnabled(true);
            jMenuItem4.setEnabled(true);
            jMenuItem5.setEnabled(true);
            jMenuItem8.setEnabled(true);
            jMenuItem7.setEnabled(true);
            jMenuItem9.setEnabled(true);
            jMenuItem13.setEnabled(true);
            jMenuItem10.setEnabled(true);
            jMenuItem11.setEnabled(true);
            jMenuItem12.setEnabled(true);
            jMenuItem14.setEnabled(true);
            
        }
       storeitems ad= new storeitems(y);
        jDesktopPane1.add(ad).setVisible(true);
      
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton5 = new javax.swing.JButton();
        tkheen = new javax.swing.JButton();
        detailss = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tsken = new javax.swing.JButton();
        suppliers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Homeee = new javax.swing.JMenu();
        additems = new javax.swing.JMenuItem();
        additems2 = new javax.swing.JMenuItem();
        additems1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(980, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 980, 660));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton5.setText("???????????? ????????????????");
        jButton5.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 230, 90));

        tkheen.setBackground(new java.awt.Color(204, 255, 255));
        tkheen.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        tkheen.setText("????????????");
        tkheen.setPreferredSize(new java.awt.Dimension(169, 89));
        tkheen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkheenActionPerformed(evt);
            }
        });
        jPanel1.add(tkheen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, 230, 90));

        detailss.setBackground(new java.awt.Color(204, 255, 255));
        detailss.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        detailss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        detailss.setText("????????????????");
        detailss.setPreferredSize(new java.awt.Dimension(169, 89));
        detailss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailssActionPerformed(evt);
            }
        });
        jPanel1.add(detailss, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 230, 90));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Print_1.png"))); // NOI18N
        jButton1.setText("????????????");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 230, 90));

        tsken.setBackground(new java.awt.Color(204, 255, 255));
        tsken.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        tsken.setText("????????????");
        tsken.setPreferredSize(new java.awt.Dimension(169, 89));
        tsken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tskenActionPerformed(evt);
            }
        });
        jPanel1.add(tsken, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 230, 90));

        suppliers.setBackground(new java.awt.Color(204, 255, 255));
        suppliers.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        suppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-exit-sign-64.png"))); // NOI18N
        suppliers.setText("?????????? ??????");
        suppliers.setPreferredSize(new java.awt.Dimension(169, 89));
        suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersActionPerformed(evt);
            }
        });
        jPanel1.add(suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 230, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setMinimumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 730));

        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("jLabel1");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

        name11.setBackground(new java.awt.Color(204, 153, 0));
        name11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 255));
        name11.setText("jLabel2");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(131, 28));

        Homeee.setText("????????????????");
        Homeee.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        Homeee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeeeActionPerformed(evt);
            }
        });

        additems.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additems.setText("????????????????");
        additems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemsActionPerformed(evt);
            }
        });
        Homeee.add(additems);

        additems2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additems2.setText("??????????????");
        additems2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additems2ActionPerformed(evt);
            }
        });
        Homeee.add(additems2);

        additems1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additems1.setText("??????????????");
        additems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additems1ActionPerformed(evt);
            }
        });
        Homeee.add(additems1);

        jMenuItem8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem8.setText("?????? ????????????");
        jMenuItem8.setEnabled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem8);

        jMenuItem14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem14.setText("?????????? ????????????");
        jMenuItem14.setEnabled(false);
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem14);

        jMenuItem11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem11.setText("??????????????????");
        jMenuItem11.setEnabled(false);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem11);

        jMenuBar1.add(Homeee);

        jMenu10.setText("????????????");
        jMenu10.setAlignmentX(0.0F);
        jMenu10.setAlignmentY(0.0F);
        jMenu10.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("?????? ??????????????");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuItem4.setText("?????????? ????????");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4);

        jMenuItem5.setText("??????????????????");
        jMenuItem5.setEnabled(false);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        jMenuItem7.setText("????????????????");
        jMenuItem7.setEnabled(false);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuItem9.setText("???????????? ?????????????? ????????????????");
        jMenuItem9.setEnabled(false);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem10.setText("???????????? ?????????????? ????????????????");
        jMenuItem10.setEnabled(false);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenuItem12.setText("???????????? ?????????????? ????????");
        jMenuItem12.setEnabled(false);
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenuItem13.setText("?????? ??????????");
        jMenuItem13.setEnabled(false);
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuBar1.add(jMenu10);

        jMenu9.setText("??????");
        jMenu9.setAlignmentX(0.0F);
        jMenu9.setAlignmentY(0.0F);
        jMenu9.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            this.dispose();
            String k =name11.getText().toString();
            MainPage ll = new MainPage(k);
            ll.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void detailssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailssActionPerformed
        try {
            jDesktopPane1.removeAll();
            storeitems addd = new storeitems(y);
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_detailssActionPerformed

    private void tskenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tskenActionPerformed
     

    }//GEN-LAST:event_tskenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try {
            jDesktopPane1.removeAll();
            additem addd = new additem();
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersActionPerformed
 try {
            jDesktopPane1.removeAll();
            storesell addd = new storesell();
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_suppliersActionPerformed

    private void tkheenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkheenActionPerformed
try {
            jDesktopPane1.removeAll();
            storesell1 addd = new storesell1();
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_tkheenActionPerformed

    private void HomeeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeeeActionPerformed
      
    }//GEN-LAST:event_HomeeeActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void additemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemsActionPerformed
try {
            addsupplier m = new addsupplier();         
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_additemsActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void additems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additems1ActionPerformed
        try {
            addstore m = new addstore();         
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_additems1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         InputStream in=null;
      try {
          
           in = this.getClass().getResourceAsStream("/reports/storeitems.jasper");
          String reportpath= "\\\\192.168.1.15\\sadam\\storeitems.jasper";
    Map<String,Object> para = new HashMap<String,Object>();
         JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
            JasperViewer.viewReport(j,false);
      }
     catch (JRException ex) {
         
          JOptionPane.showMessageDialog(null, ex);
        } finally {
        } 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      storetype m = new storetype();
        m.setVisible(true);        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        storebuyreport m = new storebuyreport();
        m.setVisible(true); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            paysupplier m = new paysupplier();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
          supplieramountdetails m = new supplieramountdetails();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        supplieramountdetailspayed m = new supplieramountdetailspayed();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         InputStream in=null;
      try {
          
          in = this.getClass().getResourceAsStream("/reports/supplierneeded.jasper");
          String reportpath= "\\\\192.168.1.15\\sadam\\supplierneeded.jasper";
    Map<String,Object> para = new HashMap<String,Object>();
         JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
            JasperViewer.viewReport(j,false);
      }
     catch (JRException ex) {
         
          JOptionPane.showMessageDialog(null, ex);
        } finally {
        } 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void additems2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additems2ActionPerformed
        try {
            addcompany m = new addcompany();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_additems2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        supplierpayed m = new supplierpayed();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        sellreporttype m = new sellreporttype();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            editprecentage m = new editprecentage();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        storesellreport m = new storesellreport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Homeee;
    private javax.swing.JMenuItem additems;
    private javax.swing.JMenuItem additems1;
    private javax.swing.JMenuItem additems2;
    public javax.swing.JButton detailss;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton5;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name11;
    public javax.swing.JButton suppliers;
    public javax.swing.JButton tkheen;
    public javax.swing.JButton tsken;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables

   public void checkusertype()
   {
         try {
            String sqll = "SELECT type from hany.users WHERE username='"+name11.getText()+"'";
              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs=pst.executeQuery();
         while (rs.next())
                {
                 type=rs.getString("type");
                 type2.setText(type);
                }
        }
        catch (SQLException ex) {
            
        }
   }
   
  
}
