// IMPLEMENT QUEUE USING STACKS (2 STACKS)
// METHOD 1: COSTLY PUSH
// TC => PUSH O(N), POP O(1), TOP O(1)
// SC => O(N)

class MyStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int size = 0;

    // PUSH
    public void push(int x) {

        Node temp = new Node(x);

        temp.next = top;
        top = temp;

        size++;
    }

    // POP
    public int pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = top.data;

        top = top.next;
        size--;

        return x;
    }

    // TOP
    public int top() {

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // SIZE
    public int size() {
        return size;
    }

    // EMPTY
    public boolean empty() {
        return top == null;
    }
}


class Queue {

    MyStack s1 = new MyStack();
    MyStack s2 = new MyStack();

    // PUSH / ENQUEUE
    public void push(int x) {

        int n = s1.size();

        // Move s1 -> s2
        for (int i = 0; i < n; i++) {
            s2.push(s1.pop());
        }

        // Push new element
        s1.push(x);

        // Move s2 -> s1
        for (int i = 0; i < n; i++) {
            s1.push(s2.pop());
        }
    }

    // POP / DEQUEUE
    public int pop() {

        if (s1.empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.pop();
    }

    // FRONT
    public int top() {

        if (s1.empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.top();
    }

    // SIZE
    public int size() {
        return s1.size();
    }
}


public class Main2 {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println(q.top());  // 10

        System.out.println(q.pop());  // 10
        System.out.println(q.pop());  // 20

        q.push(50);

        System.out.println(q.top());  // 30

        System.out.println(q.pop());  // 30
        System.out.println(q.pop());  // 40
        System.out.println(q.pop());  // 50

        System.out.println(q.size()); // 0
    }
}