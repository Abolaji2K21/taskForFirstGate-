package SevenSegmentDisplay;

import static org.junit.jupiter.api.Assertions.*;

import Exceptions.InvalidInputException;
import Exceptions.InvalidLengthException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SevenSegmentTest {

    @Test
    void convertStringInput_validInput_returnSegments() {
        SevenSegment segment = new SevenSegment();
        String input = "11111111";
        boolean[] segments = segment.convertStringInput(input);
        assertArrayEquals(new boolean[]{true, true, true, true, true, true, true, true}, segments);
    }

    @Test
    void convertStringInput_invalidInput_throwInvalidInputException() {
        SevenSegment segment = new SevenSegment();
        String input = "01234567";
        Assertions.assertThrows(InvalidInputException.class, () -> segment.convertStringInput(input));
    }

    @Test
    void convertStringInput_invalidLength_throwInvalidLengthException() {
        SevenSegment segment = new SevenSegment();
        String input = "111111111";
        assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
    }

    @Test
    void convertStringInput_emptyInput_throwInvalidLengthException() {
        SevenSegment segment = new SevenSegment();
        String input = "";
        assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
    }
    @Test
    void convertStringInput_lengthLessThanEight_throwInvalidLengthException() {
        SevenSegment segment = new SevenSegment();
        String input = "1111";
        assertThrows(InvalidLengthException.class, () -> segment.convertStringInput(input));
    }

    @Test
    void convertStringInput_inputWithSpaces_throwInvalidInputException() {
        SevenSegment segment = new SevenSegment();
        String input = "1 1 1 1 1 1 1 1";
        assertThrows(InvalidInputException.class, () -> segment.convertStringInput(input));
    }

    @Test
    void convertStringInput_inputWithOtherSymbols_throwInvalidInputException() {
        SevenSegment segment = new SevenSegment();
        String input = "11@11111";
        assertThrows(InvalidInputException.class, () -> segment.convertStringInput(input));
    }


    @Test
    void convertStringInput_invalidCharacter_throwInvalidInputException() {
        SevenSegment segment = new SevenSegment();
        String input = "11A11111";
        assertThrows(InvalidInputException.class, () -> segment.convertStringInput(input));
    }

    @Test
    void convertStringInput_allSegmentsOff_returnAllFalse() {
        SevenSegment segment = new SevenSegment();
        String input = "00000000";
        boolean[] segments = segment.convertStringInput(input);
        assertArrayEquals(new boolean[]{false, false, false, false, false, false, false, false}, segments);
    }

    @Test
    void convertStringInput_mixedInput_returnSegments() {
        SevenSegment segment = new SevenSegment();
        String input = "10011001";
        boolean[] segments = segment.convertStringInput(input);
        assertArrayEquals(new boolean[]{true, false, false, true, true, false, false, true}, segments);
    }

    @Test
    void testDisplaySevenSegment() {
        SevenSegment segment = new SevenSegment();

        String expectedAllOn = """
                    # # # #
                    #     #
                    #     #
                    #     #
                    # # # #
                    #     #
                    #     #
                    #     #
                    # # # #""";
        assertEquals(expectedAllOn, segment.displaySevenSegment("11111111"));

    }

}