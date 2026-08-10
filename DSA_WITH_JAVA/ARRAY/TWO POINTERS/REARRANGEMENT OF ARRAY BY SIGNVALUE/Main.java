<<<<<<< HEAD
// REARRANGE ARRAY ELEMENTS BY SIGN VALUES
//.TC => O(N)
// SC =>O(N)
import java.util.*;
public class Main {
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int []temp = new int [n];
        int pos = 0; // Even Indices
        int neg = 1; // Odd Indices
        for(int i = 0 ; i < n ; i++){
            if(nums[i]>0){
                temp[pos]= nums[i];
                pos = pos+2;
            }
            else{
                temp[neg] = nums[i];
                neg = neg +2;
            }
        }
        return temp;
    }
    
    
    public static void main(String[] args){
        int[]nums = {7,6,8,-9,7,-9,-8,-5};
        int[] result = rearrangeArray(nums);
        for(int x : result){
            System.out.print(x + " ");
        }
    }
=======
// REARRANGE ARRAY ELEMENTS BY SIGN VALUES
//.TC => O(N)
// SC =>O(N)
import java.util.*;
public class Main {
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int []temp = new int [n];
        int pos = 0; // Even Indices
        int neg = 1; // Odd Indices
        for(int i = 0 ; i < n ; i++){
            if(nums[i]>0){
                temp[pos]= nums[i];
                pos = pos+2;
            }
            else{
                temp[neg] = nums[i];
                neg = neg +2;
            }
        }
        return temp;
    }
    
    
    public static void main(String[] args){
        int[]nums = {7,6,8,-9,7,-9,-8,-5};
        int[] result = rearrangeArray(nums);
        for(int x : result){
            System.out.print(x + " ");
        }
    }
>>>>>>> f22e72f (DAY32)
}