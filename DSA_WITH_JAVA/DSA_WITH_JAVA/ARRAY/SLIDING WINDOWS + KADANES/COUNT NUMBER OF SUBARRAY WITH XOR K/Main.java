<<<<<<< HEAD
// COUNT NUMBER OF SUBARRAYS WITH XOR = K
// TC => O(N)
// SC => O(N)

import java.util.*;

public class Main {
    public static int subarraysWithXorK(int[] arr, int k) {
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Prefix XOR = 0 occurs once initially
        map.put(0, 1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ k;
            count += map.getOrDefault(x, 0);
            map.put(x, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Number of subarrays = " + subarraysWithXorK(arr, k));
    }
=======
// COUNT NUMBER OF SUBARRAYS WITH XOR = K
// TC => O(N)
// SC => O(N)

import java.util.*;

public class Main {
    public static int subarraysWithXorK(int[] arr, int k) {
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Prefix XOR = 0 occurs once initially
        map.put(0, 1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ k;
            count += map.getOrDefault(x, 0);
            map.put(x, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Number of subarrays = " + subarraysWithXorK(arr, k));
    }
>>>>>>> f22e72f (DAY32)
}