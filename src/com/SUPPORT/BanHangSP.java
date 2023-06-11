/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SUPPORT;

/**
 *
 * @author 121200
 */
public class BanHangSP {

    static String MaHoaDonBanHang = "";

    public static String getMaHoaDonBanHang() {
        return MaHoaDonBanHang;
    }

    public static void setMaHoaDonBanHang(String MaHoaDonBanHang1) {
        MaHoaDonBanHang = MaHoaDonBanHang1;
    }

    public static boolean CheckMaBanHang() {
        return !MaHoaDonBanHang.equalsIgnoreCase("");
    }
    public static void resetMaBanHang() {
        MaHoaDonBanHang = "";
    }
}
