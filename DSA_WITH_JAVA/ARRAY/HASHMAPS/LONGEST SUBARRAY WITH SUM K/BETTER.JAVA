<<<<<<< HEAD
// TC => O(N)
// SC => O(N)
import java.util.*;
public class Better {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If prefix sum itself is k
            if (sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;
            // If (sum - k) exists
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            // Store only first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,0,3};
        int k = 3;
        System.out.println("Longest subarray length with sum " + k + " is: " + subarraySum(nums, k));
    }
=======
// TC => O(N)
// SC => O(N)
import java.util.*;
public class Better {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If prefix sum itself is k
            if (sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;
            // If (sum - k) exists
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            // Store only first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,0,3};
        int k = 3;
        System.out.println("Longest subarray length with sum " + k + " is: " + subarraySum(nums, k));
    }
>>>>>>> f22e72f (DAY32)
}