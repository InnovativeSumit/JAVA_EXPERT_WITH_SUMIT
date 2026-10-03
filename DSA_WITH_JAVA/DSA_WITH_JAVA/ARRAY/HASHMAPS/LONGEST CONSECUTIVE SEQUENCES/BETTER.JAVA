<<<<<<< HEAD
// LONGEST CONSECUTIVE SEQUENCES
// TC => O(NLOGN)
// SC => O(LOGN)
import java.util.*;

public class BETTER {
    public static int longestSuccessiveElements(int[] nums) {
        // Edge Case
        if (nums.length == 0)
            return 0;
        // Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        // Traverse the sorted array
        for (int i = 0; i < n; i++) {
            // Consecutive element found
            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            }
            // Ignore duplicate elements
            else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }
            // Update answer
            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestSuccessiveElements(nums);
        System.out.println("Length of Longest Consecutive Sequence = " + ans);
    }
=======
// LONGEST CONSECUTIVE SEQUENCES
// TC => O(NLOGN)
// SC => O(LOGN)
import java.util.*;

public class BETTER {
    public static int longestSuccessiveElements(int[] nums) {
        // Edge Case
        if (nums.length == 0)
            return 0;
        // Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        // Traverse the sorted array
        for (int i = 0; i < n; i++) {
            // Consecutive element found
            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            }
            // Ignore duplicate elements
            else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }
            // Update answer
            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestSuccessiveElements(nums);
        System.out.println("Length of Longest Consecutive Sequence = " + ans);
    }
>>>>>>> f22e72f (DAY32)
}