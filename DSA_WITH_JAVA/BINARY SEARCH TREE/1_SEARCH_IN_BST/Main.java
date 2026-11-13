
/*
 * Search in a Binary Search Tree
 *
 * Approach: Iterative (Optimal)
 *
 * Time Complexity (TC):
 * O(H), where H is the height of the BST.
 * Average case: O(log N) for a balanced BST.
 * Worst case: O(N) for a skewed BST.
 *
 * Space Complexity (SC):
 * O(1), because no extra data structure or recursion is used.
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

    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {

            // If target is smaller, search left subtree
            if (val < root.val) {
                root = root.left;
            }

            // If target is greater, search right subtree
            else {
                root = root.right;
            }
        }

        // Returns the node if found, otherwise null
        return root;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * BST:
         *       4
         *      / \
         *     2   7
         *    / \
         *   1   3
         */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = new Solution();

        int target = 2;
        TreeNode result = solution.searchBST(root, target);

        if (result != null) {
            System.out.println("Found: " + result.val);
        } else {
            System.out.println("Not Found");
        }
    }
}
