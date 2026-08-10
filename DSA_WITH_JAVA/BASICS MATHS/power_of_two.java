<<<<<<< HEAD
// POWER OF TWOS
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main
{
	static boolean isPowerOfTwo(int n) {
		if(n == 0) return false;
		while(n != 1) {
			if ( n % 2 != 0) return false;
			else n = n/2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(isPowerOfTwo(n)) {
			System.out.println(n+" is a power of two");
		}
		else {
			System.out.println(n+" is not a power of two");
		}
	}
=======
// POWER OF TWOS
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main
{
	static boolean isPowerOfTwo(int n) {
		if(n == 0) return false;
		while(n != 1) {
			if ( n % 2 != 0) return false;
			else n = n/2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(isPowerOfTwo(n)) {
			System.out.println(n+" is a power of two");
		}
		else {
			System.out.println(n+" is not a power of two");
		}
	}
>>>>>>> f22e72f (DAY32)
}