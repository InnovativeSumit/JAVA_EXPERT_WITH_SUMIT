// IMPLEMENT QUEUE USING STACKS
// TC => O(1) PUSH, O(1) AMORTIZED POP
// SC => O(N)
// APPROACH 1

import java.util.*;
class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    // PUSH / ENQUEUE
    public void push(int x) {
        s1.push(x);
    }
    // POP / DEQUEUE
    public int pop() {

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }
    // PEEK / FRONT
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
    // CHECK EMPTY
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.peek());  // 10
        System.out.println(q.pop());   // 10
        System.out.println(q.pop());   // 20
        q.push(40);
        System.out.println(q.peek());  // 30
        System.out.println(q.pop());   // 30
        System.out.println(q.pop());   // 40
        System.out.println(q.empty()); // true
    }
}