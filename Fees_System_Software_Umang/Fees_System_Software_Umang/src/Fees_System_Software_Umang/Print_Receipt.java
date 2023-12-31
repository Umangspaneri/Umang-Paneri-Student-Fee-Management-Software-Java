/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fees_System_Software_Umang;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class Print_Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Print_Receipt
     */
    public Print_Receipt() {
        initComponents();
        getRecords();
        
        Container c = getContentPane();
        c.setBackground(new Color(0,153,153));
    }
    
    
    
    public void getRecords()
    {
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from fees_details order by reciept_no desc limit 1");
            // PreparedStatement pst = con.prepareStatement("select * from fees_details order by reciept_no  asc limit 1");
            //SELECT * FROM fees_details LIMIT 1 
            ResultSet rs = pst.executeQuery();
            rs.next();
//            
            txt_receiptNo.setText(rs.getString("reciept_no"));
            txt_paymentMode.setText(rs.getString("payment_mode"));
            
            
            String paymentMode = rs.getString("payment_mode"); 
            
            if(paymentMode.equalsIgnoreCase("cash"))
            {
                lbl_check_Db.setText("Cheque");
                txt_check_dd.setText("_");
                txt_bankName.setText("_");
                
            }
            if(paymentMode.equalsIgnoreCase("Cheque"))
            {
                lbl_check_Db.setText("Cheque No");
                txt_check_dd.setText(rs.getString("cheque_no"));
                txt_bankName.setText(rs.getString("bank_name"));
                
            }
            if(paymentMode.equalsIgnoreCase("dd"))
            {
                lbl_check_Db.setText("DD No");
                txt_check_dd.setText(rs.getString("dd_no"));
                txt_bankName.setText(rs.getString("bank_name"));
                
            }
            if(paymentMode.equalsIgnoreCase("card"))
            {
                lbl_check_Db.setText("Cheque No");
                txt_check_dd.setText("_");
                txt_bankName.setText(rs.getString("bank_name"));
                
            }
            
            
            txt_receivedFrom.setText(rs.getString("student_name"));
            txt_date.setText(rs.getString("date"));
            txt_gstin.setText(rs.getString("gstin"));
            txt_year1.setText(rs.getString("year1"));
            txt_year2.setText(rs.getString("year2"));
            txt_initialAmount.setText(rs.getString("amount"));
            txt_cgst.setText(rs.getString("cgst"));
            txt_sgst.setText(rs.getString("sgst"));
            txt_total.setText(rs.getString("total_amount"));
            txt_totalInWords.setText(rs.getString("total_in_words"));
            txt_courseName.setText(rs.getString("courses"));
            txt_remark.setText(rs.getString("remark"));
            
                
        }
        catch(Exception e)
         {
             e.printStackTrace();
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

        panel_print = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_check_Db = new javax.swing.JLabel();
        lbl_bankName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_receiptNo = new javax.swing.JLabel();
        txt_paymentMode = new javax.swing.JLabel();
        txt_check_dd = new javax.swing.JLabel();
        txt_bankName = new javax.swing.JLabel();
        txt_receivedFrom = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_gstin = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_courseName = new javax.swing.JLabel();
        txt_cgst = new javax.swing.JLabel();
        txt_sgst = new javax.swing.JLabel();
        txt_initialAmount = new javax.swing.JLabel();
        txt_cgst1 = new javax.swing.JLabel();
        txt_sgst1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_total = new javax.swing.JLabel();
        txt_total1 = new javax.swing.JLabel();
        txt_totalInWords = new javax.swing.JLabel();
        txt_total2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_year1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_year2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_check_dd1 = new javax.swing.JLabel();
        lbl_check_Db1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_remark = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panelEdit = new javax.swing.JPanel();
        btnEdit = new javax.swing.JLabel();
        panelCourseList = new javax.swing.JPanel();
        btnCourseList = new javax.swing.JLabel();
        panelViewAllRecord = new javax.swing.JPanel();
        btnViewAllRecord = new javax.swing.JLabel();
        panelBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        panelSreach = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        panelLogout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_print.setBackground(new java.awt.Color(255, 255, 255));
        panel_print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel1.setText("U.H. Institute Of Information Technology ");
        panel_print.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Old Nagardas Road, Dr. S Radhakrishnan Marg, Andheri East, Mumbai - 400069");
        panel_print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 71, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        panel_print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 880, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("Receipt No :-");
        panel_print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 122, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("Payment Mode : -");
        panel_print.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 122, -1));

        lbl_check_Db.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_check_Db.setForeground(new java.awt.Color(51, 0, 153));
        lbl_check_Db.setText("Check DD  : -");
        panel_print.add(lbl_check_Db, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 122, -1));

        lbl_bankName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_bankName.setForeground(new java.awt.Color(51, 0, 153));
        lbl_bankName.setText("Bank Name : -");
        panel_print.add(lbl_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 122, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 153));
        jLabel8.setText("Recieved From : -");
        panel_print.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 122, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 153));
        jLabel9.setText("The Following Payment In The College Office For The Year : - ");
        panel_print.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Sr No");
        panel_print.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 43, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Head");
        panel_print.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 48, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Amount(RS)");
        panel_print.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, 20));

        txt_receiptNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_receiptNo.setForeground(new java.awt.Color(51, 0, 153));
        txt_receiptNo.setText("Receipt No ");
        panel_print.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 101, -1));

        txt_paymentMode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_paymentMode.setForeground(new java.awt.Color(51, 0, 153));
        txt_paymentMode.setText("Payment Mode ");
        panel_print.add(txt_paymentMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        txt_check_dd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_check_dd.setForeground(new java.awt.Color(51, 0, 153));
        txt_check_dd.setText("Check DD  ");
        panel_print.add(txt_check_dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 101, -1));

        txt_bankName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_bankName.setForeground(new java.awt.Color(51, 0, 153));
        txt_bankName.setText("Bank Name ");
        panel_print.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 101, -1));

        txt_receivedFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_receivedFrom.setForeground(new java.awt.Color(51, 0, 153));
        txt_receivedFrom.setText("Recieved From ");
        panel_print.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 101, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 153));
        jLabel21.setText("DATE :-");
        panel_print.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 69, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 153));
        jLabel22.setText("GST No : -");
        panel_print.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        txt_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_date.setForeground(new java.awt.Color(51, 0, 153));
        txt_date.setText("DATE ");
        panel_print.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 100, -1));

        txt_gstin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_gstin.setForeground(new java.awt.Color(51, 0, 153));
        txt_gstin.setText("GST No ");
        panel_print.add(txt_gstin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 104, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("1");
        panel_print.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 43, -1));

        txt_courseName.setText("1");
        panel_print.add(txt_courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 64, -1));

        txt_cgst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cgst.setText("CGST ");
        panel_print.add(txt_cgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 75, -1));

        txt_sgst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_sgst.setText("SGST");
        panel_print.add(txt_sgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 75, -1));

        txt_initialAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_initialAmount.setText("CGST");
        panel_print.add(txt_initialAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 85, -1));

        txt_cgst1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cgst1.setText("CGST(9%)");
        panel_print.add(txt_cgst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        txt_sgst1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_sgst1.setText("SGST(9%)");
        panel_print.add(txt_sgst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("____________________________________");
        panel_print.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 220, -1));

        txt_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_total.setText("TOTAL");
        panel_print.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 66, -1));

        txt_total1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_total1.setText("TOTAL IN WORDS : -");
        panel_print.add(txt_total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        txt_totalInWords.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_totalInWords.setText("TOTAL IN WORDS ");
        panel_print.add(txt_totalInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 340, -1));

        txt_total2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_total2.setText("Recieved Signature");
        panel_print.add(txt_total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 135, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("TOTAL FEES");
        panel_print.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        txt_year1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_year1.setText("jLabel6");
        panel_print.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 49, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("__");
        panel_print.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 20, 20));

        txt_year2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_year2.setText("jLabel7");
        panel_print.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("__________________________________________________________________________________________________________________________________________________________________________");
        panel_print.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 860, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("____________________________________");
        panel_print.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 220, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("__________________________________________________________________________________________________________________________________________________________________________");
        panel_print.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 860, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("------------------------------------------Print Receipt------------------------------------------");
        panel_print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 590, -1));

        txt_check_dd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_check_dd1.setForeground(new java.awt.Color(51, 0, 153));
        txt_check_dd1.setText("Cheque");
        panel_print.add(txt_check_dd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 101, -1));

        lbl_check_Db1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_check_Db1.setForeground(new java.awt.Color(51, 0, 153));
        lbl_check_Db1.setText("Cheque  : -");
        panel_print.add(lbl_check_Db1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 122, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Remark : -");
        panel_print.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        txt_remark.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_remark.setText("jLabel20");
        panel_print.add(txt_remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, -1, -1));

        getContentPane().add(panel_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 950, 670));

        jPanel3.setBackground(new java.awt.Color(171, 140, 17));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHome.setBackground(new java.awt.Color(171, 140, 17));
        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel23.setText("Home");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel23)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 35, -1, -1));

        panelEdit.setBackground(new java.awt.Color(171, 140, 17));
        panelEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnEdit.setText("Edit Courses ");

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(59, 59, 59))
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 191, -1, -1));

        panelCourseList.setBackground(new java.awt.Color(171, 140, 17));
        panelCourseList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCourseList.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnCourseList.setText("Course List");

        javax.swing.GroupLayout panelCourseListLayout = new javax.swing.GroupLayout(panelCourseList);
        panelCourseList.setLayout(panelCourseListLayout);
        panelCourseListLayout.setHorizontalGroup(
            panelCourseListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseListLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(btnCourseList)
                .addGap(75, 75, 75))
        );
        panelCourseListLayout.setVerticalGroup(
            panelCourseListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCourseListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCourseList, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelCourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 269, -1, -1));

        panelViewAllRecord.setBackground(new java.awt.Color(171, 140, 17));
        panelViewAllRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnViewAllRecord.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnViewAllRecord.setText("View All Record");

        javax.swing.GroupLayout panelViewAllRecordLayout = new javax.swing.GroupLayout(panelViewAllRecord);
        panelViewAllRecord.setLayout(panelViewAllRecordLayout);
        panelViewAllRecordLayout.setHorizontalGroup(
            panelViewAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewAllRecordLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(btnViewAllRecord)
                .addGap(38, 38, 38))
        );
        panelViewAllRecordLayout.setVerticalGroup(
            panelViewAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewAllRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewAllRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelViewAllRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 347, -1, -1));

        panelBack.setBackground(new java.awt.Color(171, 140, 17));
        panelBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnBack.setText("Back");

        javax.swing.GroupLayout panelBackLayout = new javax.swing.GroupLayout(panelBack);
        panelBack.setLayout(panelBackLayout);
        panelBackLayout.setHorizontalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(116, 116, 116))
        );
        panelBackLayout.setVerticalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 425, -1, -1));

        panelSreach.setBackground(new java.awt.Color(171, 140, 17));
        panelSreach.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setText("Seach Record");

        javax.swing.GroupLayout panelSreachLayout = new javax.swing.GroupLayout(panelSreach);
        panelSreach.setLayout(panelSreachLayout);
        panelSreachLayout.setHorizontalGroup(
            panelSreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSreachLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        panelSreachLayout.setVerticalGroup(
            panelSreachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSreachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panelSreach, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 113, -1, -1));

        panelLogout.setBackground(new java.awt.Color(171, 140, 17));
        panelLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnLogout.setText("Logout");

        javax.swing.GroupLayout panelLogoutLayout = new javax.swing.GroupLayout(panelLogout);
        panelLogout.setLayout(panelLogoutLayout);
        panelLogoutLayout.setHorizontalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLogoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnLogout)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelLogoutLayout.setVerticalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLogoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnLogout)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(panelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 503, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
        UpdateFeesDetails update = new UpdateFeesDetails();
        update.show();
        this.dispose();
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();  //object
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);

                panel_print.print(g2);

                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = job.printDialog();
        if(ok){
            try{

                job.print();
            }
            catch (PrinterException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_printMouseClicked

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
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print_Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnCourseList;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnViewAllRecord;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_bankName;
    private javax.swing.JLabel lbl_check_Db;
    private javax.swing.JLabel lbl_check_Db1;
    private javax.swing.JPanel panelBack;
    private javax.swing.JPanel panelCourseList;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLogout;
    private javax.swing.JPanel panelSreach;
    private javax.swing.JPanel panelViewAllRecord;
    private javax.swing.JPanel panel_print;
    private javax.swing.JLabel txt_bankName;
    private javax.swing.JLabel txt_cgst;
    private javax.swing.JLabel txt_cgst1;
    private javax.swing.JLabel txt_check_dd;
    private javax.swing.JLabel txt_check_dd1;
    private javax.swing.JLabel txt_courseName;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_gstin;
    private javax.swing.JLabel txt_initialAmount;
    private javax.swing.JLabel txt_paymentMode;
    private javax.swing.JLabel txt_receiptNo;
    private javax.swing.JLabel txt_receivedFrom;
    private javax.swing.JLabel txt_remark;
    private javax.swing.JLabel txt_sgst;
    private javax.swing.JLabel txt_sgst1;
    private javax.swing.JLabel txt_total;
    private javax.swing.JLabel txt_total1;
    private javax.swing.JLabel txt_total2;
    private javax.swing.JLabel txt_totalInWords;
    private javax.swing.JLabel txt_year1;
    private javax.swing.JLabel txt_year2;
    // End of variables declaration//GEN-END:variables
}
