package basic;

public class Exercise03 {
    public String factorizePrime(final int n) {
        final StringBuilder result = new StringBuilder();

        int value = n;
        for (int i = 2; i * i <= value; i++) {
            while (value % i == 0) {
                if (result.length() != 0) {
                    result.append(" * ");
                }
                result.append(i);
                value /= i;
            }
        }

        if (value > 1) {
            if (result.length() != 0) {
                result.append(" * ");
            }
            result.append(value);
        }

        return result.toString();
    }
}
