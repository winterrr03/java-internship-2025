package string;

public class Exercise03 {
    private boolean isRepeatedPattern(final String str, final int subLength, final int strLength) {
        final int repeatCount = strLength / subLength;

        if (repeatCount == 1) return false;

        for (int i = 0; i < subLength; i++) {
            for (int j = 1; j < repeatCount; j++) {
                if (str.charAt(i) != str.charAt(j * subLength + i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isRepeatedSubstring(final String str) {
        if (str == null || str.length() <= 1) {
            return false;
        }

        final int strLength = str.length();

        for (int subLength = 1; subLength * subLength <= strLength; subLength++) {
            if (strLength % subLength == 0) {
                if (isRepeatedPattern(str, subLength, strLength) ||
                        isRepeatedPattern(str, strLength / subLength, strLength)) {
                    return true;
                }
            }
        }

        return false;
    }
}
