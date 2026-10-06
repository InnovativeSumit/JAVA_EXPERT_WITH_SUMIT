import java.util.*;
class Main {
    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // lEETCODE 503
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        // Traverse 2N - 1 to 0
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Remove smaller or equal elements
            while (!st.empty() && st.peek() <= arr[i % n]) {
                st.pop();
            }
            // Only store answer for original elements
            if (i < n) {
                // If stack is empty
                if (st.empty()) {
                    nge[i] = -1;
                } 
                else {
                    nge[i] = st.peek();
                }
            }
            // Push current element
            st.push(arr[i % n]);
        }
        return nge;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        Main obj = new Main();
        int[] ans = obj.nextGreaterElements(arr);
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}