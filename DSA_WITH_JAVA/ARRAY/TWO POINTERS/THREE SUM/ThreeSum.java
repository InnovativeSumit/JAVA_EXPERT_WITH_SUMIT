<<<<<<< HEAD
import java.util.*;
// ThreeSums problems
//TC ==> O(N)
//SC ==> o(N)
public class ThreeSum{
    public static List<Integer> ThreeSum (int[]array, int n, int target){
        for(int i = 0; i<n-2; i++){
            
            int left = i+1;
            int right = n-1;
            
            int needs = target - array[i];
            while(left<right){
                int sum = array[left]+ array[right];
                if(needs == sum){
                    return Arrays.asList(array[i], array[left], array[right]);
                }
                else if (sum<needs)
                left++;
                else 
                right--;
            }
        }
        return new ArrayList<>();
    }
    
    
    public static void main(String[] args){
        int[]array = {2,3,4,5,6,7,8,9};
        int n = array.length;
        int target = 20;
        
        List<Integer>values = ThreeSum(array,n, target);
        System.out.print(values);
    }
=======
import java.util.*;
// ThreeSums problems
//TC ==> O(N)
//SC ==> o(N)
public class ThreeSum{
    public static List<Integer> ThreeSum (int[]array, int n, int target){
        for(int i = 0; i<n-2; i++){
            
            int left = i+1;
            int right = n-1;
            
            int needs = target - array[i];
            while(left<right){
                int sum = array[left]+ array[right];
                if(needs == sum){
                    return Arrays.asList(array[i], array[left], array[right]);
                }
                else if (sum<needs)
                left++;
                else 
                right--;
            }
        }
        return new ArrayList<>();
    }
    
    
    public static void main(String[] args){
        int[]array = {2,3,4,5,6,7,8,9};
        int n = array.length;
        int target = 20;
        
        List<Integer>values = ThreeSum(array,n, target);
        System.out.print(values);
    }
>>>>>>> f22e72f (DAY32)
}