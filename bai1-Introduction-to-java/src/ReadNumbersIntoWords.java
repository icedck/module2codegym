import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 0 - 999: ");
        int number = sc.nextInt();
        if (number > 999 || number < 0) {
            System.out.println("out of ability");
        }else {
            String word = readNumber(number);
            System.out.println(word);
        }
    }

    // ham check
    public static String readNumber(int num) {
        if (num < 10){
            return readOnes(num);
        }else if (num < 20) {
            return readTeens(num);
        }else if (num < 100) {
            return readTens(num);
        }else {
            return readHundreds(num);
        }
    }
    // ham doc so co 1 chu so
    public static String readOnes(int num) {
        switch (num) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    // ham doc so co 2 chu so < 20
    public static String readTeens(int num) {
        switch (num){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    // ham doc so co 2 chu so > 20
    public static String readTens(int num) {
        int tens = num / 10;
        int ones = num % 10;
        String tenStr = "";
        switch (tens){
            case 2: tenStr = "twenty";
            break;
            case 3: tenStr = "thirty";
            break;
            case 4: tenStr = "forty";
            break;
            case 5: tenStr = "fifty";
            break;
            case 6: tenStr = "sixty";
            break;
            case 7: tenStr = "seventy";
            break;
            case 8: tenStr = "eighty";
            break;
            case 9: tenStr = "ninety";
            break;
        }

        if (ones > 0){
            return tenStr + " " + readOnes(ones);
        }else {
            return tenStr;
        }
    }
    // ham doc so co 3 chu so
    public static String readHundreds(int num) {
        int hundreds = num / 100;
        int remainder = num % 100;
        String hundredStr = readOnes(hundreds) + " hundred";
        if (remainder > 0){
            if (remainder < 10){
                hundredStr += " and " + readOnes(remainder);
            }else if (remainder < 20){
                hundredStr += " and " + readTeens(remainder);
            }else {
                hundredStr += " and " + readTens(remainder);
            }
        }
        return hundredStr;
    }

}

