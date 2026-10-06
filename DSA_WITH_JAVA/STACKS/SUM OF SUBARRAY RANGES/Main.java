// for (int i = 0; i < nums.length; i++) {

//     max = nums[i];
//     min = nums[i];

//     for (int j = i; j < nums.length; j++) {

//         max = Math.max(max, nums[j]);
//         min = Math.min(min, nums[j]);

//         s += max - min;
//     }
// }

//SUM OF SUBARRAY RANGES 
import java.util.*;

class Main {

    // TIME COMPLEXITY → O(N)
    // SPACE COMPLEXITY → O(N)
    // LEETCODE 2104
    public static long subArrayRanges(int[] arr) {

        long sumMax = sumSubarrayMax(arr);

        long sumMin = sumSubarrayMin(arr);

        return sumMax - sumMin;
    }


    // SUM OF SUBARRAY MAXIMUMS
    public static long sumSubarrayMax(int[] arr) {

        int n = arr.length;

        long total = 0;

        int[] nge = new int[n];
        int[] pge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Greater Element
        for (int i = 0; i < n; i++) {

            while (!st.empty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                pge[i] = -1;
            }
            else {
                pge[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Greater Element
        for (int i = n - 1; i >= 0; i--) {

            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nge[i] = n;
            }
            else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        // Contribution of every element
        for (int i = 0; i < n; i++) {

            long left = i - pge[i];

            long right = nge[i] - i;

            total += (long) arr[i] * left * right;
        }

        return total;
    }


    // SUM OF SUBARRAY MINIMUMS
    public static long sumSubarrayMin(int[] arr) {

        int n = arr.length;

        long total = 0;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                pse[i] = -1;
            }
            else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nse[i] = n;
            }
            else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        // Contribution of every element
        for (int i = 0; i < n; i++) {

            long left = i - pse[i];

            long right = nse[i] - i;

            total += (long) arr[i] * left * right;
        }

        return total;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2};

        long ans = subArrayRanges(arr);

        System.out.println("Sum of Subarray Ranges = " + ans);
    }
}