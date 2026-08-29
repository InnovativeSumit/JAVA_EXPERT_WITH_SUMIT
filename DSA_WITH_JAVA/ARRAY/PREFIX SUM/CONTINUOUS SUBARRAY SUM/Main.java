// LEETCODE 523
// CONTINUOUS SUBARRAY SUM
// TC => O(n)
// SC => O(n)

import java.util.*;

class Main {
	public static boolean checkSubarraySum(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		// remainder 0 exists before the array starts
		map.put(0, -1);
		int prefixSum = 0;
		for (int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			int rem = prefixSum % k;
			if (map.containsKey(rem)) {
				if (i - map.get(rem) >= 2) {
					return true;
				}

			} else {
				map.put(rem, i);
			}
		}
		return false;
	}

	public static void main (String[] args) {
		int[] nums = {23, 2, 4, 6, 7};
		int k = 6;
		if(checkSubarraySum(nums,k)){
		    System.out.print("TRUE");
		}
		else{
		     System.out.print("FALSE");
		}
	}
}GIT INIT