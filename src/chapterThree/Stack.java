package chapterThree;

public class Stack {
    private boolean isEmpty= false;
    private int[] stackArray = new int[1];

    private int size = 0;


    public boolean isEmpty() {
        return true;
    }

    public int CheckSize() {
        return size;
    }

    public void push(int num) {
        if (size == stackArray.length) {
            resize();
        }
        stackArray[size] = num;
        size++;
    }

   public void resize(){
        int[] newStackArray = new int[stackArray.length * 2];

            for(int copy = 0 ; copy < stackArray.length; copy++){
                newStackArray[copy] = stackArray[copy];

            }
                stackArray = newStackArray;
    }


    public int popp() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }

        int poppedElement = stackArray[size - 1];
        size--;

        return poppedElement;
    }

}
