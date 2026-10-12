import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    // Find the path from root to target node
    public static boolean getPath(
            TreeNode root, ArrayList<Integer> path, int target) {

        // Base case: node does not exist
        if (root == null) {
            return false;
        }

        // Add current node to path
        path.add(root.val);

        // Target found
        if (root.val == target) {
            return true;
        }

        // Search left or right subtree
        if (getPath(root.left, path, target)
                || getPath(root.right, path, target)) {
            return true;
        }

        // Backtrack: remove node if target not found here
        path.remove(path.size() - 1);

        return false;
    }

    public static ArrayList<Integer> solve(TreeNode root, int target) {
        ArrayList<Integer> path = new ArrayList<>();

        getPath(root, path, target);

        return path;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int target = 5;

        ArrayList<Integer> path = solve(root, target);

        System.out.println("Root to node path: " + path);
    }
}