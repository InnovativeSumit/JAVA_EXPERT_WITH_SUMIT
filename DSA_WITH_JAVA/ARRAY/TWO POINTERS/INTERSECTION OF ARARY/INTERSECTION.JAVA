<<<<<<< HEAD
// INTERSECTION OF TWO ARRAYS
// TC => O(N1 + N2)
// N1 => LENGTH OF FIRST ARRAY
// N2 => LENGTH OF SECOND ARRAY
// SC => O(N) // TO STIRE THE LEMENTS IN A ARRAYLIST
import java.util.*;
public class Main {

    static ArrayList<Integer> intersectionArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        ArrayList<Integer> intersection = new ArrayList<>();
        while (i < n1 && j < n2) {

            if (a[i] < b[j]) {
                i++;
            }
            else if (a[i] > b[j]) {
                j++;
            }
            else {
                intersection.add(a[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] b = {2, 3, 3, 5, 6, 6, 7};
        ArrayList<Integer> result = intersectionArray(a, b);
        System.out.println(result);
    }
=======
// INTERSECTION OF TWO ARRAYS
// TC => O(N1 + N2)
// N1 => LENGTH OF FIRST ARRAY
// N2 => LENGTH OF SECOND ARRAY
// SC => O(N) // TO STIRE THE LEMENTS IN A ARRAYLIST
import java.util.*;
public class Main {

    static ArrayList<Integer> intersectionArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        ArrayList<Integer> intersection = new ArrayList<>();
        while (i < n1 && j < n2) {

            if (a[i] < b[j]) {
                i++;
            }
            else if (a[i] > b[j]) {
                j++;
            }
            else {
                intersection.add(a[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] b = {2, 3, 3, 5, 6, 6, 7};
        ArrayList<Integer> result = intersectionArray(a, b);
        System.out.println(result);
    }
>>>>>>> f22e72f (DAY32)
}