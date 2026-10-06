<<<<<<< HEAD
import java.util.*;
// REVARSAL ALGORITHOMS
public class Revarsal {
    // Reverse the array from start to end
    static void reverse(int[] array, int low, int high) {
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

    // Left rotate the array by d positions
    static void rotateArray(int[] array, int d) {
        int n = array.length;
        d = d % n;
        reverse(array, 0, d - 1);
        reverse(array, d, n - 1);
        reverse(array, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 6, 7, 8, 8};
        int d = 2;
        rotateArray(array, d);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
=======
import java.util.*;
// REVARSAL ALGORITHOMS
public class Revarsal {
    // Reverse the array from start to end
    static void reverse(int[] array, int low, int high) {
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

    // Left rotate the array by d positions
    static void rotateArray(int[] array, int d) {
        int n = array.length;
        d = d % n;
        reverse(array, 0, d - 1);
        reverse(array, d, n - 1);
        reverse(array, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 6, 7, 8, 8};
        int d = 2;
        rotateArray(array, d);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
>>>>>>> f22e72f (DAY32)
}