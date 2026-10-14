import java.util.*;

public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Step 1: Store parent of every node and find the start node
    static Node markParents(
            Node root,
            Map<Node, Node> parentTrack,
            int start) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        Node target = null;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data == start) {
                target = current;
            }

            if (current.left != null) {
                parentTrack.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parentTrack.put(current.right, current);
                queue.offer(current.right);
            }
        }

        return target;
    }

    // Step 2: BFS from the start node to calculate burn time
    static int findMaxDistance(
            Map<Node, Node> parentTrack, Node target) {

        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean spread = false;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Spread fire to the left child
                if (current.left != null
                        && visited.add(current.left)) {
                    queue.offer(current.left);
                    spread = true;
                }

                // Spread fire to the right child
                if (current.right != null
                        && visited.add(current.right)) {
                    queue.offer(current.right);
                    spread = true;
                }

                // Spread fire to the parent
                Node parent = parentTrack.get(current);

                if (parent != null && visited.add(parent)) {
                    queue.offer(parent);
                    spread = true;
                }
            }

            if (spread) {
                time++;
            }
        }

        return time;
    }

    static int minTime(Node root, int start) {
        if (root == null) {
            return 0;
        }

        Map<Node, Node> parentTrack = new HashMap<>();

        Node target = markParents(root, parentTrack, start);

        if (target == null) {
            return 0;
        }

        return findMaxDistance(parentTrack, target);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              /   / \
             4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        int start = 2;

        System.out.println("Minimum burn time: "
                + minTime(root, start));
    }
}