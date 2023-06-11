/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author 121200
 */
public class Message {
        public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Cà Phê nhóm 4", JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message, "Cà Phê nhóm 4", JOptionPane.YES_NO_OPTION);
        return result==JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,"Cà Phê nhóm 4",JOptionPane.INFORMATION_MESSAGE);
    }
}
