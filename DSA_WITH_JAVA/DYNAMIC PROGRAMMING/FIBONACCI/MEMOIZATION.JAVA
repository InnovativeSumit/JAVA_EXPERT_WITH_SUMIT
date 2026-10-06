<<<<<<< HEAD
import java.util.*;

public class MEMOIZATION {
// DP solution using Top-Down Approach [Memoization]
// Time Complexity = O(N)
// Space Complexity = O(N)
    static int fibonacci(int n, int[] dp) {
        // Base Case
        if (n <= 1) return n;
        // Already calculated
        if (dp[n] != -1) return dp[n];
        // Store and return answer
        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Create DP array
        int[] dp = new int[n + 1];
        // Initialize with -1
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n, dp));
        sc.close();
    }
=======
import java.util.*;

public class MEMOIZATION {
// DP solution using Top-Down Approach [Memoization]
// Time Complexity = O(N)
// Space Complexity = O(N)
    static int fibonacci(int n, int[] dp) {
        // Base Case
        if (n <= 1) return n;
        // Already calculated
        if (dp[n] != -1) return dp[n];
        // Store and return answer
        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Create DP array
        int[] dp = new int[n + 1];
        // Initialize with -1
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n, dp));
        sc.close();
    }
>>>>>>> f22e72f (DAY32)
}