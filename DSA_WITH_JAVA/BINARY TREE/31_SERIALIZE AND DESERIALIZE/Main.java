import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Codec {

        // Serialize the tree into a string
        public String serialize(TreeNode root) {

            if (root == null) {
                return "";
            }

            Queue<TreeNode> queue = new LinkedList<>();
            StringBuilder result = new StringBuilder();

            queue.offer(root);

            while (!queue.isEmpty()) {

                TreeNode node = queue.poll();

                if (node == null) {
                    result.append("n ");
                    continue;
                }

                result.append(node.val).append(" ");

                queue.offer(node.left);
                queue.offer(node.right);
            }

            return result.toString().trim();
        }

        // Deserialize the string into a tree
        public TreeNode deserialize(String data) {

            if (data == null || data.isEmpty()) {
                return null;
            }

            String[] values = data.split(" ");

            TreeNode root =
                    new TreeNode(Integer.parseInt(values[0]));

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            int i = 1;

            while (!queue.isEmpty() && i < values.length) {

                TreeNode parent = queue.poll();

                // Construct left child
                if (!values[i].equals("n")) {
                    TreeNode left =
                            new TreeNode(Integer.parseInt(values[i]));

                    parent.left = left;
                    queue.offer(left);
                }
                i++;

                // Construct right child
                if (i < values.length && !values[i].equals("n")) {
                    TreeNode right =
                            new TreeNode(Integer.parseInt(values[i]));

                    parent.right = right;
                    queue.offer(right);
                }
                i++;
            }

            return root;
        }
    }

    // Print tree in level order
    public static void printLevelOrder(TreeNode root) {

        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            System.out.print(node.val + " ");

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        System.out.println();
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
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Codec codec = new Codec();

        // Serialize
        String data = codec.serialize(root);
        System.out.println("Serialized tree: " + data);

        // Deserialize
        TreeNode restoredRoot = codec.deserialize(data);

        System.out.print("Restored tree (level order): ");
        printLevelOrder(restoredRoot);
    }
}