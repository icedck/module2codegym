package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }

//    public static void main(String[] args) {
//        circle.Circle c1 = new circle.Circle(2);
//        System.out.println(c1.getRadius());
//        System.out.println(c1.getArea());
//    }
}
