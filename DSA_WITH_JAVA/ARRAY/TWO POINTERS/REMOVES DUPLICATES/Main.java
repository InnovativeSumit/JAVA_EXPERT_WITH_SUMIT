<<<<<<< HEAD
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main {
    static int removeDuplicates(int[] array, int n) {
        if (n == 0) return 0;//EDGE CASE
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] != array[count - 1]) {
                array[count] = array[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3, 4};
        int len = removeDuplicates(array, array.length);
        System.out.println("Length after removing duplicates: " + len);

        System.out.print("Array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
=======
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main {
    static int removeDuplicates(int[] array, int n) {
        if (n == 0) return 0;//EDGE CASE
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] != array[count - 1]) {
                array[count] = array[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3, 4};
        int len = removeDuplicates(array, array.length);
        System.out.println("Length after removing duplicates: " + len);

        System.out.print("Array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
>>>>>>> f22e72f (DAY32)
}