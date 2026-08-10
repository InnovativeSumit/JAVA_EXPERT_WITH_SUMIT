import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 0, count = 0;
        while (num+1 <= 100) {
            if (num % 2 == 0) {
                count++;
            }
            num++;

        }
        System.out.println(count);
    }
}