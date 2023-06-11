/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panelItem;

import com.API.Message;
import com.DAO.ChamCongDAO;
import com.DAO.NhanVienDAO;
import com.entity.NhanVien;
import com.entity.ChamCong;
import demo.nhanDienGiuongMat.FaceChamCong;
import java.awt.Frame;


/**
 *
 * @author lamqw
 */
public class ChamCongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChamCongJPanel
     */
    public ChamCongJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFaceid = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(77, 166, 255));
        jLabel1.setText("Chấm Công");

        jLabel3.setText("Nhập mã NV:");

        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaNVKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Thank you for using the app");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Have a good day");

        btnFaceid.setText("Chấm công bằng faceid");
        btnFaceid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaceidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnFaceid, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel4)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(btnFaceid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            String manv = txtMaNV.getText();
            ChamCong(manv);
        }
    }//GEN-LAST:event_txtMaNVKeyPressed

    private void btnFaceidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaceidActionPerformed
        // TODO add your handling code here:
           FaceChamCong rf = new FaceChamCong((Frame) this.getRootPane().getParent(), true);
           rf.setVisible(true);
    }//GEN-LAST:event_btnFaceidActionPerformed
    void ChamCong(String manv) {
        NhanVien nv = nvdao.SelectById(manv.trim());
        if (nv == null) {
            Message.alert(this, "Mã Nhân Viên không đúng !!!!");
        } else {
            ChamCong cc = ccdao.SelectById(manv);
            if(cc==null){
                ccdao.insert(manv);
                ccdao.ChamCongGioLam(manv);
                Message.alert(this, "Chấm Công thành công!!!");
            }else if(cc.getGiove() == null){
                if(Message.confirm(this, "Xác Nhận Chấm Công giờ về")){
                ccdao.ChamCongGioVe(manv);
                Message.alert(this, "Chấm Công thành công");
            }
            }
        }
    }

    ChamCongDAO ccdao = new ChamCongDAO();
    NhanVienDAO nvdao = new NhanVienDAO();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFaceid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtMaNV;
    // End of variables declaration//GEN-END:variables
}