import java.util.Stack;

public class UseStackString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String mWord = "word";

        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i) + "");
        }

        System.out.println(wStack.toString());

        String i = "";
        while (!wStack.isEmpty()) {
            i += wStack.pop();
        }
        System.out.println(i);
    }
}
