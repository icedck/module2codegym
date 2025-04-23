import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        String string = "code gym, gym code, gym code, gym code, gym code";

        String[] words = string.split("[\\s.,!?]+");
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            map.put(lowerCaseWord, map.getOrDefault(lowerCaseWord, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
