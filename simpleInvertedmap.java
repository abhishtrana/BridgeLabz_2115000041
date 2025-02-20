import java.util.*;

public class simpleInvertmap {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (String key : inputMap.keySet()) {
            int value = inputMap.get(key);
            invertedMap.putIfAbsent(value, new ArrayList<>());
            invertedMap.get(value).add(key);
        }
        System.out.println(invertedMap);
    }
}
