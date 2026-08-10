<<<<<<< HEAD
// FIND THE SECOND LARGEST ELEMENTS IN AN ARRAY
// USING ONE TRAVERSALS
import java.util.*;
public class SecondLargest {
//TC ==> O(N)
//SC ==> O(1)
    public static int SecondLargest(int[] array) {
        int n = array.length;
        int large = -1;
        int secondLarge = -1;
        
        for(int i = 0; i< n ; i++){
            if(array[i]>large){
                secondLarge=large;
                large = array[i];
            }
            else if(array[i]<large && array[i]>secondLarge){
                secondLarge = array[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Second Largest Elements Without Sorting by Optimal way using One passing = " + SecondLargest(array));
    }
=======
// FIND THE SECOND LARGEST ELEMENTS IN AN ARRAY
// USING ONE TRAVERSALS
import java.util.*;
public class SecondLargest {
//TC ==> O(N)
//SC ==> O(1)
    public static int SecondLargest(int[] array) {
        int n = array.length;
        int large = -1;
        int secondLarge = -1;
        
        for(int i = 0; i< n ; i++){
            if(array[i]>large){
                secondLarge=large;
                large = array[i];
            }
            else if(array[i]<large && array[i]>secondLarge){
                secondLarge = array[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Second Largest Elements Without Sorting by Optimal way using One passing = " + SecondLargest(array));
    }
>>>>>>> f22e72f (DAY32)
}