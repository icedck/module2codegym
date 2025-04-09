import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice = -1;
        double doC, doF;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    doF = sc.nextDouble();
                    System.out.println("Celsius = " + fahrenheitToCelsius(doF));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    doC = sc.nextDouble();
                    System.out.println("Fahrenheit = " + celsiusToFahrenheit(doC));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = 5.0 / 9 * (fahrenheit - 32) ;
        return celsius;
    }
}
