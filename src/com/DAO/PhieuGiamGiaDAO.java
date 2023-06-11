/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.API.JdbcHelper;
import com.entity.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author 121200
 */
public class PhieuGiamGiaDAO implements CoffeInterfaceDAO<PhieuGiamGia, String> {

    String SELECT_ALL_SQL = "SELECT MAPHIEUGIAMGIA,LOAIGG,GIAMTOIDA,HOADONTOITHIEU,SOLUONG,GIAM,TINHTRANG FROM PHIEUGIAMGIA";
    String SELECT_BY_ID_SQL = "SELECT MAPHIEUGIAMGIA,LOAIGG,GIAMTOIDA,HOADONTOITHIEU,SOLUONG,GIAM,TINHTRANG FROM PHIEUGIAMGIA WHERE MAPHIEUGIAMGIA = ?";
    String INSERT_SQL = "INSERT INTO PHIEUGIAMGIA(MAPHIEUGIAMGIA,LOAIGG,GIAMTOIDA,HOADONTOITHIEU,SOLUONG,GIAM,TINHTRANG) VALUES(?,?,?,?,?,?,?) ;";
    String UPDATE_SQL = "UPDATE PHIEUGIAMGIA  SET LOAIGG = ? ,GIAMTOIDA = ?,HOADONTOITHIEU =? ,SOLUONG = ?,GIAM =?,TINHTRANG= ? WHERE MAPHIEUGIAMGIA = ? ;";
    String DELETE_SQL = "DELETE FROM PHIEUGIAMGIA WHERE  MAPHIEUGIAMGIA = ? ;";

    @Override
    public List<PhieuGiamGia> selectBySql(String sql, Object... args) {
        List<PhieuGiamGia> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                //MAPHIEUGIAMGIA,LOAIGG,GIAMTOIDA,HOADONTOITHIEU,SOLUONG,GIAM,TINHTRANG 
                PhieuGiamGia entity = new PhieuGiamGia();
                entity.setMapgg(rs.getString("MAPHIEUGIAMGIA"));
                entity.setLoaigg(rs.getString("LOAIGG"));
                entity.setGiamtoida(rs.getInt("GIAMTOIDA"));
                entity.setGiatritoithieu(rs.getInt("HOADONTOITHIEU"));
                entity.setSoluong(rs.getInt("SOLUONG"));
                entity.setGiam(rs.getInt("GIAM"));
                entity.setTinhtrang(rs.getBoolean("TINHTRANG"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PhieuGiamGia SelectById(String id) {
        List<PhieuGiamGia> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public PhieuGiamGia SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(PhieuGiamGia entity) {
        //MAPHIEUGIAMGIA,LOAIGG,GIAMTOIDA,HOADONTOITHIEU,SOLUONG,GIAM,TINHTRANG 
        JdbcHelper.update(INSERT_SQL, entity.getMapgg(),entity.getLoaigg(),entity.getGiamtoida(),entity.getGiatritoithieu(),entity.getSoluong(),entity.getGiam(),entity.isTinhtrang());
    }

    @Override
    public void update(PhieuGiamGia entity) {
        //UPDATE PHIEUGIAMGIA  SET LOAIGG = ? ,GIAMTOIDA = ?,HOADONTOITHIEU =? ,SOLUONG = ? WHERE MAPHIEUGIAMGIA = ? ;
                JdbcHelper.update(UPDATE_SQL,entity.getLoaigg(),entity.getGiamtoida(),entity.getGiatritoithieu(),entity.getSoluong(),entity.getGiam(),entity.isTinhtrang() ,entity.getMapgg());
    }

    @Override
    public void delete(String id) {
                JdbcHelper.update(DELETE_SQL,id);
    }

    @Override
    public List<PhieuGiamGia> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
}
