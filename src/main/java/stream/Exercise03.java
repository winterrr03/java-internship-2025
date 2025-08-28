package stream;

import java.util.stream.Collectors;

public class Exercise03 {
    private static final String[] DIGIT_WORDS = {
            "Zero",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine"
    };

    public String convertNumberToWords(final int number) {
        return String.valueOf(number)
                .chars()
                .mapToObj(c -> DIGIT_WORDS[c - '0'])
                .collect(Collectors.joining(", "));
    }
}
