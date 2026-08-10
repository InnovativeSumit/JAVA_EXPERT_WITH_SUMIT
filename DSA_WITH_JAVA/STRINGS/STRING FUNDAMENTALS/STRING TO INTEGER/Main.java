<<<<<<< HEAD
// LEETCODE => 8
// STRING TO INTEGER
// TC => O(N)
// SC => O(N)

import java.util.*;
public class Main{
      static int myAtoi(String s) {
         // 1. Remove leading whitespaces
        s = s.trim();
        // Edge case
        if (s.isEmpty()) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        int num = 0;

        // 2. Check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Check overflow BEFORE multiplying
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return sign * num;
    }
    
    public static void main (String[]args){
        String s = " --042";
        // -042
        // 1337c0d3
        // 
        int res = myAtoi(s);
        System.out.println(res);
    }
=======
// LEETCODE => 8
// STRING TO INTEGER
// TC => O(N)
// SC => O(N)

import java.util.*;
public class Main{
      static int myAtoi(String s) {
         // 1. Remove leading whitespaces
        s = s.trim();
        // Edge case
        if (s.isEmpty()) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        int num = 0;

        // 2. Check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Check overflow BEFORE multiplying
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return sign * num;
    }
    
    public static void main (String[]args){
        String s = " --042";
        // -042
        // 1337c0d3
        // 
        int res = myAtoi(s);
        System.out.println(res);
    }
>>>>>>> f22e72f (DAY32)
}