/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

/**
 *
 * @author trinh duy bao
 */
public class ChungLoai {
    private String maCL;
    private String tenCL;
    private String mieuTa;

    public ChungLoai() {
    }

    public ChungLoai(String macl, String tencl, String mieuta) {
        this.maCL = macl;
        this.tenCL = tencl;
        this.mieuTa = mieuta;
    }

    public String getMacl() {
        return maCL;
    }

    public void setMacl(String macl) {
        this.maCL = macl;
    }

    public String getTencl() {
        return tenCL;
    }

    public void setTencl(String tencl) {
        this.tenCL = tencl;
    }

    public String getMieuta() {
        return mieuTa;
    }

    public void setMieuta(String mieuta) {
        this.mieuTa = mieuta;
    }
    
    
}
