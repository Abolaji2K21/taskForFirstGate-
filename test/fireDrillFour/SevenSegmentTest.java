package fireDrillFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentTest {

    @Test
    void testThatOnceTheLastInputIsZeroItDoesntWork() {
        SevenSegment mySegment = new SevenSegment();

        mySegment.displaySegment("10011100");
        assertFalse(mySegment.isOn());
    }

    @Test
    void testThatOnceTheLastInputIsOneItDoesWork() {
        SevenSegment mySegment = new SevenSegment();

        mySegment.displaySegment("10011101");
        assertTrue(mySegment.isOn());
    }

    @Test
    public void testDisplaySegmentZero() {
        SevenSegment segment = new SevenSegment();

        assertEquals("""
                # # # #
                #     #
                #     #
                #     #
                # # # #
                """, segment.displaySegment("11111101"));
    }

//    @Test
//    public void testDisplaySegmentOne() {
//        SevenSegment segment = new SevenSegment();
//
//        assertEquals("""
//                # # # #
//                #     #
//                #     #
//                #     #
//                # # # #
//                """, segment.displaySegment("11111101"));
//
//        assertEquals("""
//                # # # #
//                      #
//                # # # #
//                #
//                # # # #
//                """, segment.displaySegment("11011011"));
//    }


    @Test
    void testThatYouCanValidateTheSegment(){
        SevenSegment mySegment = new SevenSegment();
        assertThrows(IllegalArgumentException.class, () -> mySegment.displaySegment("11111111199"));

    }

    @Test
    void testThatYouCanValidateTheSegmentAgainUsingLength(){
        SevenSegment mySegment = new SevenSegment();
        assertThrows(IllegalArgumentException.class, () -> mySegment.displaySegment("1110001"));

    }


}