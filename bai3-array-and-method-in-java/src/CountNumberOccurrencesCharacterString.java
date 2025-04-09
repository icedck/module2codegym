import java.util.Scanner;

public class CountNumberOccurrencesCharacterString {
    public static void main(String[] args) {
        String a = "hello";
        String s;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a char: ");
            s = sc.nextLine();
            char findChar = s.charAt(0);
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == findChar) {
                    count++;
                }
            }
            if (s.length() > 1 || s.length() < 1){
                System.out.println("Invalid input");
            }
        }while (s.length() > 1 || s.length() < 1);

        System.out.println(count);
    }
}
