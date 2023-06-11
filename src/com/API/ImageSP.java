/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author RITTAM
 */
public class ImageSP {
    public ImageIcon getImagaIcon(ImageIcon hinh){
        
        return null;
    }
//    void chonAnh() throws IOException {
//        byte[] image = null;
//        String nameImage = "";
//        try {
//            JFileChooser jFileChooser = new JFileChooser();
//            int responsive = jFileChooser.showOpenDialog(null);
//            if (responsive == JFileChooser.APPROVE_OPTION) {
//                File file = new File(jFileChooser.getSelectedFile().getAbsolutePath());
//                nameImage = file.getName();
//                lblHinh.setText(nameImage);
//                ImageIcon icon = new ImageIcon(file.getAbsolutePath());
//                imgLogo.setIcon(icon);
//                icon.getImage();
//                FileInputStream fis = new FileInputStream(file);
//                image = fis.readAllBytes();
//                fis.close();
//                System.out.println("Chọn ảnh thành công");
//            }
//        } catch (IOException e) {
//            MsgBox.alert(null, "Chon Ảnh lỗi!!!!");
//            lblHinh.setText("No image");
//            imgLogo.setIcon(new ImageIcon("src//com//edusys//icon//polish.png"));
//        } finally {
//            if (JOptionPane.showConfirmDialog(this, "Bạn Update Ảnh vào chuyên đề " + txtMaCD.getText()
//                    + " không ??" + "",
//                     "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION
//            ) == 0) {
//                dao.updateimage(image, nameImage, txtMaCD.getText());
//            } else {
//                lblHinh.setText("No image");
//                imgLogo.setIcon(new ImageIcon("src//com//edusys//icon//polish.png"));
//            }
//        }
//    }
}
