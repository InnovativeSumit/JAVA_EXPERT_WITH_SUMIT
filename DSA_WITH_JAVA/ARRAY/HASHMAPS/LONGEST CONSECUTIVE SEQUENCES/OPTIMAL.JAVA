<<<<<<< HEAD
// LONGEST CONSECUTIVE SEQUENCES
// TC => O(N)
// SC => O(N)
import java.util.HashSet;

public class Main {

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int longest = 1;
        // Store all elements in HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // Traverse the HashSet
        for (int num : set) {
            // Start only if it is the first element of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(nums);
        System.out.println("Length of Longest Consecutive Sequence = " + ans);
    }
=======
// LONGEST CONSECUTIVE SEQUENCES
// TC => O(N)
// SC => O(N)
import java.util.HashSet;

public class Main {

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int longest = 1;
        // Store all elements in HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // Traverse the HashSet
        for (int num : set) {
            // Start only if it is the first element of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(nums);
        System.out.println("Length of Longest Consecutive Sequence = " + ans);
    }
>>>>>>> f22e72f (DAY32)
}