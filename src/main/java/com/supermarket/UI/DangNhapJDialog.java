package com.supermarket.UI;

public class DangNhapJDialog extends javax.swing.JDialog {

    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cbbVaiTro = new javax.swing.JComboBox<>();
        lblVaiTro = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblTenDangNhap = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblMatKhau = new javax.swing.JLabel();
        chkNhoMatKhau = new javax.swing.JCheckBox();
        lblDangKy = new javax.swing.JLabel();
        LblDoiMatKhau = new javax.swing.JLabel();
        pnlBtns = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng nhập");
        setResizable(false);

        pnlLogo.setLayout(new java.awt.BorderLayout());
        pnlLogo.add(lblLogo, java.awt.BorderLayout.CENTER);

        pnlInfor.setRequestFocusEnabled(false);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ĐĂNG NHẬP");

        cbbVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbVaiTro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbbVaiTro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbVaiTro.setFocusable(false);
        cbbVaiTro.setPreferredSize(new java.awt.Dimension(72, 32));

        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVaiTro.setText("Vai trò");

        txtTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTenDangNhap.setPreferredSize(new java.awt.Dimension(70, 32));

        lblTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenDangNhap.setText("Tên đăng nhập");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        chkNhoMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkNhoMatKhau.setText("Nhớ mật khẩu");
        chkNhoMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkNhoMatKhau.setFocusable(false);

        lblDangKy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDangKy.setText("Đăng ký");
        lblDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDangKy.setFocusable(false);
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDangKyMousePressed(evt);
            }
        });

        LblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblDoiMatKhau.setText("Đổi mật khẩu");
        LblDoiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblDoiMatKhau.setFocusable(false);

        pnlBtns.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setFocusable(false);
        pnlBtns.add(btnThoat);

        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setFocusable(false);
        pnlBtns.add(btnDangNhap);

        javax.swing.GroupLayout pnlInforLayout = new javax.swing.GroupLayout(pnlInfor);
        pnlInfor.setLayout(pnlInforLayout);
        pnlInforLayout.setHorizontalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInforLayout.createSequentialGroup()
                        .addComponent(chkNhoMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(lblDangKy)
                        .addGap(18, 18, 18)
                        .addComponent(LblDoiMatKhau))
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInforLayout.createSequentialGroup()
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlInforLayout.createSequentialGroup()
                                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInforLayout.createSequentialGroup()
                                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbVaiTro, 0, 245, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVaiTro))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenDangNhap))
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau))
                .addGap(20, 20, 20)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNhoMatKhau)
                    .addComponent(LblDoiMatKhau)
                    .addComponent(lblDangKy))
                .addGap(18, 18, 18)
                .addComponent(pnlBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangKyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMousePressed
        this.setVisible(false);
        new DangKyJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_lblDangKyMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Eclipse".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDoiMatKhau;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbbVaiTro;
    private javax.swing.JCheckBox chkNhoMatKhau;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlInfor;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
    }
}
