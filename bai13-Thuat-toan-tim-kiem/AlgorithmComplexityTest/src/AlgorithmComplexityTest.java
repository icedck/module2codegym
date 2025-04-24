import java.util.*;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine().toLowerCase();

//        int[] frequentChar = new int[255];
//        for (int i = 0; i < inputString.length(); i++) {
//            int index = (int) inputString.charAt(i);
//            frequentChar[index]++;
//        }
//
//        int max = 0;
//        char character = (char) 255;
//        for (int i = 0; i < 255; i++) {
//            if (frequentChar[i] > max) {
//                max = frequentChar[i];
//                character = (char) i;
//            }
//        }
//        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

        String[] inputArray = inputString.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (map.containsKey(inputArray[i])) {
                map.put(inputArray[i], map.get(inputArray[i]) + 1);
            }else {
                map.put(inputArray[i], 1);
            }
        }

        Set<String> entrySet = map.keySet();
        int max = 0;
        String maxKey = "";
        for (String key: entrySet) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }
        System.out.println("ki tu tra nhieu nhat " + maxKey + ": " + max);
    }
}
