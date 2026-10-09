import java.util.*;

class Main {

    // LeetCode 567
    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(1)
    
    public static boolean checkInclusion(String s1, String s2) {
        // If s1 is longer, permutation is impossible
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        int[] window = new int[26];
        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int windowSize = s1.length();
        // Create first window
        for (int i = 0; i < windowSize; i++) {
            window[s2.charAt(i) - 'a']++;
        }
        // Check first window
        if (isSame(freq, window)) {
            return true;
        }

        // Sliding window
        for (int i = windowSize; i < s2.length(); i++) {
            // Add new character
            window[s2.charAt(i) - 'a']++;
            // Remove old character
            window[s2.charAt(i - windowSize) - 'a']--;
            // Check current window
            if (isSame(freq, window)) {
                return true;
            }
        }
        return false;
    }


    // Compare frequency arrays
    public static boolean isSame(int[] freq, int[] window) {

        for (int i = 0; i < 26; i++) {

            if (freq[i] != window[i]) {
                return false;
            }
        }

        return true;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = checkInclusion(s1, s2);

        System.out.println(ans);
    }
}