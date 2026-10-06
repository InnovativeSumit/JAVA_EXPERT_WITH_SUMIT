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

class Solution {

    // Pair = Node + Horizontal Distance
    static class Pair {

        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // TIME COMPLEXITY  → O(N log N)
    // SPACE COMPLEXITY → O(N)

    public static ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        // If tree is empty
        if (root == null) {
            return ans;
        }

        // TreeMap stores HD in sorted order
        Map<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        // Root has HD = 0
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            Node node = curr.node;
            int hd = curr.hd;

            // For Bottom View:
            // overwrite the previous node
            map.put(hd, node.data);

            // Left child → HD - 1
            if (node.left != null) {
                q.offer(new Pair(node.left, hd - 1));
            }

            // Right child → HD + 1
            if (node.right != null) {
                q.offer(new Pair(node.right, hd + 1));
            }
        }

        // TreeMap gives left → right order
        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
                \   \
                 4   5
                  \
                   6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(4);
        root.right.right = new Node(5);

        root.left.right.right = new Node(6);

        ArrayList<Integer> ans = bottomView(root);

        System.out.println("Bottom View of Binary Tree:");

        for (int value : ans) {
            System.out.print(value + " ");
        }
    }
}