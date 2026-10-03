// MIN STACK
// TWO STACKS APPROACH — STRIVER STYLE
// TC => O(1) for push, pop, top, getMin
// SC => O(N)

import java.util.*;

class MinStack {

    Stack<Integer> st = new Stack<>();
    int mini;

    // PUSH
    public void push(int val) {

        if (st.empty()) {
            mini = val;
            st.push(val);
        }

        else {
            if (val > mini) {
                st.push(val);
            }

            else {
                st.push(2 * val - mini);
                mini = val;
            }
        }
    }

    // POP
    public void pop() {

        if (st.empty()) {
            return;
        }

        int val = st.peek();
        st.pop();

        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    // TOP
    public int top() {

        if (st.empty()) {
            return -1;
        }

        int val = st.peek();

        if (val < mini) {
            return mini;
        }

        return val;
    }

    // GET MINIMUM
    public int getMin() {

        if (st.empty()) {
            return -1;
        }

        return mini;
    }
}

public class Main {

    public static void main(String[] args) {

        MinStack st = new MinStack();

        st.push(15);
        st.push(10);
        st.push(12);
        st.push(8);

        System.out.println(st.getMin()); // 8

        st.pop();

        System.out.println(st.getMin()); // 10

        System.out.println(st.top());    // 12

        st.push(5);

        System.out.println(st.getMin()); // 5

        st.pop();

        System.out.println(st.getMin()); // 10
    }
}