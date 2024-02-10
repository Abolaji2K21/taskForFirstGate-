package chapterThree;

public class Stack {
    private boolean isEmpty= false;
    private int[] stackArray = new int[5];

    private int size = 0;


    public boolean isEmpty() {
            return size ==0;
    }

    public int CheckSize() {
        return size;
    }

    public void push(int num) {
        if (size == stackArray.length) {
            throw new StackOverflowError("Stack is full and cannot be resized");
        }
        stackArray[size] = num;
        size++;
    }



    public int popp() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Stack is empty");

        int poppedElement = stackArray[size - 1];
        size--;

        return poppedElement;
    }

    public int peek() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Stack is empty");

        return stackArray[size - 1];
    }

}
