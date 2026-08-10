<<<<<<< HEAD
import java.util.*;

public class TwoSumOptimal {
    public static List<Integer> findTwoSum(int[] array, int n, int target) {
       int right = 0;
       int left = n-1;
       
       while(left<right){
        int sum = array[left]+array[right];
        if(sum ==target){
            return Arrays.asList(array[left],array[right]);
        }
        else if (sum<target)
            left++;
        else right--;
       }
       return new  ArrayList<>();
    }

    public static void main(String[] args) {
    int[]array = {2,3,4,4,5};
    int target =7;
    int n = array.length;
    List<Integer>values = findTwoSum(array, n, target);
    System.out.print(values);

    for(int x : values){
        System.out.println(x + " ");
    }
}
}

=======
import java.util.*;

public class TwoSumOptimal {
    public static List<Integer> findTwoSum(int[] array, int n, int target) {
       int right = 0;
       int left = n-1;
       
       while(left<right){
        int sum = array[left]+array[right];
        if(sum ==target){
            return Arrays.asList(array[left],array[right]);
        }
        else if (sum<target)
            left++;
        else right--;
       }
       return new  ArrayList<>();
    }

    public static void main(String[] args) {
    int[]array = {2,3,4,4,5};
    int target =7;
    int n = array.length;
    List<Integer>values = findTwoSum(array, n, target);
    System.out.print(values);

    for(int x : values){
        System.out.println(x + " ");
    }
}
}

>>>>>>> f22e72f (DAY32)
