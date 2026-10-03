// MINIMUM SIZE SUBARRAY SUM
// LEETCODE 209
// TC => O(N)
// SC => O(N)

import java.util.*;

public class Main {
    public static int minSubArrayLen( int[] nums, int target) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        for(int right = 0 ; right< n ; right ++){
            sum += nums[right];
            while(sum >= target){
                ans = Math.min(ans, right - left +1);
                sum -= nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = minSubArrayLen(nums,target);
        System.out.println(result);
    }
}