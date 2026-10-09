
import java.util.*;

public class Main {

    /*
     * Problem: Minimum Operations to Reach n
     *
     * Starting from 0, find the minimum number of operations
     * required to reach n.
     *
     * Allowed operations:
     * 1. Add 1
     * 2. Double the number
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */

    public static int minOperation(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(minOperation(n));

        sc.close();
    }
}