// LARGEST SUBARRAY WITH ZERO SUM
// TC => O(NLOGN)
// SC => O(N)

import java.util.*;

public class Main {
    public static int largestZeroSumSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // If prefix sum itself is zero
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If prefix sum appeared before
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);

            } else {
                // Store first occurrence only
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int result = largestZeroSumSubarray(arr);
        System.out.println(result);
    }
}