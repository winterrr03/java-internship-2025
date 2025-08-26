package basic;

public class Exercise08 {
    private static final int[] VALUES = {
            1000, 900, 500, 400, 100,
            90, 50, 40, 10, 9, 5, 4, 1
    };
    
    private static final String[] SYMBOLS = {
            "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I"
    };

    public String convertToRoman(final int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number must be in range 1–3999");
        }

        final StringBuilder roman = new StringBuilder();
        int n = number;

        for (int i = 0; i < VALUES.length; i++) {
            while (n >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                n -= VALUES[i];
            }
        }

        return roman.toString();
    }
}
