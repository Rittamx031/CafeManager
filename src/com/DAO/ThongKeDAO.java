/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.API.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 121200
 */
public class ThongKeDAO {
    
        private List<Object[]> getListOfArray(String sql,String[] cols,Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i = 0;i<cols.length;i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
                
            public List<Object[]> getLuongAll(){
        String sql = "{CALL ThongKeLuong}";
        String[] cols ={"MANV","TENNV","LUONG","SOGIOLAM","THANG","THANHTIEN"};
        return this.getListOfArray(sql, cols);
    }
            
        
    /**
     *
     * @param tenNV
     * @return
     */
            
    public List<Object[]> getLuongTheoTen(String tenNV){
        String sql = "{CALL ThongKeLuongTheoTen(?) }";
        String[] cols ={"THANHTIEN"};
        return this.getListOfArray(sql, cols, tenNV);
    }
            
             public List<Object[]> getChiTienTheoThang(Integer Month){
        String sql = "{ CALL ThongKeTienChiTheoThang(?) }";
        String[] cols ={"THANHTIEN"};
        return this.getListOfArray(sql, cols, Month);
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
       
        public List<String> selectLuongCaoNhat() {
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
   
       
         public List<Object[]> getLuongTheoThang(Integer month){
        String sql = "{ CALL ThongKeLuongTheoThang(?) }";
        String[] cols ={"MANV","TENNV","LUONG","SOGIOLAM","THANHTIEN"};
        return this.getListOfArray(sql, cols,month);
         }
         
                  public List<Object[]> getNhanVienXuatSac(Integer month){
        String sql = "{ CALL ThongKeNhanVienXuatSacCuaThang(?) }";
        String[] cols ={"MANV","TENNV","SOGIOLAM","THANHTIEN"};
        return this.getListOfArray(sql, cols,month);
         }
            
}
