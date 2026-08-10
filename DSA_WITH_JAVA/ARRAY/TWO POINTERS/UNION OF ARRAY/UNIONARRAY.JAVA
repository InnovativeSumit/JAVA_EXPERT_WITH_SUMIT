<<<<<<< HEAD
// UNION OF TWO ARRAYS
// TC => O(N1 + N2)
// N1 => LENGTH OF FIRST ARRAY
// N2 => LENGTH OF SECOND ARRAY
// SC => O(N) // TO STIRE THE LEMENTS IN A ARRAYLIST
import java.util.*;
public class Main {
    static ArrayList<Integer> sortedArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> unionArray = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                    unionArray.add(a[i]);
                }
                i++;

            } else if (a[i] > b[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != b[j]) {
                    unionArray.add(b[j]);
                }
                j++;

            } else {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                    unionArray.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                unionArray.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != b[j]) {
                unionArray.add(b[j]);
            }
            j++;
        }

        return unionArray;
    }

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5, 6};
        ArrayList<Integer> result = sortedArray(a, b);
        System.out.println(result);
    }
=======
// UNION OF TWO ARRAYS
// TC => O(N1 + N2)
// N1 => LENGTH OF FIRST ARRAY
// N2 => LENGTH OF SECOND ARRAY
// SC => O(N) // TO STIRE THE LEMENTS IN A ARRAYLIST
import java.util.*;
public class Main {
    static ArrayList<Integer> sortedArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> unionArray = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                    unionArray.add(a[i]);
                }
                i++;

            } else if (a[i] > b[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != b[j]) {
                    unionArray.add(b[j]);
                }
                j++;

            } else {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                    unionArray.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != a[i]) {
                unionArray.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != b[j]) {
                unionArray.add(b[j]);
            }
            j++;
        }

        return unionArray;
    }

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5, 6};
        ArrayList<Integer> result = sortedArray(a, b);
        System.out.println(result);
    }
>>>>>>> f22e72f (DAY32)
}