package chapterThree;

import chapterThree.IntegerQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerQueueTest {

    @Test
    void testEnqueueAndDequeue() {
        IntegerQueue queue = new IntegerQueue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.enqueue(5);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());

        int dequeuedItem = queue.dequeue();
        assertEquals(5, dequeuedItem);
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    void testEmptyQueueDequeue() {
        IntegerQueue queue = new IntegerQueue();
        assertTrue(queue.isEmpty());
        assertThrows(IllegalStateException.class,() -> queue.dequeue());
    }

    @Test
    void testPeekAfterEnqueue(){
        IntegerQueue queue = new IntegerQueue();
        queue.enqueue(100);
        assertEquals(100, queue.peek());
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
    }
}
