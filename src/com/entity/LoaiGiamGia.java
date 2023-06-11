/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author RITTAM
 */
public class LoaiGiamGia {

    String LoaiGG, Mota;

    public LoaiGiamGia(String LoaiGG) {
        this.LoaiGG = LoaiGG;
    }

    public LoaiGiamGia() {
    }

    public String getLoaiGG() {
        return LoaiGG;
    }

    public void setLoaiGG(String LoaiGG) {
        this.LoaiGG = LoaiGG;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public LoaiGiamGia(String LoaiGG, String Mota) {
        this.LoaiGG = LoaiGG;
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return this.getLoaiGG();
    }

    public boolean equals(Object obj) {
        LoaiGiamGia orther = (LoaiGiamGia) obj;
        return orther.getLoaiGG().equals(this.getLoaiGG());
    }
}
