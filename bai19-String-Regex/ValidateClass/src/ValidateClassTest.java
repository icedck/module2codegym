import java.util.Scanner;

public class ValidateClassTest {
    static Scanner sc = new Scanner(System.in);
    static ValidateClass validateClass;
    public static void main(String[] args) {
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        validateClass = new ValidateClass();
        boolean valid = validateClass.validate(className);
        System.out.println(className + ": " + valid);
    }
}
