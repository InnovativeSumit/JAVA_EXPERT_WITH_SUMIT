<<<<<<< HEAD
// COMPARE VERSION NUMBERS
// TC => O(N+M) 
// N =>  LENGTH OF VERSION1 STRING
// M =>  LENGTH OF VERSION2 STRING
// SC => 0(1)
import java.util.*;
public class Main
{
    
    static int compareVersion(String version1, String version2) {
        int low = 0;
        int high = 0;
        int v1 = version1.length();
        int v2 = version2.length();

        while (low < v1 || high < v2) {
            int n1 = 0;
            int n2 = 0;
            while (low < v1 && version1.charAt(low) != '.') {
                n1 = n1 * 10 + (version1.charAt(low) - '0');
                low++;
            }
            while (high < v2 && version2.charAt(high) != '.') {
                n2 = n2 * 10 + (version2.charAt(high) - '0');
                high++;
            }
            if (n1 < n2)
                return -1;
            if (n1 > n2)
                return 1;
            if (low < v1)
                low++;
            if (high < v2)
                high++;
        }
        return 0;
    }
	public static void main(String[] args) {
	    String version1 = "0.00000000009";
	    String version2 = "1.0";
	    int result = compareVersion(version1,version2);
		System.out.println("The output is: " + result);
	}
=======
// COMPARE VERSION NUMBERS
// TC => O(N+M) 
// N =>  LENGTH OF VERSION1 STRING
// M =>  LENGTH OF VERSION2 STRING
// SC => 0(1)
import java.util.*;
public class Main
{
    
    static int compareVersion(String version1, String version2) {
        int low = 0;
        int high = 0;
        int v1 = version1.length();
        int v2 = version2.length();

        while (low < v1 || high < v2) {
            int n1 = 0;
            int n2 = 0;
            while (low < v1 && version1.charAt(low) != '.') {
                n1 = n1 * 10 + (version1.charAt(low) - '0');
                low++;
            }
            while (high < v2 && version2.charAt(high) != '.') {
                n2 = n2 * 10 + (version2.charAt(high) - '0');
                high++;
            }
            if (n1 < n2)
                return -1;
            if (n1 > n2)
                return 1;
            if (low < v1)
                low++;
            if (high < v2)
                high++;
        }
        return 0;
    }
	public static void main(String[] args) {
	    String version1 = "0.00000000009";
	    String version2 = "1.0";
	    int result = compareVersion(version1,version2);
		System.out.println("The output is: " + result);
	}
>>>>>>> f22e72f (DAY32)
}