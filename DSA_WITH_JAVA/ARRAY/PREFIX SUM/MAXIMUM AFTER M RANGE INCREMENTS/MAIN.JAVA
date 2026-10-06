<<<<<<< HEAD
// MAXIMUM AFTER AN M RANGE INCREMENTS
// TC => O(2N)
// SC => O(1)
import java.util.*;
public class Main {

	public static long subarraySum(int[]a, int[]b, int[]k, int n) {
		int[] arr = new int[n + 1];
		Arrays.fill(arr, 0);
		int m = a.length;

		for(int i = 0 ; i < m ; i++) {
			arr[a[i]] += k[i];
			if( b[i]+ 1 < n) {
				arr[b[i]+1] -=k[i];
			}
		}
		long curr = 0;
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			curr += arr[i];
			ans = Math.max(ans,curr);
		}


		return ans;
	}

	public static void main(String[] args) {
		int[] a = {0,1,2};
		int[] b = {1,4,3};
		int[] k = {100,100,100};
		int n = 3;
		System.out.println("MAXIMUM AFTER M RANGE INCREMENTS IS : " + subarraySum(a,b,k,n));
	}
=======
// MAXIMUM AFTER AN M RANGE INCREMENTS
// TC => O(2N)
// SC => O(1)
import java.util.*;
public class Main {

	public static long subarraySum(int[]a, int[]b, int[]k, int n) {
		int[] arr = new int[n + 1];
		Arrays.fill(arr, 0);
		int m = a.length;

		for(int i = 0 ; i < m ; i++) {
			arr[a[i]] += k[i];
			if( b[i]+ 1 < n) {
				arr[b[i]+1] -=k[i];
			}
		}
		long curr = 0;
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			curr += arr[i];
			ans = Math.max(ans,curr);
		}


		return ans;
	}

	public static void main(String[] args) {
		int[] a = {0,1,2};
		int[] b = {1,4,3};
		int[] k = {100,100,100};
		int n = 3;
		System.out.println("MAXIMUM AFTER M RANGE INCREMENTS IS : " + subarraySum(a,b,k,n));
	}
>>>>>>> f22e72f (DAY32)
}