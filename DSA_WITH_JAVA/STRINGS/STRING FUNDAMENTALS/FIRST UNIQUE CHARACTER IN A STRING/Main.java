// LEETCODE 387
// FIRST UNIQUE CHARACTER IN A STRING
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main {
    static int firstUniqChar(String s) {
        int[] freq = new int[26];
        // FREQUENCY COUNT UPDATE
        char[] chars = s.toCharArray();
        for (char c : chars) {
            freq[c - 'a']++;
        }
        // FREQUENCY COUNT CHECK
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}