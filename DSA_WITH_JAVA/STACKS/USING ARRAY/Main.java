// STACK USING ARRAY

class Stack {

    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    // PUSH
    void push(int x) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = x;
    }

    // POP
    int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // TOP / PEEK
    int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // SIZE
    int size() {
        return top + 1;
    }
}

class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        // 30

        System.out.println(stack.pop());
        // 30

        System.out.println(stack.peek());
        // 20

        System.out.println(stack.size());
        // 2
    }
}