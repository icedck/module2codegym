import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        point2D point2D = new point2D();
        System.out.println(point2D);

        point2D = new point2D(3,4);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));



        point3D p3D = new point3D();
        System.out.println(p3D);

        p3D = new point3D(3,4,5);
        System.out.println(p3D);
        p3D.setXYZ(6,7,8);
        System.out.println(p3D);
        System.out.println(Arrays.toString(p3D.getXYZ()));
    }
}