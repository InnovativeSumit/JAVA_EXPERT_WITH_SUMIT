<<<<<<< HEAD
//REVERSE ONLY THE VOWELS FROM A STRINGS
//TC ==> O(N)
//SC ==> O(1)
import java.util.*;
public class Methods2
{
    static boolean isVowel(char ch){
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
	    int n = str.length();
	    
	    for(int i = n-1 ; i >=0 ; i --){
	        
	        if(isVowel(str.charAt(i))){
	            System.out.print(str.charAt(i));
	        }
	    }
	    sc.close();

	}
=======
//REVERSE ONLY THE VOWELS FROM A STRINGS
//TC ==> O(N)
//SC ==> O(1)
import java.util.*;
public class Methods2
{
    static boolean isVowel(char ch){
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
	    int n = str.length();
	    
	    for(int i = n-1 ; i >=0 ; i --){
	        
	        if(isVowel(str.charAt(i))){
	            System.out.print(str.charAt(i));
	        }
	    }
	    sc.close();

	}
>>>>>>> f22e72f (DAY32)
}