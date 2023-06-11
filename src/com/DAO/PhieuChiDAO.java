/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.API.*;
import com.entity.PhieuChi;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;
//xong

/**
 *
 * @author RITTAM
 */
public class PhieuChiDAO implements CoffeInterfaceDAO<PhieuChi, String> {

    String SELECT_ALL_SQL = "SELECT MAPHIEUCHI,SOTIENCHI,LYDO,THOIGIAN,MANV FROM PHIEUCHI ;";
    String SELECT_BY_ID_SQL = "SELECT MAPHIEUCHI,SOTIENCHI,LYDO,MANV,THOIGIAN FROM PHIEUCHI  WHERE  MAPHIEUCHI = ?";
    String INSERT_SQL = "INSERT INTO PHIEUCHI (SOTIENCHI,LYDO,MANV,THOIGIAN) VALUES (?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE PHIEUCHI SET SOTIENCHI = ?,LYDO = ?,MANV = ?,THOIGIAN = ? WHERE  MAPHIEUCHI = ?;";
    String DELETE_SQL = "DELETE FROM PHIEUCHI WHERE MAPHIEUCHI = ?;";

    @Override
    public void insert(PhieuChi entity) {
            JdbcHelper.update(INSERT_SQL, entity.getSotienchi(), entity.getLydo(), entity.getManv(), entity.getThoigian());
    }

    @Override
    public void update(PhieuChi entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getSotienchi(), entity.getLydo(), entity.getManv(), entity.getThoigian(), entity.getMaphieuchi());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL,id);
    }

    @Override
    public PhieuChi SelectById(String id) {
        List<PhieuChi> list = this.selectBySql (SELECT_BY_ID_SQL, id.trim());
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhieuChi> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<PhieuChi> selectBySql(String sql, Object... args) {
        List<PhieuChi> list = new ArrayList<>();
        
        try{
            //MAPHIEUCHI,SOTIENCHI,LYDO,THOIGIAN,MANV 
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                PhieuChi entity = new PhieuChi();
                entity.setManv(rs.getString("MANV"));
                entity.setLydo(rs.getString("LYDO"));
                entity.setMaphieuchi(rs.getString("MAPHIEUCHI"));
                entity.setSotienchi(rs.getInt("SOTIENCHI"));
                entity.setThoigian(rs.getObject("THOIGIAN", LocalDateTime.class));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public PhieuChi SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
