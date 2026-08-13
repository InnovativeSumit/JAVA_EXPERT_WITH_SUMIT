// LEETCODE 290
// WORD PATTERN
// TC => O(N*N)
// SC => O(N)

import java.util.*;

public class Main
{

	static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		if (pattern.length() != arr.length) {
			return false;
		}
		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			boolean containsKey = map.containsKey(ch);
			// Same word cannot be mapped to a different character
			if (map.containsValue(arr[i]) && !containsKey) {
				return false;
			}
			// Character already exists, so word must be the same
			if (containsKey && !map.get(ch).equals(arr[i])) {
				return false;
			}
			// New character -> new word
			else {
				map.put(ch, arr[i]);
			}
		}
		return true;
	}

	public static void main(String[]args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		if(wordPattern(pattern, s)) {
			System.out.println("PATTERN IS MATCHED");
		}
		else {
			System.out.println("PATTERN IS NPOT MATCHED");
		}

	}
}