<<<<<<< HEAD
// FRUITS INTO BASKETS
// TC => O(N) 
// N =>  LENGTH OF THE ARRAY
// SC => 0(1)
import java.util.*;
public class Main
{
    
    static int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        while (r < fruits.length) {
            // Put the current fruit into the basket
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);
            // If more than 2 fruit types are present
            if (mpp.size() > 2) {
                // Remove only ONE element from the left
                mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                if (mpp.get(fruits[l]) == 0) {
                    mpp.remove(fruits[l]);
                }
                l++;
            }

            // Valid window
            if (mpp.size() <= 2) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }
        return maxLen;   
    }
    
	public static void main(String[] args) {
	    int[]fruits = {3,3,3,2,1,1,2,1,1,2,3,3,1};
	    int result = totalFruit(fruits);
		System.out.println("The maximum no of fruits into the baskets upto two type is  is: " + result);
	}
=======
// FRUITS INTO BASKETS
// TC => O(N) 
// N =>  LENGTH OF THE ARRAY
// SC => 0(1)
import java.util.*;
public class Main
{
    
    static int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        while (r < fruits.length) {
            // Put the current fruit into the basket
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);
            // If more than 2 fruit types are present
            if (mpp.size() > 2) {
                // Remove only ONE element from the left
                mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                if (mpp.get(fruits[l]) == 0) {
                    mpp.remove(fruits[l]);
                }
                l++;
            }

            // Valid window
            if (mpp.size() <= 2) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }
        return maxLen;   
    }
    
	public static void main(String[] args) {
	    int[]fruits = {3,3,3,2,1,1,2,1,1,2,3,3,1};
	    int result = totalFruit(fruits);
		System.out.println("The maximum no of fruits into the baskets upto two type is  is: " + result);
	}
>>>>>>> f22e72f (DAY32)
}