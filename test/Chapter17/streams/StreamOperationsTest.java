package Chapter17.streams;

import org.junit.jupiter.api.Test;

import static Chapter17.streams.StreamOperations.getEvenNumbersOf;
import static Chapter17.streams.StreamOperations.mapCodePointToCharacter;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StreamOperationsTest {
    @Test
    public void testStreamOperations() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> number2 = getEvenNumbersOf(number);

        assertNotNull(number2);
        assertEquals(5, number2.size());
}



    @Test
    public void testMapCodePointToCharacter() {
        List<Integer> codePoint = List.of(65, 97, 98, 66, 69,48);
        Map<Integer, String> mapPoint = mapCodePointToCharacter(codePoint);
        assertNotNull(mapPoint);
        Map<Integer, String> expected = Map.of(
                48, "0",
                65, "A",
                97, "a",
                98, "b",
                66, "B",
                69, "E"

        );
        assertEquals(expected, mapPoint);
}

    @Test
    public void testGetNumbersFormatted() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = StreamOperations.getNumbersFormatted(number);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
                assertNotNull(result);
                assertTrue(result.startsWith("["));
                assertTrue(result.endsWith("]"));
                assertEquals(expected,result);
    }
}