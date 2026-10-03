// LEETCODE 724
// FIND PIVOT INDEX
// TC => O(N)
// SC => O(1)
import java.util.*;

public class Main {
    public static int pivotIndex(int[] nums) {

        int n = nums.length;
        int totalsum = 0;

        for(int i = 0 ; i < n; i++){
            totalsum += nums[i];
        }

        int leftsum = 0;
        for(int i = 0; i < n; i++){
           int rightsum =  totalsum - leftsum - nums[i];
            if(leftsum == rightsum ){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
    
    public static void main(String[] args){
        int []nums = {1,7,3,6,5,6};
        System.out.println("The pivot index is : "+  pivotIndex(nums));
    }
}