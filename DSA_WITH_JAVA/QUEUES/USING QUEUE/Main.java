// QUEUE DATA STRUCTURE

import java.util.*;

class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // PUSH / INSERT
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // FRONT / TOP
        System.out.println(queue.peek());
        // 10

        // SIZE
        System.out.println(queue.size());
        // 3

        // POP / REMOVE
        System.out.println(queue.poll());
        // 10

        // FRONT / TOP
        System.out.println(queue.peek());
        // 20

        // SIZE
        System.out.println(queue.size());
        // 2

        // CHECK EMPTY
        System.out.println(queue.isEmpty());
        // false
    }
}