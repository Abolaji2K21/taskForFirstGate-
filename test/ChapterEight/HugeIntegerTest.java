package ChapterEight;

import ChapterEight.HugeInteger;
import ChapterEight.HugeIntegerMotherException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    @Test
    public void testEmptyInput() {
        assertThrows(HugeIntegerMotherException.class, () -> new HugeInteger(""));
    }

    @Test
    public void testSingleDigitInput() {
        HugeInteger num = new HugeInteger("5");
        assertEquals("5", num.toString());
    }

    @Test
    public void testMaximumDigitLength() {
        HugeInteger num = new HugeInteger("1234567890123456789012345678901234567890");
        assertEquals("1234567890123456789012345678901234567890", num.toString());
    }

    @Test
    public void testNumberGreaterThan40Digits() {
        assertThrows(HugeIntegerMotherException.class, () -> new HugeInteger("1234567890123456789012345678901234567890123456"));
    }

    @Test
    public void testNegativeNumber() {
        HugeInteger num = new HugeInteger("-12345");
        assertEquals("-12345", num.toString());
    }

    @Test
    public void testLargeNegativeNumber() {
        HugeInteger num = new HugeInteger("-9999999999999999999999999999999999999999");
        assertEquals("-9999999999999999999999999999999999999999", num.toString());
    }

    @Test
    public void testPositiveNumberWithLeadingZeros() {
        HugeInteger num = new HugeInteger("00012345");
        assertEquals("12345", num.toString());
    }

    @Test
    public void testPositiveNumberWithTrailingZeros() {
        HugeInteger num = new HugeInteger("12345000");
        assertEquals("12345000", num.toString());
    }

    @Test
    public void testPositiveNumberWithLeadingAndTrailingZeros() {
        HugeInteger num = new HugeInteger("00012345000");
        assertEquals("12345000", num.toString());
    }

    @Test
    public void testPositiveNumberWithAllZeros() {
        HugeInteger num = new HugeInteger("0000");
        assertEquals("0", num.toString());
    }

    @Test
    public void testNegativeNumberWithLeadingZeros() {
        HugeInteger num = new HugeInteger("-00012345");
        assertEquals("-12345", num.toString());
    }

    @Test
    public void testNegativeNumberWithTrailingZeros() {
        HugeInteger num = new HugeInteger("-12345000");
        assertEquals("-12345000", num.toString());
    }

    @Test
    public void testNegativeNumberWithLeadingAndTrailingZeros() {
        HugeInteger num = new HugeInteger("-00012345000");
        assertEquals("-12345000", num.toString());
    }

    @Test
    public void testNegativeNumberWithAllZeros() {
        HugeInteger num = new HugeInteger("-0000");
        assertEquals("0", num.toString());
    }

    @Test
    public void testEqualPositiveNumbers() {
        HugeInteger num1 = new HugeInteger("12345");
        HugeInteger num2 = new HugeInteger("12345");
        assertTrue(num1.isEqualTo(num2));
    }

    @Test
    public void testEqualNegativeNumbers() {
        HugeInteger num1 = new HugeInteger("-12345");
        HugeInteger num2 = new HugeInteger("-12345");
        assertTrue(num1.isEqualTo(num2));
    }

    @Test
    public void testUnequalPositiveNumbers() {
        HugeInteger num1 = new HugeInteger("12345");
        HugeInteger num2 = new HugeInteger("54321");
        assertFalse(num1.isEqualTo(num2));
    }

    @Test
    public void testUnequalNegativeNumbers() {
        HugeInteger num1 = new HugeInteger("-12345");
        HugeInteger num2 = new HugeInteger("-54321");
        assertFalse(num1.isEqualTo(num2));
    }

    @Test
    public void testPositiveNumberSubtractNegativeNumber() {
        HugeInteger num1 = new HugeInteger("12345");
        HugeInteger num2 = new HugeInteger("-54321");
        HugeInteger result = num1.subtract(num2);
        assertEquals("66666", result.toString());
    }

    @Test
    public void testNegativeNumberSubtractPositiveNumber() {
        HugeInteger num1 = new HugeInteger("-12345");
        HugeInteger num2 = new HugeInteger("54321");
        HugeInteger result = num1.subtract(num2);
        assertEquals("-66666", result.toString());
    }
}
