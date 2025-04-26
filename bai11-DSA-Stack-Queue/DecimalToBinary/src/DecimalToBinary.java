import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Binary number: " + DecimalToBinary(number));
    }

    public static String DecimalToBinary(int n){
        if(n==0){
            return "0";
        }
        Stack<Integer> stack = new Stack<Integer>();
        while(n > 0){
            int i = n % 2;
            stack.push(i);
            n /= 2;
        }

        String string = "";
        while(!stack.isEmpty()){
            string += stack.pop();
        }
        return string;
    }
}
