<<<<<<< HEAD
// IS SUBSEQUENCES
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
    
    static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int low  = 0;
        int high = 0;
        
        while(low<s.length() && high<t.length()){
            if(s.charAt(low) == t.charAt(high)){
                low++;
                high++;
            }
            else{
                high++;
            }
        }

        if(low == s.length()){
            return true;
        }
    return false;
        
    }


	public static void main(String[] args) {
	String s = "ace";
	String t = "abcde";
	
	if(!isSubsequence(s, t)){
	    System.out.println( s + " is not the subsequences of the  " + t );
	}
	else{
	    System.out.println(s + " is the subsequences of the  " + t );
	}
	
	}
=======
// IS SUBSEQUENCES
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
    
    static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int low  = 0;
        int high = 0;
        
        while(low<s.length() && high<t.length()){
            if(s.charAt(low) == t.charAt(high)){
                low++;
                high++;
            }
            else{
                high++;
            }
        }

        if(low == s.length()){
            return true;
        }
    return false;
        
    }


	public static void main(String[] args) {
	String s = "ace";
	String t = "abcde";
	
	if(!isSubsequence(s, t)){
	    System.out.println( s + " is not the subsequences of the  " + t );
	}
	else{
	    System.out.println(s + " is the subsequences of the  " + t );
	}
	
	}
>>>>>>> f22e72f (DAY32)
}