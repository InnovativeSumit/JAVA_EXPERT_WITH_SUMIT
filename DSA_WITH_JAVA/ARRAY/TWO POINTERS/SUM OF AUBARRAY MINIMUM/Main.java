// SUM OF SUBARRAY MINIMUM
import java.util.*;
class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // LEETCODE 907
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int) 1e9 + 7;
        int[] right = new int[n + 1];
        int[] left = new int[n + 1];
        int[] sum = new int[n + 1];
        // Copy array from index 1
        for (int i = 0; i < n; i++) {
            right[i + 1] = arr[i];
        }
        int res = 0;
        // Process every element
        for (int i = 1; i <= n; i++) {
            int curr = right[i];
            int j = i - 1;
            // Find previous smaller element
            while (right[j] >= curr) {
                j = left[j];
            }
            // Store previous smaller index
            left[i] = j;
            // Calculate sum of subarray minimums
            sum[i] = sum[j] + curr * (i - j);
            // Add to result
            res = (res + sum[i]) % mod;
        }
        return res;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int ans = sumSubarrayMins(arr);
        System.out.println("Sum of Subarray Minimums = " + ans);
    }
}