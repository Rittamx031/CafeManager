/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.time.LocalDateTime;
//xong
/**
 *
 * @author 121200
 */
public class PhieuChi {
    private int sotienchi;
    private String lydo,manv,maphieuchi;
    private LocalDateTime thoigian;

    public String getMaphieuchi() {
        return maphieuchi;
    }

    public void setMaphieuchi(String maphieuchi) {
        this.maphieuchi = maphieuchi;
    }

    public LocalDateTime getThoigian() {
        return thoigian;
    }

    public void setThoigian(LocalDateTime thoigian) {
        this.thoigian = thoigian;
    }
    

    public int getSotienchi() {
        return sotienchi;
    }

    public void setSotienchi(int sotienchi) {
        this.sotienchi = sotienchi;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
}
