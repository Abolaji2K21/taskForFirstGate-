package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    private ArrayList myArrayList;
    @BeforeEach
    void setUp() {
        myArrayList = new ArrayList();

    }

    @Test
    void testThatThatIHaveAnEmptyArray(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    void testThatMyArrayListIsNotEmpty(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        int actual = myArrayList.checkSize();
        int expected = 1;
        assertEquals(expected, actual);
        assertFalse(myArrayList.isEmpty());


    }

    @Test
    void testThatMyArrayListCanAddMoreThanOne(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        int actual = myArrayList.checkSize();
        int expected = 2;
        assertEquals(expected, actual);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    void testThatWeKnowTheSizeOfMyArray(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("Dayo");
        int actual = myArrayList.checkSize();
        int expected = 3;
        assertEquals(expected, actual);


    }
    @Test
    void testThatWeCanRemoveElementToMyArray(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        int actual1 = myArrayList.checkSize();
        int expected1 = 2;
        assertEquals(expected1, actual1);
        myArrayList.remove("JuMoke");
        int actual2 = myArrayList.checkSize();
        int expected2 = 1;
        assertEquals(expected2, actual2);

    }

    @Test
    void testThatWeRemoveElementTwice(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        int actual1 = myArrayList.checkSize();
        int expected1 = 2;
        assertEquals(expected1, actual1);
        myArrayList.remove("JuMoke");
        myArrayList.remove("Moh Baba");

        int actual2 = myArrayList.checkSize();
        int expected2 = 0;
        assertEquals(expected2, actual2);

    }

    @Test
    void testThatWeRemoveElementInTheMiddleIndex(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("Moh Baba1");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);
        myArrayList.remove("JuMoke");

        int actual2 = myArrayList.checkSize();
        int expected2 = 2;
        assertEquals(expected2, actual2);

    }

    @Test
    void testThatWeGetElementInTheMiddleIndex(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("BeeJay");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);

        String actual2 = myArrayList.getElement(1);
        String expected2 ="JuMoke";

        assertEquals(expected2, actual2);

    }

    @Test
    void testThatWeCanRemoveTheMiddleElementAndTheThirdElmentMovesToTheMiddle(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("BeeJay");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);
        myArrayList.remove("JuMoke");

        int actual2 = myArrayList.checkSize();
        int expected2 = 2;
        assertEquals(expected2, actual2);

        String actual3 = myArrayList.getElement(1);
        String expected3 ="BeeJay";

        assertEquals(expected3, actual3);

    }

    @Test
    void testThatMyResizeFuctionsWorks_Increase() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("BeeJay");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);

        myArrayList.add("Dayo");
        int actual2 = myArrayList.checkSize();
        int expected2 = 4;
        assertEquals(expected2, actual2);
    }

    @Test
    void testThatMyResizeFuctionsWorks_Decrease() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("BeeJay");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);

        myArrayList.add("Dayo");
        myArrayList.add("Timi");
        myArrayList.add("Eniola");

        int actual2 = myArrayList.checkSize();
        int expected2 = 6;
        assertEquals(expected2, actual2);
        myArrayList.remove("Dayo");
        myArrayList.remove("BeeJay");

        int actual3 = myArrayList.checkSize();
        int expected3 = 4;
        assertEquals(expected3, actual3);




    }
    @Test
    void testThatMyInsertFuctionsWorks() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("Moh Baba");
        myArrayList.add("JuMoke");
        myArrayList.add("BeeJay");

        int actual1 = myArrayList.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);

        myArrayList.insert(2, "Lumbago");
        String actual2 = myArrayList.getElement(2);
        String expected2 ="Lumbago";
        assertEquals(expected2, actual2);
    }




    }