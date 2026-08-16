<<<<<<< HEAD
// COUNT NUMBERS OF NICE SUBARRAYS
// TC ==> O(N)
// N ==> LENGTH OF THE ARRAY
// SC ==> O(1)

import java.util.*;
public class Main {
    
	static int atMost(int[] nums, int goal) {
		if (goal < 0) return 0;
		int left = 0;
		int sum = 0;
		int count = 0;
		int right = 0;

		while(right<nums.length) {
			sum += nums[right]%2;
			while (sum > goal) {
				sum -= nums[left]%2;
				left++;
			}
			count += (right - left + 1);
			right++;
		}
		return count;
	}
	
	static int numSubarraysWithSum(int[] nums, int goal) {
		return atMost(nums, goal) - atMost(nums, goal - 1);
	}

	public static void main(String[]args) {
		int[] nums = {1,1,2,1,1};
		int goals = 3;
		int ans = numSubarraysWithSum(nums , goals);
		System.out.print(ans);
	}

}
=======
// COUNT NUMBERS OF NICE SUBARRAYS
// TC ==> O(N)
// N ==> LENGTH OF THE ARRAY
// SC ==> O(1)

import java.util.*;
public class Main {
    
	static int atMost(int[] nums, int goal) {
		if (goal < 0) return 0;
		int left = 0;
		int sum = 0;
		int count = 0;
		int right = 0;

		while(right<nums.length) {
			sum += nums[right]%2;
			while (sum > goal) {
				sum -= nums[left]%2;
				left++;
			}
			count += (right - left + 1);
			right++;
		}
		return count;
	}
	
	static int numSubarraysWithSum(int[] nums, int goal) {
		return atMost(nums, goal) - atMost(nums, goal - 1);
	}

	public static void main(String[]args) {
		int[] nums = {1,1,2,1,1};
		int goals = 3;
		int ans = numSubarraysWithSum(nums , goals);
		System.out.print(ans);
	}

}
>>>>>>> f22e72f (DAY32)
