// LEETCODE 472
// CONCATENATED WORDS
// HASHSET + HASHMAP
//
// TC => O(n * L^2)
// SC => O(n * L)

import java.util.*;

class Solution {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> hs = new HashSet<>();
        // Put all words into HashSet
        for (String word : words) {
            hs.add(word);
        }
        List<String> results = new ArrayList<>();
        // Check every word
        for (String word : words) {
            // Remove current word so it cannot use itself
            hs.remove(word);
            Map<String, Boolean> hm = new HashMap<>();
            if (isConcatenated(word, hs, hm)) {
                results.add(word);
            }
            // Add the word back
            hs.add(word);
        }
        return results;
    }

    public static boolean isConcatenated(
            String word,
            Set<String> hs,
            Map<String, Boolean> hm) {
        // If already calculated
        if (hm.containsKey(word)) {
            return hm.get(word);
        }
        // Try every possible prefix
        for (int i = 0; i < word.length() - 1; i++) {
            String prefix = word.substring(0, i + 1);
            String suffix = word.substring(i + 1);
            // Case 1: both prefix and suffix are words
            if (hs.contains(prefix) && hs.contains(suffix)) {
                hm.put(word, true);
                return true;
            }
            // Case 2: prefix is a word and suffix can
            // be formed using multiple words
            if (hs.contains(prefix)
                    && isConcatenated(suffix, hs, hm)) {

                hm.put(word, true);
                return true;
            }
        }
        // Word cannot be formed
        hm.put(word, false);
        return false;
    }
}