import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money: ");
        money = sc.nextDouble();
        System.out.print("Enter the month number : ");
        month = sc.nextInt();
        System.out.print("Enter the interest rate : ");
        interestRate = sc.nextDouble();
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += money * i * (interestRate/100)/12;
        }
        System.out.println("The interest is: " + interest);
    }
}
