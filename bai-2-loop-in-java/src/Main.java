import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int start = 10;
        int count = 0;
        while (count < 5) {
            if (start % 2 == 0) {
                System.out.println(start);
                count++;
            }
            start++;
        }
    }
}