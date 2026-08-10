<<<<<<< HEAD
import java.util.*;
//TWO POINTERS
// TC ==> O(N)
// SC ==> O(1)
public class TWOPOINTERS {
    static int trappingRainWater(int[] array) {
        int n = array.length;
        
        int left = 0;
        int right = n-1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int answer = 0;
        
        while(left < right){
            leftMax  = Math.max(leftMax , array[left]);
            rightMax = Math.max(rightMax, array[right]);
            
            if(leftMax < rightMax)
            {//left 
             answer += (leftMax - array[left]); 
             left++;
            }
            else{//right
             answer += (rightMax - array[right]); 
             right--;
            }
        }
            

        
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {6,0,2,4,7,5};
        System.out.println(trappingRainWater(array));
    }
=======
import java.util.*;
//TWO POINTERS
// TC ==> O(N)
// SC ==> O(1)
public class TWOPOINTERS {
    static int trappingRainWater(int[] array) {
        int n = array.length;
        
        int left = 0;
        int right = n-1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int answer = 0;
        
        while(left < right){
            leftMax  = Math.max(leftMax , array[left]);
            rightMax = Math.max(rightMax, array[right]);
            
            if(leftMax < rightMax)
            {//left 
             answer += (leftMax - array[left]); 
             left++;
            }
            else{//right
             answer += (rightMax - array[right]); 
             right--;
            }
        }
            

        
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {6,0,2,4,7,5};
        System.out.println(trappingRainWater(array));
    }
>>>>>>> f22e72f (DAY32)
}