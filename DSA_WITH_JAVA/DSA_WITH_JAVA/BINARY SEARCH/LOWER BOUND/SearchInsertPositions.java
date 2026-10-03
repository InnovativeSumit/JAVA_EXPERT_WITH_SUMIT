<<<<<<< HEAD
//SEARCH INSERT POSITIONS PROBLEM IS EQUALS TO ==> LOWER BOUND PROBLEMS
import java.util.*;
//TC ==> O(LOGN)
//SC ==> O(1)
public class SearchInsertPositions {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;
        int ans = n ;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] >=target) {
                ans = mid;
                high = mid-1;
            } else  
            low = mid+1;
            
        }
        return ans;
    }
// CPP STLL FORMULAS 
// lb = upper_bound(array.begin(),array.end(),n)-array.begin()
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int target = 1;
        int result = Binarysearch(array, target);
        if (result == -1) {
            System.out.println("The element cannot be insertable ");
        } else {
            System.out.println("The element " + target + " can be inserted  at index " + result);
        }
    }
}
=======
//SEARCH INSERT POSITIONS PROBLEM IS EQUALS TO ==> LOWER BOUND PROBLEMS
import java.util.*;
//TC ==> O(LOGN)
//SC ==> O(1)
public class SearchInsertPositions {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;
        int ans = n ;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] >=target) {
                ans = mid;
                high = mid-1;
            } else  
            low = mid+1;
            
        }
        return ans;
    }
// CPP STLL FORMULAS 
// lb = upper_bound(array.begin(),array.end(),n)-array.begin()
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int target = 1;
        int result = Binarysearch(array, target);
        if (result == -1) {
            System.out.println("The element cannot be insertable ");
        } else {
            System.out.println("The element " + target + " can be inserted  at index " + result);
        }
    }
}
>>>>>>> f22e72f (DAY32)
