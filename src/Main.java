import ra.Circle;
import ra.Retangle;
import ra.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle  =new Circle(3.5);
        Circle circle2  =new Circle(7.5);

        Circle[] arr  = {circle, circle2};
        Circle circle1 = circle;
        System.out.println("Hình tròn có số cạnh là :" + circle.getSoCanh());
        // tinhs chu vi và diện tích
        circle.tinhChuVi(3);
        circle.tinhDienTich();
        // in ra các thuộc tính chu vi và diện tích đã tính toán
        System.out.println(" Chu vi "+ circle.getChuVi());
        System.out.println("Diệnn tích "+ circle.getDienTich());
        System.out.println(circle);
//        System.out.println("circle".equals("circle"));
        StringBuilder str1 = new StringBuilder("hùng");
        // nhập radius

        Shape shape = new Circle(4.5);
        Shape shape1 = new Retangle();
//        shape1;
        if(shape1 instanceof Retangle){
        Retangle s =(Retangle) shape1;
        }
//        ép kiểu;
        // tường minh
        Circle circle3 = (Circle) shape;
//        Retangle retangle1 = (Retangle) shape;
//        Retangle retangle1 = (Retangle) circle3;
        // ngầm định
        Shape shape2 =  circle3;

        Object o = new Retangle();
        Retangle retangle = (Retangle) o;

        int b =5;
//        ép kiểu
        Shape p1 =new Shape();
        Retangle retangle1 = (Retangle) shape;
    }

}