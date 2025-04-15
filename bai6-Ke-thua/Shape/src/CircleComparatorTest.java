import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle circl[] = new Circle[3];
        circl[0] = new Circle(3.6);
        circl[1] = new Circle();
        circl[2] = new Circle("indigo",false,3.5);

        System.out.println("Pre-sorted: ");
        for (Circle c : circl) {
            System.out.println(c);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circl, circleComparator);
        System.out.println("After-sorted: ");
        for (Circle c : circl) {
            System.out.println(c);
        }
    }
}
