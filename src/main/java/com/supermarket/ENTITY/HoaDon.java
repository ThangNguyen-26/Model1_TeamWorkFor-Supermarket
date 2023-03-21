package com.supermarket.ENTITY;

import java.util.Date;

public class HoaDon {
    private String maHD;
    private Date ngayLapHD;
    private String maNV;

    public HoaDon(String maHD, Date ngayLapHD, String maNV) {
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.maNV = maNV;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    
}
