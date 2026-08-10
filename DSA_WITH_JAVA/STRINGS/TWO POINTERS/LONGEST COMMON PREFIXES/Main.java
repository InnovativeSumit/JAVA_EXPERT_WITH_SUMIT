<<<<<<< HEAD
// LONGEST COMMON PREFIXES
// TC ==> O(NLOGN*M)  // FOR SORTING NLOGN + TRAVERSAL O(M)
// N ==> LENGTH OF THE STRINGS
// M ==> MAXIMUM LENGTH OF THE STRING
// SC ==> O(1)

import java.util.*;
public class Main{
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }
    
    public static void main(String[]args){
        String [] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.print(ans);
    }
}
    
=======
// LONGEST COMMON PREFIXES
// TC ==> O(NLOGN*M)  // FOR SORTING NLOGN + TRAVERSAL O(M)
// N ==> LENGTH OF THE STRINGS
// M ==> MAXIMUM LENGTH OF THE STRING
// SC ==> O(1)

import java.util.*;
public class Main{
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }
    
    public static void main(String[]args){
        String [] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.print(ans);
    }
}
    
>>>>>>> f22e72f (DAY32)
