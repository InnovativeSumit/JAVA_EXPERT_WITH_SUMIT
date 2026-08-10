<<<<<<< HEAD
// VALID PALINDROME USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class Palindrome_Checker{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev =" ";
		int n = str.length();

		for(int i = n-1 ; i>= 0 ; i--) {
			rev = rev + str.charAt(i);

		}

		if(rev.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("The given string \"" +  str + "\" is a palindrome.");
		} else {
			System.out.println("The given string \"" + str + "\" is not a palindrome.");

			sc.close();
		}
	}
=======
// VALID PALINDROME USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class Palindrome_Checker{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev =" ";
		int n = str.length();

		for(int i = n-1 ; i>= 0 ; i--) {
			rev = rev + str.charAt(i);

		}

		if(rev.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("The given string \"" +  str + "\" is a palindrome.");
		} else {
			System.out.println("The given string \"" + str + "\" is not a palindrome.");

			sc.close();
		}
	}
>>>>>>> f22e72f (DAY32)
}