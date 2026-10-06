<<<<<<< HEAD
import java.util.*;
//TC => O(N)
//SC ==> O(1)
public class NormalLoop{
    
    static void ReverseArray(int[]array, int n){
        for(int i  = 0 ; i < n/2 ; i++){
            //swap(array[i],array[n-i-1]);
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
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
public class NormalLoop{
    
    static void ReverseArray(int[]array, int n){
        for(int i  = 0 ; i < n/2 ; i++){
            //swap(array[i],array[n-i-1]);
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
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