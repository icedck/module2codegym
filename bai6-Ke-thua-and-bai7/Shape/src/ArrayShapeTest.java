public class ArrayShapeTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle( "indigo", false, 3.5);
        shape[1] = new Rectangle("orange", true, 2.5, 3.8);
        shape[2] = new Square("red", true, 3);

        System.out.println("Before: ");
        for (Shape s : shape) {
            System.out.println(s);
        }
        System.out.println("After: ");
        changeAfter(shape);

        //howtocolor() of Square
        for (Shape s : shape) {
            if(s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }
        }

    }

    public static void changeAfter(Shape[] shape) {
        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Circle) {
                Circle circle = (Circle) shape[i];
                circle.resize();
                System.out.println(circle);
            }
            if (shape[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape[i];
                rectangle.resize();
                System.out.println(rectangle);
            }
        }
    }
}
