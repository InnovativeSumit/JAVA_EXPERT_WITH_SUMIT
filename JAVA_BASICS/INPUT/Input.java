import java.utls.*;
// import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        // Long Input
        System.out.print("Enter a Long: ");
        long longNum = sc.nextLong();

        // Float Input
        System.out.print("Enter a Float: ");
        float floatNum = sc.nextFloat();

        // Double Input
        System.out.print("Enter a Double: ");
        double doubleNum = sc.nextDouble();

        // Boolean Input
        System.out.print("Enter a Boolean (true/false): ");
        boolean bool = sc.nextBoolean();

        // Character Input
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        // Single Word Input
        System.out.print("Enter a Single Word: ");
        String word = sc.next();

        // Consume leftover newline
        sc.nextLine();

        // Full Line Input
        System.out.print("Enter a Full Sentence: ");
        String line = sc.nextLine();

        // Display Inputs
        System.out.println("\n----- OUTPUT -----");
        System.out.println("Integer : " + num);
        System.out.println("Long    : " + longNum);
        System.out.println("Float   : " + floatNum);
        System.out.println("Double  : " + doubleNum);
        System.out.println("Boolean : " + bool);
        System.out.println("Character: " + ch);
        System.out.println("Word    : " + word);
        System.out.println("Sentence: " + line);

        sc.close();
    }
}