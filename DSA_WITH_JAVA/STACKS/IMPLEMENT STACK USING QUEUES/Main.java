// IMPLEMENT STACK USING QUEUES
// TC => PUSH O(N), POP O(1), TOP O(1)
// SC => O(N)

import java.util.*;
class Main {
    Queue<Integer> q = new LinkedList<>();
    // PUSH
    void push(int x) {
        q.add(x);
        int n = q.size();
        // Move previous elements behind x
        for (int i = 1; i < n; i++) {
            q.add(q.peek());
            q.poll();
        }
    }

    // POP
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.poll();
    }

    // TOP
    int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    // SIZE
    int size() {
        return q.size();
    }

    public static void main(String[] args) {
        Main s = new Main();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.top());
        // 30
        System.out.println(s.pop());
        // 30
        System.out.println(s.top());
        // 20
        System.out.println(s.size());
        // 2
    }
}