// LEETCODE 152
// MAXIMUM PRODUCT SUBARRAY
// TC => O(N)
// SC => O(1)

import java.util.*;

public class Main {
    
   public static  int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Reset after encountering 0
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            // Calculate prefix product
            prefix *= nums[i];
            // Calculate suffix product
            suffix *= nums[n - 1 - i];
            // Update maximum product
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
    
    public static void main(String[] args) {

        int [] nums ={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}