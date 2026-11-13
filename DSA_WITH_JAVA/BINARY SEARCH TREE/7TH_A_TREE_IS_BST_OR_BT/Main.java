
/*
 * Problem: Check Whether a Binary Tree Is a Valid BST
 *
 * Optimal Approach: Range Validation (Min-Max Bounds)
 *
 * Logic:
 * 1. Every node must be strictly greater than its minimum bound.
 * 2. Every node must be strictly smaller than its maximum bound.
 * 3. Left subtree: values must lie between minVal and root.val.
 * 4. Right subtree: values must lie between root.val and maxVal.
 * 5. An empty tree is considered a valid BST.
 *
 * Time Complexity (TC): O(N)
 * Every node is visited at most once.
 *
 * Auxiliary Space Complexity (SC): O(H)
 * H = height of the tree, due to the recursive call stack.
 * Balanced tree: O(log N)
 * Worst case (skewed tree): O(N)
 *
 * Assumption: Duplicate values are NOT allowed in a valid BST.
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

    public boolean isValidBST(TreeNode root) {

        // long bounds safely handle Integer.MIN_VALUE and MAX_VALUE
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long minVal, long maxVal) {

        // An empty subtree is valid
        if (root == null) {
            return true;
        }

        // Current value must be strictly inside the allowed range
        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }

        // Validate left and right subtrees with updated bounds
        return validate(root.left, minVal, root.val)
                && validate(root.right, root.val, maxVal);
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * Valid BST:
         *
         *         5
         *        / \
         *       3   7
         *      / \ / \
         *     2  4 6  8
         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        Solution solution = new Solution();

        System.out.println(
                "Is valid BST? " + solution.isValidBST(root));

        /*
         * Make the tree invalid:
         * Place 6 in the left subtree of 5.
         * Although 6 > 3, it violates the ancestor bound 6 < 5.
         */

        root.left.right.val = 6;

        System.out.println(
                "Is valid BST after modification? "
                + solution.isValidBST(root));
    }
}
