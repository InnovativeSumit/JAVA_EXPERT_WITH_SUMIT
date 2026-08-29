// BIT MANIPULATION
// CHECK THE ITH BIT SET OR NOT?
// TC => O(1)
// SC => O(1)

public class Main {
	public static void main(String[] args) {
        int a = 5;   // Binary: 101
        int i = 3;   // Check 2nd bit (0-indexed)
        if ((a & (1 << i)) != 0) {
            System.out.println("The " + i + "th bit is SET");
        } else {
            System.out.println("The " + i + "th bit is NOT SET");
        }
	}
} 
