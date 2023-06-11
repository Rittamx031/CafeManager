/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.API.JdbcHelper;
import com.SUPPORT.MatHang;
import com.entity.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//xong
/**
 *
 * @author 121200
 */
public class ChiTietBanHangDAO implements CoffeInterfaceDAO<ChiTietBanHang, String> {
    String viewTableThanhToan = "SELECT MAHDBH,CHITIETBANHANG.MAHH,SOLUONG,TENHH,GIASP, (GIASP * SOLUONG) AS 'THANHTIEN' AS 'THANHTIEN'   FROM CHITIETBANHANG INNER JOIN HANGHOA ON CHITIETBANHANG.MAHH = HANGHOA.MAHH WHERE MAHDBH = ?";
    String SELECT_ALL_SQL = "SELECT MAHDBH,CHITIETBANHANG.MAHH,SOLUONG,TENHH,GIASP, (GIASP * SOLUONG) AS 'THANHTIEN'   FROM CHITIETBANHANG INNER JOIN HANGHOA ON CHITIETBANHANG.MAHH = HANGHOA.MAHH";
    String SELECT_BY_ID_SQL = "SELECT MAHDBH,CHITIETBANHANG.MAHH,SOLUONG,TENHH,GIASP, (GIASP * SOLUONG) AS 'THANHTIEN'   FROM CHITIETBANHANG INNER JOIN HANGHOA ON CHITIETBANHANG.MAHH = HANGHOA.MAHH WHERE MAHDBH = ?;";
    String INSERT_SQL = "INSERT INTO CHITIETBANHANG (MAHDBH ,MAHH ,SOLUONG) VALUES (?,?,?);";
    String UPDATE_SQL = "UPDATE CHITIETBANHANG SET SOLUONG = ? WHERE MAHDBH = ? AND MAHH = ?;";
    String SELECT_BY_HH_HD_SQL = "SELECT MAHDBH,CHITIETBANHANG.MAHH,SOLUONG,TENHH,GIASP, (GIASP * SOLUONG) AS 'THANHTIEN' FROM CHITIETBANHANG INNER JOIN HANGHOA ON CHITIETBANHANG.MAHH = HANGHOA.MAHH WHERE MAHDBH = ? AND CHITIETBANHANG.MAHH = ?;";
    String DELETE_SQL = "DELETE FROM CHITIETBANHANG WHERE MAHDBH = ? AND MAHH = ?";

    @Override
    public void insert(ChiTietBanHang entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMahdbd(), entity.getMhh(), entity.getSoluong());
    }
    @Override
    public void update(ChiTietBanHang entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getSoluong(), entity.getMahdbd(), entity.getMhh());
    }

    public void delete(ChiTietBanHang entity) {
        JdbcHelper.update(DELETE_SQL, entity.getMahdbd(), entity.getMhh());

    }
   public boolean CheckExisting(ChiTietBanHang entity){
    List<ChiTietBanHang> list = this.selectBySql(SELECT_BY_HH_HD_SQL, entity.getMahdbd(),entity.getMhh());
        if (list.isEmpty()) {
         return false;
        }
    return true;
    }
   public ChiTietBanHang SelectByhh(String mahd ,String mahh){
   List<ChiTietBanHang> list = this.selectBySql(SELECT_BY_HH_HD_SQL, mahd,mahh);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
   }
    @Override
    public ChiTietBanHang SelectById(String id) {
        List<ChiTietBanHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietBanHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    public List<ChiTietBanHang> selectAllbyHHBH(String mahhbh) {
        return this.selectBySql(SELECT_BY_ID_SQL,mahhbh);
    }
    @Override
    public List<ChiTietBanHang> selectBySql(String sql, Object... args) {
        List<ChiTietBanHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                //MAHDBH,CHITIETBANHANG.MAHH,SOLUONG,TENHH,GIASP, (GIASP * SOLUONG) AS 'THANHTIEN'
                ChiTietBanHang entity = new ChiTietBanHang();
                entity.setMahdbd(rs.getString("MAHDBH"));
                entity.setMhh(rs.getString("MAHH"));
                entity.setSoluong(rs.getInt("SOLUONG"));
                entity.setGiasp(rs.getInt("GIASP"));
                entity.setThanhtien(rs.getInt("THANHTIEN"));
                entity.setTenhh(rs.getString("TENHH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<MatHang> selectMatHang(String id) {
        List<MatHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(SELECT_BY_ID_SQL, id);
            while (rs.next()) {
                //MAHDBH ,MAHH ,SOLUONG
                MatHang entity = new MatHang();
                entity.setMahh(rs.getString("MAHH"));
                entity.setSoluong(rs.getInt("SOLUONG"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChiTietBanHang SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
