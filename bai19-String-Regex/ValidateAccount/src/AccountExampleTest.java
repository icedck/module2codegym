import java.util.Scanner;

public class AccountExampleTest {
    static Scanner sc = new Scanner(System.in);
    static AccountExample accountExample;

    public static void main(String[] args) {
        System.out.print("Enter account: ");
        String account = sc.nextLine();

        accountExample = new AccountExample();
        boolean valid = accountExample.validate(account);
        System.out.println(account + ": " + valid);
    }
}
