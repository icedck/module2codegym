import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle circle[] = new ComparableCircle[3];
        circle[0] = new ComparableCircle(3.7);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle("red", false, 3.8);

        System.out.println("Before: ");
        for (ComparableCircle c : circle) {
            System.out.println(c);
        }

        Arrays.sort(circle);

        System.out.println("After: ");
        for (ComparableCircle c : circle) {
            System.out.println(c);
        }

    }
}
