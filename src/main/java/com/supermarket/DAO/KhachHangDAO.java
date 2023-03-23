package com.supermarket.DAO;

import com.supermarket.ENTITY.KhachHang;
import com.supermarket.UTILS.JdbcHelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

public class KhachHangDAO extends HeThongDAO<KhachHang, String> {
    String insert = "insert into KHACHHANG values(?,?,?,?,?,?)";
    String update = "update KHACHHANG set MATKHAU = ?, TENKH = ?, GIOITINH = ?, NGAYDANGKI = ?, NGAYSINH = ? where MAKH = ?";
    String selectall = "select * from KHACHHANG";
    String selectid = "select * from KHACHHANG where MAKH = ?";

    @Override
    public void insert(KhachHang entity) {
       JdbcHelper.update(insert, entity.getMaKH(), entity.getMatKhau(), entity.getTenKH(), entity.isGioiTinh(), entity.getNgayDangKy(), entity.getNgaySinh());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(update, entity.getMatKhau(), entity.getTenKH(), entity.isGioiTinh(), entity.getNgayDangKy(), entity.getNgaySinh(), entity.getMaKH());
    }

    @Override
    public void delete(String entity) {
        // không có xoá khách hàng vì làm vậy không khác gì đuổi khách
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectSql(selectall);
    }

    @Override
    public KhachHang selectById(String key) {
        List<KhachHang> list = selectSql(selectid, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectSql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("makh"));
                kh.setMatKhau(rs.getString("matkhau"));
                kh.setTenKH(rs.getString("tenkh"));
                kh.setGioiTinh(rs.getBoolean("gioitinh"));
                kh.setNgayDangKy(rs.getDate("ngaydangki"));
                kh.setNgaySinh(rs.getDate("ngaysinh"));
                list.add(kh);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }

}
