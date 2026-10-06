<<<<<<< HEAD
// REVERSE OF VOWELS IN A STRING USING TWO POINTERS
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Methods1 {
    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("THE REVERSE OF VOWELS IS: ");
        for (char ch : arr) {
            System.out.print(ch);
        }

        sc.close();
    }
=======
// REVERSE OF VOWELS IN A STRING USING TWO POINTERS
// TC ==> O(N)
// SC ==> O(1)

import java.util.*;
public class Methods1 {
    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("THE REVERSE OF VOWELS IS: ");
        for (char ch : arr) {
            System.out.print(ch);
        }

        sc.close();
    }
>>>>>>> f22e72f (DAY32)
}