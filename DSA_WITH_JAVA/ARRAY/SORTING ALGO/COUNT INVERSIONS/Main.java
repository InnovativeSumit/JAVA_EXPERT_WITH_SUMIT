<<<<<<< HEAD
// COUNT INVERSIONS OF AN ARRAY
// TC ==> O(NLOGN)
// SC ==> O(N)
import java.util.*;
public class Main {

    // Merge two sorted halves and count inversions
    public static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                count += (mid - left + 1);
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
        return count;
    }

    // Merge Sort function
    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = low + (high - low) / 2;
        // Left Half
        count += mergeSort(arr, low, mid);
        // Right Half
        count += mergeSort(arr, mid + 1, high);
        // Merge and Count
        count += merge(arr, low, mid, high);
        return count;
    }

    // Main Function
    public static int numberOfInversions(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int ans = numberOfInversions(arr, arr.length);
        System.out.println("Number of Inversions = " + ans);
    }
=======
// COUNT INVERSIONS OF AN ARRAY
// TC ==> O(NLOGN)
// SC ==> O(N)
import java.util.*;
public class Main {

    // Merge two sorted halves and count inversions
    public static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                count += (mid - left + 1);
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
        return count;
    }

    // Merge Sort function
    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = low + (high - low) / 2;
        // Left Half
        count += mergeSort(arr, low, mid);
        // Right Half
        count += mergeSort(arr, mid + 1, high);
        // Merge and Count
        count += merge(arr, low, mid, high);
        return count;
    }

    // Main Function
    public static int numberOfInversions(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int ans = numberOfInversions(arr, arr.length);
        System.out.println("Number of Inversions = " + ans);
    }
>>>>>>> f22e72f (DAY32)
}