import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = in.nextInt();
        System.out.println("So vua nhap: " + n);
//        double radius = 1;
//        System.out.println(radius > 0);
        if (n % 2 == 0)
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is odd.");
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday"); break;
            case 0:
            case 6: System.out.println("Weekend");
        }
    }

}