package chapterThree;

public class FireDrillFive {

    public boolean[] check(int[] array){
        boolean[] Array = new boolean[5];
        boolean check1 = false;
        for(int check = 0; check < array.length; check++){
            check1 = array[check] % 2 != 0;
            Array[check] = check1;
        }
        return Array;
    }


    public boolean[] check2(int... numbers){
        boolean[] result =  new boolean[numbers.length];
        for(int check2 = 0; check2 < numbers.length; check2++){
            result[check2] = numbers[check2] % 2 != 0;

        }
        return result;
    }


    public int[]  getArrayLength(int[] array ) {
        return new int[array.length];
    }

    public int[] newArrayLen(int[] outputArray){
        return new int[10];
    }

}

