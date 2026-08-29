// BIT MANIPULATION
// CHECK IF A NUMBER IS POWER OF 2 OR NOT
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {
        int a = 16;
        if (a > 0 && (a & (a - 1)) == 0) {
            System.out.println(a + " is a power of 2");
        } else {
            System.out.println(a + " is not a power of 2");
        }
    }
}