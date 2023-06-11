/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.*;
import com.API.*;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

/**
 *
 * @author 121200
 */
public class LuongNhanVienDAO implements CoffeInterfaceDAO<LuongNhanVien, String> {

    String SELECT_ALL_SQL = "SELECT SOGIOLAM,THANHTIEN,LUONG,MANV,THANG FROM LUONGNHANVIEN";
    String SELECT_BY_ID_SQL = "SELECT SOGIOLAM,THANHTIEN,LUONG,MANV,THANG FROM LUONGNHANVIEN WHERE MANV = ?";
    String SELECT_BY_ID_AND_M_SQL = "SELECT SOGIOLAM,THANHTIEN,LUONG,MANV,THANG FROM LUONGNHANVIEN WHERE MANV = ? AND THANG = ?";
    String INSERT_SQL = "INSERT INTO LUONGNHANVIEN (SOGIOLAM,THANHTIEN,LUONG,MANV) VALUESS (?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE LUONGNHANVIEN SET SOGIOLAM = ?,THANHTIEN = ?,LUONG = ? WHERE MANV = ?  ;";
    String DELETE_SQL = "DELETE FROM LUONGNHANVIEN WHERE  MANV = ?;";

    @Override
    public void insert(LuongNhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getSogiolam(), entity.getThanhtien(), entity.getLuong(), entity.getManv());
    }

    @Override
    public void update(LuongNhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getSogiolam(), entity.getThanhtien(), entity.getLuong(), entity.getManv());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public LuongNhanVien SelectById(String id) {
        List<LuongNhanVien> list = this.selectBySql(SELECT_ALL_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    public LuongNhanVien SelectById(String id,String mouth) {
        List<LuongNhanVien> list = this.selectBySql(SELECT_ALL_SQL, id ,mouth);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }


    @Override
    public List<LuongNhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<LuongNhanVien> selectBySql(String sql, Object... args) {
        List<LuongNhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                //SOGIOLAM,THANHTIEN,LUONG,MANV
            LuongNhanVien entity = new LuongNhanVien();
            entity.setLuong(rs.getInt("LUONG"));
            entity.setManv(rs.getString("MANV"));
            entity.setThanhtien(rs.getInt("THANHTIEN"));
            entity.setSogiolam(rs.getInt("SOGIOLAM"));
            list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public LuongNhanVien SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
