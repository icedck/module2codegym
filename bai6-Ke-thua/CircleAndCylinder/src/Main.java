//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    Circle circle = new Circle();
//        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0);
        System.out.println(cylinder);

        cylinder = new Cylinder("blue",2.0,5.0);
        System.out.println(cylinder);
        System.out.println("CV mat day = " + cylinder.bottomPerimeter() + " Dien tich mat day = " + cylinder.baseArea() +
                " Dien tich xung quanh = " + cylinder.surroundingArea() + " Dien tich roan phan = " + cylinder.totalArea() +
                " The tich = " + cylinder.volume());
    }
}