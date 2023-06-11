package demo.nhanDienGiuongMat;

public class ModelPerson {

    private String manv, image;
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelPerson() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ModelPerson(String manv, String image) {
        this.manv = manv;
        this.image = image;
    }

}
