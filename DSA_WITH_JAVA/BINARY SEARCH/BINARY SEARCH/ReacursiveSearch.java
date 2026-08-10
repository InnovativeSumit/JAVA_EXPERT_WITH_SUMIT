<<<<<<< HEAD
import java.util.*;
public class ReacursiveSearch {
    static int Binarysearch(int[] array, int target, int low , int high ) {
        
       if (low > high) return -1;
       
       int mid = low + (high - low) /2;
       if(array[mid] == target){
           return mid;
       }
       
       else if(array[mid] > target){
           return Binarysearch(array , target, low , mid-1);
       }
       
       else{
            return Binarysearch(array , target, mid+1 , high);
       }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int n = array.length;
        int low = 0;
        int high=n-1;
        
        int result = Binarysearch(array, target , low , high);
        if (result == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element " + target + " is found at index " + result);
        }
    }
}
=======
import java.util.*;
public class ReacursiveSearch {
    static int Binarysearch(int[] array, int target, int low , int high ) {
        
       if (low > high) return -1;
       
       int mid = low + (high - low) /2;
       if(array[mid] == target){
           return mid;
       }
       
       else if(array[mid] > target){
           return Binarysearch(array , target, low , mid-1);
       }
       
       else{
            return Binarysearch(array , target, mid+1 , high);
       }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int n = array.length;
        int low = 0;
        int high=n-1;
        
        int result = Binarysearch(array, target , low , high);
        if (result == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element " + target + " is found at index " + result);
        }
    }
}
>>>>>>> f22e72f (DAY32)
