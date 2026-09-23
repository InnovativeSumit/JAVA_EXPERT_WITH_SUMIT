import java.util.*;
class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // LEETCODE 84 [HARD] [LARGEST RECTANGLES AREA IN HISTOGRAM]
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            // Remove bars which are greater than current bar
            while (!st.empty() && heights[st.peek()] > heights[i]) {
                int element = st.peek();
                st.pop();
                int nse = i;
                int pse;
                if (st.empty()) {
                    pse = -1;
                } else {
                    pse = st.peek();
                }
                int area = heights[element] * (nse - pse - 1);
                maxArea = Math.max(maxArea, area);
            }
            // Push current index
            st.push(i);
        }

        // Process remaining elements
        while (!st.empty()) {
            int element = st.peek();
            st.pop();
            int nse = n;
            int pse;
            if (st.empty()) {
                pse = -1;
            } else {
                pse = st.peek();
            }
            int area = heights[element] * (nse - pse - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] heights = {3,2,10,11,5,10,6,3};
        Main obj = new Main();
        int ans = obj.largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + ans);
    }
}