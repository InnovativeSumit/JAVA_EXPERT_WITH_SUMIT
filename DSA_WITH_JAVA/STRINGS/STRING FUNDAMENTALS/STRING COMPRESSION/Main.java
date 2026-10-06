<<<<<<< HEAD
// STRING COMPRESSIONS
// FIND THE DIFFERENCES
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main
{

	static int compress(char[] chars) {
		int i = 0;
		for (int j = 1, count = 1; j <= chars.length; j++, count++) {

			if (j == chars.length || chars[j] != chars[j - 1]) {
				chars[i++] = chars[j - 1];
				if (count >= 2) {
					for (char digit : String.valueOf(count).toCharArray()) {
						chars[i++] = digit;
					}
				}
				count = 0;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		char[] chars = {'a','a','b','b','c','c','c'};
		int len = compress(chars);
		System.out.println("Compressed Length: " + len);
		System.out.print("Compressed Array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}
=======
// STRING COMPRESSIONS
// FIND THE DIFFERENCES
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main
{

	static int compress(char[] chars) {
		int i = 0;
		for (int j = 1, count = 1; j <= chars.length; j++, count++) {

			if (j == chars.length || chars[j] != chars[j - 1]) {
				chars[i++] = chars[j - 1];
				if (count >= 2) {
					for (char digit : String.valueOf(count).toCharArray()) {
						chars[i++] = digit;
					}
				}
				count = 0;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		char[] chars = {'a','a','b','b','c','c','c'};
		int len = compress(chars);
		System.out.println("Compressed Length: " + len);
		System.out.print("Compressed Array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}
>>>>>>> f22e72f (DAY32)
