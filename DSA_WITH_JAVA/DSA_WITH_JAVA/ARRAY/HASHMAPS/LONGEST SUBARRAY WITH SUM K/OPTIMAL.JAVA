<<<<<<< HEAD
// TC => O(2N)
// SC => O(1)
import java.util.*;
public class OPTIMAL {

	public static int subarraySum(int[] nums, int k) {
		int left = 0;
		int right = 0;
		long  sum = 0;
		int maxLength = 0;
		int n = nums.length;

		while(right < n) {

			while(left <= right && sum>k) {
				sum -= nums[left];
				left++;
			}
			if(sum == k) {
				maxLength = Math.max(maxLength, right-left+1);
			}
			right++;
			if (right < n) {
				sum += nums[right];
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = {2,0,0,3};
		int k = 3;
		System.out.println("Longest subarray length with sum " + k + " is: " + subarraySum(nums, k));
	}
=======
// TC => O(2N)
// SC => O(1)
import java.util.*;
public class OPTIMAL {

	public static int subarraySum(int[] nums, int k) {
		int left = 0;
		int right = 0;
		long  sum = 0;
		int maxLength = 0;
		int n = nums.length;

		while(right < n) {

			while(left <= right && sum>k) {
				sum -= nums[left];
				left++;
			}
			if(sum == k) {
				maxLength = Math.max(maxLength, right-left+1);
			}
			right++;
			if (right < n) {
				sum += nums[right];
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = {2,0,0,3};
		int k = 3;
		System.out.println("Longest subarray length with sum " + k + " is: " + subarraySum(nums, k));
	}
>>>>>>> f22e72f (DAY32)
}