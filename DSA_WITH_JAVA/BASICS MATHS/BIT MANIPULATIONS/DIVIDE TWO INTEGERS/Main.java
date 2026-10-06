// BIT MANIPULATION
// DIVIDE TWO INTEGERS
// Without using *, / or %
// TC => O(log N)
// SC => O(1)

class Solution {

    public int divide(int dividend, int divisor) {
        // Overflow case
        if (dividend == Integer.MIN_VALUE &&
            divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // Find sign of answer
        boolean sign = true;
        if (dividend < 0 && divisor >= 0)
            sign = false;
        if (dividend >= 0 && divisor < 0)
            sign = false;
        // Convert to positive long
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long quotient = 0;
        while (n >= d) {
            int cnt = 0;
            // Find largest multiple of divisor
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }
            // Add 2^cnt to quotient
            quotient += (1L << cnt);
            // Subtract divisor * 2^cnt
            n -= (d << cnt);
        }
        // Handle overflow
        if (quotient == (1L << 31) && sign) {
            return Integer.MAX_VALUE;
        }
        if (quotient == (1L << 31) && !sign) {
            return Integer.MIN_VALUE;
        }
        return sign ? (int) quotient : -(int) quotient;
    }
}