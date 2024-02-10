package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int expected = 5;
        assertEquals(expected,myStack.CheckSize());

        myStack.popp();
        int expected1 = 4 ;
        assertEquals(expected,myStack.CheckSize());

    }


}
