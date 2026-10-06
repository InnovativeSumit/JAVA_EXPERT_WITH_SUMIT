// BIT MANIPULATION
// CLEAR THE ITH BIT
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {
        int a = 13;   // Binary: 1101
        int i = 2;    // Clear 3rd bit (0-indexed)
        a = a & ~(1 << i);
        System.out.println("After clearing the " + i + "th bit: " + a);
    }
}