<<<<<<< HEAD
// REVERSE OF A STRING USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class String_concatenation{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        int n = str.length();
        String rev = " ";
        for(int i = n-1 ; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print("THE REVERSE OF THE STRING \""+ str + "\" USING STRING CONCATENATIONS IS : ");
            System.out.print(rev);
    
        sumit.close();
    }
=======
// REVERSE OF A STRING USING STRING CONCATENATIONS
// TC ==> O(N)
// SC ==> O(1)
import java.util.*;
public class String_concatenation{
    public static void main(String[]args){
        Scanner sumit = new Scanner(System.in);
        String str = sumit.nextLine();
        int n = str.length();
        String rev = " ";
        for(int i = n-1 ; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print("THE REVERSE OF THE STRING \""+ str + "\" USING STRING CONCATENATIONS IS : ");
            System.out.print(rev);
    
        sumit.close();
    }
>>>>>>> f22e72f (DAY32)
}