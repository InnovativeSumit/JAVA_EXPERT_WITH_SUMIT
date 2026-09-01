// HASHMAP
// SINGLE NUMBER II
// TC => O(n)
// SC => O(n)

import java.util.*;
class Main {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}

