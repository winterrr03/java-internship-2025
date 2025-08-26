package basic;

public class Exercise02 {
    public int getSumOfDigits(final int n) {
        return n > 0 ? (n % 10 + getSumOfDigits(n / 10)) : 0;
    }
}
