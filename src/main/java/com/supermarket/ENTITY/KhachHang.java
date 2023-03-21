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
    private String makh;
    private String matkhau;
    private String tenkh;
    private boolean gioitinh;
    private Date ngaydangky;
    private Date ngaysinh;

    public KhachHang() {
    }

    public KhachHang(String makh, String matkhau, String tenkh, boolean gioitinh, Date ngaydangky, Date ngaysinh) {
        this.makh = makh;
        this.matkhau = matkhau;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.ngaydangky = ngaydangky;
        this.ngaysinh = ngaysinh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaydangky() {
        return ngaydangky;
    }

    public void setNgaydangky(Date ngaydangky) {
        this.ngaydangky = ngaydangky;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
