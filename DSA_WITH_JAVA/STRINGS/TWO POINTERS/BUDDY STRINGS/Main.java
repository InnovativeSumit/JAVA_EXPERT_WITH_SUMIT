<<<<<<< HEAD
// BUDDY Strings
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main {
    static boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (n != m) return false;
        // Case 1: Strings are already equal
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
                if (freq[s.charAt(i) - 'a'] > 1)
                    return true;
            }
            return false;
        }
        // Case 2: Strings are different
        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1)
                    first = i;
                else if (second == -1)
                    second = i;
                else
                    return false; // More than 2 mismatches
            }
        }
        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
    
    public static void main(String[]args){
        String s ="ab";
        String goal = "aa";
        if(buddyStrings(s,goal)){
            System.out.print(s + " & " + goal + " are buddy strings" );
        }
        else{
             System.out.print(s + " & " + goal + " are not  buddy strings" );
        }
    }
=======
// BUDDY Strings
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main {
    static boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (n != m) return false;
        // Case 1: Strings are already equal
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
                if (freq[s.charAt(i) - 'a'] > 1)
                    return true;
            }
            return false;
        }
        // Case 2: Strings are different
        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1)
                    first = i;
                else if (second == -1)
                    second = i;
                else
                    return false; // More than 2 mismatches
            }
        }
        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
    
    public static void main(String[]args){
        String s ="ab";
        String goal = "aa";
        if(buddyStrings(s,goal)){
            System.out.print(s + " & " + goal + " are buddy strings" );
        }
        else{
             System.out.print(s + " & " + goal + " are not  buddy strings" );
        }
    }
>>>>>>> f22e72f (DAY32)
}