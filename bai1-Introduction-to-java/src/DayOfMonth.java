import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.print("Thang nay co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.print("Thang nay co 30 ngay");
                break;
            case 2:
                System.out.print("Thang nay co 28 ngay hoac 29 ngay");
                break;
            default:
                System.out.print("Khong co thang nay");
                break;
        }
    }
}
