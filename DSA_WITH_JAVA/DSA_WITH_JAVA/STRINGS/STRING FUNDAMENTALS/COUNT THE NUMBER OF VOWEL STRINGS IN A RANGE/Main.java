// LEETCODE 2586
// COUNT THE NUMBER OF VOWEL STRINGS IN A RANGE
// TC => O(N)
// SC => O(1)

public class Main {

	public int vowelStrings(String[] words, int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			int s = words[i].charAt(0);
			int e = words[i].charAt(words[i].length() - 1);
			if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
				if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] words = {"are", "amy", "u"};
		int left = 0;
		int right = 2;
		Main obj = new Main();
		int result = obj.vowelStrings(words, left, right);
		System.out.println(result);
	}
}