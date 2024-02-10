package chapterThree;


import java.util.Arrays;

public class ArrayList {

    private boolean isEmpty = false;
    private int size;

    private String[] array = new String[3];


    public boolean isEmpty() {
        return size == 0 ;
    }

    public void add(String element) {
        if (size == array.length) {
            resize();
        }
            array[size] = element;
            size++;


    }

    private void resize() {
        String[] newArray = new String[array.length * 2];
            for(int copy = 0; copy < array.length; copy++){
                newArray[copy] = array[copy];
            }
        array = newArray;
    }

    public int checkSize() {
        return size;
    }

    public void remove(String element) {
        for(int selectElement = 0; selectElement < size; selectElement++){
            if (array[selectElement].equals(element)){

                for(int moveElement =selectElement; moveElement < size - 1; moveElement++ ){
                    array[moveElement] = array[moveElement + 1];

                }

                array[size - 1] = element;
                size--;
            }


        }
    }

    public String getElement(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index" + index + "Out Of Bound" + size);
        }
        return array[index];
    }


    public int insert(int index, String element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index" + index + "Out Of Bound" + size);
        }

            if(size == array.length){
                resize();
            }
                for(int shiftElement = size - 1; shiftElement >= index; shiftElement-- ){
                    array[shiftElement - 1] = array[shiftElement];
                }
        array[index] = element;
        size++;
        return index;
    }

}

