import java.util.*;

public class UNARY {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        boolean flag = true;

        System.out.println("Initial Value of a = " + a);

        // Unary Plus
        System.out.println("\nUnary Plus (+a): " + (+a));

        // Unary Minus
        System.out.println("Unary Minus (-a): " + (-a));

        // Pre Increment
        System.out.println("\nPre Increment (++b): " + (++b));

        // Post Increment
        System.out.println("Post Increment (c++): " + (c++));
        System.out.println("Value of c after c++: " + c);

        // Pre Decrement
        System.out.println("\nPre Decrement (--d): " + (--d));

        // Post Decrement
        System.out.println("Post Decrement (d--): " + (d--));
        System.out.println("Value of d after d--: " + d);

        // Logical NOT
        System.out.println("\nLogical NOT (!flag): " + (!flag));
    }
}