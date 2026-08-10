<<<<<<< HEAD

// TC => O(N)
// SC =>O(1)
import java.util.*;

public class Main {

    static int maxPointscards(int[] array, int k) {
        int n = array.length;
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        // Take first k cards
        for (int i = 0; i < k; i++) {
            leftsum += array[i];
        }
        maxsum = leftsum;
        int rightindex = n - 1;
        // Remove one from left and add one from right
        for (int i = k - 1; i >= 0; i--) {
            leftsum -= array[i];
            rightsum += array[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;

        System.out.println("The maximum value is : " + maxPointscards(array, k));
    }
=======

// TC => O(N)
// SC =>O(1)
import java.util.*;

public class Main {

    static int maxPointscards(int[] array, int k) {
        int n = array.length;
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        // Take first k cards
        for (int i = 0; i < k; i++) {
            leftsum += array[i];
        }
        maxsum = leftsum;
        int rightindex = n - 1;
        // Remove one from left and add one from right
        for (int i = k - 1; i >= 0; i--) {
            leftsum -= array[i];
            rightsum += array[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;

        System.out.println("The maximum value is : " + maxPointscards(array, k));
    }
>>>>>>> f22e72f (DAY32)
}