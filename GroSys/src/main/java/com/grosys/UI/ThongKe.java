/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grosys.UI;

import com.grosys.DAO1.SanPhamDAO;
import com.grosys.DAO1.ThongkeDao;
import com.grosys.untity.SanPham;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import utils.HeaderColor;

/**
 *
 * @author Sang
 */
public class ThongKe extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    ThongkeDao dao = new ThongkeDao();
    public ThongKe() throws SQLException {
        initComponents();
        prepareUI();
        loadDuLieu();
        
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
        pnlLineDashBoard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDoanhSo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTongTienTrongNam = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlCircel = new javax.swing.JPanel();
        pnlDoanhThuTrongThang = new javax.swing.JPanel();
        lblDoanhThuThang = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblThang = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblSoSanh = new javax.swing.JLabel();
        lblSoVoiThangTruoc = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblLuotMua = new javax.swing.JLabel();
        lblLuotMua1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblChiTieu = new javax.swing.JLabel();
        lblThang1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblLSP01 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLSP02 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLSP03 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblLSP04 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblLSP05 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblLSP06 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblLSP07 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblLSP08 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();

        setBackground(new java.awt.Color(236, 245, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlLineDashBoardLayout = new javax.swing.GroupLayout(pnlLineDashBoard);
        pnlLineDashBoard.setLayout(pnlLineDashBoardLayout);
        pnlLineDashBoardLayout.setHorizontalGroup(
            pnlLineDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnlLineDashBoardLayout.setVerticalGroup(
            pnlLineDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(pnlLineDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 300, 220));

        jLabel1.setText("Doanh Số:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblDoanhSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDoanhSo.setForeground(new java.awt.Color(52, 53, 77));
        lblDoanhSo.setText("81");
        jPanel1.add(lblDoanhSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 140, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("Theo Năm 2021");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblTongTienTrongNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTongTienTrongNam.setForeground(new java.awt.Color(52, 53, 77));
        lblTongTienTrongNam.setText("$3645.30");
        jPanel1.add(lblTongTienTrongNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 120, 20));

        jPanel6.setBackground(new java.awt.Color(254, 95, 18));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chi Tiết");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel4.setText("Doanh Thu:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setForeground(new java.awt.Color(118, 120, 137));
        jLabel7.setText("Thống Kê");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 470, 226));

        pnlCircel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlCircelLayout = new javax.swing.GroupLayout(pnlCircel);
        pnlCircel.setLayout(pnlCircelLayout);
        pnlCircelLayout.setHorizontalGroup(
            pnlCircelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        pnlCircelLayout.setVerticalGroup(
            pnlCircelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        add(pnlCircel, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 14, 217, 217));

        pnlDoanhThuTrongThang.setBackground(new java.awt.Color(222, 241, 255));
        pnlDoanhThuTrongThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoanhThuThang.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblDoanhThuThang.setForeground(new java.awt.Color(61, 164, 235));
        lblDoanhThuThang.setText("+$3100");
        pnlDoanhThuTrongThang.add(lblDoanhThuThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 26));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_combo_chart_50px.png"))); // NOI18N
        pnlDoanhThuTrongThang.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 50));

        jLabel25.setForeground(new java.awt.Color(118, 120, 137));
        jLabel25.setText("Doanh thu tháng");
        pnlDoanhThuTrongThang.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        lblThang.setText("Tháng 12");
        pnlDoanhThuTrongThang.add(lblThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        add(pnlDoanhThuTrongThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 90));

        jPanel9.setBackground(new java.awt.Color(254, 247, 218));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setForeground(new java.awt.Color(118, 120, 137));
        jLabel27.setText("Chỉ tiêu so với tháng trước");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_chart_arrow_rise_50px.png"))); // NOI18N
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 50));

        lblSoSanh.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblSoSanh.setForeground(new java.awt.Color(240, 211, 94));
        lblSoSanh.setText("+$3100");
        jPanel9.add(lblSoSanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 26));

        lblSoVoiThangTruoc.setText("So với Tháng 11");
        jPanel9.add(lblSoVoiThangTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 60, 100, -1));

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 250, -1, 90));

        jPanel11.setBackground(new java.awt.Color(255, 231, 219));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setForeground(new java.awt.Color(118, 120, 137));
        jLabel31.setText("Lượt mua ");
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_area_chart_50px.png"))); // NOI18N
        jPanel11.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 90, 50));

        lblLuotMua.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblLuotMua.setForeground(new java.awt.Color(254, 87, 22));
        lblLuotMua.setText("+$3100");
        jPanel11.add(lblLuotMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 26));

        lblLuotMua1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLuotMua1.setForeground(new java.awt.Color(254, 87, 22));
        lblLuotMua1.setText("Lượt");
        jPanel11.add(lblLuotMua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 40, 26));

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 90));

        jPanel12.setBackground(new java.awt.Color(240, 220, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setForeground(new java.awt.Color(118, 120, 137));
        jLabel35.setText("Chi Tiêu Tháng");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_pie_chart_50px.png"))); // NOI18N
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 50));

        lblChiTieu.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        lblChiTieu.setForeground(new java.awt.Color(140, 24, 251));
        lblChiTieu.setText("+$3100");
        jPanel12.add(lblChiTieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 26));

        lblThang1.setText("Tháng 12");
        jPanel12.add(lblThang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 250, 160, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Đồ Uống Các Loại");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblLSP01.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP01.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setForeground(new java.awt.Color(118, 120, 137));
        jLabel8.setText("Loại Sản Phẩm");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setText("Bánh mứt kẹo");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblLSP02.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP02.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel11.setText("Gia vị, giàu ăn");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblLSP03.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP03.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel13.setText("Vệ sinh nhà cửa");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblLSP04.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP04.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel15.setText("Sửa uống các loại");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblLSP05.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP05.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP05, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel17.setText("Chăm sóc các nhân");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblLSP06.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP06.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP06, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel19.setText("Đồ dùng gia đình");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        lblLSP07.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP07.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP07, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel21.setText("Đồ công nghệ");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        lblLSP08.setForeground(new java.awt.Color(118, 120, 137));
        lblLSP08.setText("21 Sản Phẩm");
        jPanel4.add(lblLSP08, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 240, 210));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sản Phẩm", "Doanh Số", "Doanh Thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.setRowHeight(25);
        tblSP.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblSP.setShowHorizontalLines(false);
        tblSP.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblSP);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 210));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 440, 210));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiTieu;
    private javax.swing.JLabel lblDoanhSo;
    private javax.swing.JLabel lblDoanhThuThang;
    private javax.swing.JLabel lblLSP01;
    private javax.swing.JLabel lblLSP02;
    private javax.swing.JLabel lblLSP03;
    private javax.swing.JLabel lblLSP04;
    private javax.swing.JLabel lblLSP05;
    private javax.swing.JLabel lblLSP06;
    private javax.swing.JLabel lblLSP07;
    private javax.swing.JLabel lblLSP08;
    private javax.swing.JLabel lblLuotMua;
    private javax.swing.JLabel lblLuotMua1;
    private javax.swing.JLabel lblSoSanh;
    private javax.swing.JLabel lblSoVoiThangTruoc;
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lblThang1;
    private javax.swing.JLabel lblTongTienTrongNam;
    private javax.swing.JPanel pnlCircel;
    private javax.swing.JPanel pnlDoanhThuTrongThang;
    private javax.swing.JPanel pnlLineDashBoard;
    private javax.swing.JTable tblSP;
    // End of variables declaration//GEN-END:variables

    private void prepareUI(){
        tblSP.getTableHeader().setDefaultRenderer(new HeaderColor());
        pnlCircel.setSize(217,217);
        pnlLineDashBoard.setSize(300, 220);
        
    }
    private void loadDuLieu() throws SQLException {
        lblTongTienTrongNam.setText(dao.tongDoanhThu()+"$");
        lblDoanhSo.setText(dao.tongSoSanPhamDuocMua()+"");
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        lblDoanhThuThang.setText(dao.doanhThuTheoThangNV(month)+"$");
        lblSoSanh.setText("+"+(dao.doanhThuTheoThangNV(month)-dao.doanhThuTheoThangNV(month-1))+"$");
        lblLuotMua.setText(dao.luotMuaTheoThang(month)+"");
        lblChiTieu.setText(dao.chiTieuTheoThang(month)+"$");
        lblSoVoiThangTruoc.setText("So với tháng "+ (month-1));
        lblThang.setText("Tháng "+ month);
        lblThang1.setText("Tháng "+ month);
        lblLSP01.setText(dao.DoanhThuTheoLSP("LSP01")+"$");
        lblLSP02.setText(dao.DoanhThuTheoLSP("LSP02")+"$");
        lblLSP03.setText(dao.DoanhThuTheoLSP("LSP03")+"$");
        lblLSP04.setText(dao.DoanhThuTheoLSP("LSP04")+"$");
        lblLSP05.setText(dao.DoanhThuTheoLSP("LSP05")+"$");
        lblLSP06.setText(dao.DoanhThuTheoLSP("LSP06")+"$");
        lblLSP07.setText(dao.DoanhThuTheoLSP("LSP07")+"$");
        lblLSP08.setText(dao.DoanhThuTheoLSP("LSP08")+"$");
        fillToTable();
        veBieuDoTron();
        veBieuDoDoanhThuVaChiTieu();
    }
    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel)tblSP.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.thongKeSanPham();
        SanPhamDAO spDao = new SanPhamDAO();
        for(Object[] i: list) {
            model.addRow(i);
        }
        for(int i=0;i<tblSP.getRowCount();i++) {
            String maSP = (String)tblSP.getValueAt(i, 0);
            SanPham sp = spDao.selectById(maSP);
            model.setValueAt(sp.getTenSP(), i, 0);
        }
    }
    
    public void veBieuDoTron() throws SQLException {
        List<ThongkeDao.TopDoanhThu> list = dao.topDoanhThu();
        double tong = dao.tongDoanhThu();
        Map<String, Double> map = new HashMap<>();
        for(ThongkeDao.TopDoanhThu i: list) {
            map.put(i.getTenSP(), i.getDoanhThu());
        }
        drawPieChart(pnlCircel,"Top Doanh thu", map);
    }
    
    public void drawPieChart(JPanel pnlParent, String title, Map<String, Double> map) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (String key: map.keySet()) {
            dataset.setValue(key, map.get(key));
            System.out.println(key+map.get(key));
        }
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot();
        ChartPanel panel = new ChartPanel(chart);
        panel.setSize(pnlParent.getSize());
        pnlParent.add(panel);
    }
    
    public void drawLineChart(String title, String type, String value, Map<String, Double> map) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key: map.keySet()) {
            dataset.setValue(map.get(key), type, key);
        }
        
        JFreeChart chart = ChartFactory.createLineChart(title,type,value,dataset,
                PlotOrientation.VERTICAL, false, true, true);
        BarRenderer renderer = new BarRenderer();
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame(title,chart);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void veBieuDoDoanhThuVaChiTieu() throws SQLException {
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       for(int i=0;i<12;i++) {
           dataset.setValue(dao.doanhThuTheoThangNV(i), "DoanhThu",String.valueOf(i));
           dataset.setValue(dao.chiTieuTheoThang(i), "ChiTieu",String.valueOf(i));
       }
       JFreeChart chart = ChartFactory.createLineChart("Thu Chi","Thang","SoLuong",dataset,
                PlotOrientation.VERTICAL, false, true, true);
        BarRenderer renderer = new BarRenderer();
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel panel = new ChartPanel(chart);
        panel.setSize(pnlLineDashBoard.getSize());
        pnlLineDashBoard.add(panel);
        
    }
}
