package array;

public class Exercise03 {
    public void reverseArray(final int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            left++;
            right--;
        }
    }
}
