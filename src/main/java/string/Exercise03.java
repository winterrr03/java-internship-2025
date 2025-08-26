package string;

public class Exercise03 {
    public boolean isRepeatedSubstring(final String str) {
        if (str == null || str.length() <= 1) {
            return false;
        }

        final int n = str.length();
        final int[] lps = new int[n];
        int len = 0;

        for (int i = 1; i < n; i++) {
            while (len > 0 && str.charAt(i) != str.charAt(len)) {
                len = lps[len - 1];
            }
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
            }
        }

        return len > 0 && n % (n - len) == 0;
    }
}
