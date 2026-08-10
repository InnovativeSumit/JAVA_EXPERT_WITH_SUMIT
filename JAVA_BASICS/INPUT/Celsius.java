import java.util.*;
//Perimeter of A Rectangle

public class Celsius{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Farenheight to Celsius ");
        
        System.out.println("=====================================");
        
        System.out.print("Enter the Farenheight values: ");
        double f = sc.nextDouble();
       
        double c = ((f-32)*5)/9;
        System.out.printf("The Celsius  Value  is: %.3f degree ",c);
    }
}