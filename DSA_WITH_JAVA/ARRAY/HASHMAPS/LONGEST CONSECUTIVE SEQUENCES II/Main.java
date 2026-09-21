import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // LEETCODE 128
    // LONGEST CONSECUTIVE SEQUENCE

    public int longestConsecutive(int[] nums) {
         Set<Integer> hashSet = new HashSet<>();
        // Store all elements
        for (int num : nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;
        // Iterate over HashSet, not nums
        for (int num : hashSet) {
            // Check if num is the starting point
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Find consecutive numbers
                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                // Update answer
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Main obj = new Main();
        int ans = obj.longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence: " + ans);
    }
}