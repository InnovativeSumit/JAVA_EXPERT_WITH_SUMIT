
/*
 * Problem: Lowest Common Ancestor (LCA) in a BST
 *
 * Optimal Approach: BST Property (Iterative)
 *
 * Logic:
 * 1. If both p and q are smaller than the current node,
 *    move to the left subtree.
 * 2. If both p and q are greater than the current node,
 *    move to the right subtree.
 * 3. Otherwise, the current node is the LCA because
 *    p and q lie on opposite sides, or one equals the node.
 *
 * Time Complexity (TC):
 * O(H), where H is the height of the BST.
 * Balanced BST: O(log N)
 * Worst case (skewed BST): O(N)
 *
 * Auxiliary Space Complexity (SC):
 * O(1), because this iterative approach uses no recursion
 * and no additional data structures.
 *
 * N = number of nodes, H = height of the BST.
 *
 * Assumption: Both p and q exist in the BST.
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

    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {

            // Both nodes are in the left subtree
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            // Both nodes are in the right subtree
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            // Split point: current node is the LCA
            else {
                return root;
            }
        }

        return null;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * BST:
         *
         *          6
         *         / \
         *        2   8
         *       / \ / \
         *      0  4 7  9
         *        / \
         *       3   5
         *
         * Find LCA of nodes 2 and 8.
         * Expected LCA: 6
         */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Solution solution = new Solution();

        TreeNode p = root.left;   // Node 2
        TreeNode q = root.right;  // Node 8

        TreeNode lca = solution.lowestCommonAncestor(root, p, q);

        if (lca != null) {
            System.out.println("LCA: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}
