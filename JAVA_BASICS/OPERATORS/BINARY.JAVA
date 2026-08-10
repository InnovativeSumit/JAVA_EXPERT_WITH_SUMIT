import java.util.*;

public class BINARY {
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println("Initial Value of a = " + a);
        System.out.println("Value of b = " + b);

        // Assignment
        a = b;
        System.out.println("\n=  -> a = b      : " + a);

        // Reset value
        a = 20;

        // Addition Assignment
        a += b;
        System.out.println("+= -> a += b     : " + a);

        // Reset value
        a = 20;

        // Subtraction Assignment
        a -= b;
        System.out.println("-= -> a -= b     : " + a);

        // Reset value
        a = 20;

        // Multiplication Assignment
        a *= b;
        System.out.println("*= -> a *= b     : " + a);

        // Reset value
        a = 20;

        // Division Assignment
        a /= b;
        System.out.println("/= -> a /= b     : " + a);

        // Reset value
        a = 20;

        // Modulus Assignment
        a %= b;
        System.out.println("%= -> a %= b     : " + a);

        // Bitwise AND Assignment
        a = 20;
        a &= b;
        System.out.println("&= -> a &= b     : " + a);

        // Bitwise OR Assignment
        a = 20;
        a |= b;
        System.out.println("|= -> a |= b     : " + a);

        // Bitwise XOR Assignment
        a = 20;
        a ^= b;
        System.out.println("^= -> a ^= b     : " + a);

        // Left Shift Assignment
        a = 20;
        a <<= 2;
        System.out.println("<<= -> a <<= 2   : " + a);

        // Right Shift Assignment
        a = 20;
        a >>= 2;
        System.out.println(">>= -> a >>= 2   : " + a);

        // Unsigned Right Shift Assignment
        a = 20;
        a >>>= 2;
        System.out.println(">>>= -> a >>>= 2 : " + a);
    }
}