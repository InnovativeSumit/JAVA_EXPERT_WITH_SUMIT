// BIT MANIPULATION
// SINGLE NUMBER USING XOR
// TC => O(n)
// SC => O(1)

import java.util.*;

class Main {

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}