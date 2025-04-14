public class Cylinder extends Circle{
    Double height = 1.0;
    public Cylinder(){

    }

    public Cylinder(Double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, Double height) {
        super(color, radius);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double bottomPerimeter() {
        return getPerimeter();
    }
    public double surroundingArea(){
        return bottomPerimeter()*height;
    }

    public double baseArea(){
        return getArea();
    }
    public double totalArea(){
        return surroundingArea()+baseArea()*2;
    }
    public double volume(){
        return baseArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "color='" + getColor() + '\'' +
                ", radius=" + getRadius() + '\'' +
                ", height=" + getHeight() +
                '}';
    }
}
