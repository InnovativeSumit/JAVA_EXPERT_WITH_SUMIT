<<<<<<< HEAD
import java.util.*;
//TC ==> O(N)
//SC ==> O(N)
public class PREFIXARRAY{
    public static int maxArea(int[] array) {
    
    int n = array.length;
    
    int[] leftMax= new int[n];
    Arrays.fill(leftMax, 0);
     
    int[] rightMax= new int[n];
    Arrays.fill(rightMax, 0);
   
    leftMax[0] = array[0];
    rightMax[n-1] = array[n-1];
    int answer = 0;
    
    for(int i = 1; i < n; i++){
        leftMax[i]= Math.max(leftMax[i-1],array[i]);
    }
        for(int i = n-2; i>=0; i--){
        rightMax[i]= Math.max(rightMax[i+1],array[i]);
    }
    
    for(int i = 0; i<n ; i++){
        answer += Math.min(leftMax[i],rightMax[i])-array[i];
    }
    
    return answer;
    }

    public static void main(String[] args) {
        int[] array = {4,2,0,3,2,5};
        System.out.println("Maximum Water = " + maxArea(array));
    }
=======
import java.util.*;
//TC ==> O(N)
//SC ==> O(N)
public class PREFIXARRAY{
    public static int maxArea(int[] array) {
    
    int n = array.length;
    
    int[] leftMax= new int[n];
    Arrays.fill(leftMax, 0);
     
    int[] rightMax= new int[n];
    Arrays.fill(rightMax, 0);
   
    leftMax[0] = array[0];
    rightMax[n-1] = array[n-1];
    int answer = 0;
    
    for(int i = 1; i < n; i++){
        leftMax[i]= Math.max(leftMax[i-1],array[i]);
    }
        for(int i = n-2; i>=0; i--){
        rightMax[i]= Math.max(rightMax[i+1],array[i]);
    }
    
    for(int i = 0; i<n ; i++){
        answer += Math.min(leftMax[i],rightMax[i])-array[i];
    }
    
    return answer;
    }

    public static void main(String[] args) {
        int[] array = {4,2,0,3,2,5};
        System.out.println("Maximum Water = " + maxArea(array));
    }
>>>>>>> f22e72f (DAY32)
}