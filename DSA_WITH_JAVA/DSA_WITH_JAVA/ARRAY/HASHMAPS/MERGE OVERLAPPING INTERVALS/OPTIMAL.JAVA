<<<<<<< HEAD
// MERGE OVERLAPPING SUBINTERVALS OPTIMAL APPROACHES
// TC ==> O(NLOGN) [FOR SORTING O(NLOGN) + TRAVERSALS O(N)]
// SC = O(N)
import java.util.*;

public class OPTIMAL {
    public static int[][] mergeIntervals(int[][] intervals) {
        // Edge case
        if (intervals == null || intervals.length == 0)
            return new int[0][0];
        // Sort according to starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            // If list is empty OR no overlap
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(new int[]{interval[0], interval[1]});
            }
            // Overlapping intervals
            else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeIntervals(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
=======
// MERGE OVERLAPPING SUBINTERVALS OPTIMAL APPROACHES
// TC ==> O(NLOGN) [FOR SORTING O(NLOGN) + TRAVERSALS O(N)]
// SC = O(N)
import java.util.*;

public class OPTIMAL {
    public static int[][] mergeIntervals(int[][] intervals) {
        // Edge case
        if (intervals == null || intervals.length == 0)
            return new int[0][0];
        // Sort according to starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            // If list is empty OR no overlap
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(new int[]{interval[0], interval[1]});
            }
            // Overlapping intervals
            else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeIntervals(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
>>>>>>> f22e72f (DAY32)
}