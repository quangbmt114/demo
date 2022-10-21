/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DTO.NhanVien;
import DTO.HoatDongThuePhong;
import helper.ChuyenDoi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class pnlQLNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form pnlQLNhanVien
     */
    public pnlQLNhanVien() {
        initComponents();
       ArrayList<NhanVien> arrSP = BLL.BLLNhanVien.GetAll();
        BLL.BLLNhanVien.DoVaoTable(arrSP, tblNhanVien);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtTenDangNhap = new javax.swing.JTextField();
        JRNam = new javax.swing.JRadioButton();
        JRNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JDateNgaySinh = new com.toedter.calendar.JDateChooser();
        JDateNgayVaoLam = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBThem = new javax.swing.JButton();
        JBSua = new javax.swing.JButton();
        JBXoa = new javax.swing.JButton();
        JBReset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("JPanel Form - Quản lý Nhân viên");

        txtTenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhapActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRNam);
        JRNam.setText("Nam");

        buttonGroup1.add(JRNu);
        JRNu.setText("Nữ");

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "Số Điện Thoại", "Giới Tính", "Chức Vụ", "Ngày Sinh", "Ngày Vào Làm", "Lương", "Tên Đăng Nhập", "Mật Khẩu"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNhanVienMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        jLabel5.setText("Số Điện Thoại");

        jLabel7.setText("Chức Vụ");

        jLabel9.setText("Ngày Vào Làm");

        jLabel11.setText("Mật Khẩu");

        JDateNgaySinh.setDateFormatString("dd-MM-yyyy");

        JDateNgayVaoLam.setDateFormatString("dd-MM-yyyy");

        jLabel12.setText("Lương");

        jLabel10.setText("Tên Đăng Nhập");

        JBThem.setText("Thêm");
        JBThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBThemActionPerformed(evt);
            }
        });

        JBSua.setText("Sửa");
        JBSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSuaActionPerformed(evt);
            }
        });

        JBXoa.setText("Xóa");
        JBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBXoaActionPerformed(evt);
            }
        });

        JBReset.setText("Reset");
        JBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JBThem)
                .addGap(27, 27, 27)
                .addComponent(JBXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JBSua, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(JBReset)
                .addGap(0, 97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBXoa)
                    .addComponent(JBThem)
                    .addComponent(JBSua)
                    .addComponent(JBReset))
                .addGap(18, 18, 18))
        );

        jLabel8.setText("Ngày Sinh");

        jLabel6.setText("Giới Tính");

        jLabel4.setText("Địa Chỉ");

        jLabel3.setText("Tên Nhân Viên");

        jLabel2.setText("Tìm Kiếm");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(JDateNgayVaoLam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(txtLuong)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JRNam)
                                                .addGap(78, 78, 78)
                                                .addComponent(JRNu))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JDateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                .addComponent(txtTenDangNhap)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11))
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(47, 47, 47)))
                                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRNam)
                    .addComponent(JRNu)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(JDateNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(JDateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhapActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void tblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMousePressed
        // TODO add your handling code here:
        
        int HangDuocChon = tblNhanVien.getSelectedRow();
        txtTenNhanVien.setText((String) tblNhanVien.getValueAt(HangDuocChon, 1));
        txtDiaChi.setText((String) tblNhanVien.getValueAt(HangDuocChon, 2));
        txtSoDienThoai.setText((String) tblNhanVien.getValueAt(HangDuocChon, 3));
       String abc =  (String) tblNhanVien.getValueAt(HangDuocChon, 4);
       txtLuong.setText(String.valueOf(tblNhanVien.getValueAt(HangDuocChon, 8)));
       if(abc.equals("Nam")){
           JRNam.setSelected(true);
       }else{
           JRNu.setSelected(true);
       }
       txtChucVu.setText((String) tblNhanVien.getValueAt(HangDuocChon, 5));
       txtTenDangNhap.setText((String)tblNhanVien.getValueAt(HangDuocChon, 9));
       txtMatKhau.setText((String) tblNhanVien.getValueAt(HangDuocChon, 10));
       JDateNgaySinh.setDate((Date) tblNhanVien.getValueAt(HangDuocChon, 6));
       JDateNgayVaoLam.setDate((Date) tblNhanVien.getValueAt(HangDuocChon, 7));
       
    }//GEN-LAST:event_tblNhanVienMousePressed

    private void JBThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBThemActionPerformed
        // TODO add your handling code here:
    double Luong;
    String TenNhanVien,DiaChi;
    String SoDienThoai;
    boolean GioiTinh;
    String ChucVu;
    Date NgaySinh,NgayVaoLam;
    String TenDangNhap,MatKhau;
        TenNhanVien = txtTenNhanVien.getText();
        DiaChi = txtDiaChi.getText();
        SoDienThoai =txtSoDienThoai.getText();
        ChucVu = txtChucVu.getText();
        Luong = ChuyenDoi.SoDouble(txtLuong.getText());
        GioiTinh = JRNam.isSelected()?true:false;
        TenDangNhap = txtTenDangNhap.getText();
        MatKhau = txtMatKhau.getText();
        NgaySinh =  JDateNgaySinh.getDate();
        NgayVaoLam= JDateNgayVaoLam.getDate();
        NhanVien nv = new NhanVien(TenNhanVien, DiaChi, SoDienThoai,
                GioiTinh, ChucVu, NgaySinh, NgayVaoLam,
                Luong, TenDangNhap, MatKhau);
        BLL.BLLNhanVien.Add(nv);
        ArrayList<NhanVien> arrSP = BLL.BLLNhanVien.GetAll();
        BLL.BLLNhanVien.DoVaoTable(arrSP, tblNhanVien);
    }//GEN-LAST:event_JBThemActionPerformed

    private void JBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBXoaActionPerformed
        // TODO add your handling code here:
         int HangDuocChon = tblNhanVien.getSelectedRow();
        BLL.BLLNhanVien.Delete((int) tblNhanVien.getValueAt(HangDuocChon, 0));
        ArrayList<NhanVien> arrSP = BLL.BLLNhanVien.GetAll();
        BLL.BLLNhanVien.DoVaoTable(arrSP, tblNhanVien);
    }//GEN-LAST:event_JBXoaActionPerformed

    private void JBSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSuaActionPerformed
        // TODO add your handling code here:
         int HangDuocChon = tblNhanVien.getSelectedRow();
        int MaNhanVien = (int)tblNhanVien.getValueAt(HangDuocChon, 0);
        double Luong;
    String TenNhanVien,DiaChi;
    String SoDienThoai;
    boolean GioiTinh;
    String ChucVu;
    Date NgaySinh,NgayVaoLam;
    String TenDangNhap,MatKhau;
        TenNhanVien = txtTenNhanVien.getText();
        DiaChi = txtDiaChi.getText();
        SoDienThoai =txtSoDienThoai.getText();
        ChucVu = txtChucVu.getText();
        Luong = ChuyenDoi.SoDouble(txtLuong.getText());
        GioiTinh = JRNam.isSelected()?false:true;
        TenDangNhap = txtTenDangNhap.getText();
        MatKhau = txtMatKhau.getText();
        NgaySinh =  JDateNgaySinh.getDate();
        NgayVaoLam= JDateNgayVaoLam.getDate();
        NhanVien nv = new NhanVien(MaNhanVien,TenNhanVien, DiaChi, SoDienThoai,
                GioiTinh, ChucVu, NgaySinh, NgayVaoLam,
                Luong, TenDangNhap, MatKhau);
        BLL.BLLNhanVien.Update(nv);
        ArrayList<NhanVien> arrSP = BLL.BLLNhanVien.GetAll();
        BLL.BLLNhanVien.DoVaoTable(arrSP, tblNhanVien);
    }//GEN-LAST:event_JBSuaActionPerformed

    private void JBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResetActionPerformed
        // TODO add your handling code here:
        txtTenNhanVien.setText("");
        txtDiaChi.setText("");
        txtLuong.setText("");
        txtSoDienThoai.setText("");
        txtChucVu.setText("");
        JDateNgaySinh.setDate(null);
        JDateNgayVaoLam.setDate(null);
        JRNam.setSelected(true);
        txtTenDangNhap.setText("");
        txtMatKhau.setText(""); 
    }//GEN-LAST:event_JBResetActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBReset;
    private javax.swing.JButton JBSua;
    private javax.swing.JButton JBThem;
    private javax.swing.JButton JBXoa;
    private com.toedter.calendar.JDateChooser JDateNgaySinh;
    private com.toedter.calendar.JDateChooser JDateNgayVaoLam;
    private javax.swing.JRadioButton JRNam;
    private javax.swing.JRadioButton JRNu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}