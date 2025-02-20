import java.util.HashSet;
import java.util.Set;

public class Symmetricdifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (Integer num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
