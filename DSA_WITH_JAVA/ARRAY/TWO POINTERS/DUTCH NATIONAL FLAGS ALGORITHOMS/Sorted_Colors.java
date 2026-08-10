<<<<<<< HEAD
import java.util.*;
public class Sorted_Colors{
    
    static void sortedArray(int[]array, int n) {
    int low = 0;
    int mid = 0;
    int high = n - 1;

    while (mid <= high) {
        if (array[mid] == 0) {
            int temp = array[low];
            array[low] = array[mid];
            array[mid] = temp;
            // swap(array[low], array[mid]);
            low++;
            mid++;
        }
        else if (array[mid] == 1) {
            mid++;
        }
        else { // array[mid] == 2
            // swap(array[mid], array[high]);
            int temp = array[mid];
            array[mid] = array[high];
            array[high] = temp;
            high--;
        }
    }
}

public static void main(String[]args) {
    int[]array = {0, 1, 2, 0, 1, 2, 0, 1, 2};
    int n = array.length;
    sortedArray(array, n);
    for (int x : array) {
       System.out.print(x+" ");
    }
    
}
}
=======
import java.util.*;
public class Sorted_Colors{
    
    static void sortedArray(int[]array, int n) {
    int low = 0;
    int mid = 0;
    int high = n - 1;

    while (mid <= high) {
        if (array[mid] == 0) {
            int temp = array[low];
            array[low] = array[mid];
            array[mid] = temp;
            // swap(array[low], array[mid]);
            low++;
            mid++;
        }
        else if (array[mid] == 1) {
            mid++;
        }
        else { // array[mid] == 2
            // swap(array[mid], array[high]);
            int temp = array[mid];
            array[mid] = array[high];
            array[high] = temp;
            high--;
        }
    }
}

public static void main(String[]args) {
    int[]array = {0, 1, 2, 0, 1, 2, 0, 1, 2};
    int n = array.length;
    sortedArray(array, n);
    for (int x : array) {
       System.out.print(x+" ");
    }
    
}
}
>>>>>>> f22e72f (DAY32)
