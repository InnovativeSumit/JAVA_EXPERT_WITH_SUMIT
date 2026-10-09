import java.util.*;
public class Main {

    static final long MOD = 1000000007L;
    // Fast Modular Exponentiation
    static long power(long a, long b) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return result;
    }

    static int computeValue(int n) {
        int max = 2 * n;
        long[] factorial = new long[max + 1];
        factorial[0] = 1;
        for (int i = 1; i <= max; i++) {
            factorial[i] =
                (factorial[i - 1] * i) % MOD;
        }

        // C(2n, n)
        long numerator = factorial[2 * n];
        long denominator = (factorial[n] * factorial[n]) % MOD;
        // denominator^(MOD-2) gives modular inverse
        long inverse = power(denominator, MOD - 2);
        return (int)((numerator * inverse) % MOD);
    }

    public static void main(String[] args) {
        int n = 2;
        int answer = computeValue(n);
        System.out.println(answer);
    }
}