<<<<<<< HEAD
import java.util.*;

public class Space_Optimizers {
// DP solution using sPACE OPTIMIZATIONS
// Time Complexity = O(N)
// Space Complexity = O(1)
    static int fibonacci(int n) {
    // Base Case
    if(n <= 1)  return n;
    if(n == 2)  return 1;
    int[]dp = new int [3];
    // Initialize base values
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    // Build answer from bottom to top
    for(int i = 3; i <= n; i++){
        dp[0] = dp[1];
        dp[1] = dp[2];
        dp[2] = dp[0] + dp[1];
    }
    return dp[2];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
=======
import java.util.*;

public class Space_Optimizers {
// DP solution using sPACE OPTIMIZATIONS
// Time Complexity = O(N)
// Space Complexity = O(1)
    static int fibonacci(int n) {
    // Base Case
    if(n <= 1)  return n;
    if(n == 2)  return 1;
    int[]dp = new int [3];
    // Initialize base values
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    // Build answer from bottom to top
    for(int i = 3; i <= n; i++){
        dp[0] = dp[1];
        dp[1] = dp[2];
        dp[2] = dp[0] + dp[1];
    }
    return dp[2];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
>>>>>>> f22e72f (DAY32)
}