public class FirstNegativeNumber {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, -4, 6, -2 };
        System.out.println("First negative number index: " + findFirstNegative(arr));
    }
}
