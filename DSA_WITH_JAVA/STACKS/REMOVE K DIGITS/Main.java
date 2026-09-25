import java.util.*;
class Main {

    // LeetCode 402
    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(N)

    public String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        // Traverse the string
        for (int i = 0; i < n; i++) {
            // Remove larger digits from stack
            while (!st.empty()
                    && k > 0
                    && st.peek() - '0' > s.charAt(i) - '0') {
                st.pop();
                k--;
            }
            // Push current digit
            st.push(s.charAt(i));
        }

        // If k is still remaining,
        // remove digits from the end
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build answer
        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.peek());
            st.pop();
        }
        // Reverse because stack gives reverse order
        res.reverse();
        // Remove leading zeroes
        int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }
        res = new StringBuilder(res.substring(i));
        // If empty, return "0"
        if (res.length() == 0) {
            return "0";
        }
        return res.toString();
    }


    // MAIN METHOD
    public static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        Main obj = new Main();
        String ans = obj.removeKdigits(s, k);
        System.out.println("Smallest Number: " + ans);
    }
}