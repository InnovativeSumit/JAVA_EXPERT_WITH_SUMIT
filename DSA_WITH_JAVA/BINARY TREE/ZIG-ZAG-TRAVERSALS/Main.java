<<<<<<< HEAD
import java.util.*;

// ZIGZAG LEVEL ORDER TRAVERSAL
// TC ==> O(N)
// SC ==> O(N)

class Node {
    int data;
    Node right;
    Node left;
    Node(int data) {
        this.data = data;
        right = left = null;
    }
}


public class Main {
    public static List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<Node> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);
        boolean leftToRight = true;
        while(!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>(Collections.nCopies(size, 0));
            for(int i = 0; i < size; i++) {
                Node node = nodesQueue.poll();
                // Find position to insert value
                int index = leftToRight ? i : size - 1 - i;
                row.set(index, node.data);
                if(node.left != null) {
                    nodesQueue.offer(node.left);
                }
                if(node.right != null) {
                    nodesQueue.offer(node.right);
                }
            }
            // Change direction for next level
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> ans = zigZagLevelOrder(root);
        // Printing ZigZag Traversal
        for(List<Integer> row : ans) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
=======
import java.util.*;

// ZIGZAG LEVEL ORDER TRAVERSAL
// TC ==> O(N)
// SC ==> O(N)

class Node {
    int data;
    Node right;
    Node left;
    Node(int data) {
        this.data = data;
        right = left = null;
    }
}


public class Main {
    public static List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<Node> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);
        boolean leftToRight = true;
        while(!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>(Collections.nCopies(size, 0));
            for(int i = 0; i < size; i++) {
                Node node = nodesQueue.poll();
                // Find position to insert value
                int index = leftToRight ? i : size - 1 - i;
                row.set(index, node.data);
                if(node.left != null) {
                    nodesQueue.offer(node.left);
                }
                if(node.right != null) {
                    nodesQueue.offer(node.right);
                }
            }
            // Change direction for next level
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> ans = zigZagLevelOrder(root);
        // Printing ZigZag Traversal
        for(List<Integer> row : ans) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
>>>>>>> f22e72f (DAY32)
}