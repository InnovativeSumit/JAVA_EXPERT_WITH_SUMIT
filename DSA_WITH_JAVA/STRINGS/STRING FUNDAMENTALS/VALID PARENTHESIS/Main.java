// VALID PARENTHESIS
// LEETCODE 20
// TC => O(N*N)
// SC => O(N)

import java.util.*;

public class Main{
    static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            else if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
            else if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
            else {
                return s.isEmpty();
            }
        }
    }

public static void main(String[] args){
    String s ="[{()}]";
    // String s ="[]{}";
    if( isValid(s)){
        System.out.print(s + " is a valid Parenthesis");
    }
    
    else{
         System.out.print(s + " is not a valid parenthesis");
    }
}
}
    