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

/**
 *
 * @author 121200
 */
public class KhachHangDAO implements CoffeInterfaceDAO<KhachHang, String>{
String SELECT_ALL_SQL= "SELECT MAKH,TENKH,DIACHI,SDT FROM KHACHHANG";
String SELECT_BY_ID_SQL= "SELECT MAKH,TENKH,DIACHI,SDT FROM KHACHHANG WHERE MAKH=?";
String INSERT_SQL ="INSERT INTO KHACHHANG (TENKH,DIACHI,SDT) VALUES (?,?,?) ;";
String UPDATE_SQL="UPDATE KHACHHANG SET TENKH = ?,DIACHI = ? ,SDT = ?  WHERE  MAKH=?;";
String DELETE_SQL="DELETE FROM KHACHHANG WHERE  MAKH=?;";

    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.update(INSERT_SQL, entity.getTenkh(),entity.getDiachi(),entity.getSdt());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenkh(),entity.getDiachi(),entity.getSdt(),entity.getMakh());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL,id);
    }

    @Override
    public KhachHang SelectById(String id) 
    {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
       }
        return list.get(0);
    }
    public KhachHang SelectByNAME(String keyword) 
    {
        String sql ="SELECT MAKH,TENKH,DIACHI,SDT FROM KHACHHANG WHERE TENKH Like ?";
        List<KhachHang> list = this.selectBySql(sql,  "%"+keyword+"%");
        if(list.isEmpty()){
            return null; 
       }
        return list.get(0);
    }
    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try{
            //MAKH,TENKH,DIACHI,SDT
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                entity.setMakh(rs.getString("MAKH"));
                entity.setDiachi(rs.getString("DIACHI"));
                entity.setSdt(rs.getString("SDT"));
                entity.setTenkh(rs.getString("TENKH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public KhachHang SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
