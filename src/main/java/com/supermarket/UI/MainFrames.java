package com.supermarket.UI;

import com.supermarket.DAO.ChungLoaiDAO;
import com.supermarket.DAO.DonHangDAO;
import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.DAO.SanPhamDAO;
import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.ENTITY.KhachHang;
import com.supermarket.ENTITY.SanPham;
import com.supermarket.UTILS.MsgBox;
import com.supermarket.UTILS.XDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class MainFrames extends javax.swing.JFrame {

    private int index = 0;
    private int rowKH = -1;

    //Biến LIST
    private List<KhachHang> khList = new ArrayList<>();
    private List<ChungLoai> clList = new ArrayList<>();

    //Biến DAO
    private SanPhamDAO spDao = new SanPhamDAO();
    private ChungLoaiDAO clDao = new ChungLoaiDAO();
    private DonHangDAO dhDao = new DonHangDAO();

    public MainFrames() {
        initComponents();
        setLocationRelativeTo(null);
        loadToTableSP();
        fillCboSP();
        loadToTableKH();
        loadToTableCL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrGioiTinhNV = new javax.swing.ButtonGroup();
        bgrGioiTinhKH = new javax.swing.ButtonGroup();
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
        txtMatKhauKH = new javax.swing.JPasswordField();
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
        btnFirstHD = new javax.swing.JButton();
        btnPrevHD = new javax.swing.JButton();
        btnNextHD = new javax.swing.JButton();
        btnLastHD = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
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
        pnlTK = new javax.swing.JPanel();
        lblTitleSubTK = new javax.swing.JLabel();
        pnlNavRightTK = new javax.swing.JPanel();
        btnFirstTK = new javax.swing.JButton();
        btnPrevTK = new javax.swing.JButton();
        btnNextTK = new javax.swing.JButton();
        btnLastTK = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblTK = new javax.swing.JTable();
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
        lblTitleSP.setText("SẢN PHẨM");

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
        lblTitleCL.setText("CHỦNG LOẠI");

        lblMaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaCL.setText("Mã chủng loại");

        txtMaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblTenCl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenCl.setText("Tên chủng loại");

        txtTenCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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
                .addGroup(pnlEastCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMieuTa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMieuTa))
                .addGap(78, 78, 78))
        );

        pnlMainBtnCL.setLayout(new java.awt.GridLayout(1, 4, 40, 0));

        btnThemCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemCL.setText("Thêm");
        btnThemCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemCL.setFocusable(false);
        pnlMainBtnCL.add(btnThemCL);

        btnSuaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaCL.setText("Sửa");
        btnSuaCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaCL.setFocusable(false);
        pnlMainBtnCL.add(btnSuaCL);

        btnXoaCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaCL.setText("Xóa");
        btnXoaCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaCL.setFocusable(false);
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
        pnlNavRightCL.add(btnFirstCL);

        btnPrevCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevCL.setText("<<");
        btnPrevCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevCL.setFocusable(false);
        pnlNavRightCL.add(btnPrevCL);

        btnNextCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextCL.setText(">>");
        btnNextCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextCL.setFocusable(false);
        pnlNavRightCL.add(btnNextCL);

        btnLastCL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastCL.setText(">|");
        btnLastCL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastCL.setFocusable(false);
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
        lblTitleNVBH.setText("NHÂN VIÊN ");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastNVBHLayout.createSequentialGroup()
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
                .addGap(49, 49, 49))
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
        pnlMainBtnNVBH.add(btnThemNVBH);

        btnSuaNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaNVBH.setText("Sửa");
        btnSuaNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaNVBH.setFocusable(false);
        pnlMainBtnNVBH.add(btnSuaNVBH);

        btnXoaNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaNVBH.setText("Xóa");
        btnXoaNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNVBH.setFocusable(false);
        pnlMainBtnNVBH.add(btnXoaNVBH);

        btnMoiNVBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoiNVBH.setText("Mới");
        btnMoiNVBH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiNVBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoiNVBH.setFocusable(false);
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
                    .addComponent(pnlEastNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE))
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
        pnlNavRightNVBH.add(btnPrevNV);

        btnNextNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextNV.setText(">>");
        btnNextNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextNV.setFocusable(false);
        pnlNavRightNVBH.add(btnNextNV);

        btnLastNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastNV.setText(">|");
        btnLastNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastNV.setFocusable(false);
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
        lblTitleKH.setText("KHÁCH HÀNG");

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
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlWestKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhauKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
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

        btnXoaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaHD.setText("Xóa");
        btnXoaHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaHD.setFocusable(false);

        pnlNavRightHD.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

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
        pnlNavRightHD.add(btnFirstHD);

        btnPrevHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevHD.setText("<<");
        btnPrevHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevHD.setFocusable(false);
        pnlNavRightHD.add(btnPrevHD);

        btnNextHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextHD.setText(">>");
        btnNextHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextHD.setFocusable(false);
        pnlNavRightHD.add(btnNextHD);

        btnLastHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastHD.setText(">|");
        btnLastHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastHD.setFocusable(false);
        pnlNavRightHD.add(btnLastHD);

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
        jScrollPane8.setViewportView(tblHD);

        javax.swing.GroupLayout pnlDSHDLayout = new javax.swing.GroupLayout(pnlDSHD);
        pnlDSHD.setLayout(pnlDSHDLayout);
        pnlDSHDLayout.setHorizontalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(pnlDSHDLayout.createSequentialGroup()
                        .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChiTietHD, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(pnlNavRightHD, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitleSubHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDSHDLayout.setVerticalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitleSubHD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnChiTietHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavRightHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        pnlNavRightHD1.add(btnPrevDH);

        btnNextDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextDH.setText(">>");
        btnNextDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextDH.setFocusable(false);
        pnlNavRightHD1.add(btnNextDH);

        btnLastDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLastDH.setText(">|");
        btnLastDH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLastDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastDH.setFocusable(false);
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
        jScrollPane9.setViewportView(tblDH);

        javax.swing.GroupLayout pnlDSDHLayout = new javax.swing.GroupLayout(pnlDSDH);
        pnlDSDH.setLayout(pnlDSDHLayout);
        pnlDSDHLayout.setHorizontalGroup(
            pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitleSubDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(pnlDSDHLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDSDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNavRightHD1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnChiTietDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tabs.addTab("QUẢN LÝ ĐƠN HÀNG", pnlDSDH);

        pnlTK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleSubTK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleSubTK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleSubTK.setText("Thống kê");

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

        javax.swing.GroupLayout pnlTKLayout = new javax.swing.GroupLayout(pnlTK);
        pnlTK.setLayout(pnlTKLayout);
        pnlTKLayout.setHorizontalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitleSubTK, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(pnlNavRightTK, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        pnlTKLayout.setVerticalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTitleSubTK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(pnlNavRightTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("THỐNG KÊ", pnlTK);

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusable(false);

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
        index = 0;
        editSP();
    }//GEN-LAST:event_btnFirstSPActionPerformed

    private void btnFirstNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstNVActionPerformed

    private void rdoNamNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamNVActionPerformed

    private void btnFirstHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstHDActionPerformed

    private void btnFirstDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstDHActionPerformed
        // TODO add your handling code here:
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
        rowKH = tblKH.getSelectedRow();
        fillFromTableKH();
    }//GEN-LAST:event_tblKHMousePressed
    // Sản phẩm
    private void tblSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMousePressed
        index = tblSP.rowAtPoint(evt.getPoint());
        editSP();
    }//GEN-LAST:event_tblSPMousePressed

    private void btnPrevSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevSPActionPerformed
        if (index > 0) {
            index--;
            editSP();
        } else {
            editSP();
            MsgBox.alert(this, "Bạn đang ở vị trí đầu tiên!");
        }
    }//GEN-LAST:event_btnPrevSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        if (index < tblSP.getRowCount() - 1) {
            index++;
            editSP();
        } else {
            MsgBox.alert(this, "Bạn đang ở vị trí cuối cùng!");
        }
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnLastSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastSPActionPerformed
        index = tblSP.getRowCount() - 1;
        editSP();
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
        if (rowKH == khList.size() - 1) {
            MsgBox.alert(null, "Bạn đang ở cuối danh sách khách hàng");
            return;
        }
        rowKH++;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(rowKH, rowKH);
    }//GEN-LAST:event_btnNextKHActionPerformed

    private void btnPrevKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevKHActionPerformed
        if (rowKH == 0) {
            MsgBox.alert(null, "Bạn đang ở đầu danh sách khách hàng");
            return;
        } else if (rowKH == -1) {
            rowKH++;
            fillFromTableKH();
            tblKH.setRowSelectionInterval(rowKH, rowKH);
            return;
        }
        rowKH--;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(rowKH, rowKH);
    }//GEN-LAST:event_btnPrevKHActionPerformed

    private void btnFirstKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstKHActionPerformed
        rowKH = 0;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(rowKH, rowKH);
    }//GEN-LAST:event_btnFirstKHActionPerformed

    private void btnLastKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastKHActionPerformed
        rowKH = khList.size() - 1;
        fillFromTableKH();
        tblKH.setRowSelectionInterval(rowKH, rowKH);
    }//GEN-LAST:event_btnLastKHActionPerformed

    private void btnChiTietDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietDHActionPerformed
        new DonHangCTAdmin().setVisible(true);
    }//GEN-LAST:event_btnChiTietDHActionPerformed

    private void BtnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaKHActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_tblCLMousePressed

    private void btnMoiCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiCLActionPerformed
        clearCL();
    }//GEN-LAST:event_btnMoiCLActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Eclipse".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrames().setVisible(true);
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
    private javax.swing.JComboBox<String> cboChungLoai;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblChungLoai;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGioiTinhKH;
    private javax.swing.JLabel lblGioiTinhNV;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblMaCL;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMatKhau1;
    private javax.swing.JLabel lblMieuTa;
    private javax.swing.JLabel lblNgayDK;
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
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauKH;
    private javax.swing.JTextField txtMieuTa;
    private javax.swing.JTextField txtNgayDK;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaySinhKH;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenCL;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimSP;
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
        KhachHangDAO dao = new KhachHangDAO();
        khList = dao.selectAll();
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
        txtMaKH.setText(khList.get(rowKH).getMaKH());
        txtNgaySinhKH.setText(XDate.toString(khList.get(rowKH).getNgaySinh(), "dd/MM/yyyy"));
        txtTenKH.setText(khList.get(rowKH).getTenKH());
        txtMatKhauKH.setText(khList.get(rowKH).getMatKhau());
        txtNgayDK.setText(XDate.toString(khList.get(rowKH).getNgayDangKy(), "dd/MM/yyyy"));
        if (khList.get(rowKH).isGioiTinh() == true) {
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
        List<SanPham> list = spDao.selectByKeyword(keyword);
        for (SanPham sp : list) {
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
        SanPham sp = spDao.selectById(maSP);
        if (sp != null) {
            setFormSP(sp);
            tabs.setSelectedIndex(0);
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
    }

    private void fillFromTableCL(int index) {
        txtMaCL.setText(clList.get(index).getMaCL());
        txtTenCL.setText(clList.get(index).getTenCL());
        txtMieuTa.setText(clList.get(index).getMieuTa());
    }

    private void clearCL() {
        txtMaCL.setText("");
        txtTenCL.setText("");
        txtMieuTa.setText("");
    }

    private void insertCL() {

    }

    private void updateCL() {

    }

    private void deleteCL() {

    }
    //End Code Chủng Loại
}
