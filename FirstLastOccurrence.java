public class FirstLastOccurrence {
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (arr[mid] == target)
                first = mid;
        }
        return first;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (arr[mid] == target)
                last = mid;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        System.out.println("First occurrence: " + findFirst(arr, target));
        System.out.println("Last occurrence: " + findLast(arr, target));
    }
}
