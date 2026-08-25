// BIT MANIPULATION
// SWAPPING USING XOR

// a = 5  => 0101
// b = 3  => 0011

// a = a ^ b
// b = a ^ b
// a = a ^ b

// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}