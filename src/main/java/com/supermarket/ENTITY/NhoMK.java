/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.ENTITY;

import java.io.Serializable;

/**
 *
 * @author TranVanNhan
 */
public class NhoMK implements Serializable{
    private boolean nhoMK;
    private int vaiTro;
    private String tenDN;
    private String matKhau;

    public NhoMK(boolean nhoMK, int vaiTro, String tenDN, String matKhau) {
        this.nhoMK = nhoMK;
        this.vaiTro = vaiTro;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
    }

    public boolean isNhoMK() {
        return nhoMK;
    }

    public void setNhoMK(boolean nhoMK) {
        this.nhoMK = nhoMK;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
