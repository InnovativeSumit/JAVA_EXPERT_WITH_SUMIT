
/*
 * Problem: Set Matrix Zeroes
 *
 * Optimal Approach: In-place Marking (O(1) Extra Space)
 *
 * LOGIC:
 *
 * 1. Use the first row and first column as markers.
 *
 * 2. Maintain a separate variable col0 to track whether
 *    the first column originally contains zero.
 *
 * 3. Traverse the matrix from (0,0) to (n-1,m-1).
 *    Whenever matrix[i][j] == 0:
 *       - Mark its row: matrix[i][0] = 0
 *       - Mark its column: matrix[0][j] = 0
 *
 * 4. Traverse from (1,1) onwards.
 *    If matrix[i][0] == 0 OR matrix[0][j] == 0,
 *    make matrix[i][j] = 0.
 *
 * 5. Finally:
 *    - If matrix[0][0] == 0, make the entire first row zero.
 *    - If col0 == 0, make the entire first column zero.
 *
 * IMPORTANT:
 * First row and first column are handled separately
 * to avoid overwriting marker information.
 *
 * TIME COMPLEXITY (TC):
 * O(N * M)
 * - First traversal: O(N * M)
 * - Second traversal: O(N * M)
 * - First row and column: O(N + M)
 *
 * SPACE COMPLEXITY (SC):
 * O(1) Auxiliary Space
 * Only one extra variable (col0) is used.
 *
 * N = Number of rows
 * M = Number of columns
 */

class Solution {

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // Tracks whether the first column needs to be zeroed
        int col0 = 1;

        // STEP 1: Mark rows and columns using first row/column
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {

                    // Mark the corresponding row
                    matrix[i][0] = 0;

                    // Mark the corresponding column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // STEP 2: Set matrix elements to zero using markers
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < m; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {

                    matrix[i][j] = 0;
                }
            }
        }

        // STEP 3: Handle the first row separately
        if (matrix[0][0] == 0) {

            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // STEP 4: Handle the first column separately
        if (col0 == 0) {

            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        Solution solution = new Solution();

        solution.setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
