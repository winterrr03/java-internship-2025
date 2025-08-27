package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06Test {

    private final Exercise06 exercise06 = new Exercise06();

    @Test
    void shouldReturnTrue_WhenBarcodeIsValid_OK() {
        assertTrue(exercise06.isValidEAN13("8938505974194"));
        assertTrue(exercise06.isValidEAN13("8935217400157"));
        assertTrue(exercise06.isValidEAN13("6939554906626"));
    }

    @Test
    void shouldReturnFalse_WhenBarcodeIsInvalid_OK() {
        assertFalse(exercise06.isValidEAN13(null));
        assertFalse(exercise06.isValidEAN13("89385059741949"));
        assertFalse(exercise06.isValidEAN13("893521740015"));
        assertFalse(exercise06.isValidEAN13("693955490Z626"));
        assertFalse(exercise06.isValidEAN13("ABCDEFGHIJKLM"));
    }
}
