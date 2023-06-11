/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author 121200
 */
public class LoaiHang {
    private String malh,tenlh,mota;

    public LoaiHang(String malh) {
        this.malh=malh;
    }

    public LoaiHang() {
    }
    
    public String getMalh() {
        return malh;
    }

    public void setMalh(String malh) {
        this.malh = malh;
    }

    public String getTenlh() {
        return tenlh;
    }

    public void setTenlh(String tenlh) {
        this.tenlh = tenlh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return this.getTenlh();
    }
    public boolean equals(Object obj) {
        LoaiHang other = (LoaiHang) obj;
        return other.getMalh().equals(this.getMalh());
    }
}
