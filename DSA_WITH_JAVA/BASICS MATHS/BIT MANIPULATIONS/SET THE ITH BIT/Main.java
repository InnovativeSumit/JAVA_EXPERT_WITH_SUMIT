// BIT MANIPULATION
// SET THE ITH BIT
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {

        int a = 5;   // Binary: 101
        int i = 3;   // Set 3rd bit (0-indexed)

        a = a | (1 << i);

        System.out.println("After setting the " + i + "th bit: " + a);
    }
}