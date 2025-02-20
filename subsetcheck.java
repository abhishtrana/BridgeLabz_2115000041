import java.util.HashSet;
import java.util.Set;

public class subsetcheck{
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        for (Integer num : set1) {
            if (!set2.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(isSubset(set1, set2));
    }
}
