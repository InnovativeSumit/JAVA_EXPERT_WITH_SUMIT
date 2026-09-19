// NEXT GREATER ELEMENTS [MONOTONIC STACKS] //LEETCODE 155
// TWO STACKS APPROACH
// TC => O(N)
// SC => O(N)
import java.util.*;

class Main {

    public int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller or equal elements
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // If stack is empty
            if (st.empty()) {
                nge[i] = -1;
            } 
            else {
                nge[i] = st.peek();
            }
            // Push current element
            st.push(arr[i]);
        }
        return nge;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        Main obj = new Main();
        int[] ans = obj.nextGreaterElement(arr);
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}