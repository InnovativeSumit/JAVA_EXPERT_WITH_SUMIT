// BIT MANIPULATION
// SINGLE NUMBER III
// Every number appears twice except two numbers that appear only once.
// TC => O(N)
// SC => O(1)

import java.util.*;
class Main {

    public static int[] singleNumber(int[] nums) {
        // XOR of all numbers
        // duplicates cancel out
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        // Get the rightmost set bit
        int rightmostBit = xor & (-xor);
        int b1 = 0;
        int b2 = 0;
        // Divide numbers into two groups
        for (int num : nums) {
            if ((num & rightmostBit) != 0) {
                b1 = b1 ^ num;
            } 
            else {
                b2 = b2 ^ num;
            }
        }
        return new int[]{b1, b2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] ans = singleNumber(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }
}