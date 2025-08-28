package stream;

import java.util.Arrays;

public class Exercise05 {
    public int sumOfLongestNumbers(final int[] numbers) {
        int maxLen = Arrays.stream(numbers)
                .map(n -> String.valueOf(n).length())
                .max()
                .orElse(0);
        
        return Arrays.stream(numbers)
                .filter(n -> String.valueOf(n).length() == maxLen)
                .sum();
    }
}
