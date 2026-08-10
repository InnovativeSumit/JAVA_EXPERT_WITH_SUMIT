<<<<<<< HEAD
//LOWER BOUND
import java.util.*;
//TC ==> O(LOGN)
//SC ==> O(1)
public class LowerBound {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;
        int ans = n ;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else  
            low = mid+1;  
        }
        return ans;
    }
// CPP STLL FORMULAS 
// lb = lower_bound(array.begin(),array.end(),n)-array.begin()
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int target = 20;
        int result = Binarysearch(array, target);
        System.out.print("The lower bound of the element is: "+ result);
        if (result!= array.length) {
            System.out.println("The lower bound element is : "+ array[result]);
        } else {
            System.out.println("The lower bound element is not present");
        }
    }
=======
//LOWER BOUND
import java.util.*;
//TC ==> O(LOGN)
//SC ==> O(1)
public class LowerBound {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;
        int ans = n ;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else  
            low = mid+1;  
        }
        return ans;
    }
// CPP STLL FORMULAS 
// lb = lower_bound(array.begin(),array.end(),n)-array.begin()
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int target = 20;
        int result = Binarysearch(array, target);
        System.out.print("The lower bound of the element is: "+ result);
        if (result!= array.length) {
            System.out.println("The lower bound element is : "+ array[result]);
        } else {
            System.out.println("The lower bound element is not present");
        }
    }
>>>>>>> f22e72f (DAY32)
}