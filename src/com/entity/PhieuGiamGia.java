/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author RITTAM
 */
public class PhieuGiamGia {

    String mapgg, Loaigg;
    int giamtoida, giatritoithieu, soluong,giam;
    boolean tinhtrang;

    public int getGiam() {
        return giam;
    }

    public void setGiam(int giam) {
        this.giam = giam;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getMapgg() {
        return mapgg;
    }

    public void setMapgg(String mapgg) {
        this.mapgg = mapgg;
    }

    public String getLoaigg() {
        return Loaigg;
    }

    public void setLoaigg(String Loaigg) {
        this.Loaigg = Loaigg;
    }

    public int getGiamtoida() {
        return giamtoida;
    }

    public void setGiamtoida(int giamtoida) {
        this.giamtoida = giamtoida;
    }

    public int getGiatritoithieu() {
        return giatritoithieu;
    }

    public void setGiatritoithieu(int giatritoithieu) {
        this.giatritoithieu = giatritoithieu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Giảm :" +  this.getGiam() +" "+ this.getLoaigg() + "- Hóa đơn tối thiểu" + this.getGiatritoithieu() +"- Giảm tối đa" +this.getGiamtoida();
    }
    @Override
    public boolean equals(Object obj) {
        PhieuGiamGia orther = (PhieuGiamGia) obj;
        return orther.toString().equals(this.toString());
    }
}
