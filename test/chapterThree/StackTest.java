package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack myStack;

    @BeforeEach
    void setMyStack(){
        myStack = new Stack();
    }

    @Test
    void testThatThatIHaveAnEmptyArray(){assertTrue(myStack.isEmpty());
    }

    @Test
    void testThatTheLengthOfMyStackCanBeDetermined(){
        myStack.CheckSize();
        int expected = 0;
         assertEquals(expected,myStack.CheckSize());
    }

    @Test
    void testThatThePushFunctionalityWorks(){
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.CheckSize();
        int expected = 3;
        assertEquals(expected,myStack.CheckSize());



    }

    @Test
    void testThatTheCheckSizeFunctionalityWorks(){
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.CheckSize();
        int expected = 2;
        assertEquals(expected,myStack.CheckSize());

    }

    @Test
    void testThatThePopFunctionalityWorks(){
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int actual = myStack.popp();
        int expected1 = 5 ;
        assertEquals(expected1,actual);


    }

    @Test
    void testThatThePopFunctionalityWorksAndCheckSize(){
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int actual = myStack.popp();
        int expected1 = 5 ;
        assertEquals(expected1,actual);
        assertEquals(4,myStack.CheckSize());



        int actual1 = myStack.popp();
        int expected2 = 4 ;
        assertEquals(expected2,actual1);
        assertEquals(3,myStack.CheckSize());


    }

    @Test
    void testThatThePeekFunctionalityWorks(){
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int actual = myStack.peek();
        int expected1 = 5 ;
        assertEquals(expected1,actual);
    }

    @Test
    void testThatThePeekFunctionalityWorksAndCheckSize(){
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int actual = myStack.peek();
        int expected1 = 5 ;
        assertEquals(expected1,actual);
        assertEquals(5,myStack.CheckSize());


    }

    @Test
    void testThatMyStackIsFull(){
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        assertEquals(5,myStack.CheckSize());
        assertThrows(StackOverflowError.class, () -> myStack.push(6));



    }
    @Test
    void testThatMyStackIsPoppedWhenEmpty() {
        assertTrue(myStack.isEmpty());

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myStack.popp());
    }
}
