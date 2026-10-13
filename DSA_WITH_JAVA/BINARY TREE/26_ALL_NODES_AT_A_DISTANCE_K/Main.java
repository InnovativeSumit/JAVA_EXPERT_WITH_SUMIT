import java.util.*;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Step 1: Store each node's parent using BFS
    public static void markParents(
            TreeNode root,
            Map<TreeNode, TreeNode> parentTrack) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left != null) {
                parentTrack.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parentTrack.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    // Step 2: BFS from target in all three directions
    public static List<Integer> distanceK(
            TreeNode root, TreeNode target, int k) {

        List<Integer> result = new ArrayList<>();

        if (root == null || target == null) {
            return result;
        }

        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
        markParents(root, parentTrack);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int currentLevel = 0;

        while (!queue.isEmpty()) {

            if (currentLevel == k) {
                break;
            }

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                // Visit left child
                if (current.left != null
                        && visited.add(current.left)) {
                    queue.offer(current.left);
                }

                // Visit right child
                if (current.right != null
                        && visited.add(current.right)) {
                    queue.offer(current.right);
                }

                // Visit parent
                TreeNode parent = parentTrack.get(current);

                if (parent != null && visited.add(parent)) {
                    queue.offer(parent);
                }
            }

            currentLevel++;
        }

        // All remaining nodes are exactly distance k
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }

        return result;
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               5   1
              / \ / \
             6  2 0  8
               / \
              7   4
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode target = root.left; // Node 5
        int k = 2;

        List<Integer> result = distanceK(root, target, k);

        System.out.println("Nodes at distance " + k + ": " + result);
    }
}