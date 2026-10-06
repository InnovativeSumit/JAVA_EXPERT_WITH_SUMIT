<<<<<<< HEAD
import java.util.*;
//TC ==> O(N)
//SC ==> O(1)
public class Main
{
	static int LengthOfLastWords(String s) {
		String str = s.trim();
		int n = str.length();
		int count = 0;
		for ( int i = n-1 ; i >=0 ; i--) {
			if( str.charAt(i) != ' ' ) {
				count++;
			}
			else {
				break;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String s = " I love my freind  ";
		String str = s.trim();
		int n = str.length();
		for(int i = n-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		System.out.println("The length of the last word is :"+LengthOfLastWords(s));
	}
=======
import java.util.*;
//TC ==> O(N)
//SC ==> O(1)
public class Main
{
	static int LengthOfLastWords(String s) {
		String str = s.trim();
		int n = str.length();
		int count = 0;
		for ( int i = n-1 ; i >=0 ; i--) {
			if( str.charAt(i) != ' ' ) {
				count++;
			}
			else {
				break;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String s = " I love my freind  ";
		String str = s.trim();
		int n = str.length();
		for(int i = n-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		System.out.println("The length of the last word is :"+LengthOfLastWords(s));
	}
>>>>>>> f22e72f (DAY32)
}