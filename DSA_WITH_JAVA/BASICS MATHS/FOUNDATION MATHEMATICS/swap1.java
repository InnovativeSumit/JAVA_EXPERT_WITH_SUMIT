<<<<<<< HEAD
import java.util.*;
public class Swap1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        // Swapping using a third variable
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
        
        // Swapping using arithmetic operations
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        sc.close();
    }

}
=======
import java.util.*;
public class Swap1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        // Swapping using a third variable
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
        
        // Swapping using arithmetic operations
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        sc.close();
    }

}
>>>>>>> f22e72f (DAY32)
