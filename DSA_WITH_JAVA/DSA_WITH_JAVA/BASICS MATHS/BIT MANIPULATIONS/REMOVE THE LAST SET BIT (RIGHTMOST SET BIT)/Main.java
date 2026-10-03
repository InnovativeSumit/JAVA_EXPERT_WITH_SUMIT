// BIT MANIPULATION
// REMOVE THE LAST SET BIT (RIGHTMOST SET BIT)
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {
        int a = 40;   // Binary: 1100
        a = a & (a - 1);
        System.out.println("After removing the last set bit: " + a);
    }
}