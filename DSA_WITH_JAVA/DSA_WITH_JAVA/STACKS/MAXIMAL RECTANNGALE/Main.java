import java.util.*;

class Main {

    // LeetCode 85
    // TIME COMPLEXITY  → O(N × M)
    // SPACE COMPLEXITY → O(M)

    public int maximalRectangle(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];

        int maxArea = 0;

        // Traverse every row
        for (int i = 0; i < n; i++) {

            // Build histogram for current row
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == '1') {
                    height[j] = height[j] + 1;
                } 
                else {
                    height[j] = 0;
                }
            }

            // Find largest rectangle in histogram
            maxArea = Math.max(
                maxArea,
                largestRectangleArea(height)
            );
        }

        return maxArea;
    }


    // Largest Rectangle in Histogram
    private int largestRectangleArea(int[] heights) {

        int n = heights.length;

        Stack<Integer> st = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            // Remove greater elements
            while (!st.empty() &&
                   heights[st.peek()] > heights[i]) {

                int element = st.peek();
                st.pop();

                int nse = i;

                int pse;

                if (st.empty()) {
                    pse = -1;
                } 
                else {
                    pse = st.peek();
                }

                int area = heights[element]
                         * (nse - pse - 1);

                maxArea = Math.max(maxArea, area);
            }

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
            } 
            else {
                pse = st.peek();
            }

            int area = heights[element]
                     * (nse - pse - 1);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        Main obj = new Main();

        int ans = obj.maximalRectangle(matrix);

        System.out.println("Maximum Rectangle Area: " + ans);
    }
}