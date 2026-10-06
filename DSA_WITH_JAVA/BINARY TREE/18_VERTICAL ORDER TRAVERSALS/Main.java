import java.util.*;

// TreeNode
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


// Tuple
class Tuple {

    TreeNode node;
    int row;
    int col;

    Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}


class Main {

    // LeetCode 987
    // TIME COMPLEXITY  → O(N log N)
    // SPACE COMPLEXITY → O(N)

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        /*
         * TreeMap
         *      column
         *        ↓
         *      TreeMap
         *        row
         *          ↓
         *      PriorityQueue
         *          ↓
         *       node values
         */

        TreeMap<Integer,
            TreeMap<Integer,
                PriorityQueue<Integer>>> map = new TreeMap<>();


        // Queue for BFS
        Queue<Tuple> q = new LinkedList<>();

        // Root starts at row = 0, col = 0
        q.offer(new Tuple(root, 0, 0));


        // BFS Traversal
        while (!q.isEmpty()) {

            Tuple tuple = q.poll();

            TreeNode node = tuple.node;

            int row = tuple.row;
            int col = tuple.col;


            // If column does not exist
            if (!map.containsKey(col)) {
                map.put(
                    col,
                    new TreeMap<>()
                );
            }


            // If row does not exist
            if (!map.get(col).containsKey(row)) {
                map.get(col).put(
                    row,
                    new PriorityQueue<>()
                );
            }


            // Store node value
            map.get(col)
               .get(row)
               .offer(node.val);


            // Left child
            if (node.left != null) {

                q.offer(
                    new Tuple(
                        node.left,
                        row + 1,
                        col - 1
                    )
                );
            }


            // Right child
            if (node.right != null) {

                q.offer(
                    new Tuple(
                        node.right,
                        row + 1,
                        col + 1
                    )
                );
            }
        }


        // Final answer
        List<List<Integer>> ans = new ArrayList<>();


        // TreeMap automatically gives columns
        // from smallest to largest
        for (TreeMap<Integer, PriorityQueue<Integer>> rows
                : map.values()) {

            List<Integer> column = new ArrayList<>();


            // Rows automatically sorted
            for (PriorityQueue<Integer> nodes
                    : rows.values()) {

                // Values sorted using PriorityQueue
                while (!nodes.isEmpty()) {

                    column.add(nodes.poll());
                }
            }

            ans.add(column);
        }


        return ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        /*
                 3
                / \
               9   20
                  /  \
                 15   7
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        Main obj = new Main();

        List<List<Integer>> ans =
            obj.verticalTraversal(root);


        System.out.println(
            "Vertical Traversal:"
        );

        System.out.println(ans);
    }
}