/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panelItem;

import com.API.Message;
import com.DAO.KhoDAO;
import com.entity.Kho;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lamqw
 */
public class KhoHangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhoHangJPanel
     */
    public KhoHangJPanel() {
        initComponents();
        init();
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
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblDonVi = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKho = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(77, 166, 255));
        jLabel1.setText("Kho Hàng");

        lblTen.setText("Tên:");

        lblSoLuong.setText("Số lượng:");

        lblDonVi.setText("Đơn vị:");

        tblKho.setBackground(new java.awt.Color(77, 166, 255));
        tblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên", "Số lượng", "Đơn vị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKho);

        btnThem.setBackground(new java.awt.Color(0, 255, 0));
        btnThem.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 102, 102));
        btnXoa.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 204, 102));
        btnSua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(77, 166, 255));
        btnMoi.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblTen)
                                        .addGap(41, 41, 41)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblSoLuong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 342, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTen))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonVi)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnMoi))
                .addGap(21, 21, 21))
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

    private void tblKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoMouseClicked
        // TODO add your handling code here:
           if(evt.getClickCount() == 2){
            Kho kho = dao.SelectById((String) tblKho.getValueAt(tblKho.getSelectedRow(), 0));
            setForm(kho);
            editable(txtSoLuong,txtDonVi);
        }
    }//GEN-LAST:event_tblKhoMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
              this.Them();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.xoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.sua();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.moi();
    }//GEN-LAST:event_btnMoiActionPerformed

  KhoDAO dao = new KhoDAO();
void btnsetable(Object... args) {
        btnMoi.setEnabled(false);
        btnSua.setEnabled(false);
        btnThem.setEnabled(false);
        btnXoa.setEnabled(false);
        for (Object ob : args) {
            try {
                ((JButton) ob).setEnabled(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    void fillTable() {
        List<Kho> list = dao.selectAll();
        DefaultTableModel model = (DefaultTableModel) tblKho.getModel();
        model.setRowCount(0);
        for (Kho kho : list) {
            Object[] row = new Object[3];
            row[0] = kho.getTen();
            row[1] = kho.getSoluong();
            row[2] = kho.getDonvi();
            model.addRow(row);
        }
                btnsetable(btnThem,btnMoi);
    }

    void clearForm() {
        setForm(new Kho());
    }

    void setForm(Kho kho) {
        txtDonVi.setText(kho.getDonvi());
        txtSoLuong.setText(String.valueOf(kho.getSoluong()));
        txtTen.setText(kho.getTen());
        editable();
    }

    Kho getForm() {
        Kho kho = new Kho();
        kho.setTen(txtTen.getText());
        kho.setSoluong(Integer.parseInt(txtSoLuong.getText()));
        kho.setDonvi(txtDonVi.getText());
        return kho;
    }
    void editable(Object... args){
        txtDonVi.setEditable(false);
        txtSoLuong.setEditable(false);
        txtTen.setEditable(false);
        for(Object ob:args){
            try{
                ((JTextField) ob).setEditable(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    
    }
    void Them() {
        Kho kho = getForm();
        if (kho.getTen().trim().equals("")) {
            Message.alert(this, "Chưa nhập tên");
        }else if(!txtTen.isEditable()){
            Message.alert(this,"\"" + kho.getTen().trim()+ "\""+ " Đã tồn tại !!!");
        }
        else{
        try {
            dao.insert(kho);
            this.fillTable();
            this.clearForm();
            Message.alert(this, "Thêm thành công!");
        } catch (Exception e) {
            Message.alert(this, "Thêm thất bại!");
        }
        }
    }

    void xoa() {
        Kho kho = getForm();
        if (kho.getTen().trim().equals("")) {
            Message.alert(this, "Chọn Loại Hàng để xóa!");
        } else {
            if (Message.confirm(this, "Bạn muốn xóa " + "\""+ kho.getTen() + "\""+ " khỏi kho chứ?")) {
                try {
                    dao.delete(kho);
                    this.fillTable();
                    this.clearForm();
                    Message.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    Message.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void sua() {
        Kho kho = getForm();
        if(kho.getTen().trim().equals("")){
            Message.alert(this, "Chưa Chọn Hàng hóa!!!");
        }
        else{
        Kho kho1 = dao.SelectById(kho.getTen().trim());
        if(kho.getSoluong() != kho1.getSoluong()|| kho.getDonvi().trim().equalsIgnoreCase(kho1.getDonvi().trim())){
            if (Message.confirm(this, "Bạn muốn Sửa " + "\""+ kho.getTen() + "\""+ " trong kho chứ?" +
                    "\nSố lượng "+ kho1.getSoluong() + " --> " +kho.getSoluong()+
                    "\n Đơn Vị "+ kho1.getDonvi()+ " --> "+ kho1.getDonvi())) {
                try {
                    dao.update(kho);
                    this.fillTable();
                    this.clearForm();
                    Message.alert(this, "Sửa thành công!");
                } catch (Exception e) {
                    Message.alert(this, "Sửa thất bại!");
                    System.out.println(e);
                }
            }
        }
        }
    }
    void init(){
        fillTable();
    }
    private void moi() {
        clearForm();
        editable(txtTen,txtSoLuong,txtDonVi);
        btnsetable(btnMoi,btnThem);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTen;
    private javax.swing.JTable tblKho;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
