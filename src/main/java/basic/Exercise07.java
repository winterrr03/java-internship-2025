package basic;

public class Exercise07 {
    public int reverseBinary(final int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        int n = number;
        int reversed = 0;

        while (n > 0) {
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
        }

        return reversed;
    }
}
