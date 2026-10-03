<<<<<<< HEAD

//MAX CONSECUTIVE ONES
import java.util.*;

//TC ==> O(N)
//SC ==> O(1)
public class Main {
    static int maxConsecutiveOnes(int[] array, int n) {
        if (n == 0) return 0;
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 0, 1, 1, 1, 1, 0 };
        int n = array.length;
        System.out.println("The maximum consecutives ones is : " + maxConsecutiveOnes(array, n));

    }
}
=======

//MAX CONSECUTIVE ONES
import java.util.*;

//TC ==> O(N)
//SC ==> O(1)
public class Main {
    static int maxConsecutiveOnes(int[] array, int n) {
        if (n == 0) return 0;
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 0, 1, 1, 1, 1, 0 };
        int n = array.length;
        System.out.println("The maximum consecutives ones is : " + maxConsecutiveOnes(array, n));

    }
}
>>>>>>> f22e72f (DAY32)
