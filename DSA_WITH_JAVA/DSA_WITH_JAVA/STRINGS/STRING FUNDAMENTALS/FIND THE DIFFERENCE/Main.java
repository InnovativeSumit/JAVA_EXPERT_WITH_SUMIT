<<<<<<< HEAD
// TWO SUMS USING HASHMAPS
// FIND THE DIFFERENCES
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main
{

	static char findTheDifference(String s, String t) {
		int total = 0;
		for (int i = 0 ; i <t.length() ; i++) {
			total = total + t.charAt(i);
		}

		for(int i = 0; i <s.length(); i++) {
			total = total - s.charAt(i);
		}

		return (char) total;
	}

	public static void main(String[] args) {
		String s = "Sumit";
		String t = "Sumita";
		System.out.print("The difference is: "+ findTheDifference(s,t));

	}
}
=======
// TWO SUMS USING HASHMAPS
// FIND THE DIFFERENCES
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main
{

	static char findTheDifference(String s, String t) {
		int total = 0;
		for (int i = 0 ; i <t.length() ; i++) {
			total = total + t.charAt(i);
		}

		for(int i = 0; i <s.length(); i++) {
			total = total - s.charAt(i);
		}

		return (char) total;
	}

	public static void main(String[] args) {
		String s = "Sumit";
		String t = "Sumita";
		System.out.print("The difference is: "+ findTheDifference(s,t));

	}
}
>>>>>>> f22e72f (DAY32)
