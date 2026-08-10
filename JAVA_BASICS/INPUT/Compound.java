import java.util.*;
//Perimeter of A Rectangle

public class Compound{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculations of Compound Interest");
        
        System.out.println("=====================================");
        
        System.out.print("Enter the Principle values: ");
        double p = sc.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter the time: ");
        double t = sc.nextDouble();
       
        
        double ans = p*(1+r/100)/t;
        System.out.printf("The Compound Interest Value  is: %.3f \n ",ans);
        System.out.printf("The Total Value with Compound Interest is: %.3f",ans+p);
       
    }
}