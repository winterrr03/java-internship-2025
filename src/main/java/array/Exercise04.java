package array;

public class Exercise04 {
    public int[] mergeSortedArrays(final int[] arr1, final int[] arr2) {
        final int arr1Length = arr1.length;
        final int arr2Length = arr2.length;
        int[] result = new int[arr1Length + arr2Length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
                continue;
            }

            result[k++] = arr2[j++];
        }

        while (i < arr1Length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2Length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
