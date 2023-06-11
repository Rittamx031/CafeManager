/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API;

import com.entity.NhanVien;

/**
 *
 * @author 121200
 */
public class admin {
    public static NhanVien user;
    public static void clear(){
        admin.user= null;
    }
    public static boolean isLogin(){
        return admin.user != null;
    }
    public static boolean isManager(){
        return (admin.user.getChucvu().trim().equalsIgnoreCase("quan ly") &&  isLogin());
    }
}
