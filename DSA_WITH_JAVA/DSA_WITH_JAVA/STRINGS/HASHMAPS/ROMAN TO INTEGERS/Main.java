<<<<<<< HEAD
// ROMAN TO INTEGERS LEETCODE 13
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main {
	static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result -= map.get(s.charAt(i));
			} else {
				result += map.get(s.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[]args) {
		String s = "MCMXCIV";
		int ans =  romanToInt(s);
		  System.out.print("The summation of he string is : " + ans);
	}

=======
// ROMAN TO INTEGERS LEETCODE 13
// TC => O(N)
// SC => O(1)

import java.util.*;
public class Main {
	static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result -= map.get(s.charAt(i));
			} else {
				result += map.get(s.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[]args) {
		String s = "MCMXCIV";
		int ans =  romanToInt(s);
		  System.out.print("The summation of he string is : " + ans);
	}

>>>>>>> f22e72f (DAY32)
}