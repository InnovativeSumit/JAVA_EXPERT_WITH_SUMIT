// STACK DATA STRUCTURE

import java.util.*;

class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // PUSH
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // TOP / PEEK
        System.out.println(stack.peek());
        // 30

        // SIZE
        System.out.println(stack.size());
        // 3

        // POP
        System.out.println(stack.pop());
        // 30

        // TOP
        System.out.println(stack.peek());
        // 20

        // SIZE
        System.out.println(stack.size());
        // 2

        // CHECK EMPTY
        System.out.println(stack.isEmpty());
        // false
    }
}