// LEETCODE 383
// RANSOM NOTE
// TC => O(N+M)
// SC => O(26) // O(1)

import java.util.*;

public class Main
{
	static boolean canConstruct(String ransomNote, String magazine) {
		int[] freqArray = new int[26];

		for (char c : magazine.toCharArray()) {
			freqArray[c - 'a']++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (freqArray[c - 'a'] == 0) {
				return false;
			}
			freqArray[c - 'a']--;
		}
		return true;
	}

	public static void main(String[]args) {
		String ransomNote = "abc";
		String magazine = "aab";
		if(canConstruct(ransomNote,magazine)) {
			System.out.println("Ransomnote can be constructed using magazine");
		}
		else {
			System.out.println("Ransomnote cannot be constructed using magazine");
		}

	}
}