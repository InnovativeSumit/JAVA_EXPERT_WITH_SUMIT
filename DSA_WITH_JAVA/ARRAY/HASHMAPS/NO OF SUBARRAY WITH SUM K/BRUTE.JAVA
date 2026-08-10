<<<<<<< HEAD
// TC => O(N)
// SC  =>O(1)
import java.util.*;
public class BRUTE
{
    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i <n; i++){
            int sum =0;
            for(int j = i ; j<n ; j++){
                sum+=nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[]args){
        int[]nums = {1,2,3};
        int k = 3;
        System.out.println("The subarray sum equals to "+k+" is: " + subarraySum(nums,k) );
    }
=======
// TC => O(N)
// SC  =>O(1)
import java.util.*;
public class BRUTE
{
    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i <n; i++){
            int sum =0;
            for(int j = i ; j<n ; j++){
                sum+=nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[]args){
        int[]nums = {1,2,3};
        int k = 3;
        System.out.println("The subarray sum equals to "+k+" is: " + subarraySum(nums,k) );
    }
>>>>>>> f22e72f (DAY32)
}