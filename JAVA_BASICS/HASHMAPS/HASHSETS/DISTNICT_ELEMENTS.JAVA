// DISTNICT ELEMENTS PRINT
// TC => O(N)
// SC => O(N)
import java.util.*;
public class DISTNICT_ELEMENTS
{
    static int distnict(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
         return set.size();
    }
    
	public static void main(String[] args) {
	    int[]nums = {2,1,2,1,2};
		System.out.println(distnict(nums));
	}
}