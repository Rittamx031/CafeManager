/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.API.JdbcHelper;
import com.entity.LoaiGiamGia;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RITTAM
 */
public class LoaiGiamGiaDAO {

    public List<LoaiGiamGia> SelectALL() {
        String sql = "SELECT LoaiGG,mota FROM LoaiGiamGia";
        List<LoaiGiamGia> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                //SELECT MALH,TENLH,MOTAv FROM LOAIGIAMGIA
                LoaiGiamGia entity = new LoaiGiamGia();
                entity.setLoaiGG(rs.getString("LoaiGG"));
                entity.setMota(rs.getString("mota"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

