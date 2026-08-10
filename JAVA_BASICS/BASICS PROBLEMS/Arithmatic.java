import java.util.*;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter 1st  number: ");
        int a = number.nextInt(); 

         System.out.print("Enter 2nd  number: ");
        int b = number.nextInt(); 

        //Arithmatic functions
        System.out.println("The sum is : "+ (a+b));
        System.out.println("The difference is : "+ (a-b));
        System.out.println("The product is : "+ (a*b));
        System.out.println("The quotient is : "+ (a/b));
        System.out.println("The remainder is : "+ (a%b));


    }
    
}
