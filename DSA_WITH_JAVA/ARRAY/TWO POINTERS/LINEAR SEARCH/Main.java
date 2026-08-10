<<<<<<< HEAD
// LINEAR SEARCH ON ARRAY
// TC => O(N)
// BEST APPROACH IS BINARY SEARCH BUT AT THAT CASE ARRAY MUST BE IN SORTED ORDER
// SC => O(1)

import java.util.*;
public class Main
{

	static boolean lineaSearch(int[]array, int target) {
		int n = array.length;
		for (int i= 0 ; i<n ; i++) {
			if(array[i]== target) {
				return true;
			}
		}
		return false;

	}
	public static void main(String[] args) {
		System.out.print("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print("\n");
		int[]array = new int[num];
		System.out.print("Enter the values: ");
		for(int i = 0; i< num ; i++) {
			array[i]=sc.nextInt();
		}

		System.out.print("\n ");
		System.out.print("Your array is: ");
		for(int x : array) {
			System.out.print(x+" ");
		}

		System.out.print("\n ");
		int target = 8;
		if(lineaSearch(array,target)) {
			System.out.println("Your target element "+target + " is present in the array");
		}
		else {
			System.out.println("Your target element "+target + " is not present in the array");
		}

	}
=======
// LINEAR SEARCH ON ARRAY
// TC => O(N)
// BEST APPROACH IS BINARY SEARCH BUT AT THAT CASE ARRAY MUST BE IN SORTED ORDER
// SC => O(1)

import java.util.*;
public class Main
{

	static boolean lineaSearch(int[]array, int target) {
		int n = array.length;
		for (int i= 0 ; i<n ; i++) {
			if(array[i]== target) {
				return true;
			}
		}
		return false;

	}
	public static void main(String[] args) {
		System.out.print("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print("\n");
		int[]array = new int[num];
		System.out.print("Enter the values: ");
		for(int i = 0; i< num ; i++) {
			array[i]=sc.nextInt();
		}

		System.out.print("\n ");
		System.out.print("Your array is: ");
		for(int x : array) {
			System.out.print(x+" ");
		}

		System.out.print("\n ");
		int target = 8;
		if(lineaSearch(array,target)) {
			System.out.println("Your target element "+target + " is present in the array");
		}
		else {
			System.out.println("Your target element "+target + " is not present in the array");
		}

	}
>>>>>>> f22e72f (DAY32)
}