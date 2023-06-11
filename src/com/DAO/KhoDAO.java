/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.Kho;
import com.API.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//xong
/**
 *
 * @author RITTAM
 */
public class KhoDAO implements CoffeInterfaceDAO<Kho, String> {

    String SELECT_ALL_SQL = "SELECT TEN,SOLUONG,DONVI FROM KHO ;";
    String SELECT_BY_ID_SQL = "SELECT TEN,SOLUONG,DONVI FROM KHO WHERE TEN = ?";
    String INSERT_SQL = "INSERT INTO KHO (TEN,SOLUONG,DONVI) VALUES (?,?,?) ;";
    String UPDATE_SQL = "UPDATE KHO SET SOLUONG = ?,DONVI = ? WHERE  TEN = ?;";
    String DELETE_SQL = "DELETE FROM KHO WHERE  TEN = ?;";

    @Override
    public void insert(Kho entity) {
        JdbcHelper.update(INSERT_SQL, entity.getTen(), entity.getSoluong(), entity.getDonvi());
    }

    @Override
    public void update(Kho entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getSoluong(), entity.getDonvi(), entity.getTen().trim());
    }
    public void delete(Kho entity){
        JdbcHelper.update(DELETE_SQL, entity.getTen());
    }
    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public Kho SelectById(String id) {
        List<Kho> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
        return null;
        }
        return list.get(0);
    }

    @Override
    public List<Kho> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<Kho> selectBySql(String sql, Object... args) {
        List<Kho> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                // 
                Kho entity = new Kho();
                entity.setTen(rs.getString("TEN"));
                entity.setDonvi(rs.getString("DONVI"));
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
    public Kho SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
