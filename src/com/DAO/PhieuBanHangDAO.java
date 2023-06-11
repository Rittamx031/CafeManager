/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.PhieuBanHang;
import com.API.*;
import com.entity.ChiTietBanHang;
import com.entity.HangHoa;
import com.entity.HoaDonBanHang;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author RITTAM
 */
public class PhieuBanHangDAO {
    public PhieuBanHang getPhieuBanHang(String maPhieuBanHang) {
        PhieuBanHang phieuBanHang = new PhieuBanHang();
        HoaDonBanHangDAO dao = new HoaDonBanHangDAO();
        HoaDonBanHang hd = dao.SelectById(maPhieuBanHang);
        phieuBanHang.setMahdbh(hd.getMahdbh());
        phieuBanHang.setThoiGian(hd.getNgayhdbh());
        phieuBanHang.setManv(hd.getManv());
        phieuBanHang.setTongTien(hd.getTongtien());

        ChiTietBanHangDAO bhdao = new ChiTietBanHangDAO();

        phieuBanHang.setArray(bhdao.selectMatHang(maPhieuBanHang));

        return phieuBanHang;
    }

    public String getMaPhieubanHangNeẉ̣() throws SQLException {
        String mahhdb = "";
        String sql = "{ ? = CALL [dbo].[AUTO_IDHDBH] ()}";
        CallableStatement cstmt = JdbcHelper.getCamt(sql);
        //Registering the out parameter of the function (return type)
        cstmt.registerOutParameter(1, Types.NVARCHAR);
        //Setting the input parameters of the function
        //Executing the statement
        cstmt.execute();
        mahhdb = cstmt.getNString(1);
        return mahhdb;
    }
}
