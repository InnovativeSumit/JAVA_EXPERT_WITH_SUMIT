// INFIX TO POSTFIX CONVERSION
// STACK
// TC => O(N)
// SC => O(N)

import java.util.*;

class Main {
    // Priority of operators
    public static int priority(char ch) {
        if (ch == '^') {
            return 3;
        }
        else if (ch == '*' || ch == '/') {
            return 2;
        }
        else if (ch == '+' || ch == '-') {
            return 1;
        }

        return -1;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            // Operand
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans.append(s.charAt(i));
            }
            // Opening bracket
            else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            // Closing bracket
            else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop(); // remove '('
            }
            // Operator
            else {
                while (!st.isEmpty() &&
                       priority(s.charAt(i)) <= priority(st.peek())) {
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        // Pop remaining operators
        while (!st.isEmpty()) {
            ans.append(st.peek());
            st.pop();
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String ans = infixToPostfix(s);
        System.out.println(ans);
    }
}