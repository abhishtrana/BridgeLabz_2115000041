import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        System.out.println(hasPairWithSum(arr, target) ? "Pair exists" : "No pair exists");
    }
}

