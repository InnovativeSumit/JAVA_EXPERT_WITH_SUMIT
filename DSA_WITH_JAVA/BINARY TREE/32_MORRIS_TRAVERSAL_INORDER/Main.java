
import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {

            // No left subtree
            if (curr.left == null) {
                inorder.add(curr.val);
                curr = curr.right;
            } else {

                // Find inorder predecessor
                TreeNode prev = curr.left;

                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                // Create temporary thread
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {

                    // Remove thread and visit current node
                    prev.right = null;
                    inorder.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return inorder;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
                  \
                   6
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        System.out.println(inorderTraversal(root));
    }
}
