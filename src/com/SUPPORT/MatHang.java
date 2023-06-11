package com.SUPPORT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 121200
 */
public class MatHang {
    private String mahh;
    private int soluong;

    public MatHang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMahh() {
        return mahh;
    }

    public MatHang(String mahh, int soluong) {
        this.mahh = mahh;
        this.soluong = soluong;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return this.getMahh() + "\t\t" + String.valueOf(this.getSoluong());
    }
    
}
