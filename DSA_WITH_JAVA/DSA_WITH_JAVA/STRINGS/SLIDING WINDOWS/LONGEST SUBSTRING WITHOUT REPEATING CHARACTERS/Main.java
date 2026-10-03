// LEETCODE 3
//LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS
// TC => O(N*N)
// SC => O(N)
import java.util.*;

public class Main {
      public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;

        List<Character> list = new ArrayList<>();

        while (end < s.length()) {

            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;

                max_length = Math.max(max_length, list.size());
            } 
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return max_length;
    
    }
    
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println("LENGH OF LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS "+ lengthOfLongestSubstring(s));
    }
}
