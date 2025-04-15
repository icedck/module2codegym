public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize() {
        this.radius += this.radius * (Math.random() * (double)100.0F + (double)1.0F) / (double)100.0F;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + " and Area=" + this.getArea() + ", which is a subclass of " + super.toString();
    }
}
