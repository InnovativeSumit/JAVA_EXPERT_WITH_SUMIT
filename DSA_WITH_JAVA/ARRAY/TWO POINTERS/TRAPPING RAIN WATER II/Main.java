import java.util.*;
class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(1)
    // LEETCODE 42
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } 
                else {
                    total += leftMax - height[left];
                }
                left++;
            }
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } 
                else {
                    total += rightMax - height[right];
                }
                right--;
            }
        }
        return total;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        int ans = trap(height);
        System.out.println("Trapped Rain Water = " + ans);
    }
}