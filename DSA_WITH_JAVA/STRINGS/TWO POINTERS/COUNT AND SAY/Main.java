import java.util.*;

class Main {
    // LeetCode 38
    // TIME COMPLEXITY  → O(N * L)
    // SPACE COMPLEXITY → O(L)
    //
    // N = number of terms
    // L = length of the current Count-and-Say string

    public static String countAndSay(int n) {
        // Base case
        if (n == 1) {
            return "1";
        }
        String number = "1";
        // Generate terms from 2 to n
        for (int i = 2; i <= n; i++) {
            StringBuilder res = new StringBuilder();
            int count = 1;
            // Traverse current string
            for (int j = 1; j < number.length(); j++) {
                // Same character
                if (number.charAt(j) == number.charAt(j - 1)) {
                    count++;
                }
                // Different character
                else {
                    // Add count + digit
                    res.append(count);
                    res.append(number.charAt(j - 1));
                    // Reset count
                    count = 1;
                }
            }
            // Add the last group
            res.append(count);
            res.append(number.charAt(number.length() - 1));
            // Move to next term
            number = res.toString();
        }
        return number;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        int n = 5;

        String ans = countAndSay(n);

        System.out.println("Count and Say:");

        System.out.println(ans);
    }
}