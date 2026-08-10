<<<<<<< HEAD
// REPEATING AND MISSING NO
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class NORMAL {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        long SN = (long) n * (n + 1) / 2;
        long S2N = (long) n * (n + 1) * (2L * n + 1) / 6;
        long S = 0;
        long S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long) a[i] * a[i];
        }
        // x - y
        long val1 = S - SN;
        // x² - y²
        long val2 = S2 - S2N;
        // x + y
        val2 = val2 / val1;
        // Repeating number
        long x = (val1 + val2) / 2;
        // Missing number
        long y = x - val1;
        return new int[]{(int) x, (int) y};
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
// SC ==> O(1)
public class NORMAL {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        long SN = (long) n * (n + 1) / 2;
        long S2N = (long) n * (n + 1) * (2L * n + 1) / 6;
        long S = 0;
        long S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long) a[i] * a[i];
        }
        // x - y
        long val1 = S - SN;
        // x² - y²
        long val2 = S2 - S2N;
        // x + y
        val2 = val2 / val1;
        // Repeating number
        long x = (val1 + val2) / 2;
        // Missing number
        long y = x - val1;
        return new int[]{(int) x, (int) y};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating Number = " + ans[0]);
        System.out.println("Missing Number = " + ans[1]);
    }
>>>>>>> f22e72f (DAY32)
}