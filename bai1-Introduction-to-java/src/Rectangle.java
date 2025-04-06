import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float height, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextFloat();
        System.out.println("Area = " + (height * width));
    }
}
