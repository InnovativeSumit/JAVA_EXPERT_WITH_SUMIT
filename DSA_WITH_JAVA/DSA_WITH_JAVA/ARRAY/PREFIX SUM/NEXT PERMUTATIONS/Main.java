<<<<<<< HEAD
// NEXT GREATEST nextGreatestPermutations
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
// IN CPP STL => (next_permutation(arr.begin(), arr.end())
public class Main
{ 
    // Function to reverse a portion of the array
    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    
    
    static void nextGreatestPermutations(int[]array,int n){
    int index = -1;
    for(int i = n-2; i>=0 ; i--){
        if(array[i]<array[i+1]){
            index = i;
            break;
        }
    }
    
    if(index == -1){
        reverse(array, 0 , n-1);
        return;
    }
    
    for(int i =n-1; i> index ; i--){
        if(array[i]>array[index]){
            int temp = array[index];
            array[index]= array[i];
            array[i]=temp;
            break;
        }
    }
    
    reverse(array, index+1, n-1);
}

    
	public static void main(String[] args) {
	    int[]array = {2,1,5,4,3,0,0};
	    int n = array.length;
	    nextGreatestPermutations(array,n);
	    for(int x: array){
		System.out.print( x+ " ");
	    }
	}
=======
// NEXT GREATEST nextGreatestPermutations
import java.util.*;
// TC ==> O(N)
// SC ==> O(1)
// IN CPP STL => (next_permutation(arr.begin(), arr.end())
public class Main
{ 
    // Function to reverse a portion of the array
    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    
    
    static void nextGreatestPermutations(int[]array,int n){
    int index = -1;
    for(int i = n-2; i>=0 ; i--){
        if(array[i]<array[i+1]){
            index = i;
            break;
        }
    }
    
    if(index == -1){
        reverse(array, 0 , n-1);
        return;
    }
    
    for(int i =n-1; i> index ; i--){
        if(array[i]>array[index]){
            int temp = array[index];
            array[index]= array[i];
            array[i]=temp;
            break;
        }
    }
    
    reverse(array, index+1, n-1);
}

    
	public static void main(String[] args) {
	    int[]array = {2,1,5,4,3,0,0};
	    int n = array.length;
	    nextGreatestPermutations(array,n);
	    for(int x: array){
		System.out.print( x+ " ");
	    }
	}
>>>>>>> f22e72f (DAY32)
}