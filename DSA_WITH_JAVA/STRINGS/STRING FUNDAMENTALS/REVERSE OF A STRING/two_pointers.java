<<<<<<< HEAD
// REVERSE OF A STRING USING TWO POINTERS  
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class two_pointers{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();
        
        System.out.print("\n");
        System.out.println("The Original Format in ASCII form ");
        for(int x : arr){
            System.out.print(x+ " ");
        }
        
        int low = 0;
        int high = n-1;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("The reverse Format in ASCII form ");
        for(int x : arr){
            System.out.print(x+ " ");
        }
        
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("The actual reverse Format");
        for(char x : arr){
            System.out.print(x);
        }
        sumit.close();
    }
=======
// REVERSE OF A STRING USING TWO POINTERS  
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class two_pointers{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();
        
        System.out.print("\n");
        System.out.println("The Original Format in ASCII form ");
        for(int x : arr){
            System.out.print(x+ " ");
        }
        
        int low = 0;
        int high = n-1;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("The reverse Format in ASCII form ");
        for(int x : arr){
            System.out.print(x+ " ");
        }
        
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("The actual reverse Format");
        for(char x : arr){
            System.out.print(x);
        }
        sumit.close();
    }
>>>>>>> f22e72f (DAY32)
}