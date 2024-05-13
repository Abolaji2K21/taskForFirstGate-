package Chapter16;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example9 {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//        queue.add(4);
//        queue.add(4);
//        queue.add(4);
//        System.out.println(queue);
//
//        queue.offer(4);
//        queue.offer(4);
//        queue.offer(4);
//        queue.offer(4);
//        queue.offer(4);
//        queue.offer(4);
//        queue.offer(4);
//
//        System.out.println(queue);

        Comparator<Integer> comparator = (a, b) ->{
            if(b>a) return b-a;
            else return a-b;
        };
        Queue<Integer> queue1 = new PriorityQueue<>(3, comparator);
        queue1.offer(10);
        queue1.offer(20);
        queue1.offer(30);
        queue1.offer(40);
        queue1.offer(50);
        queue1.offer(60);
        System.out.println(queue1);

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
    }
}
