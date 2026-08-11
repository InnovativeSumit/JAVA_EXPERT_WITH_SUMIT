package JAVA_OOPS.ACCESS_MODIFIERS.PROTECTED.Students;
import mypackage.Students;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();        //  ERROR
        System.out.println(s.name);  //  ERROR
    }
}
