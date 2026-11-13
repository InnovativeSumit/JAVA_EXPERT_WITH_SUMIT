
/*
 * Problem: Kth Smallest and Kth Largest Element in a BST
 *
 * Optimal Approach:
 * 1. Kth Smallest -> Inorder traversal (Left, Root, Right)
 * 2. Kth Largest  -> Reverse inorder traversal (Right, Root, Left)
 *
 * Both traversals visit BST elements in sorted order.
 *
 * TIME COMPLEXITY (TC):
 * O(H + K), where H is the height of the BST.
 * More precisely, traversal takes O(min(N, H + K)).
 * Balanced BST: O(log N + K)
 * Worst case (skewed BST): O(N)
 *
 * AUXILIARY SPACE COMPLEXITY (SC):
 * O(H) for the recursive call stack.
 * Balanced BST: O(log N)
 * Worst case (skewed BST): O(N)
 *
 * N = number of nodes, H = height, K = requested position.
 *
 * Assumption: BST contains distinct values and 1 <= K <= N.
 * Returns -1 if K is invalid.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    // Kth Smallest Element
    public int kthSmallest(TreeNode root, int k) {

        if (k <= 0) {
            return -1;
        }

        int[] count = {0};
        int[] answer = {-1};

        inorder(root, k, count, answer);

        return answer[0];
    }

    // Inorder: Left -> Root -> Right
    private void inorder(
            TreeNode root, int k, int[] count, int[] answer) {

        if (root == null || count[0] >= k) {
            return;
        }

        inorder(root.left, k, count, answer);

        if (count[0] >= k) {
            return;
        }

        count[0]++;

        if (count[0] == k) {
            answer[0] = root.val;
            return;
        }

        inorder(root.right, k, count, answer);
    }

    // Kth Largest Element
    public int kthLargest(TreeNode root, int k) {

        if (k <= 0) {
            return -1;
        }

        int[] count = {0};
        int[] answer = {-1};

        reverseInorder(root, k, count, answer);

        return answer[0];
    }

    // Reverse inorder: Right -> Root -> Left
    private void reverseInorder(
            TreeNode root, int k, int[] count, int[] answer) {

        if (root == null || count[0] >= k) {
            return;
        }

        reverseInorder(root.right, k, count, answer);

        if (count[0] >= k) {
            return;
        }

        count[0]++;

        if (count[0] == k) {
            answer[0] = root.val;
            return;
        }

        reverseInorder(root.left, k, count, answer);
    }

    // Main method to test both operations
    public static void main(String[] args) {

        /*
         * BST:
         *
         *         5
         *        / \
         *       3   7
         *      / \ / \
         *     2  4 6  8
         *
         * Sorted order: 2, 3, 4, 5, 6, 7, 8
         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        Solution solution = new Solution();

        int k = 3;

        System.out.println(
                "Kth Smallest (k = " + k + "): "
                + solution.kthSmallest(root, k));

        System.out.println(
                "Kth Largest (k = " + k + "): "
                + solution.kthLargest(root, k));
    }
}
