import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Thông tin tam giác:");
        System.out.println(triangle.toString());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());
    }
}