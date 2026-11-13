
/*
 * Problem: Construct a BST from Preorder Traversal
 *
 * Optimal Approach: Recursion + Upper Bound
 *
 * Preorder Traversal: Root -> Left -> Right
 *
 * Logic:
 * 1. The first element becomes the root.
 * 2. Build the left subtree using values smaller than root.val.
 * 3. Build the right subtree using values smaller than the
 *    inherited upper bound but greater than the root.
 * 4. If the current value exceeds the upper bound, return null
 *    without consuming it.
 *
 * Time Complexity (TC): O(N)
 * Every preorder element is processed once.
 *
 * Auxiliary Space Complexity (SC): O(H)
 * H = height of the constructed BST due to recursion.
 * Balanced BST: O(log N)
 * Worst case (skewed BST): O(N)
 *
 * Assumption: Preorder contains distinct integer values.
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

    private int index;

    public TreeNode bstFromPreorder(int[] preorder) {

        // Reset index so repeated calls work correctly
        index = 0;

        return build(preorder, Long.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, long bound) {

        // All elements have been processed
        if (index == preorder.length) {
            return null;
        }

        // This value belongs outside the current subtree
        if (preorder[index] > bound) {
            return null;
        }

        // Create the current root and consume its value
        TreeNode root = new TreeNode(preorder[index++]);

        // Values smaller than root.val belong to the left subtree
        root.left = build(preorder, root.val);

        // Remaining valid values belong to the right subtree
        root.right = build(preorder, bound);

        return root;
    }

    // Helper method to print preorder traversal
    public void printPreorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * Input preorder:
         * [8, 5, 1, 7, 10, 12]
         *
         * Constructed BST:
         *
         *         8
         *        / \
         *       5   10
         *      / \    \
         *     1   7    12
         */

        int[] preorder = {8, 5, 1, 7, 10, 12};

        Solution solution = new Solution();

        TreeNode root = solution.bstFromPreorder(preorder);

        System.out.println("Constructed BST preorder:");
        solution.printPreorder(root);
    }
}
