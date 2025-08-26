package string;

public class Exercise02 {
    public int extractAndSumIntegers(final String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int sum = 0;
        final StringBuilder cur = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                cur.append(c);
            } else {
                if (!cur.isEmpty()) {
                    sum += Integer.parseInt(cur.toString());
                    cur.setLength(0);
                }
            }
        }

        if (!cur.isEmpty()) {
            sum += Integer.parseInt(cur.toString());
        }

        return sum;
    }
}
