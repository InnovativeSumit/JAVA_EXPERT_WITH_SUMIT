<<<<<<< HEAD
import java.util.*;
//STRING NAIVE ALGORITHOMS
//TC = O(N*M)
//SC = O(M) (because substring() creates a new String)
public class Main
{
    
    public static  int firstOccurences(String haystack, String needle) {
        int str1 = haystack.length();
        int str2 = needle.length();
        for(int i=0 ; i < (str1-str2)+1 ; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                //HERE I IS THE FISRT OCCURRENCES
                // AND ENDED WITH +I COZ LAST INDEX IS NOT VALID IN STRING 
                if(haystack.substring(i,str2+i).equals(needle)){
                    return i;
                }
            }
        } 

        return -1; 
    }

	public static void main(String[] args) {
	    String haystack = "sadbutsad";
	    String needle = "but";
		System.out.println("The first occurences of the substring in the main string is : "+ firstOccurences (haystack, needle));
	}
=======
import java.util.*;
//STRING NAIVE ALGORITHOMS
//TC = O(N*M)
//SC = O(M) (because substring() creates a new String)
public class Main
{
    
    public static  int firstOccurences(String haystack, String needle) {
        int str1 = haystack.length();
        int str2 = needle.length();
        for(int i=0 ; i < (str1-str2)+1 ; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                //HERE I IS THE FISRT OCCURRENCES
                // AND ENDED WITH +I COZ LAST INDEX IS NOT VALID IN STRING 
                if(haystack.substring(i,str2+i).equals(needle)){
                    return i;
                }
            }
        } 

        return -1; 
    }

	public static void main(String[] args) {
	    String haystack = "sadbutsad";
	    String needle = "but";
		System.out.println("The first occurences of the substring in the main string is : "+ firstOccurences (haystack, needle));
	}
>>>>>>> f22e72f (DAY32)
}