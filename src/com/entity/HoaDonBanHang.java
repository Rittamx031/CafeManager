/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.time.LocalDateTime;

/**
 *
 * @author 121200
 */
public class HoaDonBanHang {
    private String manv,makh,mahdbh,PhieuGiamGia;
    private int tongtien,diemtl,giamgia,chiphikhac;
    private LocalDateTime ngayhdbh;

    public String getPhieuGiamGia() {
        return PhieuGiamGia;
    }

    public void setPhieuGiamGia(String PhieuGiamGia) {
        this.PhieuGiamGia = PhieuGiamGia;
    }

    
    public LocalDateTime getNgayhdbh() {
        return ngayhdbh;
    }

    public void setNgayhdbh(LocalDateTime ngayhdbh) {
        this.ngayhdbh = ngayhdbh;
    }

    public String getMahdbh() {
        return mahdbh;
    }

    public void setMahdbh(String mahdbh) {
        this.mahdbh = mahdbh;
    }
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public int getDiemtl() {
        return diemtl;
    }

    public void setDiemtl(int diemtl) {
        this.diemtl = diemtl;
    }

    public int getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public int getChiphikhac() {
        return chiphikhac;
    }

    public void setChiphikhac(int chiphikhac) {
        this.chiphikhac = chiphikhac;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }
    
}
