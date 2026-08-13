// MAXIMUM SUM OF THE SUBARRAY OF SIZE ATLEAST k
// TC => O(3N)
// SC => O(1)

import java.util.*;
public class Main {

    public static int maxSumWithK(int[] arr, int k) {
        int n = arr.length;
        
        // Kadane's algorithm
        int[] beh = new int[n];
        beh[0] = arr[0];

        for (int i = 1; i < n; i++) {
            beh[i] = Math.max(arr[i], beh[i - 1] + arr[i]);
        }
        
        // Sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int ans = windowSum;
        // Sliding window
        for (int i = k; i < n; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            ans = Math.max(ans, windowSum);
            int leftIndex = i - k;
            ans = Math.max(ans, windowSum + beh[leftIndex]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,-2,3,5,1,2};
        int k = 3;
        int result = maxSumWithK(arr, k);
        System.out.println(result);
    }
}