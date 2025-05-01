import java.util.Stack;

public class BracketChecker {
    public static boolean isBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if(c == '}' || c == ']' || c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }

                char leftChar = stack.pop();
                if(!isMatch(leftChar, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String[] test = {"s * (s - a) * (s - b) * (s - c)",
                "(- b + (b2 - 4*a*c)^0.5) / 2*a",
                "s * (s - a) * (s - b * (s - c)",
                "s * (s - a) * s - b) * (s - c)",
                "(- b + (b^2 - 4*a*c)^(0.5/ 2*a))"};

        for (String s : test) {
            System.out.println(s + " -> " + (isBracket(s) ? "well" : "not well"));
        }
    }
}
