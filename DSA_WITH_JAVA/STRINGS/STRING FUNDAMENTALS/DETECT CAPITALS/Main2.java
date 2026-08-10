<<<<<<< HEAD
//  DETECTS CAPITALS IN A STRING
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main2
{
	static boolean digitalCharacters(String word) {
		if (word.length() <= 1) {
			return true;
		}

		// Determine the expected case from the second character
		boolean secondUpper = Character.isUpperCase(word.charAt(1));

		// Check all remaining characters
		for (int i = 2; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)) != secondUpper) {
				return false;
			}
		}

		// If second is uppercase, first must also be uppercase.
		// If second is lowercase, first can be uppercase or lowercase.
		return !secondUpper || Character.isUpperCase(word.charAt(0));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String word = sc.nextLine();
		if( digitalCharacters(word)) {
			System.out.println("Captils is detected succesfully");
		}
		else {
			System.out.println("Captils is undetected succesfully");
		}


}
=======
//  DETECTS CAPITALS IN A STRING
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main2
{
	static boolean digitalCharacters(String word) {
		if (word.length() <= 1) {
			return true;
		}

		// Determine the expected case from the second character
		boolean secondUpper = Character.isUpperCase(word.charAt(1));

		// Check all remaining characters
		for (int i = 2; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)) != secondUpper) {
				return false;
			}
		}

		// If second is uppercase, first must also be uppercase.
		// If second is lowercase, first can be uppercase or lowercase.
		return !secondUpper || Character.isUpperCase(word.charAt(0));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String word = sc.nextLine();
		if( digitalCharacters(word)) {
			System.out.println("Captils is detected succesfully");
		}
		else {
			System.out.println("Captils is undetected succesfully");
		}


}
>>>>>>> f22e72f (DAY32)
}