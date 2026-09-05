// NUMBER OF SUBSTRINGS CONTAINING ALL THREE CHARACTERS
// OPTIMIZED APPROACH USING LAST SEEN
// WITH EVERY CHARACTERS , THERE IS A SUBSTRING THAT ENDS
// TC => O(N)
// SC => O(1)

import java.util.*;
class Main {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastSeen = {-1, -1, -1};
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            // Store last seen index
            lastSeen[s.charAt(i) - 'a'] = i;
            // If all three characters are present
            if (lastSeen[0] != -1 &&
                lastSeen[1] != -1 &&
                lastSeen[2] != -1) {
                cnt = cnt + 1 +
                      Math.min(lastSeen[0],
                      Math.min(lastSeen[1], lastSeen[2]));
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "bbacba";
        int ans = numberOfSubstrings(s);
        System.out.println(ans);
    }
}