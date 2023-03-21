/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

import java.util.Date;

public class NhanVien {
    private String MaNV;
    private String MatKhau;
    private String HoTenString;
    private boolean GioiTinh;
    private Date NgaySinh;
    private boolean VaiTro;

    public NhanVien(String MaNV, String MatKhau, String HoTenString, boolean GioiTinh, Date NgaySinh, boolean VaiTro) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTenString = HoTenString;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.VaiTro = VaiTro;
    }

    public NhanVien(String MaNV, String MatKhau, String HoTenString, boolean GioiTinh, Date NgaySinh) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTenString = HoTenString;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTenString() {
        return HoTenString;
    }

    public void setHoTenString(String HoTenString) {
        this.HoTenString = HoTenString;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
}
