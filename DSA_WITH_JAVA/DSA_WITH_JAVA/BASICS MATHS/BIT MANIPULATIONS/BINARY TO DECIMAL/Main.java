// BIT MANIPULATION
// BINARY  TO DECIMAL NUMBER CONVERSIONS
// 111 => 7 [DECIMAL TO BINARY]
// TC  => O(N)
// SC  => O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
       String str = "1101";
        int num = 0;
        int p2 = 1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                num = num + p2;
            }
            p2 = p2 * 2;
        }
        System.out.println(num);

	}
}