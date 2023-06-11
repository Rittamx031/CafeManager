/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.API.JdbcHelper;
import com.entity.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 121200
 */
public class HoaDonBanHangDAO implements CoffeInterfaceDAO<HoaDonBanHang, String> {

    String SELECT_ALL_SQL = "SELECT MAHDBH,NGAYHDBH,TONGTIEN,DIEMTL,GIAMGIA,CHIPHIKHAC,MAKH,MANV,MAGIAMGIA FROM HOADONBANHANG;";
    String SELECT_BY_ID_SQL = "SELECT MAHDBH,NGAYHDBH,TONGTIEN,DIEMTL,GIAMGIA,CHIPHIKHAC,MAKH,MANV,MAGIAMGIA FROM HOADONBANHANG  WHERE MAHDBH = ?";
    String INSERT_SQL = "INSERT INTO HOADONBANHANG (NGAYHDBH,TONGTIEN,DIEMTL,GIAMGIA,CHIPHIKHAC,MAKH,MANV,MAGIAMGIA) VALUES (?,?,?,?,?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE HOADONBANHANG SET NGAYHDBH = ?,TONGTIEN = ?,DIEMTL = ?,GIAMGIA = ?,CHIPHIKHAC = ?,MAKH = ?,MANV = ?, MAGIAMGIA =? WHERE MAHDBH =? ;";
    
    String DELETE_SQL = "DELETE FROM HOADONBANHANG WHERE  MAHDBH =?;";

    @Override
    public void insert(HoaDonBanHang entity) {
        JdbcHelper.update(INSERT_SQL, entity.getNgayhdbh(), entity.getTongtien(), entity.getDiemtl(), entity.getGiamgia(), entity.getChiphikhac(), entity.getMakh(), entity.getManv(),entity.getPhieuGiamGia());
    }
    public void updateChiPhi( int chiphikhac, String mahbbh) {
        String UPDATE_ChiPhi_SQL = "UPDATE HOADONBANHANG SET CHIPHIKHAC = ? WHERE MAHDBH =? ;";
        JdbcHelper.update(UPDATE_ChiPhi_SQL, chiphikhac, mahbbh);
    }
        public void updateMaGiamGia( String MaGiamGia, String mahbbh) {
        String UPDATE_ChiPhi_SQL = "UPDATE HOADONBANHANG SET MAGIAMGIA = ? WHERE MAHDBH =? ;";
        JdbcHelper.update(UPDATE_ChiPhi_SQL, MaGiamGia, mahbbh);
    }
        public int selectTongBill(String mahdbh){
            int tongtien= 0;
        try {
            String sql ="SELECT SUM(CHITIETBANHANG.SOLUONG*HANGHOA.GIASP)  AS 'TONGTIEN' FROM HANGHOA INNER JOIN CHITIETBANHANG ON CHITIETBANHANG.MAHH = HANGHOA.MAHH WHERE MAHDBH = ?";
            ResultSet rs = JdbcHelper.query(sql, mahdbh);
               rs.next();
            tongtien = rs.getInt("TONGTIEN") ;
            return tongtien;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        }
    @Override
    public void update(HoaDonBanHang entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getNgayhdbh(), entity.getTongtien(), entity.getDiemtl(), entity.getGiamgia(), entity.getChiphikhac(), entity.getMakh(), entity.getManv(), entity.getMahdbh());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDonBanHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    public void resetTongtien(String mahhdh){
        JdbcHelper.update("update HOADONBANHANG set DIEMTL = 0 where MAHDBH = ?; ",mahhdh);
    }
    
    @Override
    public List<HoaDonBanHang> selectBySql(String sql, Object... args) {
        List<HoaDonBanHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                //MAHDBH,NGAYHDBH,TONGTIEN,DIEMTL,GIAMGIA,CHIPHIKHAC,MAKH,MANV
                HoaDonBanHang entity = new HoaDonBanHang();
                entity.setMahdbh(rs.getString("MAHDBH"));
                entity.setChiphikhac(rs.getInt("CHIPHIKHAC"));
                entity.setDiemtl(rs.getInt("DIEMTL"));
                entity.setGiamgia(rs.getInt("GIAMGIA"));
                entity.setMakh(rs.getString("MAKH"));
                entity.setManv(rs.getString("MANV"));
                entity.setNgayhdbh(rs.getObject("NGAYHDBH", LocalDateTime.class));
                entity.setTongtien(rs.getInt("TONGTIEN"));
                entity.setPhieuGiamGia(rs.getString("MAGIAMGIA"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HoaDonBanHang SelectById(String id) {
        List<HoaDonBanHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public HoaDonBanHang SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
