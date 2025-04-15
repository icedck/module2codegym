public class Circle {
    private String color = "red";
    private double radius = 1.0;

    Circle(){

    }

    Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                ", radius=" + getRadius() +
                '}';
    }
}
