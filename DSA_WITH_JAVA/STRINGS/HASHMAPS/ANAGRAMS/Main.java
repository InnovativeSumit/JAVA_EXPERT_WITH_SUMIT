<<<<<<< HEAD
// ANAGRAMS CHECKS

// Time Complexity (TC)
// Let n = length of the strings.
// toCharArray() → O(n)
// Arrays.sort(ch1) → O(n log n)
// Arrays.sort(ch2) → O(n log n)
// Arrays.equals(ch1, ch2) → O(n)
// O(n)+O(nlogn)+O(nlogn)+O(n)=O(nlogn)
// Time Complexity: O(n log n)

// Space Complexity (SC)
// ch1 array → O(n)
// ch2 array → O(n)
// O(n)+O(n)=O(n)
// Space Complexity: O(n)

import java.util.*;

public class Main{
    static boolean isAnagrams(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            char ch1 []= s1.toCharArray();
            char ch2 []= s1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static void main(String[]args){
        String s1 ="keep";
        String s2 = "peek";
        if(isAnagrams(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        }
        else{
             System.out.println(s1 + "and " + s2 + " are not Anagrams");
        }
        
    }
=======
// ANAGRAMS CHECKS

// Time Complexity (TC)
// Let n = length of the strings.
// toCharArray() → O(n)
// Arrays.sort(ch1) → O(n log n)
// Arrays.sort(ch2) → O(n log n)
// Arrays.equals(ch1, ch2) → O(n)
// O(n)+O(nlogn)+O(nlogn)+O(n)=O(nlogn)
// Time Complexity: O(n log n)

// Space Complexity (SC)
// ch1 array → O(n)
// ch2 array → O(n)
// O(n)+O(n)=O(n)
// Space Complexity: O(n)

import java.util.*;

public class Main{
    static boolean isAnagrams(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            char ch1 []= s1.toCharArray();
            char ch2 []= s1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static void main(String[]args){
        String s1 ="keep";
        String s2 = "peek";
        if(isAnagrams(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        }
        else{
             System.out.println(s1 + "and " + s2 + " are not Anagrams");
        }
        
    }
>>>>>>> f22e72f (DAY32)
}