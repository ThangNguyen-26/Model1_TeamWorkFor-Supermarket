package com.supermarket.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.SanPham;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class DonHangDAO extends HeThongDAO<DonHang, String> {

    String delete = "DELETE DONHANG WHERE MADH = ?";
    String selectAll_SQL = "SELECT * FROM DONHANG";

    @Override
    public void insert(DonHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(DonHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String entity) {
        JdbcHelper.update(delete, entity);
    }

    @Override
    public List<DonHang> selectAll() {
        return selectSql(selectAll_SQL);
    }

    @Override
    public DonHang selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DonHang> selectSql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getString(1));
                entity.setNgayDatHang(rs.getDate(2));
                entity.setMaKH(rs.getString(3));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
}
