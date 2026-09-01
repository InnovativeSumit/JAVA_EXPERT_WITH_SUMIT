// BIT MANIPULATION
// XOR OF NUMBERS IN A GIVEN RANGE
// TC => O(1)
// SC => O(1)

import java.util.*;
class Main {
    public static int xorTillN(int n) {
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        if (n % 4 == 3) return 0;
        return n;
    }

    public static int xorRange(int l, int r) {
        return xorTillN(r) ^ xorTillN(l - 1);
    }
    public static void main(String[] args) {
        int l = 4;
        int r = 7;
        int ans = xorRange(l, r);
        System.out.println(ans);

    }

}