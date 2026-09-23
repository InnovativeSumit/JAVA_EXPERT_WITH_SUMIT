import java.util.*;
class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)
    // LEETCODE 735

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            // Positive asteroid → directly push
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            }
            // Negative asteroid → collision may happen
            else {
                // Remove smaller positive asteroids
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }

                // Same size → both destroyed
                if (!st.empty()  && st.peek() > 0 && st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                }

                // Negative asteroid survives
                else if (st.empty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }
        }

        // Convert stack to array
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        Main obj = new Main();
        int[] ans = obj.asteroidCollision(asteroids);
        System.out.println("Asteroids after collision:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}