import java.util.*;

public class maxKeyvalue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxKey = key;
            }
        }

        System.out.println("Key with highest value: " + maxKey);
    }
}
