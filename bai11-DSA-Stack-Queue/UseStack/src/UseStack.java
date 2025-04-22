import java.util.Arrays;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        int[] reversedArr = new int[arr.length];
        int i = 0;
        while (!stack.isEmpty()) {
            reversedArr[i++] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed Stack: " + Arrays.toString(reversedArr));
    }
}
