package stream;

import java.util.Arrays;

public class Exercise01 {
    public int sumEvenSubtractOdd(final int[] numbers) {
        return Arrays.stream(numbers).map(n -> n % 2 == 0 ? n : -n).sum();
    }
}
