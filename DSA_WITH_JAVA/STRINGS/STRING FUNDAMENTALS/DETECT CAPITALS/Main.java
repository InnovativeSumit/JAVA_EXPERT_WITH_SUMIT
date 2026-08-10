<<<<<<< HEAD
//  DETECTS CAPITALS IN A STRING
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main
{
	static boolean digitalCharacters(String word) {
	    char[] arr = word.toCharArray();
        int count = 0;
        // Count uppercase letters
        for (char ch : arr) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        // Case 1: All uppercase
        if (count == word.length()) {
            return true;
        }
        // Case 2: All lowercase
        if (count == 0) {
            return true;
        }
        // Case 3: Only first letter is uppercase
        if (count == 1 && Character.isUpperCase(arr[0])) {
            return true;
        }
        return false;
	    
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
public class Main
{
	static boolean digitalCharacters(String word) {
	    char[] arr = word.toCharArray();
        int count = 0;
        // Count uppercase letters
        for (char ch : arr) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        // Case 1: All uppercase
        if (count == word.length()) {
            return true;
        }
        // Case 2: All lowercase
        if (count == 0) {
            return true;
        }
        // Case 3: Only first letter is uppercase
        if (count == 1 && Character.isUpperCase(arr[0])) {
            return true;
        }
        return false;
	    
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