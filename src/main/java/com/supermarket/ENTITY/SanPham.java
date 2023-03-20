/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

/**
 *
 * @author TranVanNhan
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private float GiaThanh;
    private String MaCL;

    public SanPham(String MaSP, String TenSP, int SoLuong, float GiaThanh, String MaCL) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.GiaThanh = GiaThanh;
        this.MaCL = MaCL;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(float GiaThanh) {
        this.GiaThanh = GiaThanh;
    }

    public String getMaCL() {
        return MaCL;
    }

    public void setMaCL(String MaCL) {
        this.MaCL = MaCL;
    }
}
