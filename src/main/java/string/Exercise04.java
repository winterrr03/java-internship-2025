package string;

public class Exercise04 {
    public String compressString(final String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        final StringBuilder result = new StringBuilder();
        final int len = text.length();
        int count = 1;

        for (int i = 1; i < len; i++) {
            if (text.charAt(i - 1) == text.charAt(i)) {
                count++;
                continue;
            }

            result.append(text.charAt(i - 1));
            if (count > 1) {
                result.append(count);
            }
            count = 1;
        }

        result.append(text.charAt(len - 1));
        if (count > 1) result.append(count);

        return result.toString();
    }
}
