import java.util.*;

public class EvenOddBitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking last bit using bitwise AND operator
        if ((num & 1) == 0) { 
            // Actually we check the LSB BIT 
            System.out.println(num + " is Even");
        } 
        else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}