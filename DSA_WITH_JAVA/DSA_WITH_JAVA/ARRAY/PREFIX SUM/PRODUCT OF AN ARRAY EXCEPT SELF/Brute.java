<<<<<<< HEAD
import java.util.*;

public class Brute {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=1;
            for (int j = 0; j < n; j++) {
               if(i!=j){
                ans[i]*= array[j];
                   
               }
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] ans = productOfArrayExceptSelf(array);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
=======
import java.util.*;

public class Brute {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=1;
            for (int j = 0; j < n; j++) {
               if(i!=j){
                ans[i]*= array[j];
                   
               }
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] ans = productOfArrayExceptSelf(array);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
>>>>>>> f22e72f (DAY32)
}