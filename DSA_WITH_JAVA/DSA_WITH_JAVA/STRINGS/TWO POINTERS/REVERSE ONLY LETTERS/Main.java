<<<<<<< HEAD
// REVERSE ONLY LETTERS [ IN OPPOSITE DIRECTIONS]
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main {
	static String reverseOnlyLetters(String s) {
		int start = 0;
		int end = s.length()-1;
		char ch [] = s.toCharArray();
		while(start<end) {
			if(!Character.isLetter(ch[start])) {
				start++;
			}
			else if( !Character.isLetter(ch[end]) ) {
				end--;
			}

			else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}

		return new String(ch);
	}

	public static void main(String[]args) {
		String s ="a-bC-dEf-ghIj";
		String newstr = reverseOnlyLetters(s);
		System.out.println(newstr);

	}
=======
// REVERSE ONLY LETTERS [ IN OPPOSITE DIRECTIONS]
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main {
	static String reverseOnlyLetters(String s) {
		int start = 0;
		int end = s.length()-1;
		char ch [] = s.toCharArray();
		while(start<end) {
			if(!Character.isLetter(ch[start])) {
				start++;
			}
			else if( !Character.isLetter(ch[end]) ) {
				end--;
			}

			else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}

		return new String(ch);
	}

	public static void main(String[]args) {
		String s ="a-bC-dEf-ghIj";
		String newstr = reverseOnlyLetters(s);
		System.out.println(newstr);

	}
>>>>>>> f22e72f (DAY32)
}