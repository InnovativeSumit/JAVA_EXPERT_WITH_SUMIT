// BIT MANIPULATION
// SUBSETS
// TC => O(n * 2^n)
// SC => O(n * 2^n)

import java.util.*;
class Main {
	public static  List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		int subsets = 1 << n;
		List<List<Integer>> ans = new ArrayList<>();
		for (int num = 0; num < subsets; num++) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if ((num & (1 << i)) != 0) {
					list.add(nums[i]);
				}
			}
			ans.add(list);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		List<List<Integer>> ans = subsets(nums);
		System.out.println(ans);
	}
}