<<<<<<< HEAD
 // GROUP ANAGRAMS
// N = Number of Strings
// K = Average Length of Each String
//
// Time Complexity  : O(N × K)
// Space Complexity : O(N × K) [HashMap storing all strings O(N × K)]

import java.util.*;
public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Key -> Frequency String
        // Value -> List of Anagrams
        Map<String, List<String>> map = new HashMap<>();
        // Traverse every string
        for (String s : strs) {
            // Frequency array for 26 lowercase letters
            int[] count = new int[26];
            // Count frequency of each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            // Build unique key
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add current string to its anagram group
            map.get(key).add(s);
        }
        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Main obj = new Main();   
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = obj.groupAnagrams(strs);
        System.out.println(ans);
    }
=======
 // GROUP ANAGRAMS
// N = Number of Strings
// K = Average Length of Each String
//
// Time Complexity  : O(N × K)
// Space Complexity : O(N × K) [HashMap storing all strings O(N × K)]

import java.util.*;
public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Key -> Frequency String
        // Value -> List of Anagrams
        Map<String, List<String>> map = new HashMap<>();
        // Traverse every string
        for (String s : strs) {
            // Frequency array for 26 lowercase letters
            int[] count = new int[26];
            // Count frequency of each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            // Build unique key
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add current string to its anagram group
            map.get(key).add(s);
        }
        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Main obj = new Main();   
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = obj.groupAnagrams(strs);
        System.out.println(ans);
    }
>>>>>>> f22e72f (DAY32)
} 