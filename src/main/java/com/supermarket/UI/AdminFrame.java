package com.supermarket.UI;

import com.supermarket.DAO.ChungLoaiDAO;
import com.supermarket.DAO.ChiTietDonHangDAO;
import com.supermarket.DAO.ChiTietHoaDonDAO;
import com.supermarket.DAO.DonHangDAO;
import com.supermarket.DAO.HoaDonDAO;
import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.DAO.SanPhamDAO;
import com.supermarket.DAO.NhanVienDAO;
import com.supermarket.ENTITY.CLockThread;
import com.supermarket.ENTITY.NhanVien;
import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.HoaDon;
import com.supermarket.ENTITY.ChiTietDonHang;
import com.supermarket.ENTITY.KhachHang;
import com.supermarket.ENTITY.ChiTietHoaDon;
import com.supermarket.ENTITY.SanPham;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminFrame extends javax.swing.JFrame {

    private int index = 0;
    private int indexSP = -1;
    private int indexKH = -1;
    private int indexCL = -1;
    private int indexHD = -1;
    private int indexNV = -1;

    //Biến LIST
    private List<SanPham> spList = new ArrayList<>();
    private List<KhachHang> khList = new ArrayList<>();
    private List<ChungLoai> clList = new ArrayList<>();
    private List<NhanVien> nvList = new ArrayList<>();
    private List<HoaDon> hdList = new ArrayList<>();

    //Biến DAO
    private KhachHangDAO khDao = new KhachHangDAO();
    private SanPhamDAO spDao = new SanPhamDAO();
    private ChungLoaiDAO clDao = new ChungLoaiDAO();
    private DonHangDAO dhDao = new DonHangDAO();
    private HoaDonDAO hdDao = new HoaDonDAO();
    private ChiTietDonHangDAO dhctDao = new ChiTietDonHangDAO();
    private NhanVienDAO nvDao = new NhanVienDAO();

    public AdminFrame() {
        initComponents();
        setLocationRelativeTo(null);
//        new ChaoJDialog(this, true).setVisible(true);
//        new DangNhapJDialog(this, true).setVisible(true);
        clockRun();
        loadToTableSP();
        fillCboSP();
        loadToTableKH();
        loadToTableCL();
        loadToTableDH();
        loadToTableNV();
        loadToTableHD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrGioiTinhNV = new javax.swing.ButtonGroup();
        bgrGioiTinhKH = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        pnlQLSP = new javax.swing.JPanel();
        lblTitleSP = new javax.swing.JLabel();
        pnlNorthSP = new javax.swing.JPanel();
        pnlWestSP = new javax.swing.JPanel();
        lblMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblChungLoai = new javax.swing.JLabel();
        cboChungLoai = new javax.swing.JComboBox<>();
        pnlEastSP = new javax.swing.JPanel();
        lblTenSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblGia = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtTimSP = new javax.swing.JTextField();
        btnTimSP = new javax.swing.JButton();
        pnlMainBtnSP = new javax.swing.JPanel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnMoiSP = new javax.swing.JButton();
        pnlSouthSP = new javax.swing.JPanel();
        lblTitleSubSP = new javax.swing.JLabel();
        pnlNavRightSP = new javax.swing.JPanel();
        btnFirstSP = new javax.swing.JButton();
        btnPrevSP = new javax.swing.JButton();
        btnNextSP = new javax.swing.JButton();
        btnLastSP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        pnlQLCL = new javax.swing.JPanel();
        lblTitleCL = new javax.swing.JLabel();
        pnlNorthCL = new javax.swing.JPanel();
        pnlWestCL = new javax.swing.JPanel();
        lblMaCL = new javax.swing.JLabel();
        txtMaCL = new javax.swing.JTextField();
        lblTenCl = new javax.swing.JLabel();
        txtTenCL = new javax.swing.JTextField();
        pnlEastCL = new javax.swing.JPanel();
        lblMieuTa = new javax.swing.JLabel();
        txtMieuTa = new javax.swing.JTextField();
        pnlMainBtnCL = new javax.swing.JPanel();
        btnThemCL = new javax.swing.JButton();
        btnSuaCL = new javax.swing.JButton();
        btnXoaCL = new javax.swing.JButton();
        btnMoiCL = new javax.swing.JButton();
        pnlSouthCL = new javax.swing.JPanel();
        lblTitleSubCL = new javax.swing.JLabel();
        pnlNavRightCL = new javax.swing.JPanel();
        btnFirstCL = new javax.swing.JButton();
        btnPrevCL = new javax.swing.JButton();
        btnNextCL = new javax.swing.JButton();
        btnLastCL = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCL = new javax.swing.JTable();
        pnlQLNVBH = new javax.swing.JPanel();
        lblTitleNVBH = new javax.swing.JLabel();
        pnlNorthNVBH = new javax.swing.JPanel();
        pnlWestNVBH = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblGioiTinhNV = new javax.swing.JLabel();
        rdoNamNV = new javax.swing.JRadioButton();
        rdoNuNV = new javax.swing.JRadioButton();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        pnlEastNVBH = new javax.swing.JPanel();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        pnlMainBtnNVBH = new javax.swing.JPanel();
        btnThemNVBH = new javax.swing.JButton();
        btnSuaNVBH = new javax.swing.JButton();
        btnXoaNVBH = new javax.swing.JButton();
        btnMoiNVBH = new javax.swing.JButton();
        pnlSouthNVBH = new javax.swing.JPanel();
        lblTitleSubNVBH = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblNVBH = new javax.swing.JTable();
        pnlNavRightNVBH = new javax.swing.JPanel();
        btnFirstNV = new javax.swing.JButton();
        btnPrevNV = new javax.swing.JButton();
        btnNextNV = new javax.swing.JButton();
        btnLastNV = new javax.swing.JButton();
        pnlDSKH = new javax.swing.JPanel();
        lblTitleKH = new javax.swing.JLabel();
        pnlNorthKH = new javax.swing.JPanel();
        pnlWestKH = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblMatKhau1 = new javax.swing.JLabel();
        txtMatKhauKH = new javax.swing.JTextField();
        pnlEastKH = new javax.swing.JPanel();
        lblNgaySinh1 = new javax.swing.JLabel();
        txtNgaySinhKH = new javax.swing.JTextField();
        lblGioiTinhKH = new javax.swing.JLabel();
        rdoNamKH = new javax.swing.JRadioButton();
        rdoNuKH = new javax.swing.JRadioButton();
        lblNgayDK = new javax.swing.JLabel();
        txtNgayDK = new javax.swing.JTextField();
        pnlSouthKH = new javax.swing.JPanel();
        BtnSuaKH = new javax.swing.JButton();
        lblTitleSubKH = new javax.swing.JLabel();
        pnlNavRightKH = new javax.swing.JPanel();
        btnFirstKH = new javax.swing.JButton();
        btnPrevKH = new javax.swing.JButton();
        btnNextKH = new javax.swing.JButton();
        btnLastKH = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        pnlDSHD = new javax.swing.JPanel();
        lblTitleSubHD = new javax.swing.JLabel();
        btnChiTietHD = new javax.swing.JButton();
        btnXoaHD = new javax.swing.JButton();
        pnlNavRightHD = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        btnNextHD = new javax.swing.JButton();
        btnLastHD = new javax.swing.JButton();
        btnPrevHD = new javax.swing.JButton();
        btnFirstHD = new javax.swing.JButton();
        lblMaNVpnlDSHD = new javax.swing.JLabel();
        txtMaNVpnlDSHD = new javax.swing.JTextField();
        lblMaHDpnlDSHD = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        lblTongTienpnlDSHD = new javax.swing.JLabel();
        txtTongTienpnlDSHD = new javax.swing.JTextField();
        txtNgayLapHDpnlDSHD = new javax.swing.JTextField();
        lblNgayLapHDpnlDSHD = new javax.swing.JLabel();
        pnlDSDH = new javax.swing.JPanel();
        lblTitleSubDH = new javax.swing.JLabel();
        btnXoaDH = new javax.swing.JButton();
        btnChiTietDH = new javax.swing.JButton();
        pnlNavRightHD1 = new javax.swing.JPanel();
        btnFirstDH = new javax.swing.JButton();
        btnPrevDH = new javax.swing.JButton();
        btnNextDH = new javax.swing.JButton();
        btnLastDH = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblDH = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaDH = new javax.swing.JTextField();
        txtMaKh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        txtNgayDatHang = new javax.swing.JTextField();
        pnlTK = new javax.swing.JPanel();
        lblTitleSubTK = new javax.swing.JLabel();
        pnlNavRightTK = new javax.swing.JPanel();
        btnFirstTK = new javax.swing.JButton();
        btnPrevTK = new javax.swing.JButton();
        btnNextTK = new javax.swing.JButton();
        btnLastTK = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblTK = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblTitleSubTK1 = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lí siêu thị");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabs.setFocusable(false);

        pnlQLSP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleSP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitleSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSP.setText("QUẢN LÝ SẢN PHẨM");

        lblMaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaSP.setText("Mã sản phẩm");

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblChungLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblChungLoai.setText("Chủng loại");

        cboChungLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChungLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboChungLoai.setFocusable(false);

        javax.swing.GroupLayout pnlWestSPLayout = new javax.swing.GroupLayout(pnlWestSP);
        pnlWestSP.setLayout(pnlWestSPLayout);
        pnlWestSPLayout.setHorizontalGroup(
            pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChungLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWestSPLayout.createSequentialGroup()
                        .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboChungLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlWestSPLayout.setVerticalGroup(
            pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestSPLayout.createSequentialGroup()
                .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWestSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChungLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChungLoai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenSP.setText("Tên sản phẩm");

        txtTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGia.setText("Giá thành");

        txtGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtTimSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnTimSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimSP.setText("Tìm kiếm");
        btnTimSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimSP.setFocusable(false);
        btnTimSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEastSPLayout = new javax.swing.GroupLayout(pnlEastSP);
        pnlEastSP.setLayout(pnlEastSPLayout);
        pnlEastSPLayout.setHorizontalGroup(
            pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastSPLayout.createSequentialGroup()
                        .addComponent(lblTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastSPLayout.createSequentialGroup()
                        .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastSPLayout.createSequentialGroup()
                        .addComponent(txtTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEastSPLayout.setVerticalGroup(
            pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastSPLayout.createSequentialGroup()
                .addGroup(pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEastSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimSP)
                    .addComponent(btnTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pnlMainBtnSP.setLayout(new java.awt.GridLayout(1, 4, 40, 0));

        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.setText("Thêm");
        btnThemSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemSP.setFocusable(false);
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });
        pnlMainBtnSP.add(btnThemSP);

        btnSuaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaSP.setText("Sửa");
        btnSuaSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaSP.setFocusable(false);
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });
        pnlMainBtnSP.add(btnSuaSP);

        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSP.setText("Xóa");
        btnXoaSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaSP.setFocusable(false);
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });
        pnlMainBtnSP.add(btnXoaSP);

        btnMoiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoiSP.setText("Mới");
        btnMoiSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoiSP.setFocusable(false);
        btnMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiSPActionPerformed(evt);
            }
        });
        pnlMainBtnSP.add(btnMoiSP);

        javax.swing.GroupLayout pnlNorthSPLayout = new javax.swing.GroupLayout(pnlNorthSP);
        pnlNorthSP.setLayout(pnlNorthSPLayout);
        pnlNorthSPLayout.setHorizontalGroup(
            pnlNorthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBtnSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlNorthSPLayout.createSequentialGroup()
                .addComponent(pnlWestSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlEastSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNorthSPLayout.setVerticalGroup(
            pnlNorthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthSPLayout.createSequentialGroup()
                .addGroup(pnlNorthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNorthSPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlEastSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlNorthSPLayout.createSequentialGroup()
                        .addComponent(pnlWestSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(pnlMainBtnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTitleSubSP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubSP.setText("Danh sách sản phẩm");

        pnlNavRightSP.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstSP.setText("|<");
        btnFirstSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstSP.setFocusable(false);
        btnFirstSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstSPActionPerformed(evt);
            }
        });
        pnlNavRightSP.add(btnFirstSP);

        btnPrevSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevSP.setText("<<");
        btnPrevSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevSP.setFocusable(false);
        btnPrevSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevSPActionPerformed(evt);
            }
        });
        pnlNavRightSP.add(btnPrevSP);

        btnNextSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextSP.setText(">>");
        btnNextSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextSP.setFocusable(false);
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });
        pnlNavRightSP.add(btnNextSP);

        btnLastSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastSP.setText(">|");
        btnLastSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastSP.setFocusable(false);
        btnLastSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastSPActionPerformed(evt);
            }
        });
        pnlNavRightSP.add(btnLastSP);

        tblSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Chủng loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSPMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblSP);

        javax.swing.GroupLayout pnlSouthSPLayout = new javax.swing.GroupLayout(pnlSouthSP);
        pnlSouthSP.setLayout(pnlSouthSPLayout);
        pnlSouthSPLayout.setHorizontalGroup(
            pnlSouthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSouthSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleSubSP, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNavRightSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        pnlSouthSPLayout.setVerticalGroup(
            pnlSouthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNavRightSP, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblTitleSubSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQLSPLayout = new javax.swing.GroupLayout(pnlQLSP);
        pnlQLSP.setLayout(pnlQLSPLayout);
        pnlQLSPLayout.setHorizontalGroup(
            pnlQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitleSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSouthSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNorthSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlQLSPLayout.setVerticalGroup(
            pnlQLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNorthSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("QUẢN LÍ SẢN PHẨM", pnlQLSP);

        pnlQLCL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleCL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleCL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCL.setText("QUẢN LÝ CHỦNG LOẠI");

        lblMaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaCL.setText("Mã chủng loại");

        txtMaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMaCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMaCLMousePressed(evt);
            }
        });
        txtMaCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCLActionPerformed(evt);
            }
        });

        lblTenCl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenCl.setText("Tên chủng loại");

        txtTenCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTenCLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlWestCLLayout = new javax.swing.GroupLayout(pnlWestCL);
        pnlWestCL.setLayout(pnlWestCLLayout);
        pnlWestCLLayout.setHorizontalGroup(
            pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaCL)
                    .addComponent(lblTenCl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaCL, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(txtTenCL))
                .addContainerGap())
        );
        pnlWestCLLayout.setVerticalGroup(
            pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaCL, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(lblMaCL))
                .addGap(44, 44, 44)
                .addGroup(pnlWestCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenCL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenCl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblMieuTa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMieuTa.setText("Miêu tả");

        txtMieuTa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMieuTa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMieuTaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlEastCLLayout = new javax.swing.GroupLayout(pnlEastCL);
        pnlEastCL.setLayout(pnlEastCLLayout);
        pnlEastCLLayout.setHorizontalGroup(
            pnlEastCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastCLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMieuTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMieuTa, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
        );
        pnlEastCLLayout.setVerticalGroup(
            pnlEastCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastCLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMieuTa)
                .addGap(101, 113, Short.MAX_VALUE))
            .addGroup(pnlEastCLLayout.createSequentialGroup()
                .addComponent(txtMieuTa)
                .addContainerGap())
        );

        pnlMainBtnCL.setLayout(new java.awt.GridLayout(1, 4, 40, 0));

        btnThemCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemCL.setText("Thêm");
        btnThemCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemCL.setFocusable(false);
        btnThemCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCLActionPerformed(evt);
            }
        });
        pnlMainBtnCL.add(btnThemCL);

        btnSuaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaCL.setText("Sửa");
        btnSuaCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaCL.setFocusable(false);
        btnSuaCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCLActionPerformed(evt);
            }
        });
        pnlMainBtnCL.add(btnSuaCL);

        btnXoaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaCL.setText("Xóa");
        btnXoaCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaCL.setFocusable(false);
        btnXoaCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCLActionPerformed(evt);
            }
        });
        pnlMainBtnCL.add(btnXoaCL);

        btnMoiCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoiCL.setText("Mới");
        btnMoiCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoiCL.setFocusable(false);
        btnMoiCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiCLActionPerformed(evt);
            }
        });
        pnlMainBtnCL.add(btnMoiCL);

        javax.swing.GroupLayout pnlNorthCLLayout = new javax.swing.GroupLayout(pnlNorthCL);
        pnlNorthCL.setLayout(pnlNorthCLLayout);
        pnlNorthCLLayout.setHorizontalGroup(
            pnlNorthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainBtnCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlNorthCLLayout.createSequentialGroup()
                        .addComponent(pnlWestCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pnlEastCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlNorthCLLayout.setVerticalGroup(
            pnlNorthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlWestCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEastCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlMainBtnCL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitleSubCL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubCL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubCL.setText("Danh sách chủng loại");

        pnlNavRightCL.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstCL.setText("|<");
        btnFirstCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstCL.setFocusable(false);
        btnFirstCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstCLActionPerformed(evt);
            }
        });
        pnlNavRightCL.add(btnFirstCL);

        btnPrevCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevCL.setText("<<");
        btnPrevCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevCL.setFocusable(false);
        btnPrevCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevCLActionPerformed(evt);
            }
        });
        pnlNavRightCL.add(btnPrevCL);

        btnNextCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextCL.setText(">>");
        btnNextCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextCL.setFocusable(false);
        btnNextCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextCLActionPerformed(evt);
            }
        });
        pnlNavRightCL.add(btnNextCL);

        btnLastCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastCL.setText(">|");
        btnLastCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastCL.setFocusable(false);
        btnLastCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastCLActionPerformed(evt);
            }
        });
        pnlNavRightCL.add(btnLastCL);

        tblCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblCL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã chủng loại", "Tên chủng loại", "Miêu tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCLMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tblCL);

        javax.swing.GroupLayout pnlSouthCLLayout = new javax.swing.GroupLayout(pnlSouthCL);
        pnlSouthCL.setLayout(pnlSouthCLLayout);
        pnlSouthCLLayout.setHorizontalGroup(
            pnlSouthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSouthCLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleSubCL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlNavRightCL, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4)
        );
        pnlSouthCLLayout.setVerticalGroup(
            pnlSouthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleSubCL, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(pnlNavRightCL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQLCLLayout = new javax.swing.GroupLayout(pnlQLCL);
        pnlQLCL.setLayout(pnlQLCLLayout);
        pnlQLCLLayout.setHorizontalGroup(
            pnlQLCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlQLCLLayout.createSequentialGroup()
                        .addGroup(pnlQLCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNorthCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSouthCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlQLCLLayout.setVerticalGroup(
            pnlQLCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleCL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNorthCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("QUẢN LÝ CHỦNG LOẠI", pnlQLCL);

        pnlQLNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleNVBH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleNVBH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleNVBH.setText("QUẢN LÝ NHÂN VIÊN BÁN HÀNG");

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblGioiTinhNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGioiTinhNV.setText("Giới tính");

        bgrGioiTinhNV.add(rdoNamNV);
        rdoNamNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoNamNV.setText("Nam");
        rdoNamNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rdoNamNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNamNV.setFocusable(false);
        rdoNamNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamNVActionPerformed(evt);
            }
        });

        bgrGioiTinhNV.add(rdoNuNV);
        rdoNuNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoNuNV.setText("Nữ");
        rdoNuNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rdoNuNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNuNV.setFocusable(false);

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgaySinh.setText("Ngày sinh");

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlWestNVBHLayout = new javax.swing.GroupLayout(pnlWestNVBH);
        pnlWestNVBH.setLayout(pnlWestNVBHLayout);
        pnlWestNVBHLayout.setHorizontalGroup(
            pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGioiTinhNV, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgaySinh)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlWestNVBHLayout.createSequentialGroup()
                        .addComponent(rdoNamNV)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNuNV)))
                .addContainerGap())
        );
        pnlWestNVBHLayout.setVerticalGroup(
            pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(lblMaNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNamNV)
                    .addComponent(rdoNuNV)
                    .addComponent(lblGioiTinhNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWestNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoTen.setText("Họ và tên");

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlEastNVBHLayout = new javax.swing.GroupLayout(pnlEastNVBH);
        pnlEastNVBH.setLayout(pnlEastNVBHLayout);
        pnlEastNVBHLayout.setHorizontalGroup(
            pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlEastNVBHLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pnlEastNVBHLayout.setVerticalGroup(
            pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastNVBHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlEastNVBHLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlEastNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(102, 102, 102)))
        );

        pnlMainBtnNVBH.setLayout(new java.awt.GridLayout(1, 4, 40, 0));

        btnThemNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemNVBH.setText("Thêm");
        btnThemNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemNVBH.setFocusable(false);
        btnThemNVBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVBHActionPerformed(evt);
            }
        });
        pnlMainBtnNVBH.add(btnThemNVBH);

        btnSuaNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaNVBH.setText("Sửa");
        btnSuaNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaNVBH.setFocusable(false);
        btnSuaNVBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNVBHActionPerformed(evt);
            }
        });
        pnlMainBtnNVBH.add(btnSuaNVBH);

        btnXoaNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaNVBH.setText("Xóa");
        btnXoaNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNVBH.setFocusable(false);
        btnXoaNVBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNVBHActionPerformed(evt);
            }
        });
        pnlMainBtnNVBH.add(btnXoaNVBH);

        btnMoiNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoiNVBH.setText("Mới");
        btnMoiNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoiNVBH.setFocusable(false);
        btnMoiNVBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiNVBHActionPerformed(evt);
            }
        });
        pnlMainBtnNVBH.add(btnMoiNVBH);

        javax.swing.GroupLayout pnlNorthNVBHLayout = new javax.swing.GroupLayout(pnlNorthNVBH);
        pnlNorthNVBH.setLayout(pnlNorthNVBHLayout);
        pnlNorthNVBHLayout.setHorizontalGroup(
            pnlNorthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNorthNVBHLayout.createSequentialGroup()
                        .addComponent(pnlMainBtnNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlNorthNVBHLayout.createSequentialGroup()
                        .addComponent(pnlWestNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlEastNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlNorthNVBHLayout.setVerticalGroup(
            pnlNorthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlWestNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEastNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlMainBtnNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitleSubNVBH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubNVBH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubNVBH.setText("Danh sách nhân viên bán hàng");

        tblNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblNVBH.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Mật khẩu", "Họ tên", "Giới tính", "Ngày sinh", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNVBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNVBHMousePressed(evt);
            }
        });
        jScrollPane12.setViewportView(tblNVBH);

        pnlNavRightNVBH.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstNV.setText("|<");
        btnFirstNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstNV.setFocusable(false);
        btnFirstNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstNVActionPerformed(evt);
            }
        });
        pnlNavRightNVBH.add(btnFirstNV);

        btnPrevNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevNV.setText("<<");
        btnPrevNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevNV.setFocusable(false);
        btnPrevNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevNVActionPerformed(evt);
            }
        });
        pnlNavRightNVBH.add(btnPrevNV);

        btnNextNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextNV.setText(">>");
        btnNextNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextNV.setFocusable(false);
        btnNextNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNVActionPerformed(evt);
            }
        });
        pnlNavRightNVBH.add(btnNextNV);

        btnLastNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastNV.setText(">|");
        btnLastNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastNV.setFocusable(false);
        btnLastNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastNVActionPerformed(evt);
            }
        });
        pnlNavRightNVBH.add(btnLastNV);

        javax.swing.GroupLayout pnlSouthNVBHLayout = new javax.swing.GroupLayout(pnlSouthNVBH);
        pnlSouthNVBH.setLayout(pnlSouthNVBHLayout);
        pnlSouthNVBHLayout.setHorizontalGroup(
            pnlSouthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
            .addGroup(pnlSouthNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleSubNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNavRightNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSouthNVBHLayout.setVerticalGroup(
            pnlSouthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleSubNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavRightNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQLNVBHLayout = new javax.swing.GroupLayout(pnlQLNVBH);
        pnlQLNVBH.setLayout(pnlQLNVBHLayout);
        pnlQLNVBHLayout.setHorizontalGroup(
            pnlQLNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLNVBHLayout.createSequentialGroup()
                        .addGroup(pnlQLNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlSouthNVBH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlNorthNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlQLNVBHLayout.setVerticalGroup(
            pnlQLNVBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNVBHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleNVBH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNorthNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthNVBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("QUẢN LÝ NHÂN VIÊN", pnlQLNVBH);

        pnlDSKH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleKH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleKH.setText("QUẢN LÝ KHÁCH HÀNG");

        lblMaKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaKH.setText("Mã khách hàng");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenKH.setText("Tên khách hàng");

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblMatKhau1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatKhau1.setText("Mật khẩu");

        txtMatKhauKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlWestKHLayout = new javax.swing.GroupLayout(pnlWestKH);
        pnlWestKH.setLayout(pnlWestKHLayout);
        pnlWestKHLayout.setHorizontalGroup(
            pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMatKhau1)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(txtMaKH)
                    .addComponent(txtMatKhauKH))
                .addContainerGap())
        );
        pnlWestKHLayout.setVerticalGroup(
            pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestKHLayout.createSequentialGroup()
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaKH))
                .addGap(19, 19, 19)
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau1))
                .addContainerGap())
        );

        lblNgaySinh1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgaySinh1.setText("Ngày sinh");

        txtNgaySinhKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblGioiTinhKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGioiTinhKH.setText("Giới tính");

        bgrGioiTinhKH.add(rdoNamKH);
        rdoNamKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoNamKH.setText("Nam");
        rdoNamKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNamKH.setFocusable(false);

        bgrGioiTinhKH.add(rdoNuKH);
        rdoNuKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoNuKH.setText("Nữ");
        rdoNuKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoNuKH.setFocusable(false);

        lblNgayDK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayDK.setText("Ngày đăng kí");

        txtNgayDK.setEditable(false);
        txtNgayDK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlEastKHLayout = new javax.swing.GroupLayout(pnlEastKH);
        pnlEastKH.setLayout(pnlEastKHLayout);
        pnlEastKHLayout.setHorizontalGroup(
            pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEastKHLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNgayDK))
                    .addGroup(pnlEastKHLayout.createSequentialGroup()
                        .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGioiTinhKH)
                            .addComponent(lblNgaySinh1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEastKHLayout.createSequentialGroup()
                        .addComponent(rdoNamKH)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNuKH))
                    .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(txtNgayDK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEastKHLayout.setVerticalGroup(
            pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(lblNgaySinh1))
                .addGap(18, 18, 18)
                .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNamKH)
                    .addComponent(rdoNuKH)
                    .addComponent(lblGioiTinhKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlEastKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayDK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlNorthKHLayout = new javax.swing.GroupLayout(pnlNorthKH);
        pnlNorthKH.setLayout(pnlNorthKHLayout);
        pnlNorthKHLayout.setHorizontalGroup(
            pnlNorthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWestKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(pnlEastKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNorthKHLayout.setVerticalGroup(
            pnlNorthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEastKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWestKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BtnSuaKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSuaKH.setText("Sửa");
        BtnSuaKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnSuaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSuaKH.setFocusable(false);
        BtnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuaKHActionPerformed(evt);
            }
        });

        lblTitleSubKH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubKH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubKH.setText("Danh sách khách hàng");

        pnlNavRightKH.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstKH.setText("|<");
        btnFirstKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstKH.setFocusable(false);
        btnFirstKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstKHActionPerformed(evt);
            }
        });
        pnlNavRightKH.add(btnFirstKH);

        btnPrevKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevKH.setText("<<");
        btnPrevKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevKH.setFocusable(false);
        btnPrevKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevKHActionPerformed(evt);
            }
        });
        pnlNavRightKH.add(btnPrevKH);

        btnNextKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextKH.setText(">>");
        btnNextKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextKH.setFocusable(false);
        btnNextKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextKHActionPerformed(evt);
            }
        });
        pnlNavRightKH.add(btnNextKH);

        btnLastKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastKH.setText(">|");
        btnLastKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastKH.setFocusable(false);
        btnLastKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastKHActionPerformed(evt);
            }
        });
        pnlNavRightKH.add(btnLastKH);

        tblKH.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Mật khẩu", "Tên khách hàng", "Giới tính", "Ngày sinh", "Ngày đăng kí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKHMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tblKH);

        javax.swing.GroupLayout pnlSouthKHLayout = new javax.swing.GroupLayout(pnlSouthKH);
        pnlSouthKH.setLayout(pnlSouthKHLayout);
        pnlSouthKHLayout.setHorizontalGroup(
            pnlSouthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSouthKHLayout.createSequentialGroup()
                        .addComponent(BtnSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitleSubKH, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNavRightKH, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        pnlSouthKHLayout.setVerticalGroup(
            pnlSouthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnSuaKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblTitleSubKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavRightKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDSKHLayout = new javax.swing.GroupLayout(pnlDSKH);
        pnlDSKH.setLayout(pnlDSKHLayout);
        pnlDSKHLayout.setHorizontalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSouthKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNorthKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDSKHLayout.setVerticalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNorthKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("QUẢN LÝ KHÁCH HÀNG", pnlDSKH);

        pnlDSHD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleSubHD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSubHD.setText("DANH SÁCH HÓA ĐƠN");

        btnChiTietHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChiTietHD.setText("Chi tiết hóa đơn");
        btnChiTietHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChiTietHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTietHD.setFocusable(false);
        btnChiTietHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietHDActionPerformed(evt);
            }
        });

        btnXoaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaHD.setText("Xóa");
        btnXoaHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaHD.setFocusable(false);
        btnXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHDActionPerformed(evt);
            }
        });

        pnlNavRightHD.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập hóa đơn", "Mã nhân viên", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHDMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tblHD);

        btnNextHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextHD.setText(">>");
        btnNextHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextHD.setFocusable(false);
        btnNextHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextHDActionPerformed(evt);
            }
        });

        btnLastHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastHD.setText(">|");
        btnLastHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastHD.setFocusable(false);
        btnLastHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastHDActionPerformed(evt);
            }
        });

        btnPrevHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevHD.setText("<<");
        btnPrevHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevHD.setFocusable(false);
        btnPrevHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevHDActionPerformed(evt);
            }
        });

        btnFirstHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstHD.setText("|<");
        btnFirstHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstHD.setFocusable(false);
        btnFirstHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstHDActionPerformed(evt);
            }
        });

        lblMaNVpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNVpnlDSHD.setText("Mã nhân viên");

        txtMaNVpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblMaHDpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaHDpnlDSHD.setText("Mã hóa đơn");

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblTongTienpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongTienpnlDSHD.setText("Tổng tiền");

        txtTongTienpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtNgayLapHDpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblNgayLapHDpnlDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayLapHDpnlDSHD.setText("Ngày lập");

        javax.swing.GroupLayout pnlDSHDLayout = new javax.swing.GroupLayout(pnlDSHD);
        pnlDSHD.setLayout(pnlDSHDLayout);
        pnlDSHDLayout.setHorizontalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(pnlNavRightHD, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitleSubHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDSHDLayout.createSequentialGroup()
                                .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChiTietHD, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFirstHD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnPrevHD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnNextHD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnLastHD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlDSHDLayout.createSequentialGroup()
                                .addComponent(lblMaHDpnlDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDSHDLayout.createSequentialGroup()
                                .addComponent(lblMaNVpnlDSHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaNVpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlDSHDLayout.createSequentialGroup()
                                .addComponent(lblNgayLapHDpnlDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayLapHDpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDSHDLayout.createSequentialGroup()
                                .addComponent(lblTongTienpnlDSHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongTienpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        pnlDSHDLayout.setVerticalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitleSubHD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlNavRightHD, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHDpnlDSHD))
                        .addGap(33, 33, 33)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNVpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNVpnlDSHD)))
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayLapHDpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayLapHDpnlDSHD))
                        .addGap(33, 33, 33)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTienpnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTienpnlDSHD))))
                .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(btnChiTietHD, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrevHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNextHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLastHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("QUẢN LÝ HÓA ĐƠN", pnlDSHD);

        pnlDSDH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleSubDH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitleSubDH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSubDH.setText("QUẢN LÝ ĐƠN HÀNG");

        btnXoaDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaDH.setText("Xóa");
        btnXoaDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaDH.setFocusable(false);
        btnXoaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDHActionPerformed(evt);
            }
        });

        btnChiTietDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChiTietDH.setText("Chi tiết đơn hàng");
        btnChiTietDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChiTietDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTietDH.setFocusable(false);
        btnChiTietDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietDHActionPerformed(evt);
            }
        });

        pnlNavRightHD1.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstDH.setText("|<");
        btnFirstDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstDH.setFocusable(false);
        btnFirstDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstDHActionPerformed(evt);
            }
        });
        pnlNavRightHD1.add(btnFirstDH);

        btnPrevDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevDH.setText("<<");
        btnPrevDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevDH.setFocusable(false);
        btnPrevDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevDHActionPerformed(evt);
            }
        });
        pnlNavRightHD1.add(btnPrevDH);

        btnNextDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextDH.setText(">>");
        btnNextDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextDH.setFocusable(false);
        btnNextDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDHActionPerformed(evt);
            }
        });
        pnlNavRightHD1.add(btnNextDH);

        btnLastDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastDH.setText(">|");
        btnLastDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastDH.setFocusable(false);
        btnLastDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastDHActionPerformed(evt);
            }
        });
        pnlNavRightHD1.add(btnLastDH);

        tblDH.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Mã đơn hàng", "Ngày đặt hàng", "Mã khách hàng", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDHMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tblDH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã đơn hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng");

        txtMaDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtMaKh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ngày đặt hàng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tổng tiền");

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtNgayDatHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaKh, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayDatHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgayDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaKh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDSDHLayout = new javax.swing.GroupLayout(pnlDSDH);
        pnlDSDH.setLayout(pnlDSDHLayout);
        pnlDSDHLayout.setHorizontalGroup(
            pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleSubDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSDHLayout.createSequentialGroup()
                        .addComponent(btnXoaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChiTietDH, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNavRightHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDSDHLayout.setVerticalGroup(
            pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSDHLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitleSubDH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNavRightHD1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnChiTietDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ ĐƠN HÀNG", pnlDSDH);

        pnlTK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleSubTK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubTK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubTK.setText("Danh sách thống kê");

        pnlNavRightTK.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirstTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirstTK.setText("|<");
        btnFirstTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFirstTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstTK.setFocusable(false);
        btnFirstTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstTKActionPerformed(evt);
            }
        });
        pnlNavRightTK.add(btnFirstTK);

        btnPrevTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevTK.setText("<<");
        btnPrevTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevTK.setFocusable(false);
        btnPrevTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevTKActionPerformed(evt);
            }
        });
        pnlNavRightTK.add(btnPrevTK);

        btnNextTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextTK.setText(">>");
        btnNextTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextTK.setFocusable(false);
        pnlNavRightTK.add(btnNextTK);

        btnLastTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastTK.setText(">|");
        btnLastTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastTK.setFocusable(false);
        pnlNavRightTK.add(btnLastTK);

        tblTK.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Năm", "Doanh thu", "Sản phẩm bán nhiều nhất", "Sản phẩm bán ít nhât"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblTK);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NĂM");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DOANH THU");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SẢN PHẨM BÁN NHIỀU NHẤT");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SẢN PHẨM BÁN ÍT NHẤT");

        lblTitleSubTK1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleSubTK1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSubTK1.setText("Thông tin chi tiết");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(lblTitleSubTK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleSubTK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout pnlTKLayout = new javax.swing.GroupLayout(pnlTK);
        pnlTK.setLayout(pnlTKLayout);
        pnlTKLayout.setHorizontalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKLayout.createSequentialGroup()
                        .addComponent(lblTitleSubTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlNavRightTK, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTKLayout.setVerticalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTKLayout.createSequentialGroup()
                        .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitleSubTK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlNavRightTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10))))
        );

        tabs.addTab("THỐNG KÊ", pnlTK);

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusable(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        lblClock.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblClock.setText("00:00:00");

        lblInfor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInfor.setText("Thông tin chi tiết");
        lblInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfor.setFocusable(false);

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock)
                .addGap(390, 390, 390)
                .addComponent(lblInfor)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblClock)
                    .addComponent(lblInfor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSPActionPerformed
        indexSP = 0;
        fillFromTableSP(indexSP);
    }//GEN-LAST:event_btnFirstSPActionPerformed

    private void btnFirstNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstNVActionPerformed
        indexNV = 0;
        editNV();
    }//GEN-LAST:event_btnFirstNVActionPerformed

    private void rdoNamNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamNVActionPerformed

    private void btnFirstHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstHDActionPerformed
        firstHD();
    }//GEN-LAST:event_btnFirstHDActionPerformed

    private void btnFirstDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstDHActionPerformed
        index = 0;
        editDH();
        tblDH.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnFirstDHActionPerformed

    private void btnFirstTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstTKActionPerformed
    //
    private void btnPrevTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevTKActionPerformed

    //Khách hàng
    private void tblKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMousePressed
        indexKH = tblKH.getSelectedRow();
        fillFromTableKH();
    }//GEN-LAST:event_tblKHMousePressed
    // Sản phẩm
    private void tblSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMousePressed
        index = tblSP.rowAtPoint(evt.getPoint());
        editSP();
    }//GEN-LAST:event_tblSPMousePressed

    private void btnPrevSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevSPActionPerformed
        tblSP.setRowSelectionAllowed(true);
        indexSP--;
        if (indexSP < 0) {
            indexSP = spList.size() - 1;
        }
        tblSP.setRowSelectionInterval(indexSP, indexSP);
        fillFromTableSP(indexSP);
    }//GEN-LAST:event_btnPrevSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        indexSP++;
        if (indexSP > spList.size() - 1) {
            indexSP = 0;
        }
        tblSP.setRowSelectionInterval(indexSP, indexSP);
        fillFromTableSP(indexSP);
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnLastSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastSPActionPerformed
        indexSP = tblSP.getRowCount() - 1;
        fillFromTableSP(indexSP);
    }//GEN-LAST:event_btnLastSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        SanPham model = getFromSP();
        try {
            spDao.insert(model);
            loadToTableSP();
            clearFormSP();
            MsgBox.alert(this, "Thêm sản phẩm thành công.");
        } catch (Exception e) {
            MsgBox.alert(this, "Sản phẩm đã tồn tại!");
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiSPActionPerformed
        clearFormSP();
    }//GEN-LAST:event_btnMoiSPActionPerformed

    private void btnNextKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextKHActionPerformed
        if (indexKH == khList.size() - 1) {
            MsgBox.alert(null, "Bạn đang ở cuối danh sách khách hàng");
            return;
        }
        indexKH++;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(indexKH, indexKH);
    }//GEN-LAST:event_btnNextKHActionPerformed

    private void btnPrevKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevKHActionPerformed
        if (indexKH == 0) {
            MsgBox.alert(null, "Bạn đang ở đầu danh sách khách hàng");
            return;
        } else if (indexKH == -1) {
            indexKH++;
            fillFromTableKH();
            tblKH.setRowSelectionInterval(indexKH, indexKH);
            return;
        }
        indexKH--;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(indexKH, indexKH);
    }//GEN-LAST:event_btnPrevKHActionPerformed

    private void btnFirstKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstKHActionPerformed
        indexKH = 0;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(indexKH, indexKH);
    }//GEN-LAST:event_btnFirstKHActionPerformed

    private void btnLastKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastKHActionPerformed
        indexKH = khList.size() - 1;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(indexKH, indexKH);
    }//GEN-LAST:event_btnLastKHActionPerformed

    private void btnChiTietDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietDHActionPerformed
        String madh = txtMaDH.getText();
        ChiTietDonHang dhct = dhctDao.selectById(madh);
        this.setVisible(false);
        ChiTietDonHangFrame frameDHCT = new ChiTietDonHangFrame(dhct.getMaDH());
        frameDHCT.setVisible(true);
    }//GEN-LAST:event_btnChiTietDHActionPerformed

    private void BtnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaKHActionPerformed
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKH.getText());
        kh.setMatKhau(txtMatKhauKH.getText());
        kh.setNgaySinh(XDate.toDate(txtNgaySinhKH.getText(), "dd/MM/yyyy"));
        kh.setNgayDangKy(XDate.toDate(txtNgayDK.getText(), "dd/MM/yyyy"));
        kh.setTenKH(txtTenKH.getText());
        if (rdoNamKH.isSelected()) {
            kh.setGioiTinh(true);
        } else {
            kh.setGioiTinh(false);
        }
        khDao.update(kh);
        MsgBox.alert(null, "Sửa thông tin khách hàng thành công");
        loadToTableKH();
    }//GEN-LAST:event_BtnSuaKHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnTimSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSPActionPerformed
        this.loadToTableSP();
        this.clearFormSP();
        this.index = -1;
    }//GEN-LAST:event_btnTimSPActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        SanPham model = getFromSP();
        try {
            spDao.update(model);
            loadToTableSP();
            MsgBox.alert(this, "Cập nhật sản phẩm thành công.");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật sản phẩm thất bại!" + e.toString());
        }
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed

        if (MsgBox.confirm(this, "Bạn muốn xóa sản phẩm này chứ?")) {
            String maSP = txtMaSP.getText();
            String tenSP = txtTenSP.getText();
            try {
                spDao.delete(maSP);
                loadToTableSP();
                clearFormSP();
                MsgBox.alert(this, "Xóa sản phẩm \"" + tenSP + "\" thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Sản phẩm không thể xóa do lỗi \n" + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void tblCLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCLMousePressed
        fillFromTableCL(tblCL.getSelectedRow());
        indexCL = tblCL.getSelectedRow();
    }//GEN-LAST:event_tblCLMousePressed

    private void btnMoiCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiCLActionPerformed
        clearCL();
    }//GEN-LAST:event_btnMoiCLActionPerformed

    private void btnSuaCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCLActionPerformed
        if (checkCL()) {
            updateCL();
        }
    }//GEN-LAST:event_btnSuaCLActionPerformed

    private void btnThemCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCLActionPerformed
        if (checkCL()) {
            insertCL();
        }
    }//GEN-LAST:event_btnThemCLActionPerformed

    private void btnXoaCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCLActionPerformed
        if (checkCL()) {
            deleteCL();
        }
    }//GEN-LAST:event_btnXoaCLActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.setVisible(false);
        new DangNhapJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void tblDHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDHMousePressed
        index = tblDH.rowAtPoint(evt.getPoint());
        editDH();
    }//GEN-LAST:event_tblDHMousePressed

    private void btnPrevDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevDHActionPerformed
        index--;
        editDH();
        tblDH.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnPrevDHActionPerformed

    private void btnNextDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDHActionPerformed
        index++;
        editDH();
        tblDH.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnNextDHActionPerformed

    private void btnLastDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastDHActionPerformed
        index = tblDH.getRowCount() - 1;
        editDH();
        tblDH.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnLastDHActionPerformed

    private void btnXoaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDHActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn xóa đơn hàng này chứ?")) {
            String maDH = txtMaDH.getText();
            try {
                dhDao.delete(maDH);
                loadToTableDH();
                clearFormDH();
                MsgBox.alert(this, "Xóa đơn hàng \"" + maDH + "\" thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Đơn hàng không thể xóa do lỗi \n" + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaDHActionPerformed

    private void btnChiTietHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietHDActionPerformed
        openFrameCTHD();
    }//GEN-LAST:event_btnChiTietHDActionPerformed

    private void btnFirstCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstCLActionPerformed
        firstCL();
    }//GEN-LAST:event_btnFirstCLActionPerformed

    private void btnPrevCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevCLActionPerformed
        previousCL();
    }//GEN-LAST:event_btnPrevCLActionPerformed

    private void btnNextCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCLActionPerformed
        nextCL();
    }//GEN-LAST:event_btnNextCLActionPerformed

    private void btnLastCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastCLActionPerformed
        lastCL();
    }//GEN-LAST:event_btnLastCLActionPerformed

    private void tblNVBHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVBHMousePressed
        indexNV = tblNVBH.rowAtPoint(evt.getPoint());
        editNV();
        btnThemNVBH.setEnabled(false);
        btnSuaNVBH.setEnabled(true);
        btnXoaNVBH.setEnabled(true);
    }//GEN-LAST:event_tblNVBHMousePressed

    private void btnThemNVBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVBHActionPerformed
        savẹNhanvien();
    }//GEN-LAST:event_btnThemNVBHActionPerformed

    private void btnSuaNVBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNVBHActionPerformed
        updateNhanvien();
    }//GEN-LAST:event_btnSuaNVBHActionPerformed

    private void btnXoaNVBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNVBHActionPerformed
        if (admin())
            deleteNhanvien();
    }//GEN-LAST:event_btnXoaNVBHActionPerformed

    private void btnMoiNVBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiNVBHActionPerformed
        newNhanVien();
    }//GEN-LAST:event_btnMoiNVBHActionPerformed

    private void txtMaCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCLActionPerformed

    private void txtMaCLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaCLMousePressed
        txtMaCL.setBackground(Color.white);
        txtMaCL.setFocusable(true);
        txtMaCL.requestFocus();
    }//GEN-LAST:event_txtMaCLMousePressed

    private void txtTenCLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenCLMousePressed
        txtTenCL.setBackground(Color.white);
        txtTenCL.setFocusable(true);
        txtTenCL.requestFocus();
    }//GEN-LAST:event_txtTenCLMousePressed

    private void txtMieuTaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMieuTaMousePressed
        txtMieuTa.setBackground(Color.white);
        txtMieuTa.setFocusable(true);
        txtMieuTa.requestFocus();
    }//GEN-LAST:event_txtMieuTaMousePressed

    private void btnXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHDActionPerformed
        deleteHD();
    }//GEN-LAST:event_btnXoaHDActionPerformed

    private void tblHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMousePressed
        fillFromTableHD(tblHD.getSelectedRow());
        indexHD = tblHD.getSelectedRow();
    }//GEN-LAST:event_tblHDMousePressed

    private void btnPrevHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevHDActionPerformed
        previousHD();
    }//GEN-LAST:event_btnPrevHDActionPerformed

    private void btnNextHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextHDActionPerformed
        nextHD();
    }//GEN-LAST:event_btnNextHDActionPerformed

    private void btnLastHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastHDActionPerformed
        lastHD();
    }//GEN-LAST:event_btnLastHDActionPerformed

    private void btnLastNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastNVActionPerformed
        indexNV = tblNVBH.getRowCount() - 1;
        editNV();
    }//GEN-LAST:event_btnLastNVActionPerformed

    private void btnPrevNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevNVActionPerformed
        indexNV--;
        if (indexNV < 0) {
            indexNV = tblNVBH.getRowCount() - 1;
        }
        editNV();
    }//GEN-LAST:event_btnPrevNVActionPerformed

    private void btnNextNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNVActionPerformed
        indexNV++;
        if (indexNV > tblNVBH.getRowCount() - 1) {
            indexNV = 0;
        }
        editNV();
    }//GEN-LAST:event_btnNextNVActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Eclipse".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSuaKH;
    private javax.swing.ButtonGroup bgrGioiTinhKH;
    private javax.swing.ButtonGroup bgrGioiTinhNV;
    private javax.swing.JButton btnChiTietDH;
    private javax.swing.JButton btnChiTietHD;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnFirstCL;
    private javax.swing.JButton btnFirstDH;
    private javax.swing.JButton btnFirstHD;
    private javax.swing.JButton btnFirstKH;
    private javax.swing.JButton btnFirstNV;
    private javax.swing.JButton btnFirstSP;
    private javax.swing.JButton btnFirstTK;
    private javax.swing.JButton btnLastCL;
    private javax.swing.JButton btnLastDH;
    private javax.swing.JButton btnLastHD;
    private javax.swing.JButton btnLastKH;
    private javax.swing.JButton btnLastNV;
    private javax.swing.JButton btnLastSP;
    private javax.swing.JButton btnLastTK;
    private javax.swing.JButton btnMoiCL;
    private javax.swing.JButton btnMoiNVBH;
    private javax.swing.JButton btnMoiSP;
    private javax.swing.JButton btnNextCL;
    private javax.swing.JButton btnNextDH;
    private javax.swing.JButton btnNextHD;
    private javax.swing.JButton btnNextKH;
    private javax.swing.JButton btnNextNV;
    private javax.swing.JButton btnNextSP;
    private javax.swing.JButton btnNextTK;
    private javax.swing.JButton btnPrevCL;
    private javax.swing.JButton btnPrevDH;
    private javax.swing.JButton btnPrevHD;
    private javax.swing.JButton btnPrevKH;
    private javax.swing.JButton btnPrevNV;
    private javax.swing.JButton btnPrevSP;
    private javax.swing.JButton btnPrevTK;
    private javax.swing.JButton btnSuaCL;
    private javax.swing.JButton btnSuaNVBH;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemCL;
    private javax.swing.JButton btnThemNVBH;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTimSP;
    private javax.swing.JButton btnXoaCL;
    private javax.swing.JButton btnXoaDH;
    private javax.swing.JButton btnXoaHD;
    private javax.swing.JButton btnXoaNVBH;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChungLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblChungLoai;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGioiTinhKH;
    private javax.swing.JLabel lblGioiTinhNV;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblMaCL;
    private javax.swing.JLabel lblMaHDpnlDSHD;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNVpnlDSHD;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMatKhau1;
    private javax.swing.JLabel lblMieuTa;
    private javax.swing.JLabel lblNgayDK;
    private javax.swing.JLabel lblNgayLapHDpnlDSHD;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgaySinh1;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenCl;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTitleCL;
    private javax.swing.JLabel lblTitleKH;
    private javax.swing.JLabel lblTitleNVBH;
    private javax.swing.JLabel lblTitleSP;
    private javax.swing.JLabel lblTitleSubCL;
    private javax.swing.JLabel lblTitleSubDH;
    private javax.swing.JLabel lblTitleSubHD;
    private javax.swing.JLabel lblTitleSubKH;
    private javax.swing.JLabel lblTitleSubNVBH;
    private javax.swing.JLabel lblTitleSubSP;
    private javax.swing.JLabel lblTitleSubTK;
    private javax.swing.JLabel lblTitleSubTK1;
    private javax.swing.JLabel lblTongTienpnlDSHD;
    private javax.swing.JPanel pnlDSDH;
    private javax.swing.JPanel pnlDSHD;
    private javax.swing.JPanel pnlDSKH;
    private javax.swing.JPanel pnlEastCL;
    private javax.swing.JPanel pnlEastKH;
    private javax.swing.JPanel pnlEastNVBH;
    private javax.swing.JPanel pnlEastSP;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainBtnCL;
    private javax.swing.JPanel pnlMainBtnNVBH;
    private javax.swing.JPanel pnlMainBtnSP;
    private javax.swing.JPanel pnlNavRightCL;
    private javax.swing.JPanel pnlNavRightHD;
    private javax.swing.JPanel pnlNavRightHD1;
    private javax.swing.JPanel pnlNavRightKH;
    private javax.swing.JPanel pnlNavRightNVBH;
    private javax.swing.JPanel pnlNavRightSP;
    private javax.swing.JPanel pnlNavRightTK;
    private javax.swing.JPanel pnlNorthCL;
    private javax.swing.JPanel pnlNorthKH;
    private javax.swing.JPanel pnlNorthNVBH;
    private javax.swing.JPanel pnlNorthSP;
    private javax.swing.JPanel pnlQLCL;
    private javax.swing.JPanel pnlQLNVBH;
    private javax.swing.JPanel pnlQLSP;
    private javax.swing.JPanel pnlSouthCL;
    private javax.swing.JPanel pnlSouthKH;
    private javax.swing.JPanel pnlSouthNVBH;
    private javax.swing.JPanel pnlSouthSP;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JPanel pnlWestCL;
    private javax.swing.JPanel pnlWestKH;
    private javax.swing.JPanel pnlWestNVBH;
    private javax.swing.JPanel pnlWestSP;
    private javax.swing.JRadioButton rdoNamKH;
    private javax.swing.JRadioButton rdoNamNV;
    private javax.swing.JRadioButton rdoNuKH;
    private javax.swing.JRadioButton rdoNuNV;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblCL;
    private javax.swing.JTable tblDH;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblKH;
    private javax.swing.JTable tblNVBH;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblTK;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaCL;
    private javax.swing.JTextField txtMaDH;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaKh;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNVpnlDSHD;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtMatKhauKH;
    private javax.swing.JTextField txtMieuTa;
    private javax.swing.JTextField txtNgayDK;
    private javax.swing.JTextField txtNgayDatHang;
    private javax.swing.JTextField txtNgayLapHDpnlDSHD;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaySinhKH;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenCL;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimSP;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongTienpnlDSHD;
    // End of variables declaration//GEN-END:variables

    // Begin Khach hang code
    private void loadToTableKH() {
        DefaultTableModel khTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        khTableModel.setColumnIdentifiers(new Object[]{"Mã khách hàng", "Mật khẩu", "Tên khách hàng", "Giới tính", "Ngày đăng ký", "Ngày sinh"});
        khList = khDao.selectAll();
        for (KhachHang kh : khList) {
            if (kh.isGioiTinh() == true) {
                khTableModel.addRow(new Object[]{kh.getMaKH(), kh.getMatKhau(), kh.getTenKH(), "Nam", XDate.toString(kh.getNgayDangKy(), "dd/MM/yyyy"), XDate.toString(kh.getNgaySinh(), "dd/MM/yyyy")});
            } else {
                khTableModel.addRow(new Object[]{kh.getMaKH(), kh.getMatKhau(), kh.getTenKH(), "Nữ", XDate.toString(kh.getNgayDangKy(), "dd/MM/yyyy"), XDate.toString(kh.getNgaySinh(), "dd/MM/yyyy")});

            }
        }
        tblKH.setModel(khTableModel);
    }

    private void fillFromTableKH() {
        txtMaKH.setText(khList.get(indexKH).getMaKH());
        txtNgaySinhKH.setText(XDate.toString(khList.get(indexKH).getNgaySinh(), "dd/MM/yyyy"));
        txtTenKH.setText(khList.get(indexKH).getTenKH());
        txtMatKhauKH.setText(khList.get(indexKH).getMatKhau());
        txtNgayDK.setText(XDate.toString(khList.get(indexKH).getNgayDangKy(), "dd/MM/yyyy"));
        if (khList.get(indexKH).isGioiTinh() == true) {
            rdoNamKH.setSelected(true);
        } else {
            rdoNuKH.setSelected(true);
        }
    }
    // End Khach hang code

    // Begin SanPham code
    private void loadToTableSP() {
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        String keyword = txtTimSP.getText();
        spList = spDao.selectByKeyword(keyword);
        for (SanPham sp : spList) {
            Object[] row = {
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getSoLuong(),
                sp.getGiaThanh(),
                sp.getMaCL()
            };
            model.addRow(row);
        }
    }

    private void editSP() {
        String maSP = (String) tblSP.getValueAt(this.index, 0);
        tblSP.setRowSelectionInterval(index, index);
        SanPham sp = spDao.selectById(maSP);
        if (sp != null) {
            setFormSP(sp);
        }
    }

    private void setFormSP(SanPham sp) {
        txtMaSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        txtSoLuong.setText(String.valueOf(sp.getSoLuong()));
        txtGia.setText(String.valueOf(sp.getGiaThanh()));
        cboChungLoai.setToolTipText(sp.getMaCL());
        cboChungLoai.setSelectedItem(clDao.selectById(sp.getMaCL()));
    }

    private void fillFromTableSP(int index) {
        tblCL.setRowSelectionAllowed(true);
        txtMaSP.setText(spList.get(index).getMaSP());
        txtTenSP.setText(spList.get(index).getTenSP());
        txtSoLuong.setText(String.valueOf(spList.get(index).getSoLuong()));
        txtGia.setText(String.valueOf(spList.get(index).getGiaThanh()));
        cboChungLoai.setToolTipText(spList.get(index).getMaCL());
        cboChungLoai.setSelectedItem(clDao.selectById(spList.get(index).getMaCL()));
        tblSP.setRowSelectionInterval(indexSP, indexSP);
    }

    private void fillCboSP() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChungLoai.getModel();
        model.removeAllElements();
        List<ChungLoai> list = clDao.selectAll();
        for (ChungLoai cl : list) {
            model.addElement(cl);
        }
    }

    private void clearFormSP() {
        SanPham sp = new SanPham();
        sp.setMaSP(sp.getMaSP());
        sp.setTenSP(sp.getTenSP());
        sp.setSoLuong(sp.getSoLuong());
        sp.setGiaThanh(sp.getGiaThanh());
        ChungLoai cl = (ChungLoai) cboChungLoai.getSelectedItem();
        sp.setMaCL(cl.getMaCL());
        setFormSP(sp);
        index = -1;
    }

    private SanPham getFromSP() {
        SanPham sp = new SanPham();
        sp.setMaSP(txtMaSP.getText());
        sp.setTenSP(txtTenSP.getText());
        sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        sp.setGiaThanh(Float.parseFloat(txtGia.getText()));
        ChungLoai cl = (ChungLoai) cboChungLoai.getSelectedItem();
        sp.setMaCL(cl.getMaCL());
        return sp;
    }
    // End SanPham code

    //Start Code Chủng Loại
    private void loadToTableCL() {
        DefaultTableModel clTableModel = (DefaultTableModel) tblCL.getModel();
        clTableModel.setRowCount(0);
        clList = clDao.selectAll();
        for (ChungLoai cl : clList) {
            Object[] row = {
                cl.getMaCL(),
                cl.getTenCL(),
                cl.getMieuTa(),};
            clTableModel.addRow(row);
        }
        btnThemCL.setEnabled(false);
    }

    private void fillFromTableCL(int index) {
        tblCL.setRowSelectionAllowed(true);
        txtMaCL.setText(clList.get(index).getMaCL());
        txtTenCL.setText(clList.get(index).getTenCL());
        txtMieuTa.setText(clList.get(index).getMieuTa());
        tblCL.setRowSelectionInterval(index, index);
        btnThemCL.setEnabled(false);
    }

    private void clearCL() {
        txtMaCL.setText("");
        txtTenCL.setText("");
        txtMieuTa.setText("");
        btnThemCL.setEnabled(true);
        btnSuaCL.setEnabled(false);
        btnXoaCL.setEnabled(false);
        tblCL.setRowSelectionAllowed(false);
        indexCL = -1;
    }

    private void insertCL() {
        ChungLoai clitem = new ChungLoai(txtMaCL.getText(), txtTenCL.getText(), txtMieuTa.getText());
        clDao.insert(clitem);
        loadToTableCL();
        for (ChungLoai cl : clList) {
            if (txtMaCL.getText().equals(cl.getMaCL())) {
                indexCL = clList.indexOf(cl);
                fillFromTableCL(indexCL);
                break;
            }
        }
        btnSuaCL.setEnabled(true);
        btnXoaCL.setEnabled(true);
    }

    private void updateCL() {
        ChungLoai clitem = new ChungLoai(txtMaCL.getText(), txtTenCL.getText(), txtMieuTa.getText());
        clDao.update(clitem);
        loadToTableCL();
        for (ChungLoai cl : clList) {
            if (txtMaCL.getText().equals(cl.getMaCL())) {
                indexCL = clList.indexOf(cl);
                fillFromTableCL(indexCL);
                break;
            }
        }
        fillCboSP();
    }

    private void deleteCL() {
        clDao.delete(txtMaCL.getText());
        loadToTableCL();
    }

    private void firstCL() {
        indexCL = 0;
        tblCL.setRowSelectionAllowed(true);
        fillFromTableCL(0);
    }

    private void nextCL() {
        tblCL.setRowSelectionAllowed(true);
        indexCL++;
        if (indexCL > clList.size() - 1) {
            indexCL = 0;
        }
        fillFromTableCL(indexCL);
    }

    private void previousCL() {
        tblCL.setRowSelectionAllowed(true);
        indexCL--;
        if (indexCL < 0) {
            indexCL = clList.size() - 1;
        }
        fillFromTableCL(indexCL);
    }

    private void lastCL() {
        tblCL.setRowSelectionAllowed(true);
        indexCL = clList.size() - 1;
        fillFromTableCL(indexCL);
    }

    private boolean checkCL() {
        if (txtMaCL.getText().length() == 0 || txtMaCL.getText().length() > 10) {
            txtMaCL.setBackground(Color.yellow);
            txtMaCL.setFocusable(false);
            txtTenCL.setFocusable(false);
            txtMieuTa.setFocusable(false);
            return false;
        } else {
            txtMaCL.setBackground(Color.white);
        }

        if (txtTenCL.getText().length() == 0 || txtTenCL.getText().length() > 50) {
            txtTenCL.setBackground(Color.yellow);
            txtTenCL.setFocusable(false);
            return false;
        } else {
            txtTenCL.setBackground(Color.white);
        }

        if (txtMieuTa.getText().length() == 0 || txtMieuTa.getText().length() > 100) {
            txtMieuTa.setBackground(Color.yellow);
            txtMieuTa.setFocusable(false);
            return false;
        } else {
            txtMieuTa.setBackground(Color.white);
        }
        return true;
    }

    //End Code Chủng Loại
    private void loadToTableDH() {
        DefaultTableModel model = (DefaultTableModel) tblDH.getModel();
        model.setRowCount(0);
        List<DonHang> list = dhDao.selectAll();
        for (DonHang dh : list) {
            Object[] row = {
                dh.getMaDH(),
                dh.getNgayDatHang(),
                dh.getMaKH(),
                dh.getTongTien()
            };
            model.addRow(row);
        }
    }

    private void editDH() {
        String maDH = (String) tblDH.getValueAt(this.index, 0);
        DonHang dh = dhDao.selectById(maDH);
        if (dh != null) {
            setFormDH(dh);
        }
    }

    private void setFormDH(DonHang dh) {
        txtMaDH.setText(dh.getMaDH());
        txtMaKh.setText(dh.getMaKH());
        txtNgayDatHang.setText(String.valueOf(dh.getNgayDatHang()));
        txtTongTien.setText(String.valueOf(dh.getTongTien()));
    }

    private void clearFormDH() {
        DonHang dh = new DonHang();
        dh.setMaDH(dh.getMaDH());
        dh.setNgayDatHang(dh.getNgayDatHang());
        dh.setMaKH(dh.getMaKH());
    }

    //BEGIN NHANVIEN
    private void loadToTableNV() {
        DefaultTableModel model = (DefaultTableModel) tblNVBH.getModel();
        model.setRowCount(0);
        try {
            nvList = nvDao.selectAll();
            for (NhanVien nv : nvList) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isGioiTinh() ? "nữ" : "nam",
                    XDate.toString(nv.getNgaySinh(), "dd/MM/YYYY"),
                    nv.isVaiTro() ? "admin" : "nhanvien"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void setNhanVien(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtMatKhau.setText(nv.getMatKhau());
        txtHoTen.setText(nv.getHoTen());
        rdoNuNV.setSelected(nv.isGioiTinh());
        rdoNamNV.setSelected(!nv.isGioiTinh());
//        rdoAdmin.setSelected(nv.isVaiTro());
//        rdoNhanvien.setSelected(!nv.isVaiTro());
        txtNgaySinh.setText(XDate.toString(nv.getNgaySinh(), "dd/MM/YYYY"));
    }

    private NhanVien getNhanVien() {
        NhanVien model = new NhanVien();
        model.setMaNV(txtMaNV.getText());
        model.setMatKhau(new String(txtMatKhau.getPassword()));
        model.setHoTen(txtHoTen.getText());
        model.setNgaySinh(XDate.toDate(txtNgaySinh.getText(), "dd/MM/YYYY"));
        model.setGioiTinh(rdoNuNV.isSelected());
        //model.setVaiTro(rdoAdmin.isSelected());
        return model;
    }

    private void editNV() {
        try {
            String manv = (String) tblNVBH.getValueAt(this.indexNV, 0);
            NhanVien model = nvDao.selectById(manv);
            if (model != null) {
                setNhanVien(model);
                //System.out.println(model.getNgaySinh());
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn" + e.toString());
        }
    }

    private void newNhanVien() {
        txtMaNV.setText(null);
        txtMatKhau.setText(null);
        txtHoTen.setText(null);
        txtNgaySinh.setText(null);
        index = -1;
        btnThemNVBH.setEnabled(true);
        btnSuaNVBH.setEnabled(false);
        btnXoaNVBH.setEnabled(false);
    }

    private void savẹNhanvien() {
        NhanVien model = getNhanVien();
        try {
            nvDao.insert(model);
            newNhanVien();
            loadToTableNV();
            MsgBox.alert(this, "Thêm thành công");
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "", 0);
        }
    }

    private void updateNhanvien() {
        NhanVien model = getNhanVien();
        try {
            nvDao.update(model);
            loadToTableNV();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!", "", 0);
        }
    }

    private void deleteNhanvien() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xoá người này")) {
            String manv = txtMaNV.getText();
            try {
                nvDao.delete(manv);
                newNhanVien();
                loadToTableNV();
                MsgBox.alert(this, "Xoá thành công");
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(this, "Xoá thất bại!", "", 0);
            }
        }
    }

    private boolean admin() {
        if (nvList.get(index).isVaiTro() == true) {
            JOptionPane.showMessageDialog(this, "Không được xoá Admin!", "", 0);
            return false;
        }
        return true;
    }

    private void clockRun() {
        CLockThread cl = new CLockThread(lblClock);
        Thread t = new Thread(cl);
        t.start();
    }

    //start HoaDon
    private void loadToTableHD() {
        initHD();
        DefaultTableModel hdTableModel = (DefaultTableModel) tblHD.getModel();
        hdTableModel.setRowCount(0);
        hdList = hdDao.selectAll();
        for (HoaDon hd : hdList) {
            Object[] row = {
                hd.getMaHD(),
                hd.getNgayLapHD(),
                hd.getMaNV(),
                hd.getTongTien()
            };
            hdTableModel.addRow(row);
        }
    }
    
    private void initHD(){
        txtMaHD.setFocusable(false);
        txtMaNVpnlDSHD.setFocusable(false);
        txtNgayLapHDpnlDSHD.setFocusable(false);
        txtTongTienpnlDSHD.setFocusable(false);
    }

    private void fillFromTableHD(int index) {
        txtMaHD.setText(hdList.get(index).getMaHD());
        txtMaNVpnlDSHD.setText(hdList.get(index).getMaNV());
        txtNgayLapHDpnlDSHD.setText(String.valueOf(hdList.get(index).getNgayLapHD()));
        txtTongTienpnlDSHD.setText(String.valueOf(hdList.get(index).getTongTien()));
        tblHD.setRowSelectionInterval(index, index);
    }

    private void deleteHD() {
        hdDao.delete(txtMaHD.getText());
        loadToTableHD();
    }

    private void firstHD() {
        indexHD = 0;
        fillFromTableHD(0);
    }

    private void nextHD() {
        indexHD++;
        if (indexHD > hdList.size() - 1) {
            indexHD = 0;
        }
        fillFromTableHD(indexHD);
    }

    private void previousHD() {
        indexHD--;
        if (indexHD < 0) {
            indexHD = hdList.size() - 1;
        }
        fillFromTableHD(indexHD);
    }

    private void lastHD() {
        indexHD = hdList.size() - 1;
        fillFromTableHD(indexHD);
    }

    private void openFrameCTHD() {
        String mahd = txtMaHD.getText();
        if (!(mahd.length() == 0)) {
            ChiTietHoaDon cthd = new ChiTietHoaDonDAO().selectById(mahd);
            ChiTietHoaDonFrame CTHDFrame = new ChiTietHoaDonFrame(cthd.getMaHD());
            this.setVisible(false);
            CTHDFrame.setVisible(true);
        } else {
            MsgBox.alert(this, "Vui Lòng Chọn 1 HD Để Xem Chi Tiết !");
        }
    }
    //end HoaDon
}