import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // PREVIOUS SMALLER ELEMENT

    public int[] previousSmallerElements(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        // Traverse from left to right
        for (int i = 0; i < n; i++) {
            // Remove greater or equal elements
            while (!st.empty() && st.peek() >= arr[i]) {
                st.pop();
            }
            // If stack is empty
            if (st.empty()) {
                pse[i] = -1;
            }
            else {
                pse[i] = st.peek();
            }
            // Push current element
            st.push(arr[i]);
        }
        return pse;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        Main obj = new Main();
        int[] ans = obj.previousSmallerElements(arr);
        System.out.println("Previous Smaller Elements:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}