package chapterThree;

public class Set {

    private boolean isEmpty = false;

    private int[] array = new int[1];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addToMySet(int num) {
        if (checkElement(num)){
            return;
        }
        if (size == array.length){
            resize();
        }

        array[size] = num;
        size++;
    }

    private void resize() {
        int[] newArray = new int[array.length *2];
            for(int moveNum = 0 ; moveNum < size; moveNum++){
                newArray[moveNum] = array[moveNum];
            }
            array = newArray;
    }

    public int checkSize(){
        return size;
    }

    public void removeFromSet(int num) {
        for(int selectNum = 0 ; selectNum < size ; selectNum++){
            if (array[selectNum] == num ){
                for(int moveNum = selectNum; moveNum < size -1 ; moveNum++  ){;
                    array[moveNum] = array[moveNum + 1];
                }
                array[size -1] = num;
                size--;

            }
        }
    }

    public int getElement(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index" + index + "Out Of Bound" + size);
        }
        return array[index];
    }
     public boolean checkElement(int num){
        for(int check = 0; check < size ; check++){
            if(array[check] == num){
                return  true;
            }
        }
        return false;
     }

     public boolean contain(int num){
        for(int check = 0 ; check < size; check++){
            if(array[check] == num){
                return  true;
            }
        }
        return false;
     }

}
