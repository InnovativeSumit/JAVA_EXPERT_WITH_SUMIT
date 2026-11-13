
/*
 * Problem: Delete a Node in a Binary Search Tree (BST)
 *
 * Optimal Approach: BST Search + Inorder Successor Connection
 *
 * Cases:
 * 1. Node is a leaf: return null.
 * 2. Node has only a left child: return the left child.
 * 3. Node has only a right child: return the right child.
 * 4. Node has two children:
 *    - Attach the right subtree to the rightmost node
 *      of the left subtree.
 *    - Return the left subtree as the replacement.
 *
 * Time Complexity (TC):
 * O(H), where H is the height of the BST.
 * Balanced BST: O(log N)
 * Worst case (skewed BST): O(N)
 *
 * Auxiliary Space Complexity (SC):
 * O(1) for the iterative deletion/search approach.
 * The recursive findLastRight() helper uses O(H) stack space
 * in the worst case.
 *
 * N = number of nodes, H = height of the BST.
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

    public TreeNode deleteNode(TreeNode root, int key) {

        // Case 1: Empty tree
        if (root == null) {
            return null;
        }

        // Case 2: The root itself is the node to delete
        if (root.val == key) {
            return helper(root);
        }

        TreeNode cur = root;

        // Search for the node to delete
        while (cur != null) {

            if (key < cur.val) {

                // Target is the left child
                if (cur.left != null && cur.left.val == key) {
                    cur.left = helper(cur.left);
                    break;
                }

                cur = cur.left;

            } else {

                // Target is the right child
                if (cur.right != null && cur.right.val == key) {
                    cur.right = helper(cur.right);
                    break;
                }

                cur = cur.right;
            }
        }

        // Return the original root
        return root;
    }

    // Deletes the current node and reconnects its subtrees
    private TreeNode helper(TreeNode root) {

        // Case 1: No left child
        if (root.left == null) {
            return root.right;
        }

        // Case 2: No right child
        if (root.right == null) {
            return root.left;
        }

        // Case 3: Both children exist
        TreeNode rightChild = root.right;

        // Find the rightmost node in the left subtree
        TreeNode lastRight = findLastRight(root.left);

        // Attach the original right subtree
        lastRight.right = rightChild;

        // The left subtree becomes the replacement
        return root.left;
    }

    // Returns the rightmost node in a subtree
    private TreeNode findLastRight(TreeNode root) {

        while (root.right != null) {
            root = root.right;
        }

        return root;
    }

    // Prints nodes in sorted order for testing
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * Initial BST:
         *
         *         6
         *        / \
         *       3   8
         *      / \  /
         *     2   4 7
         *
         * Delete key = 3
         */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);

        Solution solution = new Solution();

        int key = 3;
        root = solution.deleteNode(root, key);

        System.out.println("BST after deleting " + key + ":");
        solution.inorder(root);
    }
}
