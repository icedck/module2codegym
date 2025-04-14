public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 5);
        System.out.println(circle);
    }
}
