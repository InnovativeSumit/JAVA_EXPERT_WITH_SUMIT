//Leetcode 3340
// CHECK BALANCED STRING
// TC => O(N)
// SC => O(1)
public class Main {
	static boolean isBalanced(String num) {

		int evensum = 0;
		int oddsum = 0;

		for ( int i = 0 ; i < num.length() ; i++) {
			if (i % 2 == 0 ) {
				evensum += num.charAt(i)-'0';
			}
			else {
				oddsum += num.charAt(i)-'0';
			}
		}
		return oddsum == evensum;
	}

	public static void main (String[] args) {
		String num = "1210";
		if(isBalanced(num)) {
			System.out.println("The "+ num + " is a balanced String" );
		}
		else {
			System.out.println("The "+ num + " is not a balanced String" );
		}
	}
}