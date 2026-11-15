
import java.util.*;

class Main {

    /*
     * Problem: Spiral Matrix / Spiral Traversal
     *
     * Optimal Approach: Boundary Traversal
     *
     * We maintain 4 pointers:
     *
     * top    = First remaining row
     * bottom = Last remaining row
     * left   = First remaining column
     * right  = Last remaining column
     *
     * Traversal:
     *
     * 1. Traverse left to right  -> top row
     * 2. Traverse top to bottom  -> right column
     * 3. Traverse right to left  -> bottom row
     * 4. Traverse bottom to top  -> left column
     *
     * Repeat until all elements are visited.
     *
     * IMPORTANT:
     * Check boundary conditions before traversing
     * the bottom row and left column to avoid duplicates.
     *
     * TIME COMPLEXITY (TC): O(N * M)
     * Every matrix element is visited exactly once.
     *
     * AUXILIARY SPACE COMPLEXITY (SC): O(1)
     * Only 4 boundary variables are used.
     *
     * OUTPUT SPACE: O(N * M)
     * The ArrayList stores all matrix elements.
     *
     * N = Number of rows
     * M = Number of columns
     */

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Handle empty matrix
        if (matrix == null || matrix.length == 0 ||
            matrix[0].length == 0) {
            return ans;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        // Initialize 4 boundaries
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        // Continue until all boundaries are crossed
        while (top <= bottom && left <= right) {

            // STEP 1: Traverse from LEFT to RIGHT
            for (int i = left; i <= right; i++) {

                ans.add(matrix[top][i]);
            }

            top++;

            // STEP 2: Traverse from TOP to BOTTOM
            for (int i = top; i <= bottom; i++) {

                ans.add(matrix[i][right]);
            }

            right--;

            // STEP 3: Traverse from RIGHT to LEFT
            // Check whether rows are still remaining
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {

                    ans.add(matrix[bottom][i]);
                }

                bottom--;
            }

            // STEP 4: Traverse from BOTTOM to TOP
            // Check whether columns are still remaining
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {

                    ans.add(matrix[i][left]);
                }

                left++;
            }
        }

        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        ArrayList<Integer> result = spiralOrder(matrix);

        System.out.println("Spiral Traversal:");

        for (int element : result) {

            System.out.print(element + " ");
        }
    }
}
