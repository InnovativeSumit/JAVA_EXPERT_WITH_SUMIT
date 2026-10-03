<<<<<<< HEAD
// Find Words Containing Character
// TC ==> O(N * M)
// N  ==> Number of Words
// M  ==> Average Length of Each Word
// SC ==> O(N) (Including Output List)

import java.util.*;
public class Main {
    
    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }

    // Main Function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter character to search: ");
        char x = sc.next().charAt(0);

        List<Integer> ans = findWordsContaining(words, x);

        System.out.println("Indices containing '" + x + "' : " + ans);
        sc.close();
    }
=======
// Find Words Containing Character
// TC ==> O(N * M)
// N  ==> Number of Words
// M  ==> Average Length of Each Word
// SC ==> O(N) (Including Output List)

import java.util.*;
public class Main {
    
    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }

    // Main Function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter character to search: ");
        char x = sc.next().charAt(0);

        List<Integer> ans = findWordsContaining(words, x);

        System.out.println("Indices containing '" + x + "' : " + ans);
        sc.close();
    }
>>>>>>> f22e72f (DAY32)
}