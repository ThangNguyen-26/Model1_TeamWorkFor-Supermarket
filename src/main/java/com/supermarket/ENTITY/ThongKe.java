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
public class ThongKe {
    private Date nam;
    private float tongtien;
    private String itnhat, nhieunhat;

    public ThongKe() {
    }

    public ThongKe(Date nam, float tongtien, String itnhat, String nhieunhat) {
        this.nam = nam;
        this.tongtien = tongtien;
        this.itnhat = itnhat;
        this.nhieunhat = nhieunhat;
    }

    public Date getNam() {
        return nam;
    }

    public void setNam(Date nam) {
        this.nam = nam;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getItnhat() {
        return itnhat;
    }

    public void setItnhat(String itnhat) {
        this.itnhat = itnhat;
    }

    public String getNhieunhat() {
        return nhieunhat;
    }

    public void setNhieunhat(String nhieunhat) {
        this.nhieunhat = nhieunhat;
    }
    
    
}
