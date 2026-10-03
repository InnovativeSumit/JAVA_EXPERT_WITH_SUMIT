// VALID PARENTHESES
// STACK
// TC => O(N)
// SC => O(N)

import java.util.*;
class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // Opening brackets
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '[' ||
                s.charAt(i) == '{') {

                st.push(s.charAt(i));
            }

            // Closing brackets
            else {
                if (st.empty()) {
                    return false;
                }
                char ch = st.top();
                st.pop();
                if (s.charAt(i) == ')' && ch != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && ch != '[') {
                    return false;
                }
                if (s.charAt(i) == '}' && ch != '{') {
                    return false;
                }
            }
        }
        return st.empty();
    }
}

public class Main {

    public static void main(String[] args) {

        String s = "({[]})";

        boolean ans = Solution.isValid(s);

        System.out.println(ans);
    }
}