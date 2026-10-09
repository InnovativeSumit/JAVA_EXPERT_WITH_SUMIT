import java.util.*;

public class Main {

    public static String minWindow(String s, String t) {

        // If t is longer than s, answer is impossible
        if (s.length() < t.length()) {
            return "";
        }

        // Frequency of characters required from t
        int[] hash = new int[256];

        for (char ch : t.toCharArray()) {
            hash[ch]++;
        }

        int left = 0;
        int right = 0;

        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        // Sliding window
        while (right < s.length()) {

            char ch = s.charAt(right);

            // If this character is still required
            if (hash[ch] > 0) {
                count++;
            }

            // Add character to current window
            hash[ch]--;

            // When window contains all characters of t
            while (count == t.length()) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                hash[leftChar]++;

                // If removing this character makes the window invalid
                if (hash[leftChar] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        // No valid window found
        if (startIndex == -1) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String answer = minWindow(s, t);

        System.out.println("Minimum Window: " + answer);
    }
}