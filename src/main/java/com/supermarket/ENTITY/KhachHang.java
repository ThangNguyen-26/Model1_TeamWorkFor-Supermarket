/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

import java.util.Date;

/**
 *
 * @author trinh duy bao
 */
public class KhachHang {
    private String maKH;
    private String matKhau;
    private String tenKH;
    private boolean gioiTinh;
    private Date ngayDangKy;
    private Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String makh, String matkhau, String tenkh, boolean gioitinh, Date ngaydangky, Date ngaysinh) {
        this.maKH = makh;
        this.matKhau = matkhau;
        this.tenKH = tenkh;
        this.gioiTinh = gioitinh;
        this.ngayDangKy = ngaydangky;
        this.ngaySinh = ngaysinh;
    }

    public String getMakh() {
        return maKH;
    }

    public void setMakh(String makh) {
        this.maKH = makh;
    }

    public String getMatkhau() {
        return matKhau;
    }

    public void setMatkhau(String matkhau) {
        this.matKhau = matkhau;
    }

    public String getTenkh() {
        return tenKH;
    }

    public void setTenkh(String tenkh) {
        this.tenKH = tenkh;
    }

    public boolean isGioitinh() {
        return gioiTinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioiTinh = gioitinh;
    }

    public Date getNgaydangky() {
        return ngayDangKy;
    }

    public void setNgaydangky(Date ngaydangky) {
        this.ngayDangKy = ngaydangky;
    }

    public Date getNgaysinh() {
        return ngaySinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaySinh = ngaysinh;
    }
    
    
}
