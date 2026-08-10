<<<<<<< HEAD
import java.util.*;

public class prog {

    public static void oddEvenorder(int[] array, int n) {
        // Two Pointers Concepts
        // int left = 0;
        // for(int i = 0; i< n; i++){
        // if(array[i]%2 ==1 ){
        // int temp = array[i];
        // array[i]= array[left];
        // array[left]= temp;
        // left++;
        // }

        // }
        // // Reverse odd part to make it descending
        // int i = 0, j = left - 1;
        // while (i < j) {
        // int temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // i++;
        // j--;
        // }

        // // Sort even part in ascending order
        // Arrays.sort(array, left, array.length)

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 1) {
                array[i] = -array[i];
            }
        }

        Arrays.sort(array, 0, array.length);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
                count++;
            }
        }
        Arrays.sort(array, count, array.length);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int n = array.length;

        oddEvenorder(array, n);
        
        System.out.print("Output: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
=======
import java.util.*;

public class prog {

    public static void oddEvenorder(int[] array, int n) {
        // Two Pointers Concepts
        // int left = 0;
        // for(int i = 0; i< n; i++){
        // if(array[i]%2 ==1 ){
        // int temp = array[i];
        // array[i]= array[left];
        // array[left]= temp;
        // left++;
        // }

        // }
        // // Reverse odd part to make it descending
        // int i = 0, j = left - 1;
        // while (i < j) {
        // int temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // i++;
        // j--;
        // }

        // // Sort even part in ascending order
        // Arrays.sort(array, left, array.length)

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 1) {
                array[i] = -array[i];
            }
        }

        Arrays.sort(array, 0, array.length);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
                count++;
            }
        }
        Arrays.sort(array, count, array.length);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int n = array.length;

        oddEvenorder(array, n);
        
        System.out.print("Output: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
>>>>>>> f22e72f (DAY32)
}