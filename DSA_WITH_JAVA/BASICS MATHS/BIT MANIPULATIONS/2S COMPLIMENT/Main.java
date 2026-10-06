// BIT MANIPULATION
// 2'S COMPLEMENT
// 5 => 0101
// 1'S COMPLEMENT => 1010
// 2'S COMPLEMENT => 1011
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
        // Find 2's complement
        int twosComplement = onesComplement + 1;
        System.out.println(twosComplement);
    }
}