// BIT MANIPULATION
// CHECK IF A NUMBER IS ODD OR EVEN
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {
        int a = 7;
        if ((a & 1) != 0) {
            System.out.println(a + " is ODD");
        } else {
            System.out.println(a + " is EVEN");
        }
    }
}