<<<<<<< HEAD
// PAIRS WITH LESS THAN K DIFFERENECE
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main {
	static int countPairs(int arr[], int k) {
		Arrays.sort(arr);
		int n = arr.length;
		int i = 0;
		int ans = 0;
		for (int j = 0; j < n; j++) {
			while (i < j && arr[j] - arr[i] >= k) {
				i++;
			}
			ans += (j - i);
		}
		return ans;
	}
	
	public static void main(String[]args){
	    int [] arr = {1, 10, 4, 2};
	    int k = 3;
	    System.out.println("The total no of pairs with less than k differnece is : " +  countPairs(arr,k));
	}

}

=======
// PAIRS WITH LESS THAN K DIFFERENECE
// TC => O(N)
// SC => O(1)
import java.util.*;
public class Main {
	static int countPairs(int arr[], int k) {
		Arrays.sort(arr);
		int n = arr.length;
		int i = 0;
		int ans = 0;
		for (int j = 0; j < n; j++) {
			while (i < j && arr[j] - arr[i] >= k) {
				i++;
			}
			ans += (j - i);
		}
		return ans;
	}
	
	public static void main(String[]args){
	    int [] arr = {1, 10, 4, 2};
	    int k = 3;
	    System.out.println("The total no of pairs with less than k differnece is : " +  countPairs(arr,k));
	}

}

>>>>>>> f22e72f (DAY32)
