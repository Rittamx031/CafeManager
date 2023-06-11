/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import com.API.DateSP;
import com.SUPPORT.MatHang;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author 121200
 */
public class PhieuBanHang {
    private String mahdbh,manv;
    private LocalDateTime thoiGian;
    private List<MatHang> array;
    private int TongTien;

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    
    public String getMahdbh() {
        return mahdbh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
    public void setMahdbh(String mahdbh) {
        this.mahdbh = mahdbh;
    }

    public LocalDateTime getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDateTime thoiGian) {
        this.thoiGian = thoiGian;
    }

    public List<MatHang> getArray() {
        return array;
    }

    public void setArray(List<MatHang> array) {
        this.array = array;
    }

    @Override
    public String toString() {
            String hoadon = "";
            for (MatHang mh :this.array) {
                hoadon += mh.toString();
        }
             
        return " Mã hóa đơn : " +this.mahdbh
                +"\n Thời gian tạo: " + DateSP.DateTimeToString(thoiGian,DateSP.getDatetimepattern())+
                hoadon
                +"\n Tổng tiền : \t" + String.valueOf(this.getTongTien())
                +"\n\n"+"\t\t" + this.getManv();
    }
}
