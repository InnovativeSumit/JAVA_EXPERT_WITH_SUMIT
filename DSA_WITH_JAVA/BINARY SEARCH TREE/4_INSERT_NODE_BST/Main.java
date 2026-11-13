
/*
 * Problem: Insert a Given Node in a Binary Search Tree (BST)
 *
 * Optimal Approach: Iterative BST Traversal
 *
 * Logic:
 * 1. If the root is null, create and return a new node.
 * 2. Traverse the BST to find the correct insertion position.
 * 3. If val is smaller than the current node, move left.
 * 4. If val is greater than or equal to the current node,
 *    move right.
 * 5. Insert the new node at the first available position.
 *
 * Time Complexity (TC):
 * O(H), where H is the height of the BST.
 * Balanced BST: O(log N)
 * Worst case (skewed BST): O(N)
 *
 * Space Complexity (SC):
 * O(1), because the algorithm is iterative and uses
 * only a constant number of extra variables.
 *
 * Note: This implementation inserts duplicate values
 * into the right subtree.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Main {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        // If the BST is empty, the new node becomes the root
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode cur = root;

        while (true) {

            // Insert into the right subtree for val >= cur.val
            if (val >= cur.val) {

                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = new TreeNode(val);
                    break;
                }

            } else {

                // Insert into the left subtree for val < cur.val
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = new TreeNode(val);
                    break;
                }
            }
        }

        // Return the original root of the BST
        return root;
    }

    // Helper method to print the BST in sorted order
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
         * Insert val = 5
         *
         * Result:
         *
         *         6
         *        / \
         *       3   8
         *      / \  /
         *     2   4 7
         *          \
         *           5
         */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);

        Main solution = new Main();

        int val = 5;
        root = solution.insertIntoBST(root, val);

        System.out.println("BST after insertion (inorder):");
        solution.inorder(root);
    }
}
