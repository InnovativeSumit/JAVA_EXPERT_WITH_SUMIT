// ZIGZAG CONVERSIONS
// LEETCODE 6
// TC => O(N*N)
// SC => O(N)
import java.util.*;

public class Main {
   public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;
        while (i < s.length()) {
            // Going DOWN
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index] += s.charAt(i++);
            }
            // Going UP
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index] += s.charAt(i++);
            }
        }

        String res = "";
        for (String str : ans) {
            res += str;
        }
        return res;
    }
    
    public static void main (String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String res = convert(s,numRows);
        System.out.println("After zigzag conversion : "+ res);
    }
}