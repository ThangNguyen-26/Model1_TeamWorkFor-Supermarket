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
    private String macl;
    private String tencl;
    private String mieuta;

    public ChungLoai() {
    }

    public ChungLoai(String macl, String tencl, String mieuta) {
        this.macl = macl;
        this.tencl = tencl;
        this.mieuta = mieuta;
    }

    public String getMacl() {
        return macl;
    }

    public void setMacl(String macl) {
        this.macl = macl;
    }

    public String getTencl() {
        return tencl;
    }

    public void setTencl(String tencl) {
        this.tencl = tencl;
    }

    public String getMieuta() {
        return mieuta;
    }

    public void setMieuta(String mieuta) {
        this.mieuta = mieuta;
    }
    
    
}
