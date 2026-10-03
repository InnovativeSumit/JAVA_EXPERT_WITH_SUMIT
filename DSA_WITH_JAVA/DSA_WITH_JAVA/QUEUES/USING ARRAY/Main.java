// QUEUE IMPLEMENTATION USING ARRAY

class Queue {

    int[] arr;
    int size;
    int currSize;
    int start;
    int end;

    Queue(int size) {
        this.size = size;
        arr = new int[size];

        currSize = 0;
        start = -1;
        end = -1;
    }

    // PUSH / ENQUEUE
    void push(int x) {

        // Queue is full
        if (currSize == size) {
            System.out.println("Queue is Full");
            return;
        }

        // First element
        if (currSize == 0) {
            start = 0;
            end = 0;
        }
        else {
            end = (end + 1) % size;
        }

        arr[end] = x;
        currSize++;
    }

    // TOP / FRONT
    int top() {

        if (currSize == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[start];
    }

    // POP / DEQUEUE
    int pop() {

        if (currSize == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int element = arr[start];

        // Only one element
        if (currSize == 1) {
            start = -1;
            end = -1;
        }
        else {
            start = (start + 1) % size;
        }

        currSize--;

        return element;
    }

    // SIZE
    int size() {
        return currSize;
    }
}

class Main {

    public static void main(String[] args) {

        Queue q = new Queue(5);

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

        q.push(40);
        q.push(50);
        q.push(60);
    }
}