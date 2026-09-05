// QUEUE IMPLEMENTATION USING LINKED LIST
// TC => O(1)
// SC => O(N)

class Main {
    static class Queue {
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node start, end;
        int size = 0;
        // PUSH
        void push(int x) {
            Node temp = new Node(x);
            if (start == null) {
                start = end = temp;
            }
            else {
                end.next = temp;
                end = temp;
            }

            size++;
        }

        // POP
        int pop() {
            if (start == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            Node temp = start;
            start = start.next;
            if (start == null) {
                end = null;
            }
            size--;
            return temp.data;
        }

        // TOP
        int top() {
            if (start == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return start.data;
        }

        // SIZE
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.top());
        // 10
        System.out.println(q.pop());
        // 10
        System.out.println(q.top());
        // 20
        System.out.println(q.size());
        // 2
    }
}