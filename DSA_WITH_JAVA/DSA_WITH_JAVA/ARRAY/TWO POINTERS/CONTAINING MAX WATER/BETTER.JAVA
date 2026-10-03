<<<<<<< HEAD
import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        // Check every possible pair of lines
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;

                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum Water = " + maxArea(height));
    }
=======
import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        // Check every possible pair of lines
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;

                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum Water = " + maxArea(height));
    }
>>>>>>> f22e72f (DAY32)
}