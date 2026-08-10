<<<<<<< HEAD
// MAXIMUM CONSECUTIVE 3
// TC => O(N)
// SC =>O(1)
import java.util.*;
public class Main2 {

    static int maxConsecutive(int[] nums, int k) {
         int n = nums.length;
        int left = 0;
        int right = 0;
        int countZeros = 0;
        int maxLength = 0;

         while (right < n) {
            if (nums[right] == 0) countZeros++;
            if (countZeros > k) {
                if (nums[left] == 0)
                    countZeros--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println("The maximum value of consecutives one  is : " +  maxConsecutive(nums, k));
    }
=======
// MAXIMUM CONSECUTIVE 3
// TC => O(N)
// SC =>O(1)
import java.util.*;
public class Main2 {

    static int maxConsecutive(int[] nums, int k) {
         int n = nums.length;
        int left = 0;
        int right = 0;
        int countZeros = 0;
        int maxLength = 0;

         while (right < n) {
            if (nums[right] == 0) countZeros++;
            if (countZeros > k) {
                if (nums[left] == 0)
                    countZeros--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println("The maximum value of consecutives one  is : " +  maxConsecutive(nums, k));
    }
>>>>>>> f22e72f (DAY32)
}