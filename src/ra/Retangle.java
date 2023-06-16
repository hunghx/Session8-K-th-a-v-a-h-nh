package ra;

public class Retangle extends Shape{
    private double chieuDai;
    private double chieuRong;

    @Override
    public void tinhChuVi(int b) {
        this.setChuVi(chieuRong+chieuDai);
    }

//    @Override
//    public void tinhDienTich() {
//        this.setDienTich(chieuRong*chieuDai);
//    }
}
