<<<<<<< HEAD
import java.util.*;
//TC==>O(N)
//SC==>O(1)
public class Optimal {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        
        //prefix claculations
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            //Here ans[i] stotres the prefix values
            ans[i] = ans[i-1]*array[i-1];
        }
        
        //suffix claculations
        int suffix =1;
        for (int i = n-2; i >= 0; i--) {
            suffix *= array[i+1];
            //Final answers ==> suffix*prefix[ans[i]] = ans[i]
            ans[i] *= suffix; 
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
}

=======
import java.util.*;
//TC==>O(N)
//SC==>O(1)
public class Optimal {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        
        //prefix claculations
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            //Here ans[i] stotres the prefix values
            ans[i] = ans[i-1]*array[i-1];
        }
        
        //suffix claculations
        int suffix =1;
        for (int i = n-2; i >= 0; i--) {
            suffix *= array[i+1];
            //Final answers ==> suffix*prefix[ans[i]] = ans[i]
            ans[i] *= suffix; 
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
}

>>>>>>> f22e72f (DAY32)
