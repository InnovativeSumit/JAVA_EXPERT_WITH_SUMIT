// LEETCODE 43
// MULTIPLY STRINGS
// TC => O(N*M)
// SC => O(N+M)

import java.util.*;

public class Main {
    
    public static String multiply(String num1, String num2) {
      // If either number is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        
        // Result can have at most n + m digits
        int[] res = new int[n + m];
        // Multiply each digit
        for (int i = n - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int mul = a * b;
                // Add multiplication and previous value
                int sum = mul + res[i + j + 1];
                // Store digit
                res[i + j + 1] = sum % 10;
                // Store carry
                res[i + j] += sum / 10;
            }
        }

        // Convert result array to String
        StringBuilder sb = new StringBuilder();
        for (int val : res) {
            // Skip leading zero
            if (sb.length() == 0 && val == 0) {
                continue;
            }
            sb.append((char) (val + '0'));
        }
        return sb.length() == 0 ? "0" : sb.toString();
}
    
    public static void main(String[] args) {

        String num1 = "8";
        String num2 = "9";
        String res = multiply(num1,num2);
        System.out.println(res);
    }
}