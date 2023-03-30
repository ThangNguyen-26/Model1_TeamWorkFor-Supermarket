package com.supermarket.UI;

import com.supermarket.DAO.NhanVienDAO;
import com.supermarket.DAO.KhachHangDAO;
import com.supermarket.ENTITY.NhanVien;
import com.supermarket.ENTITY.KhachHang;
import com.supermarket.UTILS.MsgBox;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import jdk.jfr.Event;

public class DangNhapJDialog extends javax.swing.JDialog {

    NhanVienDAO nvDAO = new NhanVienDAO();
    KhachHangDAO khDAO = new KhachHangDAO();
    File file = new File("src/main/java/com/supermarket/UTILS/save.txt");

    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initCombox();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlInfor = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cboVaiTro = new javax.swing.JComboBox<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Đăng nhập");
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnlLogo.setLayout(new java.awt.BorderLayout());
        pnlLogo.add(lblLogo, java.awt.BorderLayout.CENTER);

        pnlInfor.setRequestFocusEnabled(false);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ĐĂNG NHẬP");

        cboVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboVaiTro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboVaiTro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboVaiTro.setFocusable(false);
        cboVaiTro.setPreferredSize(new java.awt.Dimension(72, 32));
        cboVaiTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboVaiTroMousePressed(evt);
            }
        });
        cboVaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVaiTroActionPerformed(evt);
            }
        });

        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVaiTro.setText("Vai trò");

        txtTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTenDangNhap.setPreferredSize(new java.awt.Dimension(70, 32));
        txtTenDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMousePressed(evt);
            }
        });
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyPressed(evt);
            }
        });

        lblTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenDangNhap.setText("Tên đăng nhập");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMatKhauMousePressed(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

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
        LblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LblDoiMatKhauMousePressed(evt);
            }
        });

        pnlBtns.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setFocusable(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        pnlBtns.add(btnThoat);

        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setFocusable(false);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyTyped(evt);
            }
        });
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
                            .addComponent(cboVaiTro, 0, 245, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlInforLayout.setVerticalGroup(
            pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInforLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void LblDoiMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDoiMatKhauMousePressed
        this.setVisible(false);
        new DoiMatKhauJDialog(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_LblDoiMatKhauMousePressed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (check()) {
            DangNhap();
        }
        if (chkNhoMatKhau.isSelected() == false) {
            file.delete();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (chkNhoMatKhau.isSelected() == false) {
            file.delete();
        }
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtTenDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMousePressed
        txtTenDangNhap.setBackground(Color.white);
        txtTenDangNhap.setFocusable(true);
        txtTenDangNhap.requestFocus();
    }//GEN-LAST:event_txtTenDangNhapMousePressed

    private void txtMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatKhauMousePressed
        txtMatKhau.setBackground(Color.white);
        txtMatKhau.setFocusable(true);
        txtMatKhau.requestFocus();
    }//GEN-LAST:event_txtMatKhauMousePressed

    private void cboVaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVaiTroActionPerformed
        if (cboVaiTro.getSelectedIndex() == 1) {
            lblDangKy.setVisible(true);
        } else {
            lblDangKy.setVisible(false);
        }
    }//GEN-LAST:event_cboVaiTroActionPerformed

    private void cboVaiTroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboVaiTroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboVaiTroMousePressed

    private void btnDangNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDangNhapKeyTyped

    private void txtTenDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyPressed
        // TODO add your handling code here:
        EnterBtnLogin(evt);
    }//GEN-LAST:event_txtTenDangNhapKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        EnterBtnLogin(evt);
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        EnterBtnLogin(evt);
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
            @Override
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
    private javax.swing.JComboBox<String> cboVaiTro;
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
        lblDangKy.setVisible(false);
        txtTenDangNhap.setFocusable(false);
        txtMatKhau.setFocusable(false);
        try {
            if (file.exists()) {
                Scanner scan = new Scanner(file);
                String role = scan.nextLine();
                if (role.equals("Nhân Viên")) {
                    cboVaiTro.setSelectedItem("Nhân viên");
                } else {
                    cboVaiTro.setSelectedItem("Khách Hàng");
                }
                txtTenDangNhap.setText(scan.nextLine());
                txtMatKhau.setText(scan.nextLine());
                scan.close();
                chkNhoMatKhau.setSelected(true);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void EnterBtnLogin(KeyEvent k) {
        if (k.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnDangNhap.doClick();
        }
    }

    private void initCombox() {
        cboVaiTro.removeAllItems();
        String[] vaiTro = {"Nhân Viên", "Khách Hàng"};
        for (String vaitro : vaiTro) {
            cboVaiTro.addItem(vaitro);
        }
    }

    private void DangNhap() {
        System.out.println(chkNhoMatKhau.isSelected());
        if (cboVaiTro.getSelectedIndex() == 0) {
            DangNhapNhanVien();
        } else {
            DangNhapKhachHang();
        }
    }

    private void DangNhapNhanVien() {
        String maNV = txtTenDangNhap.getText();
        String passWord = new String(txtMatKhau.getPassword());

        NhanVien nv = nvDAO.selectById(maNV);
        if (nv == null) {
            MsgBox.alert(this, "Sai tên đăng nhập!");
        } else if (!passWord.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
        } else {
            nhoMatKhau();
            if (nv.isVaiTro() == false) {
                this.setVisible(false);
                NhanVienBanHang b = new NhanVienBanHang();
                b.setVisible(true);
            } else {
                this.setVisible(false);
                MainFrames a = new MainFrames();
                a.setVisible(true);
            }
        }
    }

    private void DangNhapKhachHang() {
        String maKH = txtTenDangNhap.getText();
        String passWord = new String(txtMatKhau.getPassword());

        KhachHang kh = khDAO.selectById(maKH);
        if (kh == null) {
            MsgBox.alert(this, "Sai tên đăng nhập !");
        } else if (!passWord.equals(kh.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu !");
        } else {
            nhoMatKhau();
            this.setVisible(false);
            KhachHangFrame a = new KhachHangFrame(kh.getMaKH());
            a.setVisible(true);
        }
    }

    private boolean check() {
        if (txtTenDangNhap.getText().length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập tên đăng nhập !");
            txtTenDangNhap.setBackground(Color.yellow);
            txtTenDangNhap.setFocusable(false);
            txtMatKhau.setFocusable(false);
            return false;
        }
        if (txtMatKhau.getText().length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập mật khẩu !");
            txtMatKhau.setBackground(Color.yellow);
            txtTenDangNhap.setFocusable(false);
            return false;
        }
        return true;
    }

    private void nhoMatKhau() {
        if (chkNhoMatKhau.isSelected()) {
            try {
                file.delete();
                file.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
                if (cboVaiTro.getSelectedItem().equals("Nhân Viên")) {
                    bw.write("Nhân Viên");
                    bw.newLine();
                } else {
                    bw.write("Khách Hàng");
                    bw.newLine();
                }
                bw.write(txtTenDangNhap.getText());
                bw.newLine();
                bw.write(txtMatKhau.getPassword());
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            file.delete();
        }
    }

}
