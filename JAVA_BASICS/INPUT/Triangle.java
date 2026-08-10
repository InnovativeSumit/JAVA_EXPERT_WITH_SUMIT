import java.util.*;
//Perimeter of A Rectangle

public class Triangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parameters of a Tritangle:");
        
        System.out.println("=====================================");
        
        System.out.print("Enter the Base values of Triangle:");
        double b = sc.nextDouble();
        
        System.out.print("Enter the Height values of Triangle:");
        double h = sc.nextDouble();
        
        
        double ans = (b*h)/2;
        System.out.printf("The Perimeter of a rectangle: %.3f",ans);
       
    }
}