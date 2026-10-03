<<<<<<< HEAD
// REPEATING AND MISSING NO
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class XOR {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        // XOR of all array elements and numbers from 1 to n
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr ^= a[i];
            xr ^= (i + 1);
        }
        // Rightmost set bit
        int number = xr & ~(xr - 1);
        int zero = 0;
        int one = 0;
        // Divide array elements into two groups
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one ^= a[i];
            } else {
                zero ^= a[i];
            }
        }
        // Divide numbers 1 to n into two groups
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }
        // Check which one is repeating
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) {
                count++;
            }
        }
        if (count == 2) {
            return new int[]{zero, one};   // {Repeating, Missing}
        }
        return new int[]{one, zero};       // {Repeating, Missing}
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating Number = " + ans[0]);
        System.out.println("Missing Number = " + ans[1]);
    }
=======
// REPEATING AND MISSING NO
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class XOR {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        // XOR of all array elements and numbers from 1 to n
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr ^= a[i];
            xr ^= (i + 1);
        }
        // Rightmost set bit
        int number = xr & ~(xr - 1);
        int zero = 0;
        int one = 0;
        // Divide array elements into two groups
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one ^= a[i];
            } else {
                zero ^= a[i];
            }
        }
        // Divide numbers 1 to n into two groups
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }
        // Check which one is repeating
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) {
                count++;
            }
        }
        if (count == 2) {
            return new int[]{zero, one};   // {Repeating, Missing}
        }
        return new int[]{one, zero};       // {Repeating, Missing}
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating Number = " + ans[0]);
        System.out.println("Missing Number = " + ans[1]);
    }
>>>>>>> f22e72f (DAY32)
}