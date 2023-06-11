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
import java.util.logging.Level;
import java.util.logging.Logger;
//xong

/**
 *
 * @author 121200
 */
public class HangHoaDAO implements CoffeInterfaceDAO<HangHoa, String> {

    String SELECT_ALL_SQL = "SELECT MAHH,TENHH,HINHANH,GIASP,MALH,MANCC FROM HANGHOA";
    String SELECT_BY_ID_SQL = "SELECT MAHH,TENHH,HINHANH,GIASP,MALH,MANCC FROM HANGHOA WHERE MAHH = ?";
    String SELECT_BY_LH_SQL = "SELECT MAHH,TENHH,HINHANH,GIASP,MALH,MANCC FROM HANGHOA WHERE MALH = ?";
    String SELECT_BY_NAME_SQL = "SELECT MAHH,TENHH,HINHANH,GIASP,MALH,MANCC FROM HANGHOA WHERE MALH = ? AND TENHH LIKE ?";
    String SELECT_BY_NAME2_SQL = "SELECT MAHH,TENHH,HINHANH,GIASP,MALH,MANCC FROM HANGHOA WHERE TENHH = ?";
    String INSERT_SQL = "INSERT INTO HANGHOA (MAHH,TENHH,HINHANH,GIASP,MALH,MANCC) VALUES (?,?,?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE HANGHOA SET TENHH = ?,HINHANH = ?,GIASP = ?,MALH = ?,MANCC = ? WHERE MAHH = ? ;";
    String DELETE_SQL = "DELETE FROM HANGHOA WHERE MAHH = ? ;";

    @Override
    public void insert(HangHoa entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMahh(), entity.getTenhh(), entity.getHinhanh(), entity.getGiasp(), entity.getMalh(), entity.getMancc());
    }

    @Override
    public void update(HangHoa entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenhh(), entity.getHinhanh(), entity.getGiasp(), entity.getMalh(), entity.getMancc(), entity.getMahh());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public HangHoa SelectById(String id) {
        List<HangHoa> list = this.selectBySql(SELECT_BY_ID_SQL, id.trim());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public List<HangHoa> selectByLH(String lh) {
        return this.selectBySql(SELECT_BY_LH_SQL, lh);
    }
    public List<HangHoa> selectByName(String lh,String name) {
        return this.selectBySql(SELECT_BY_NAME_SQL,lh, "%"+name+"%");
    }
     public HangHoa selectHHByName(String name) {
        List<HangHoa> list = this.selectBySql(SELECT_BY_NAME2_SQL, name.trim());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<HangHoa> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<HangHoa> selectBySql(String sql, Object... args) {
        List<HangHoa> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                // MAHH,TENHH,HINHANH,GIASP,MALH,MANCC
                HangHoa entity = new HangHoa();
                entity.setGiasp(rs.getInt("GIASP"));
                entity.setHinhanh(rs.getBytes("HINHANH"));
                entity.setMahh(rs.getString("MAHH"));
                entity.setMalh(rs.getString("MALH"));
                entity.setMancc(rs.getString("MANCC"));
                entity.setTenhh(rs.getString("TENHH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HangHoa SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
