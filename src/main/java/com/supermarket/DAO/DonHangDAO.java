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
    String selectAllCoTongTienSQL = "SELECT DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH, SUM(CHITIETDONHANG.THANHTIEN)\n"
            + "FROM DONHANG INNER JOIN CHITIETDONHANG\n"
            + "ON DONHANG.MADH = CHITIETDONHANG.MADH\n"
            + "GROUP BY DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH";
    String selectById_SQL = "SELECT * FROM DONHANG WHERE MADH = ?";

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
        return selectSql(selectAllCoTongTienSQL);
    }

    @Override
    public DonHang selectById(String key) {

        List<DonHang> list = selectSql(selectById_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    public List<DonHang> selectSql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getString("madh"));
                entity.setNgayDatHang(rs.getDate("ngaydathang"));
                entity.setMaKH(rs.getString("makh"));
                entity.setTongTien(rs.getFloat(4));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
}
