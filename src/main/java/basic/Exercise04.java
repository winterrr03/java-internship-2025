package basic;

public class Exercise04 {
    public String generateFibonacciUpTo(final int n) {
        if (n < 1) return "";

        final StringBuilder result = new StringBuilder();
        int a = 1, b = 1;
        result.append(a).append(" ").append(b);

        for (int c = a + b; c <= n; c = a + b) {
            result.append(" ").append(c);
            a = b;
            b = c;
        }

        return result.toString();
    }
}
