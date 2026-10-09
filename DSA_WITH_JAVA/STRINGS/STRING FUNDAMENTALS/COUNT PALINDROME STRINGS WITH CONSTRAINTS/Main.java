import java.util.*;

class Main {
    static final long MOD = 1000000007L;
    static int palindromicStrings(int n, int k) {
        long ans = 0;
        // ways = P(k, m)
        // Initially P(k, 0) = 1
        long ways = 1;
        for (int m = 0; 2 * m <= n && m <= k; m++) {
            // Calculate P(k, m)
            if (m > 0) {
                ways = (ways * (k - m + 1)) % MOD;
            }
            // Odd length = 2m + 1
            if (2 * m + 1 <= n) {
                // Middle character must be different
                // from the m characters already used.
                long odd = (ways * (k - m)) % MOD;
                ans = (ans + odd) % MOD;
            }
            // Even length = 2m
            if (m > 0 && 2 * m <= n) {
                // First half completely determines
                // the even-length palindrome.
                ans = (ans + ways) % MOD;
            }
        }
        return (int) ans;
    }


    // MAIN METHOD
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        int ans = palindromicStrings(n, k);
        System.out.println(ans);
    }
}