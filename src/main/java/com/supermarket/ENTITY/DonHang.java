/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

import java.util.Date;

/**
 *
 * @author hoang
 */
public class DonHang {

    private String maDH;
    private Date ngayDatHang;
    private String maKH;

    public DonHang() {
    }

    public DonHang(String maDH, Date ngayDatHang, String maKH) {
        this.maDH = maDH;
        this.ngayDatHang = ngayDatHang;
        this.maKH = maKH;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

}
