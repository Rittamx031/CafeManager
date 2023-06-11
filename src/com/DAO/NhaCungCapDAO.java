/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.*;
import com.API.*;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 121200
 */
public class NhaCungCapDAO implements CoffeInterfaceDAO<NhaCungCap, String> {

    String SELECT_ALL_SQL = "SELECT MANCC,TENNCC,DIACHI,SDT FROM NHACUNGCAP ;";
    String SELECT_BY_ID_SQL = "SELECT MANCC,TENNCC,DIACHI,SDT FROM NHACUNGCAP ; WHERE =";
    String INSERT_SQL = "INSERT INTO NHACUNGCAP (MANCC,TENNCC,DIACHI,SDT) VALUESS (?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE NHACUNGCAP SET  TENNCC = ?,DIACHI = ?,SDT = ? WHERE  MANCC = ?;";
    String DELETE_SQL = "DELETE FROM NHACUNGCAP WHERE  MANCC = ?;";

    @Override
    public void insert(NhaCungCap entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMancc(), entity.getTenncc(), entity.getDiachi(), entity.getSdt());
    }

    @Override
    public void update(NhaCungCap entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenncc(), entity.getDiachi(), entity.getSdt(), entity.getMancc());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public NhaCungCap SelectById(String id) {
        List<NhaCungCap> list = this.selectBySql(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
        return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                // MANCC,TENNCC,DIACHI,SDT
                NhaCungCap entity = new NhaCungCap();
                entity.setDiachi(rs.getString("DIACHI"));
                entity.setMancc(rs.getString("MANCC"));
                entity.setSdt(rs.getString("SDT"));
                entity.setTenncc(rs.getString("TENNCC"));
                list.add(entity);        
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public NhaCungCap SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
