
import java.util.*;

class Solution {

    /*
     * Problem: Anti-Diagonal Traversal of a Matrix
     *
     * Optimal Approach: Diagonal Traversal using Two Loops
     *
     * LOGIC:
     *
     * We divide the traversal into two parts.
     *
     * PART 1:
     * Start from every element of the FIRST ROW.
     *
     * For each starting position:
     *   j = 0
     *   k = i
     *
     * Move diagonally:
     *   j++  (move down)
     *   k--  (move left)
     *
     * PART 2:
     * Start from every element of the LAST COLUMN,
     * excluding the first row to avoid duplication.
     *
     * For each starting position:
     *   j = i
     *   k = n - 1
     *
     * Move diagonally:
     *   j++  (move down)
     *   k--  (move left)
     *
     * TIME COMPLEXITY (TC): O(N * N)
     * Every matrix element is visited exactly once.
     *
     * AUXILIARY SPACE COMPLEXITY (SC): O(1)
     * Only loop variables are used.
     *
     * OUTPUT SPACE: O(N * N)
     * ArrayList stores all matrix elements.
     *
     * NOTE: This implementation assumes a square matrix.
     */

    public static ArrayList<Integer> antiDiagonalPattern(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = matrix.length;

        // PART 1: Start from every element of the first row
        for (int i = 0; i < n; i++) {

            int j = 0;
            int k = i;

            // Traverse diagonally down-left
            while (k >= 0 && j < n) {

                ans.add(matrix[j][k]);

                j++;
                k--;
            }
        }

        // PART 2: Start from every element of the last column
        // Exclude the first row because it is already traversed
        for (int i = 1; i < n; i++) {

            int j = i;
            int k = n - 1;

            // Traverse diagonally down-left
            while (j < n && k >= 0) {

                ans.add(matrix[j][k]);

                j++;
                k--;
            }
        }

        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<Integer> result = antiDiagonalPattern(matrix);

        System.out.println("Anti-Diagonal Traversal:");

        for (int element : result) {

            System.out.print(element + " ");
        }
    }
}
