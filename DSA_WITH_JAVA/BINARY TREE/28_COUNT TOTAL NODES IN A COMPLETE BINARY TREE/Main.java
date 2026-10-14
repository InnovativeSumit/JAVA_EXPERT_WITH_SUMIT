public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        // If heights are equal, this subtree is perfect
        if (leftHeight == rightHeight) {
            return (int) ((1L << leftHeight) - 1);
        }

        // Otherwise, recursively count both subtrees
        return 1 + countNodes(root.left)
                 + countNodes(root.right);
    }

    // Calculate height along the leftmost path
    private static int getLeftHeight(TreeNode node) {
        int height = 0;

        while (node != null) {
            height++;
            node = node.left;
        }

        return height;
    }

    // Calculate height along the rightmost path
    private static int getRightHeight(TreeNode node) {
        int height = 0;

        while (node != null) {
            height++;
            node = node.right;
        }

        return height;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \  /
             4  5 6
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Total nodes: " + countNodes(root));
    }
}