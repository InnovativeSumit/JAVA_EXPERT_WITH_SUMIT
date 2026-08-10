// TWO SUM PROBLEMS
// TC => O(N)
// SC => O(N)

import java.util.*;
public class TWOSUM{
    
    static boolean twosum(int[]nums , int target){
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            int rem = target - x;
            if(set.contains(rem)){
                return true;
            }
            else{
                set.add(x);
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[]nums = {2,3,4,5,1};
        int target = 8;
        System.out.print(twosum(nums,target));
    }
}