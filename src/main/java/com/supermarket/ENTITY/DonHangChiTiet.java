/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

/**
 *
 * @author hoang
 */
public class DonHangChiTiet {

    private int soLuong;
    private float thanhTien;
    private String maSP;
    private String maDH;

    public DonHangChiTiet() {
    }

    public DonHangChiTiet(int soLuong, float thanhTien, String maSP, String maDH) {
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maSP = maSP;
        this.maDH = maDH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

}
