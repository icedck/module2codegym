public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2,3);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle("blue", false, 2,3);
//        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3, 5);
        System.out.println(rectangle);

        rectangle.resize();
        System.out.println(rectangle);
    }
}
