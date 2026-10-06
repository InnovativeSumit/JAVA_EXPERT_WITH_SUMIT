// CHECK WEATHE TWO STRINGS ALMOST EQUIVALENTS
// LEETCODE 2068
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
	public static  boolean checkAlmostEquivalent(String word1, String word2) {
        int len = word1.length();
        int[] freq = new int [26];

        for(int i = 0 ; i <len; i++){
            freq [word1.charAt(i)-'a']++;
            freq [word2.charAt(i)-'a']--;
        }

        for( int i = 0 ; i < 26 ; i++){
            if(Math.abs(freq[i])>3){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
    String word1 ="abcdeef";
    String word2 ="abaaacc";
    if(checkAlmostEquivalent(word1, word2)){
        System.out.println("Here both Strings are Almost Equivalent");
    }
    else{
        System.out.println("Here both Strings are not Almost Equivalent");
    }
    }

}