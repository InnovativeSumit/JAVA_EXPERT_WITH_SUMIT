import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(H)
    // H = height of the tree

    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        rightView(root, result, 0);

        return result;
    }

    public static void rightView(
            TreeNode curr,
            List<Integer> result,
            int currDepth) {

        // Base case
        if (curr == null) {
            return;
        }

        // First node encountered at this depth
        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        // Visit RIGHT first
        rightView(curr.right, result, currDepth + 1);

        // Then visit LEFT
        rightView(curr.left, result, currDepth + 1);
    }


    // MAIN METHOD
    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
                \   \
                 5   4
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> ans = rightSideView(root);

        System.out.println("Right Side View:");

        for (int value : ans) {
            System.out.print(value + " ");
        }
    }
}


// Binary Tree Node
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}