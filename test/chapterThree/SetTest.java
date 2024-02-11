package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set mySet;

    @BeforeEach
    void setMySet(){
        mySet = new Set();
    }

    @Test
    void testThatMySetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    void testThatMySetSizeCanBeDetermine(){
        assertTrue(mySet.isEmpty());

        assertEquals(0, mySet.checkSize());

    }

    @Test
    void testThatMyAddFunctionalityWorks(){
        assertTrue(mySet.isEmpty());

        mySet.addToMySet(7);
        assertEquals(1, mySet.checkSize());

    }


    @Test
    void testThatMyContainFunctionalityWorks(){
        assertTrue(mySet.isEmpty());

        mySet.addToMySet(7);
        mySet.addToMySet(2);
        mySet.addToMySet(3);

        assertTrue(mySet.contain(2));
    }

    @Test
    void testThatMyContainFunctionalityWorksAndReturnFalse(){
        assertTrue(mySet.isEmpty());

        mySet.addToMySet(7);
        mySet.addToMySet(2);
        mySet.addToMySet(3);

        assertFalse(mySet.contain(4));
    }


    @Test
    void testThatMyAddFunctionalityCanNotAddTwoUniqueNumbersToMySet(){
        assertTrue(mySet.isEmpty());

        mySet.addToMySet(7);
        mySet.addToMySet(2);
        mySet.addToMySet(4);
        assertEquals(3, mySet.checkSize());


        mySet.addToMySet(7);
        mySet.addToMySet(2);



        assertEquals(3, mySet.checkSize());

    }


    @Test
    void testThatResizeFunctionalityWorks(){
        assertTrue(mySet.isEmpty());

        mySet.addToMySet(7);
        mySet.addToMySet(8);
        mySet.addToMySet(9);
        mySet.addToMySet(2);

        assertEquals(4, mySet.checkSize());

    }

    @Test
    void testThatMyRemoveFunctionalityWorks(){
        assertTrue(mySet.isEmpty());
        mySet.addToMySet(7);
        mySet.addToMySet(8);
        mySet.addToMySet(9);
        assertEquals(3, mySet.checkSize());

        mySet.removeFromSet(9);
        mySet.removeFromSet(8);

        assertEquals(1, mySet.checkSize());


    }

    @Test
    void testThatWeGetElementInMySet() {
        assertTrue(mySet.isEmpty());
        mySet.addToMySet(2);
        mySet.addToMySet(4);
        mySet.addToMySet(6);

        int actual1 = mySet.checkSize();
        int expected1 = 3;
        assertEquals(expected1, actual1);

        int actual2 = mySet.getElement(1);
        int expected2 = 4;
        assertEquals(expected2, actual2);
        int actual3 = mySet.getElement(0);
        int expected3 = 2;
        assertEquals(expected3, actual3);

        int actual4 = mySet.getElement(2);
        int expected4 = 6;
        assertEquals(expected4, actual4);

    }


}
