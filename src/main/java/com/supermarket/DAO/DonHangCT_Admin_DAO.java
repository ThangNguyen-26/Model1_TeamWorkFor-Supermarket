package com.supermarket.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.DonHangChiTiet;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class DonHangCT_Admin_DAO extends HeThongDAO<DonHangChiTiet, String> {

    String selectAll_SQL = "SELECT * FROM CHITIETDONHANG";

    @Override
    public void insert(DonHangChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(DonHangChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DonHangChiTiet> selectAll() {
        return selectSql(selectAll_SQL);
    }

    @Override
    public DonHangChiTiet selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DonHangChiTiet> selectSql(String sql, Object... args) {
        List<DonHangChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DonHangChiTiet entity = new DonHangChiTiet();
                entity.setThanhTien(rs.getFloat(1));
                entity.setMaSP(rs.getString(2));
                entity.setMaDH(rs.getString(3));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }

}
