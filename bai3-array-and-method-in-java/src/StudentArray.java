import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        String input = sc.nextLine();
        boolean index = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Student: " + input + " index " + i);
                index = true;
                break;
            }
        }
        if (!index) {
            System.out.println("Not found " + input + " in the list.");
        }
    }
}
