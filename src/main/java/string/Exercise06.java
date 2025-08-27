package string;

public class Exercise06 {
    public boolean isValidEAN13(final String barcode) {
        if (barcode == null || barcode.length() != 13) {
            return false;
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < barcode.length(); i++) {
            char ch = barcode.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }

            int digit = ch - '0';

            if (i % 2 == 0) {
                sumOdd += digit;
                continue;
            }

            sumEven += digit;
        }

        return (sumOdd + 3 * sumEven) % 10 == 0;
    }
}
