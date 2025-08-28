package stream;

import java.util.Arrays;

public class Exercise04 {
    public int[] sortByDictionaryOrder(final int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(String::compareTo)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
