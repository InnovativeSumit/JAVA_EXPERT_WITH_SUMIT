<<<<<<< HEAD
// TWO SUMS USING HASHMAPS
// TC => O(N)
// SC => O(N)

import java.util.*;
public class Main
{

	static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int need = target - nums[i];
			if (map.containsKey(need)) {
				return new int[] {map.get(need), i};
			}
			else map.put(nums[i], i);
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int[]nums = {2,7,11,15};
		int target = 9;
		int[] ans = twoSum(nums,target);
		for(int x : ans) {
			System.out.print(x + " ");
		}
	}
}
=======
// TWO SUMS USING HASHMAPS
// TC => O(N)
// SC => O(N)

import java.util.*;
public class Main
{

	static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int need = target - nums[i];
			if (map.containsKey(need)) {
				return new int[] {map.get(need), i};
			}
			else map.put(nums[i], i);
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int[]nums = {2,7,11,15};
		int target = 9;
		int[] ans = twoSum(nums,target);
		for(int x : ans) {
			System.out.print(x + " ");
		}
	}
}
>>>>>>> f22e72f (DAY32)
