<<<<<<< HEAD
// ISOMORPHIC strings
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main
{
	static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			// Character already mapped
			if (map.containsKey(ch1)) {
				// Mapping should be same
				if (map.get(ch1) != ch2) {
					return false;
				}
			}
			// Character not mapped
			else {
				// Another character is already mapped to ch2
				if (map.containsValue(ch2)) {
					return false;
				}
				map.put(ch1, ch2);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st String : ");
		String s = sc.nextLine();
		System.out.print("Enter the 2nd String : ");
		String t = sc.nextLine();
		if(isIsomorphic(s,t)) {
			System.out.println(s+ " & "+ t + " are isomorphic strings");
		}
		else {
			System.out.println(s+ " & "+ t + " are not  isomorphic strings");
		}

	}
=======
// ISOMORPHIC strings
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main
{
	static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			// Character already mapped
			if (map.containsKey(ch1)) {
				// Mapping should be same
				if (map.get(ch1) != ch2) {
					return false;
				}
			}
			// Character not mapped
			else {
				// Another character is already mapped to ch2
				if (map.containsValue(ch2)) {
					return false;
				}
				map.put(ch1, ch2);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st String : ");
		String s = sc.nextLine();
		System.out.print("Enter the 2nd String : ");
		String t = sc.nextLine();
		if(isIsomorphic(s,t)) {
			System.out.println(s+ " & "+ t + " are isomorphic strings");
		}
		else {
			System.out.println(s+ " & "+ t + " are not  isomorphic strings");
		}

	}
>>>>>>> f22e72f (DAY32)
}