package array;

public class Exercise01 {
    public int sumEvenSubtractOdd(final int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int result = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                result += n;
                continue;
            }

            result -= n;
        }

        return result;
    }
}
