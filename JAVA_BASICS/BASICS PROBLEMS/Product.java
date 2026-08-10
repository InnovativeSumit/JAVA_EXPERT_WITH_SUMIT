import java.util.*;

public class Product {
     public static void main(String[] args) {
         Scanner number = new Scanner(System.in);
        
        System.out.print("Enetr the number: ");
        double num1 = number.nextDouble();
        
        System.out.print("Enetr the number: ");
        double num2 = number.nextDouble();
        
       double product = num1*num1;
       System.out.printf("The product of the numbers is: %.3f", product);

     }
}
