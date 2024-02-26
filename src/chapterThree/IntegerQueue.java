package chapterThree;

import java.util.ArrayList;

public class IntegerQueue {
    private ArrayList<Integer> elements;

    public IntegerQueue() {
        elements = new ArrayList<>();
    }

    public void enqueue(int item) {
        elements.add(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public int peek() {
        return 0;
    }
}
