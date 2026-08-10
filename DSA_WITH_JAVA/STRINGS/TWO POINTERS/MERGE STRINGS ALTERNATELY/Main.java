<<<<<<< HEAD
// MERGE STRINGS ALTERNATELY
// TC ==> O(N+M) 
// N ==> LENGTH OF THE WORD1 STRINGS
// M ==> LENGTH OF THE WORD2 STRINGS
// SC ==> O(1)

import java.util.*;
public class Main {
	static String mergeAlternately(String word1, String word2) {
		// int i=0;
		// int j=0;
		// StringBuilder sb = new StringBuilder();
		// while(i < word1.length() && j<word2.length()){
		//     char ch1 = word1.charAt(i);
		//     char ch2 = word2.charAt(j);
		//     sb.append(ch1);
		//     sb.append(ch2);
		//     i++;
		//     j++;
		// }
		// while(i<word1.length()){
		//     sb.append(word1.charAt(i));
		//     i++;
		// }
		// while(j<word2.length()){
		//     sb.append(word2.charAt(j));
		//     j++;
		// }

		// return sb.toString();

		char[] ans = new char[word1.length() + word2.length()];

		int i=0;
		int j=0;
		int k=0;

		while(i<word1.length() && j<word2.length()) {
			ans[k++] = word1.charAt(i++);
			ans[k++] = word2.charAt(j++);
		}
		while(i<word1.length()) {
			ans[k++] = word1.charAt(i++);
		}
		while(j<word2.length()) {
			ans[k++] = word2.charAt(j++);
		}
		return new String(ans);
	}


	public static void main(String[]args) {
		String word1 = "abc";
		String word2 = "pr";
		String ans = mergeAlternately(word1, word2);
		System.out.print(ans);
	}
}

=======
// MERGE STRINGS ALTERNATELY
// TC ==> O(N+M) 
// N ==> LENGTH OF THE WORD1 STRINGS
// M ==> LENGTH OF THE WORD2 STRINGS
// SC ==> O(1)

import java.util.*;
public class Main {
	static String mergeAlternately(String word1, String word2) {
		// int i=0;
		// int j=0;
		// StringBuilder sb = new StringBuilder();
		// while(i < word1.length() && j<word2.length()){
		//     char ch1 = word1.charAt(i);
		//     char ch2 = word2.charAt(j);
		//     sb.append(ch1);
		//     sb.append(ch2);
		//     i++;
		//     j++;
		// }
		// while(i<word1.length()){
		//     sb.append(word1.charAt(i));
		//     i++;
		// }
		// while(j<word2.length()){
		//     sb.append(word2.charAt(j));
		//     j++;
		// }

		// return sb.toString();

		char[] ans = new char[word1.length() + word2.length()];

		int i=0;
		int j=0;
		int k=0;

		while(i<word1.length() && j<word2.length()) {
			ans[k++] = word1.charAt(i++);
			ans[k++] = word2.charAt(j++);
		}
		while(i<word1.length()) {
			ans[k++] = word1.charAt(i++);
		}
		while(j<word2.length()) {
			ans[k++] = word2.charAt(j++);
		}
		return new String(ans);
	}


	public static void main(String[]args) {
		String word1 = "abc";
		String word2 = "pr";
		String ans = mergeAlternately(word1, word2);
		System.out.print(ans);
	}
}

>>>>>>> f22e72f (DAY32)
