// LONGEST SUBSTRING WITH AT MOST K DISTINCT CHARACTERS
// SLIDING WINDOW + HASHMAP
// TC => O(N)
// SC => O(K)

import java.util.*;

class Main {
    public static int longestKSubstr(String s, int k) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        while (r < s.length()) {
            // Add character to map
            mpp.put(s.charAt(r),
                    mpp.getOrDefault(s.charAt(r), 0) + 1);
            // If distinct characters > k
            while (mpp.size() > k) {
                mpp.put(s.charAt(l),
                        mpp.get(s.charAt(l)) - 1);
                // Remove character if frequency becomes 0
                if (mpp.get(s.charAt(l)) == 0) {
                    mpp.remove(s.charAt(l));
                }
                l++;
            }
            // Update maximum length
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }


public static void main(String[] args) {
    String s = "aaabbccd";
    int k = 2;
    int ans = longestKSubstr(s, k);
    System.out.println(ans);
}
}