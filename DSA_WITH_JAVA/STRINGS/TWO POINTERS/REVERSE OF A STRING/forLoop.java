<<<<<<< HEAD
// REVERSE OF A STRING USING ONE SINGLE ITERATORS FOR LOOP  
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class forLoop{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        
        int n = str.length();
        char[] arr = str.toCharArray();
        for(char i = 0; i < n/2 ; i++){
            char temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]= temp;
        }
        System.out.print("THE REVERSE IS : ");
        for(char x : arr){
            System.out.print(x);
        }
        sumit.close();
    }
=======
// REVERSE OF A STRING USING ONE SINGLE ITERATORS FOR LOOP  
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class forLoop{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        
        int n = str.length();
        char[] arr = str.toCharArray();
        for(char i = 0; i < n/2 ; i++){
            char temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]= temp;
        }
        System.out.print("THE REVERSE IS : ");
        for(char x : arr){
            System.out.print(x);
        }
        sumit.close();
    }
>>>>>>> f22e72f (DAY32)
}