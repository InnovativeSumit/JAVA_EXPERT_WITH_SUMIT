import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int postIndex;
    static Map<Integer, Integer> inMap;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder == null
                || inorder.length != postorder.length) {
            return null;
        }

        postIndex = postorder.length - 1;
        inMap = new HashMap<>();

        // Store each inorder value and its index
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private static TreeNode build(
            int[] inorder, int[] postorder,
            int inStart, int inEnd) {

        // No nodes in this subtree
        if (inStart > inEnd) {
            return null;
        }

        // Last unused postorder value is the root
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int inRoot = inMap.get(rootValue);

        // Build right subtree first
        root.right = build(
                inorder, postorder, inRoot + 1, inEnd);

        // Then build left subtree
        root.left = build(
                inorder, postorder, inStart, inRoot - 1);

        return root;
    }

    // Print tree in preorder
    public static void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);

        System.out.print("Preorder traversal: ");
        printPreorder(root);
    }
}