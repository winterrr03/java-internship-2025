package stream;

import java.util.Arrays;

public class Exercise02 {
    public int findMissingNumber(final int[] arr) {
        final int realArrLength = arr.length + 1;
        final int expectedSum = realArrLength * (realArrLength + 1) / 2;
        final int actualSum = Arrays.stream(arr).sum();

        return expectedSum - actualSum;
    }
}
