public // BIT MANIPULATION
// 1'S COMPLEMENT
// 5 => 0101
// 1'S COMPLEMENT => 1010
// TC => O(1)
// SC => O(1)

public class Main {
    public static void main(String[] args) {

        int n = 5;
        int bits = 4;
        // Create mask using left shift
        int mask = (1 << bits) - 1;
        // Find 1's complement
        int onesComplement = (~n) & mask;
        System.out.println(onesComplement);
    }
} {
  
}
