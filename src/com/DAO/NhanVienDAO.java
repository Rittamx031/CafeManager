/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.*;
import com.API.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
//xong

/**
 *
 * @author 121200
 */
public class NhanVienDAO implements CoffeInterfaceDAO<NhanVien, String> {

    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN ;";
    String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MANV = ?";
    String INSERT_SQL = "INSERT INTO NHANVIEN (MANV,TENNV,MATKHAU,GIOITINH,CHUCVU,DIACHI,SDT) values (?,?,?,?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE NHANVIEN SET TENNV = ?, MATKHAU = ?,GIOITINH = ?,CHUCVU = ?, DIACHI = ?, SDT = ? WHERE  MANV = ? ;";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE  MANV = ?;";
    String SELECT_BY_TEN = "SELECT TENNV FROM NHANVIEN";

    @Override
    public void insert(NhanVien entity) {
        //MANV,MATKHAU,GIOITINH,CHUCVU,DIACHI,SDT
        JdbcHelper.update(INSERT_SQL, entity.getManv(), entity.getTennv(), entity.getMatkhau(), entity.isGioitinh(), entity.getChucvu(), entity.getDiachi(), entity.getSdt());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTennv(), entity.getMatkhau(), entity.isGioitinh(), entity.getChucvu(), entity.getDiachi(), entity.getSdt(), entity.getManv());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public NhanVien SelectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                //MANV,MATKHAU,GIOITINH,CHUCVU,DIACHI,SDT
                NhanVien entity = new NhanVien();
                entity.setChucvu(rs.getString("CHUCVU"));
                entity.setDiachi(rs.getString("DIACHI"));
                entity.setGioitinh(rs.getBoolean("GIOITINH"));
                entity.setManv(rs.getString("MANV"));
                entity.setMatkhau(rs.getString("MATKHAU"));
                entity.setSdt(rs.getString("SDT"));
                entity.setTennv(rs.getString("TENNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public NhanVien SelectByTen() {
    return (NhanVien) this.selectBySql(SELECT_BY_TEN);
    }

    
       public List<String> selectTen() {
        String sql="SELECT TENNV FROM NHANVIEN";
        List<String> list=new ArrayList<>();
        try {
           ResultSet rs =JdbcHelper.query(sql);
           while(rs.next()){
                 list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
       

}
