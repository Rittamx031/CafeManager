/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;
import java.sql.*;
import com.entity.ChamCong;
import com.API.*;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RITTAM
 */
//xong
public class ChamCongDAO implements CoffeInterfaceDAO<ChamCong, String> {
        String SELECT_ALL_SQL= "SELECT GIOLAM,TONGGIO,GIOVE,NGAYLAM,MANV FROM CHAMCONG";
        String SELECT_BY_ID_SQL= "SELECT GIOLAM,TONGGIO,GIOVE,NGAYLAM,MANV FROM CHAMCONG WHERE MANV = ? AND NGAYLAM = ?;";
        String INSERT_SQL ="INSERT INTO CHAMCONG (NGAYLAM,MANV) VALUES (?,?);";
        String UPDATE_SQL="UPDATE CHAMCONG SET GIOLAM = ?,TONGGIO = ?,GIOVE = ?,NGAYLAM = ? WHERE  NGAYLAM = ? AND  MANV = ?;";
        String DELETE_SQL="DELETE FROM CHAMCONG WHERE  MANV = ? AND   NGAYLAM = ?;";

    @Override
    public void insert(ChamCong entity) {
        System.out.println("not sp");
    }
    
    public void insert(String manv) {
        JdbcHelper.update(INSERT_SQL,LocalDate.now(),manv);
    }
    @Override
    public void update(ChamCong entity) {
        JdbcHelper.update(UPDATE_SQL,entity.getGiolam(),entity.getTonggio(),entity.getGiove(),entity.getNgaylam(),entity.getManv());
    }

    public void delete(String id,LocalDate date) {
        JdbcHelper.update(DELETE_SQL,id,date);
    }

    @Override
    public ChamCong SelectById(String id) {
        List<ChamCong> list = this.selectBySql(SELECT_BY_ID_SQL, id,LocalDate.now());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public ChamCong SelectChamCong(String id) {
        String sql= "SELECT GIOLAM,TONGGIO,GIOVE,NGAYLAM,MANV FROM CHAMCONG WHERE MANV = ? AND NGAYLAM = ?";
        List<ChamCong> list = this.selectBySql(sql, id, LocalDate.now());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public void ChamCongGioLam(String manv){
    String sql= "UPDATE CHAMCONG SET GIOLAM = ? WHERE  NGAYLAM = ? AND  MANV = ?;";
        JdbcHelper.update(sql,LocalTime.now(),LocalDate.now() ,manv);
    }
    public void ChamCongGioVe(String manv){
    String sql= "UPDATE CHAMCONG SET GIOVE = ? WHERE  NGAYLAM = ? AND  MANV = ?;";
        JdbcHelper.update(sql,LocalTime.now(),LocalDate.now(),manv);
    }
    
    @Override
    public List<ChamCong> selectAll() {
            return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public List<ChamCong> selectBySql(String sql, Object... args) {
        List<ChamCong> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                //SELECT GIOLAM,TONGGIO,GIOVE,NGAYLAM,MANV FROM CHAMCONG WHERE MANV = ? 
                ChamCong entity = new ChamCong();
                entity.setGiolam(rs.getObject("GIOLAM", LocalTime.class));
                entity.setGiove(rs.getObject("GIOVE", LocalTime.class));
                entity.setNgaylam(rs.getObject("NGAYLAM", LocalDate.class));
                entity.setManv(rs.getString("MANV"));
                entity.setTonggio(rs.getFloat("TONGGIO"));
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
    public ChamCong SelectByTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
