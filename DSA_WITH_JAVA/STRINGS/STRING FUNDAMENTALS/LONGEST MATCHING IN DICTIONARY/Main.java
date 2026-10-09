import java.util.*;

public class Main {

    // Check whether 'word' is a subsequence of 's'
    static boolean isSubsequence(String s, String word) {
        int i = 0; // pointer for word
        int j = 0; // pointer for s
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }

    // Find the longest matching word
    static String findLongestWord(String s, ArrayList<String> d) {
        // Sort dictionary:
        // 1. Longer words first
        // 2. Lexicographically smaller first if same length
        Collections.sort(d, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            }
            return a.compareTo(b);
        });
        // Check every dictionary word
        for (String word : d) {
            if (isSubsequence(s, word)) {
                return word;
            }
        }
        // No valid word found
        return "";
    }

    public static void main(String[] args) {
        String s = "abpcplea";
        ArrayList<String> d = new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        String answer = findLongestWord(s, d);
        System.out.println("Longest matching word: " + answer);
    }
}