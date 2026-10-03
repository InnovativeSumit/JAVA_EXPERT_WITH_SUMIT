<<<<<<< HEAD
import java.util.*;
public class BETTER

{
    static int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }
    
    public static void main(String[]args){
        int[]nums = {1,2,3};
        int k = 3;
        System.out.println("The subarray sum equals to "+k+" is: " + subarraySum(nums,k) );
    }
=======
import java.util.*;
public class BETTER

{
    static int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
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