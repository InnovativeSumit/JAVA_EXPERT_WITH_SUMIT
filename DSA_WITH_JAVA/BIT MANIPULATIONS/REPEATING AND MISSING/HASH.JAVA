<<<<<<< HEAD
// REPEATING AND MISSING NO
import java.util.*;
// TC ==> O(N)
// SC ==> O(N) (Hash/Frequency Array)
public class HASH {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        // Hash array
        int[] hash = new int[n + 1];
        // Count frequency
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }
        int repeating = -1;
        int missing = -1;
        // Find repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating Number = " + ans[0]);
        System.out.println("Missing Number = " + ans[1]);
    }
=======
// REPEATING AND MISSING NO
import java.util.*;
// TC ==> O(N)
// SC ==> O(N) (Hash/Frequency Array)
public class HASH {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        // Hash array
        int[] hash = new int[n + 1];
        // Count frequency
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }
        int repeating = -1;
        int missing = -1;
        // Find repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating Number = " + ans[0]);
        System.out.println("Missing Number = " + ans[1]);
    }
>>>>>>> f22e72f (DAY32)
}