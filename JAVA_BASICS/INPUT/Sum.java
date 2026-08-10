import java.util.*;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();

        int sum = num + num2;
        System.out.println("The sum of " + num + " and " + num2 + " is: " + sum);

        sc.close();
    }
}