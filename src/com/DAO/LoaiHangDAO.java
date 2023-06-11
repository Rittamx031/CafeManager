/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.LoaiHang;
import com.API.*;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author RITTAM
 */
public class LoaiHangDAO implements CoffeInterfaceDAO<LoaiHang, String> {

    String SELECT_ALL_SQL = "SELECT MALH,TENLH,MOTA FROM LOAIHANG";
    String SELECT_BY_ID_SQL = "SELECT MALH,TENLH,MOTA FROM LOAIHANG WHERE  MALH = ?";
    String INSERT_SQL = "INSERT INTO LOAIHANG (MALH,TENLH,MOTA) VALUESS (?,?,?) ;";
    String UPDATE_SQL = "UPDATE LOAIHANG SET TENLH = ?,MOTA = ? WHERE  MALH = ?;";
    String DELETE_SQL = "DELETE FROM LOAIHANG WHERE  MALH = ?;";

    @Override
    public void insert(LoaiHang entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMalh(), entity.getTenlh(), entity.getMota());
    }

    @Override
    public void update(LoaiHang entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenlh(), entity.getMota(), entity.getMalh());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public LoaiHang SelectById(String id) {
        List<LoaiHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<LoaiHang> selectBySql(String sql, Object... args) {
        List<LoaiHang> list = new ArrayList<>();
        try {
            //MALH
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                LoaiHang entity = new LoaiHang();
                entity.setMalh(rs.getString("MALH"));
                entity.setMota(rs.getString("TENLH"));
                entity.setTenlh(rs.getString("MOTA"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public LoaiHang SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
