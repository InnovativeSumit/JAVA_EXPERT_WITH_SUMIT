// LONGEST  SUM OF THE SUBARRAY OF SIZE ATLEAST k
// TC => O(3N)
// SC => O(1)

import java.util.*;
public class Main {
    public static int maxLengthWithMaximumSum(int[] arr, int k) {
        int n = arr.length;
        // Maximum sum subarray ending at index i
        int[] beh = new int[n];
        // Length of that maximum sum subarray
        int[] len = new int[n];
        beh[0] = arr[0];
        len[0] = 1;

        // Kadane's Algorithm
        for (int i = 1; i < n; i++) {
            if (arr[i] > beh[i - 1] + arr[i]) {
                beh[i] = arr[i];
                len[i] = 1;
            } else {
                beh[i] = beh[i - 1] + arr[i];
                len[i] = len[i - 1] + 1;
            }
        }

        // Sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        int maxLength = k;
        // Sliding window
        for (int i = k; i < n; i++) {

            windowSum += arr[i];
            windowSum -= arr[i - k];

            // Case 1: subarray of exactly k elements
            if (windowSum > maxSum) {
                maxSum = windowSum;
                maxLength = k;
            }

            // Case 2: extend using best subarray before the window
            int currentSum = windowSum + beh[i - k];
            int currentLength = k + len[i - k];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 3, 5, 1, 2};
        int k = 3;
        int result = maxLengthWithMaximumSum(arr, k);
        System.out.println(result);
    }
}