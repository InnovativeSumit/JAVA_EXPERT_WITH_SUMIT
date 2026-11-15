
/*
 * Problem: Rotate Matrix by 90 Degrees Clockwise
 *
 * Optimal Approach:
 * 1. Transpose the matrix.
 * 2. Reverse every row.
 *
 * STEP 1: TRANSPOSE
 * Swap matrix[i][j] with matrix[j][i].
 *
 * STEP 2: REVERSE EACH ROW
 * Reverse every individual row using two pointers.
 *
 * Example:
 *
 * Original Matrix:
 * 1  2  3
 * 4  5  6
 * 7  8  9
 *
 * After Transpose:
 * 1  4  7
 * 2  5  8
 * 3  6  9
 *
 * After Reversing Each Row:
 * 7  4  1
 * 8  5  2
 * 9  6  3
 *
 * TIME COMPLEXITY (TC): O(N * N)
 * - Transposing: O(N * N)
 * - Reversing rows: O(N * N)
 *
 * SPACE COMPLEXITY (SC): O(1)
 * - In-place modification.
 * - No extra matrix or array is created.
 *
 * Note: This approach works for a square matrix.
 */

class Solution {

    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        // STEP 1: Transpose the matrix
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }

        // STEP 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                // Swap elements
                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution solution = new Solution();

        solution.rotateMatrix(matrix);

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
