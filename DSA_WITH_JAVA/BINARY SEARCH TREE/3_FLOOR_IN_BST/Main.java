
/*
 * Problem: Floor in a Binary Search Tree (BST)
 *
 * Optimal Approach: Iterative BST Traversal
 *
 * Definition:
 * Floor of a key is the largest value in the BST
 * that is less than or equal to the given key.
 *
 * Time Complexity (TC):
 * O(H), where H is the height of the BST.
 * Average: O(log N) for a balanced BST.
 * Worst case: O(N) for a skewed BST.
 *
 * Space Complexity (SC):
 * O(1), because we use an iterative approach
 * without recursion or any extra data structure.
 *
 * If no floor exists, return -1.
 */

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
    }
}

public class Main {

    public static int floorInBST(TreeNode<Integer> root, int key) {

        int floor = -1;

        while (root != null) {

            // Exact match: the key itself is the floor
            if (root.data == key) {
                return root.data;
            }

            // If key is greater, current node is a candidate
            // Search right for a potentially larger valid value
            if (key > root.data) {
                floor = root.data;
                root = root.right;
            }

            // If key is smaller, search the left subtree
            else {
                root = root.left;
            }
        }

        // Return the largest value <= key, or -1 if absent
        return floor;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        /*
         * BST:
         *
         *         8
         *        / \
         *       4   12
         *      / \  / \
         *     2  6 10  14
         */

        TreeNode<Integer> root = new TreeNode<>(8);

        root.left = new TreeNode<>(4);
        root.right = new TreeNode<>(12);

        root.left.left = new TreeNode<>(2);
        root.left.right = new TreeNode<>(6);

        root.right.left = new TreeNode<>(10);
        root.right.right = new TreeNode<>(14);

        int key = 5;

        int result = floorInBST(root, key);

        System.out.println("Key: " + key);
        System.out.println("Floor: " + result);
    }
}
