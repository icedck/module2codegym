package testcircle;

import circle.Circle;

public class TestCircle extends Circle {
    public static void main(String[] args) {
//        Circle c1 = new Circle(2);
//        System.out.println(c1.getRadius());
//        System.out.println(c1.getArea());
        TestCircle testCircle = new TestCircle();
        testCircle.setRadius(2.0);
        System.out.println(testCircle.getArea());
    }
}
