package fireDrillFour;

import java.util.Arrays;


public class DoubleArray {





    public int[]  getDoubleArray(int[] array ) {
        return new int[array.length * 2];
    }

    public int[] calculateDoubleArray(int[] array){
       int[] arrayCopy = getDoubleArray(array );
       int counter = 0;

       for(int count = 0; count < array.length; count++){
           arrayCopy[count] = array[count];
       }
       for(int collect = array.length ; collect < arrayCopy.length ; collect++){
           arrayCopy[collect] = array[counter] * 2;
           counter++;

       }

       return arrayCopy;
    }



    }
