//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        point p = new point();
        System.out.println(p);

        p = new point(1,2);
        System.out.println(p);


        MoveablePoint m = new MoveablePoint();
        System.out.println(m);

        m = new MoveablePoint(1,2);
        System.out.println(m);

        m = new MoveablePoint(1,2,3,4);
        System.out.println(m);

        m.move();
        System.out.println(m);
    }
}