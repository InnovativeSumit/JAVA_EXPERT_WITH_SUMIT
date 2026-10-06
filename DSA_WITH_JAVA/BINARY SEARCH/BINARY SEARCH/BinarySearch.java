<<<<<<< HEAD
import java.util.*;
public class BinarySearch {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int result = Binarysearch(array, target);

        if (result == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element " + target + " is found at index " + result);
        }
    }
=======
import java.util.*;
public class BinarySearch {
    static int Binarysearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int result = Binarysearch(array, target);

        if (result == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element " + target + " is found at index " + result);
        }
    }
>>>>>>> f22e72f (DAY32)
}