// REPEATED SUBSTRING PATTERNS
// LEETCODE 459 
// TC => O(N*N)
// SC => O(N)

import java.util.*;

public class Main{
    static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                String substr = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                
                for (int j = 0; j < n / i; j++) {
                    sb.append(substr);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

public static void main(String[] args){
    String s ="abcabcabc";
    if( repeatedSubstringPattern(s)){
        System.out.print(s +" contains repeated substring");
    }
    
    else{
         System.out.print(s +" does not contains repeated substring");
    }
}
}
    