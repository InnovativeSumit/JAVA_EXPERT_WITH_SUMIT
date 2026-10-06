import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(K)

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int index = 0;
        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Remove elements outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            // Remove smaller or equal elements
            while (!dq.isEmpty()
                    && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            // Add current index
            dq.offerLast(i);
            // Window is ready
            if (i >= k - 1) {
                // Front contains maximum element
                ans[index] = nums[dq.peekFirst()];
                index++;
            }
        }
        return ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        System.out.println("Maximum Sliding Window:");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}