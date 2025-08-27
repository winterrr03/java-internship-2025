package array;

public class Exercise02 {
    public int binarySearch(final int[] arr, final int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
                continue;
            }

            right = mid - 1;
        }

        return -1;
    }
}
