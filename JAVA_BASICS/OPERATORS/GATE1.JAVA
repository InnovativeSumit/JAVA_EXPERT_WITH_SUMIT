// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class GATE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Write a number: ");
        int num1 = sc.nextInt();
        System.out.println("now a number: "+ (++num1));
        System.out.println("now a number: "+ (num1++));
        System.out.println("now a number: "+ (num1+1));
        System.out.println("now a number: "+ (--num1));
        System.out.println("now a number: "+ (--num1));
        System.out.println("now a number: "+ (num1+2));
        System.out.println("now a number: "+ (num1++));
        System.out.println("now a number: "+ (num1));
        
        
    }
}

// Write a number: 10
// now a number: 11
// now a number: 11
// now a number: 13
// now a number: 11
// now a number: 10
// now a number: 12
// now a number: 10
// now a number: 11