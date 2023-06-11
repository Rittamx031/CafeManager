/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 121200
 */
public class ChamCong {
    private LocalTime giolam,giove;
    private float tonggio;
    private LocalDate ngaylam;
    private String manv;
    public LocalTime getGiolam() {
        return giolam;
    }

    public void setGiolam(LocalTime giolam) {
        this.giolam = giolam;
    }

    public LocalTime getGiove() {
        return giove;
    }

    public void setGiove(LocalTime giove) {
        this.giove = giove;
    }

    public float getTonggio() {
        return tonggio;
    }

    public void setTonggio(float tonggio) {
        this.tonggio = tonggio;
    }

    public LocalDate getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(LocalDate ngaylam) {
        this.ngaylam = ngaylam;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
}
