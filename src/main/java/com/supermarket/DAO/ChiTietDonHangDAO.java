package com.supermarket.DAO;

import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.DonHangChiTiet;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietDonHangDAO extends HeThongDAO<DonHangChiTiet, String> {

    String selectAll_SQL = "SELECT * FROM CHITIETDONHANG";
    String selectById_SQL = "SELECT * FROM CHITIETDONHANG WHERE MADH = ?";

    @Override
    public void insert(DonHangChiTiet entity) {
        String str = "INSERT INTO CHITIETDONHANG VALUES(?,?,?,?)";
        JdbcHelper.update(str, entity.getSoLuong(),entity.getThanhTien(),entity.getMaSP(),entity.getMaDH());
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
        List<DonHangChiTiet> list = selectSql(selectById_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonHangChiTiet> selectSql(String sql, Object... args) {
        List<DonHangChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DonHangChiTiet entity = new DonHangChiTiet();
                entity.setMaDH(rs.getString("madh"));
                entity.setMaSP(rs.getString("masp"));
                entity.setSoLuong(rs.getInt("soluong"));
                entity.setThanhTien(rs.getFloat("thanhtien"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }

    public List<DonHangChiTiet> selectByKeyword(String keyword) {
        
        return this.selectSql("SELECT * FROM CHITIETDONHANG WHERE MADH LIKE ?",  keyword );
        
    }
    
}
