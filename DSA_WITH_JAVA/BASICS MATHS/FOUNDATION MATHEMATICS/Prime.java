<<<<<<< HEAD
import java.util.*;

public class Prime{
    public static void main( String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    boolean isPrime = true;
    
    if(n == 1 || n== 2 ) isPrime = true;
    
    else if(n<1) isPrime = false;
    
    else{
        
        for(int i = 2 ; i <= n/2 ; i++){
        if(n%i == 0){
            isPrime = false;
            break;
        }
        else
        isPrime = true;
     }
    }
    
    
    if(isPrime){
        System.out.println("The number is a prime number");
    }
    else{
         System.out.println("The number is not a prime number");
    }
}
=======
import java.util.*;

public class Prime{
    public static void main( String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    boolean isPrime = true;
    
    if(n == 1 || n== 2 ) isPrime = true;
    
    else if(n<1) isPrime = false;
    
    else{
        
        for(int i = 2 ; i <= n/2 ; i++){
        if(n%i == 0){
            isPrime = false;
            break;
        }
        else
        isPrime = true;
     }
    }
    
    
    if(isPrime){
        System.out.println("The number is a prime number");
    }
    else{
         System.out.println("The number is not a prime number");
    }
}
>>>>>>> f22e72f (DAY32)
}