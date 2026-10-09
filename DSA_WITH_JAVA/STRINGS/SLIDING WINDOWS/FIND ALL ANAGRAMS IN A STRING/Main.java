import java.util.*;

public class Main {

    // Find all starting indices of anagrams of p in s
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // If p is longer than s, no anagram is possible
        if (p.length() > s.length()) {
            return result;
        }

        // Frequency array for pattern p
        int[] pCount = new int[26];

        // Frequency array for current window in s
        int[] sCount = new int[26];

        // Count characters of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // Sliding window
        for (int i = 0; i < s.length(); i++) {

            // Add current character
            sCount[s.charAt(i) - 'a']++;

            // Remove character outside the window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // Check if current window is an anagram
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> answer = findAnagrams(s, p);

        System.out.println("Starting indices of anagrams: " + answer);
    }
}