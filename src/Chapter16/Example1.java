package Chapter16;

import java.util.*;

public class Example1{


    public static void main(String[] args) {
        /**
         * Boolean
         * Byte
         * Short
         * Character
         * Integer
         * Long
         * Float
         * Double
         */


//        Collection<String> words = new ArrayList<>();
//        Collection<String> words = new PriorityQueue<>();
        Collection<String> words = new TreeSet<>();
        words.add("Happpy ");
        words.add("Happpy ");
        words.add("Happpy ");
        words.add("Happpy ");
        words.add("Happpy ");
        words.add("Happpy ");
        words.add("Happpy ");

        System.out.println(words);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        List<Integer> numbers2= new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);
        numbers.add(4);
        Set<List<Integer>> set = new HashSet<>();
        set.add(numbers);
        set.add(numbers2);

        System.out.println(set);

//
//        char c = '0';
//
//        Character b1 = c;
//        System.out.println("char:" + c);
//        System.out.println("Character:" + b1);

//        int c = '0';

//        Integer b1 = c;
//        System.out.println("char:" + c);
//        System.out.println("Character:" + b1);

    }

}
