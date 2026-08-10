<<<<<<< HEAD
// REVERSE OF A STRING USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class Buffer_String {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer newStr = new StringBuffer(str);
		System.out.println("THE REVERSE OF THE STRING \"" + str + "\" USING StringBuffer IS : " + newStr.reverse());
		sc.close();
	}
=======
// REVERSE OF A STRING USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class Buffer_String {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer newStr = new StringBuffer(str);
		System.out.println("THE REVERSE OF THE STRING \"" + str + "\" USING StringBuffer IS : " + newStr.reverse());
		sc.close();
	}
>>>>>>> f22e72f (DAY32)
}