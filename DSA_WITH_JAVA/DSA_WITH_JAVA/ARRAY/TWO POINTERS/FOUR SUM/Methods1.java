<<<<<<< HEAD
import java.util.*;
// FOUR SUM PROBLEMS
// Sorting       = O(N log N)
// Outer loop    = O(N)
// Inner loop    = O(N)
// Two pointers  = O(N)
// Overall Time Complexity	O(N³)
// Auxiliary Space Complexity	O(1)
// Space Including Output	O(K) (K = number of quadruplets)
public class Methods1 {
    public static List<Integer> FourSum(int[] array, int n, int target) {
        Arrays.sort(array);
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && array[i] == array[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && array[j] == array[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = 0;
                    sum += array[i];
                    sum += array[j];
                    sum += array[left];
                    sum += array[right];

                    if (sum == target) {
                        return Arrays.asList(
                                array[i],
                                array[j],
                                array[left],
                                array[right]);

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 7, 6};
        int target = 20;
        List<Integer> ans = FourSum(array, array.length, target);
        System.out.println(ans);
    }
=======
import java.util.*;
// FOUR SUM PROBLEMS
// Sorting       = O(N log N)
// Outer loop    = O(N)
// Inner loop    = O(N)
// Two pointers  = O(N)
// Overall Time Complexity	O(N³)
// Auxiliary Space Complexity	O(1)
// Space Including Output	O(K) (K = number of quadruplets)
public class Methods1 {
    public static List<Integer> FourSum(int[] array, int n, int target) {
        Arrays.sort(array);
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && array[i] == array[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && array[j] == array[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = 0;
                    sum += array[i];
                    sum += array[j];
                    sum += array[left];
                    sum += array[right];

                    if (sum == target) {
                        return Arrays.asList(
                                array[i],
                                array[j],
                                array[left],
                                array[right]);

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 7, 6};
        int target = 20;
        List<Integer> ans = FourSum(array, array.length, target);
        System.out.println(ans);
    }
>>>>>>> f22e72f (DAY32)
}