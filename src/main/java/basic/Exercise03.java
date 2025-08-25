package basic;

public class Exercise03 {
    public String factorizePrime(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                if (result.length() != 0) {
                    result.append(" * ");
                }
                result.append(i);
                n /= i;
            }
        }

        if (n > 1) {
            if (result.length() != 0) {
                result.append(" * ");
            }
            result.append(n);
        }

        return result.toString();
    }
}
