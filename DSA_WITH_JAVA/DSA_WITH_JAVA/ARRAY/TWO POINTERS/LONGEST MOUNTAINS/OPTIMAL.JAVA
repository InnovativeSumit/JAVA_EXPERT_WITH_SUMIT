<<<<<<< HEAD
import java.util.*;
// Time Complexity (Worst Case)	O(N²)
// Time Complexity (Best Case)	O(N)
// Space Complexity	O(1)
public class Main {

    static int longestMountain(int[] array, int n) {

        int ans = 0;

        for (int i = 1; i < n - 1; i++) {

            // Check if current element is a peak
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {

                int left = i;
                int right = i;
                int count = 0;

                // Expand to the left
                while (left > 0 && array[left] > array[left - 1]) {
                    left--;
                    count++;
                }

                // Expand to the right
                while (right < n - 1 && array[right] > array[right + 1]) {
                    right++;
                    count++;
                }

                ans = Math.max(ans, count + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 7, 4, 2, 3, 1};

        System.out.println("Longest Mountain Length = " +
                longestMountain(array, array.length));
    }
=======
import java.util.*;
// Time Complexity (Worst Case)	O(N²)
// Time Complexity (Best Case)	O(N)
// Space Complexity	O(1)
public class Main {

    static int longestMountain(int[] array, int n) {

        int ans = 0;

        for (int i = 1; i < n - 1; i++) {

            // Check if current element is a peak
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {

                int left = i;
                int right = i;
                int count = 0;

                // Expand to the left
                while (left > 0 && array[left] > array[left - 1]) {
                    left--;
                    count++;
                }

                // Expand to the right
                while (right < n - 1 && array[right] > array[right + 1]) {
                    right++;
                    count++;
                }

                ans = Math.max(ans, count + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 7, 4, 2, 3, 1};

        System.out.println("Longest Mountain Length = " +
                longestMountain(array, array.length));
    }
>>>>>>> f22e72f (DAY32)
}