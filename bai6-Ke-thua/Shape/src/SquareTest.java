public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);

        s = new Square(2.3);
        System.out.println(s);

        s = new Square("red",false,2.3);
        System.out.println(s);
    }
}
