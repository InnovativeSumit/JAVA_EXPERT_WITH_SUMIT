// BIT MANIPULATION
// DECIMAL TO BINARY NUMBER CONVERSIONS
// 7 => 111 [DECIMAL TO BINARY]
// TC => O(LOGN)
// SC => O(LOGN)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
        int n = 13;
        String ans = "";
        while (n != 0) {
            if (n % 2 == 1) {
                ans = ans + "1";
            } else {
                ans = ans + "0";
            }
            n = n / 2;
        }

        // Reverse the answer
        String binary = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            binary = binary + ans.charAt(i);
        }

        System.out.println(binary);
	}
}