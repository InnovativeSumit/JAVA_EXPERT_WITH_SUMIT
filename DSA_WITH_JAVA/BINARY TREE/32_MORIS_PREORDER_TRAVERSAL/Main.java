
import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;

        TreeNode curr = dummy;

        while (curr != null) {

            if (curr.left == null) {
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;

                // Find the rightmost node in the left subtree
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    // Create a temporary thread
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    // Process the reversed right boundary
                    addReverseBoundary(curr.left, prev, result);

                    // Remove the thread
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return result;
    }

    // Reverse the right pointers from start to end
    private static void reverseRight(TreeNode start, TreeNode end) {
        if (start == end) {
            return;
        }

        TreeNode prev = start;
        TreeNode curr = start.right;

        while (prev != end) {
            TreeNode next = curr.right;
            curr.right = prev;
            prev = curr;
            curr = next;
        }
    }

    // Add a reversed boundary, then restore it
    private static void addReverseBoundary(
            TreeNode start, TreeNode end, List<Integer> result) {

        reverseRight(start, end);

        TreeNode node = end;

        while (true) {
            result.add(node.val);

            if (node == start) {
                break;
            }

            node = node.right;
        }

        reverseRight(end, start);
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

        System.out.println(postorderTraversal(root));
    }
}
