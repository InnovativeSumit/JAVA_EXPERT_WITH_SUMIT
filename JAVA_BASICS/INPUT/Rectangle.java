import java.util.*;
//Perimeter of A Rectangle

public class Rectangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parameters of a rectangle:");
        
        System.out.println("=====================================");
        
        System.out.print("Enter the 1st Parameters of a rectangle:");
        double a = sc.nextDouble();
        
        System.out.print("Enter the 2nd Parameters of a rectangle:");
        double b = sc.nextDouble();
        
        System.out.print("Enter the 3rd Parameters of a rectangle:");
        double c = sc.nextDouble();
        
        System.out.print("Enter the 4th Parameters of a rectangle:");
        double d = sc.nextDouble();
        
        double ans = a+b+c+d;
        System.out.printf("The Perimeter of a rectangle: %.3f",ans);
       
    }
}