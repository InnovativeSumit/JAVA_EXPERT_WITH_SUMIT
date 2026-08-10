<<<<<<< HEAD
import java.util.*;

public class Better {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        //prefix claculations
        int[] prefix = new int[n];
        prefix[0]=1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]*array[i-1];
        }
        //suffix claculations
        int[] suffix = new int[n];
        suffix[n-1]=1;
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1]*array[i+1];
        }
        
        //Final answers claculations
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i]*suffix[i];
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

public class Better {
    static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        //prefix claculations
        int[] prefix = new int[n];
        prefix[0]=1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]*array[i-1];
        }
        //suffix claculations
        int[] suffix = new int[n];
        suffix[n-1]=1;
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1]*array[i+1];
        }
        
        //Final answers claculations
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i]*suffix[i];
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