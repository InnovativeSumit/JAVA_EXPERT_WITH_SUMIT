<<<<<<< HEAD
// MAXIMUM PRODUCTS SUBARRAY USING TWO POINTERS
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main
{ 
    static int maxProductsSubarray(int[]array,int n){
    int pre = 1 , suf = 1;
    int ans = Integer.MIN_VALUE;
    int index = -1;
    for(int i = 0; i<n ; i++){
        if(pre == 0) pre = 1;
        if(suf == 0) suf =1;
        pre = pre * array[i];
        suf = suf * array[n-i-1];
        ans = Math.max(ans,Math.max(pre,suf));
    }
    return ans;
}
	public static void main(String[] args) {
	    int[]array = {2,1,5,4,3,0,0};
	    int n = array.length;
	    System.out.print(maxProductsSubarray(array,n));
	    
	}
=======
// MAXIMUM PRODUCTS SUBARRAY USING TWO POINTERS
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
public class Main
{ 
    static int maxProductsSubarray(int[]array,int n){
    int pre = 1 , suf = 1;
    int ans = Integer.MIN_VALUE;
    int index = -1;
    for(int i = 0; i<n ; i++){
        if(pre == 0) pre = 1;
        if(suf == 0) suf =1;
        pre = pre * array[i];
        suf = suf * array[n-i-1];
        ans = Math.max(ans,Math.max(pre,suf));
    }
    return ans;
}
	public static void main(String[] args) {
	    int[]array = {2,1,5,4,3,0,0};
	    int n = array.length;
	    System.out.print(maxProductsSubarray(array,n));
	    
	}
>>>>>>> f22e72f (DAY32)
}