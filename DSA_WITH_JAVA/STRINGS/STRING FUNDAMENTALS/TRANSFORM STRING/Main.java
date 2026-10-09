import java.util.*;

class Main {

    // TIME COMPLEXITY  → O(N)
    // SPACE COMPLEXITY → O(1)

    static int transform(String s1, String s2) {
        int n = s1.length();
        // Length must be same
        if (n != s2.length()) {
            return -1;
        }
        // Frequency check
        int[] freq = new int[256];
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        // If characters are different
        for (int x : freq) {
            if (x != 0) {
                return -1;
            }
        }
        int ans = 0;
        int i = n - 1;
        int j = n - 1;
        // Greedy from right to left
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i--;
                j--;
            } 
            else {
                ans++;
                i--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "ForGeeksGeeks";
        System.out.println(transform(s1, s2));
    }
}