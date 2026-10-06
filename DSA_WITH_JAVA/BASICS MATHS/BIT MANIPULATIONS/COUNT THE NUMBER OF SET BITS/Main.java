// BIT MANIPULATION
// COUNT THE NUMBER OF SET BITS
// int mid = (low + right) >> 1;
// TC => O(number of set bits)
// SC => O(1)

public class Main {
    public static void main(String[] args) {
        int a = 13;   // Binary: 1101
        int count = 0;

        while (a != 0) {
            a = a & (a - 1);
            count++;
        }
        System.out.println("Number of set bits: " + count);
    }
}