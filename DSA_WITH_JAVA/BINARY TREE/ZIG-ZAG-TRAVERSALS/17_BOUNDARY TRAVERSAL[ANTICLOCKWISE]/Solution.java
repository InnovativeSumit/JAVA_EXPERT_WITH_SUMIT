package DSA_WITH_JAVA.BINARY TREE.ZIG-ZAG-TRAVERSALS.17_BOUNDARY TRAVERSAL[ANTICLOCKWISE];

public /*
===========================================================
Problem Name: Boundary Traversal Anti-Clockwise
===========================================================

Optimal Approach:
Traverse the boundary of the binary tree in 3 steps:

1. Add the Left Boundary
   - Start from root.left.
   - Add only non-leaf nodes.
   - Prefer the left child; if unavailable, go to the right child.

2. Add All Leaf Nodes
   - Traverse the tree recursively.
   - Add every leaf node from left to right.

3. Add the Right Boundary in Reverse
   - Start from root.right.
   - Add only non-leaf nodes into a temporary list.
   - Prefer the right child; if unavailable, go to the left child.
   - Add the temporary list in reverse order.

Final Order:
Root → Left Boundary → Leaf Nodes → Right Boundary (Bottom to Top)

Time Complexity: O(N)
Space Complexity: O(N)
===========================================================
*/

import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    // -------------------------------------------------------
    // Check whether a node is a leaf node
    // -------------------------------------------------------
    boolean isLeaf(Node node) {

        return node.left == null && node.right == null;
    }


    // -------------------------------------------------------
    // STEP 1: Add Left Boundary
    // -------------------------------------------------------
    void addLeftBoundary(Node root, ArrayList<Integer> res) {

        Node cur = root.left;

        while (cur != null) {

            // Do not add leaf nodes here
            // because leaves will be added separately
            if (isLeaf(cur) == false) {
                res.add(cur.data);
            }

            // Prefer left child
            if (cur.left != null) {
                cur = cur.left;
            }

            // If left child is not available,
            // move to right child
            else {
                cur = cur.right;
            }
        }
    }


    // -------------------------------------------------------
    // STEP 2: Add All Leaf Nodes
    // -------------------------------------------------------
    void addLeaves(Node root, ArrayList<Integer> res) {

        // If current node is a leaf
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        // Traverse left subtree
        if (root.left != null) {
            addLeaves(root.left, res);
        }

        // Traverse right subtree
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }


    // -------------------------------------------------------
    // STEP 3: Add Right Boundary in Reverse
    // -------------------------------------------------------
    void addRightBoundary(Node root, ArrayList<Integer> res) {

        Node cur = root.right;

        // Temporary list to store right boundary
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while (cur != null) {

            // Do not add leaf nodes here
            if (isLeaf(cur) == false) {
                temp.add(cur.data);
            }

            // Prefer right child
            if (cur.right != null) {
                cur = cur.right;
            }

            // If right child is not available,
            // move to left child
            else {
                cur = cur.left;
            }
        }

        // Add right boundary from bottom to top
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }


    // -------------------------------------------------------
    // MAIN FUNCTION: Boundary Traversal Anti-Clockwise
    // -------------------------------------------------------
    ArrayList<Integer> printBoundary(Node root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();

        // Empty tree
        if (root == null) {
            return ans;
        }

        // If root itself is a leaf,
        // simply add it and return
        if (isLeaf(root)) {
            ans.add(root.data);
            return ans;
        }

        // Root
        ans.add(root.data);

        // STEP 1: Left Boundary
        addLeftBoundary(root, ans);

        // STEP 2: All Leaf Nodes
        addLeaves(root, ans);

        // STEP 3: Right Boundary in Reverse
        addRightBoundary(root, ans);

        return ans;
    }


    // -------------------------------------------------------
    // MAIN METHOD
    // -------------------------------------------------------
    public static void main(String[] args) {

        /*
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7
                   /     /
                  8     9

        Boundary Traversal Anti-Clockwise:

        1 → 2 → 4 → 8 → 6 → 9 → 7 → 3
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);


        Main obj = new Main();

        ArrayList<Integer> result = obj.printBoundary(root);

        System.out.println("Boundary Traversal Anti-Clockwise:");
        System.out.println(result);
    }
} {
  
}
