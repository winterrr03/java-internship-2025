package array;

public class Exercise05 {
    public int findMissingNumber(final int[] arr) {
        final int realArrLength = arr.length + 1;
        final int expectedSum = realArrLength * (realArrLength + 1) / 2;
        int actualSum = 0;

        for (int n : arr) {
            actualSum += n;
        }

        return expectedSum - actualSum;
    }
}
