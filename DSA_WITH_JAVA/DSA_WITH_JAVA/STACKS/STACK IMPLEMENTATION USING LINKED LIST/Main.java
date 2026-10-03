// STACK IMPLEMENTATION USING LINKED LIST
// TC => O(1) for PUSH, POP, TOP, SIZE
// SC => O(N)
class Main {

    static class Stack {
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
        void push(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }

        // POP
        int pop() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            Node temp = top;
            top = top.next;
            size--;
            return temp.data;
        }

        // TOP
        int top() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        // SIZE
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        // 30
        System.out.println(stack.pop());
        // 30
        System.out.println(stack.top());
        // 20
        System.out.println(stack.size());
        // 2
    }
}