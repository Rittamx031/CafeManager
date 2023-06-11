/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author 121200
 */
public class ChiTietBanHang {

    private String mhh, mahdbd, tenhh;
    private int soluong, thanhtien, giasp;
    public boolean equals(Object obj) {
        ChiTietBanHang other = (ChiTietBanHang) obj;
       return other.getMhh().equals(this.getMhh());
    }
    public String getTenhh() {
        return tenhh;
    }

    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getGiasp() {
        return giasp;
    }

    public void setGiasp(int giasp) {
        this.giasp = giasp;
    }

    public String getMahdbd() {
        return mahdbd;
    }

    public void setMahdbd(String mahdbd) {
        this.mahdbd = mahdbd;
    }

    public String getMhh() {
        return mhh;
    }

    public void setMhh(String mhh) {
        this.mhh = mhh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}
