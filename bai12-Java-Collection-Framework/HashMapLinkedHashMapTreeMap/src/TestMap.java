import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println("Display");
        System.out.println(map + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Display key");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 3);
        linkedHashMap.put("c", 1);
        linkedHashMap.put("d", 2);
        System.out.println("Display " + "c" + linkedHashMap.get("c"));
    }
}
