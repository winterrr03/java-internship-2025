package string;

public class Exercise05 {
    public String decompressString(final String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        final StringBuilder result = new StringBuilder();
        final int len = text.length();
        int i = 0;

        while (i < len) {
            char ch = text.charAt(i);
            int count = 0;
            i += 1;

            while (i < len && Character.isDigit(text.charAt(i))) {
                count = count * 10 + (text.charAt(i) - '0');
                i++;
            }

            result.append(String.valueOf(ch).repeat(Math.max(1, count)));
        }

        return result.toString();
    }
}
