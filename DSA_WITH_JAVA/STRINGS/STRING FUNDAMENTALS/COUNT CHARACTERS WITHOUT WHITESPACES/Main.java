<<<<<<< HEAD
// COUNT TOTAL NO OF CHARACTERS PRESENT INSIDE OF A STRING 
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("The total length of the String is: "+ n);
		
		String newStr = str.trim();
		int m = newStr.length();
		System.out.println("The total length of the String eliminating the leading and trailing whitespaces  is: "+ m);

		int count = 0;
		for(int i = 0 ; i< m; i++) {
			if(newStr.charAt(i) != ' ')
				count++;
		}

		System.out.println("The total no of the characters present inside of the string is : "+ count);
		sc.close();
	}
=======
// COUNT TOTAL NO OF CHARACTERS PRESENT INSIDE OF A STRING 
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("The total length of the String is: "+ n);
		
		String newStr = str.trim();
		int m = newStr.length();
		System.out.println("The total length of the String eliminating the leading and trailing whitespaces  is: "+ m);

		int count = 0;
		for(int i = 0 ; i< m; i++) {
			if(newStr.charAt(i) != ' ')
				count++;
		}

		System.out.println("The total no of the characters present inside of the string is : "+ count);
		sc.close();
	}
>>>>>>> f22e72f (DAY32)
}