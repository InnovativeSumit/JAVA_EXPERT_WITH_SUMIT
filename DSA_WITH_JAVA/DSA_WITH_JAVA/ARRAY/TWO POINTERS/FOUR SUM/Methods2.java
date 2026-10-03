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
public class Methods2 {

    public static List<List<Integer>> FourSum(int[] array, int target) {
        Arrays.sort(array);
        int n = array.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // Skip duplicate i
            if (i > 0 && array[i] == array[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // Skip duplicate j
                if (j > i + 1 && array[j] == array[j - 1])
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
                        ans.add(Arrays.asList(array[i],array[j],array[left],array[right]));

                        // Move both pointers
                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right && array[left] == array[left - 1])
                            left++;
                        // Skip duplicate right values
                        while (left < right && array[right] == array[right + 1])
                            right--;

                    } 
                    else if (sum < target) {
                        left++;
                    } 
                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = FourSum(array, target);
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
public class Methods2 {

    public static List<List<Integer>> FourSum(int[] array, int target) {
        Arrays.sort(array);
        int n = array.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // Skip duplicate i
            if (i > 0 && array[i] == array[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // Skip duplicate j
                if (j > i + 1 && array[j] == array[j - 1])
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
                        ans.add(Arrays.asList(array[i],array[j],array[left],array[right]));

                        // Move both pointers
                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right && array[left] == array[left - 1])
                            left++;
                        // Skip duplicate right values
                        while (left < right && array[right] == array[right + 1])
                            right--;

                    } 
                    else if (sum < target) {
                        left++;
                    } 
                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = FourSum(array, target);
        System.out.println(ans);
    }
>>>>>>> f22e72f (DAY32)
}