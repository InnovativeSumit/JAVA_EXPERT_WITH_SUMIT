public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void changeTree(Node root) {

        if (root == null) {
            return;
        }

        int child = 0;

        if (root.left != null) {
            child += root.left.data;
        }

        if (root.right != null) {
            child += root.right.data;
        }

        // Increase the parent or children to satisfy the property
        if (child >= root.data) {
            root.data = child;
        } else {
            if (root.left != null) {
                root.left.data = root.data;
            } else if (root.right != null) {
                root.right.data = root.data;
            }
        }

        // Recursively fix the left and right subtrees
        changeTree(root.left);
        changeTree(root.right);

        // Update parent using the modified children
        int total = 0;

        if (root.left != null) {
            total += root.left.data;
        }

        if (root.right != null) {
            total += root.right.data;
        }

        if (root.left != null || root.right != null) {
            root.data = total;
        }
    }

    // Inorder traversal to print the tree
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 50
                /  \
               7    2
              / \  / \
             3  5  1  30
        */

        Node root = new Node(50);
        root.left = new Node(7);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(5);

        root.right.left = new Node(1);
        root.right.right = new Node(30);

        changeTree(root);

        System.out.println("Inorder traversal after modification:");
        inorder(root);
    }
}