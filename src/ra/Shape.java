package ra;

import javafx.scene.shape.Circle;

public class Shape {
    private int soCanh;
    private double chuVi;
    private double dienTich;

    public Shape() {
    }

    public Shape(int soCanh, double chuVi, double dienTich) {
        this.soCanh = soCanh;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public Shape(int soCanh, double chuVi) {
        this.soCanh = soCanh;
        this.chuVi = chuVi;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void tinhChuVi(){
        System.out.println(
                "Không tính được chu vi"
        );
    }
    public void tinhChuVi(int a){
        System.out.println(
                "Không tính được chu vi"
        );
    }
     public final void tinhDienTich(){

    }
}
