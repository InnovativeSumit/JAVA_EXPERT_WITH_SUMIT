<<<<<<< HEAD
import java.util.*;
//TC => O(N)
//SC ==> O(1)
public class TwoPointers{
    
    static void ReverseArray(int[]array, int n){
        int low = 0;
        int high = n-1;
        while(low<high){
            //swap(array[low],array[high]);
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[]args){
        int[]array = {1,2,3,4,5,6};
        int n = array.length;
        ReverseArray(array, n );
        
        for(int x: array){
            System.out.print(x+" ");
        }
    }
=======
import java.util.*;
//TC => O(N)
//SC ==> O(1)
public class TwoPointers{
    
    static void ReverseArray(int[]array, int n){
        int low = 0;
        int high = n-1;
        while(low<high){
            //swap(array[low],array[high]);
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[]args){
        int[]array = {1,2,3,4,5,6};
        int n = array.length;
        ReverseArray(array, n );
        
        for(int x: array){
            System.out.print(x+" ");
        }
    }
>>>>>>> f22e72f (DAY32)
}