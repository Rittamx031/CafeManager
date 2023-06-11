package demo.nhanDienGiuongMat;

import com.API.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControlPerson {
    public void insert(ModelPerson mod) {
            JdbcHelper.update("INSERT INTO FaceRE(id,MANV) VALUES (?,?);", mod.getId(),mod.getManv());
    }
    public void update(ModelPerson mod, int id) {
        JdbcHelper.update("UPDATE FaceRE set MANV=? where id =?;",mod.getManv(), mod.getId());
    }
    public void delete(int id) {
             JdbcHelper.update("DELETE FROM FaceRE where id =?;",id);
    }
//    public ModelPerson SelectById(Integer makh){
//        String sql="SELECT * FROM KhoaHoc WHERE MaKH=?";
//        List<ModelPerson> list = selectBySql(sql, makh);
//        return list.size() > 0 ? list.get(0) : null;
//}
//public List<ModelPerson> selectByChuyenDe(String macd){
//        String sql="SELECT * FROM KhoaHoc WHERE MaCD=?";
//        return this.selectBySql(sql, macd);
//    }
//public List<ModelPerson> selectAll() {
//    return this.selectBySql(SELECT_ALL_SQL);
//}
//
//protected List<ModelPerson> selectBySql(String sql, Object... args) {
//
//    List<ModelPerson> list = new ArrayList<>();
//    try{
//        ResultSet rs = JdbcHelper.query(sql, args);
//        while(rs.next()){
//            //MAKH,MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV,NGAYTAO
//            ModelPerson entity = new ModelPerson();
//            entity.setId(rs.getInt("id"));
//            entity.setMaNV(rs.getString("MANV"));
//            list.add(entity);
//        }
//        rs.getStatement().getConnection().close();
//        return list;
//    }catch(Exception e){
//        throw new RuntimeException(e);
//    }
//
//}
//
//    public List<Integer> selectYears() {
//        String sql="SELECT DISTINCT year(NgayKG) Year FROM KhoaHoc ORDER BY Year DESC";
//        List<Integer> list=new ArrayList<>();
//        try {
//           ResultSet rs = JdbcHelper.query(sql);
//           while(rs.next()){
//                 list.add(rs.getInt(1));
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        } 
//        catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

        
}
