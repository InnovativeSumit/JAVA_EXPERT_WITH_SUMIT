<<<<<<< HEAD
import java.util.*;

public class TABULATION {
// DP solution using Bottom-Up Approach [Tabulation]
// Time Complexity = O(N)
// Space Complexity = O(N)
    static int fibonacci(int n) {
    // Base Case
    if(n <= 1)  return n;
    int[]dp = new int [n+1];
    // Initialize base values
    dp[0] = 0;
    dp[1] = 1;
    // Build answer from bottom to top
    for(int i = 2; i <= n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
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

public class TABULATION {
// DP solution using Bottom-Up Approach [Tabulation]
// Time Complexity = O(N)
// Space Complexity = O(N)
    static int fibonacci(int n) {
    // Base Case
    if(n <= 1)  return n;
    int[]dp = new int [n+1];
    // Initialize base values
    dp[0] = 0;
    dp[1] = 1;
    // Build answer from bottom to top
    for(int i = 2; i <= n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
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