import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int preorderIndex;
    static Map<Integer, Integer> inMap;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        preorderIndex = 0;
        inMap = new HashMap<>();

        // Store inorder values and their indices
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private static TreeNode build(
            int[] preorder, int inStart, int inEnd) {

        // No elements in this subtree
        if (inStart > inEnd) {
            return null;
        }

        // First unused preorder value is the root
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int inRoot = inMap.get(rootValue);

        // Construct left subtree first
        root.left = build(preorder, inStart, inRoot - 1);

        // Construct right subtree
        root.right = build(preorder, inRoot + 1, inEnd);

        return root;
    }

    // Print tree in level-order
    public static void printLevelOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.print("Level-order traversal: ");
        printLevelOrder(root);
    }
}