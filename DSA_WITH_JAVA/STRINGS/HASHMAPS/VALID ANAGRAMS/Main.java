<<<<<<< HEAD
// VALID ANAGRAMS STRINGS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;

public class Main
{
    static boolean isAnagram(String s, String t) {
        
       int n = s.length();
       int m = t.length();
       
        if (n != m) {
            return false;
        }
        
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true; 
    }

	public static void main(String[] args) {
	String s = "anagram";
	String t = "nagaram";
	
	if(!isAnagram(s, t)){
	    System.out.println(s + " and " + t + " are not  Anagrams strings");
	}
	else{
	    System.out.println(s + " and " + t + " are  Anagrams strings");
	}
	
	}
=======
// VALID ANAGRAMS STRINGS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;

public class Main
{
    static boolean isAnagram(String s, String t) {
        
       int n = s.length();
       int m = t.length();
       
        if (n != m) {
            return false;
        }
        
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true; 
    }

	public static void main(String[] args) {
	String s = "anagram";
	String t = "nagaram";
	
	if(!isAnagram(s, t)){
	    System.out.println(s + " and " + t + " are not  Anagrams strings");
	}
	else{
	    System.out.println(s + " and " + t + " are  Anagrams strings");
	}
	
	}
>>>>>>> f22e72f (DAY32)
}