public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    Rectangle(){

    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }


    @Override
    public void resize() {
        this.width += this.width * (Math.random() * (double)100.0F + (double)1.0F) / (double)100.0F;
        this.height += this.height * (Math.random() * (double)100.0F + (double)1.0F) / (double)100.0F;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                +" and Area="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
