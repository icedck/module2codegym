import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD can chuyen sang VND");
        long usd = sc.nextLong();
        long vnd = usd * 23000;
        System.out.printf("VND = %d", vnd);
    }
}
