// BIT MANIPULATION
// SWAP THE NUMBERS 
// TC => O(1)
// SC => O(1)

public class Main {
	public static void main(String[] args) {

		int a = 5;
		int n = 2;
		System.out.println("Before swapping the val of a i s: " + a);
		System.out.println("Before  swapping the val of a i s: " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping the val of a i s: " + a);
		System.out.println("After swapping the val of a i s: " + b);
	}
} 
