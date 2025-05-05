import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String regex = "^\\d{2}-[0]\\d{9}";

        System.out.print("Please enter a valid phone number: ");
        String phone = sc.nextLine();
        if (phone.matches(regex)) {
            System.out.println("Valid phone number");
        }else {
            System.out.println("Invalid phone number");
        }
    }
}