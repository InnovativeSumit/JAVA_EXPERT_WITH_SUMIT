import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)

    public static int[] stockSpan(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();


        // Traverse from left to right
        for (int i = 0; i < n; i++) {

            // Remove smaller or equal prices
            while (!st.empty() &&
                   arr[st.peek()] <= arr[i]) {

                st.pop();
            }


            // If stack is empty
            if (st.empty()) {

                ans[i] = i + 1;

            } else {

                // Previous Greater Element
                ans[i] = i - st.peek();
            }


            // Push current index
            st.push(i);
        }

        return ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        int[] ans = stockSpan(arr);


        System.out.println("Stock Span:");

        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + " ");
        }
    }
}