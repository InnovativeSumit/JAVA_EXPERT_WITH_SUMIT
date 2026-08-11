import java.util.*;
// PUBLIC IS ALLOWED ANYWHERE IN THE PROGRAM. IT IS NOT RESTRICTED TO ANY PARTICULAR CLASS OR PACKAGE.
// PUBLIC MEMBERS ARE VISIBLE EVERYWHERE IN THE PROGRAM.

class Student {
    public
    String name = "Susmita";
    int roll_no = 89;
    
    public
    void display() {
        System.out.println("Name: " + name + " & Roll No is : "+ roll_no
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();       //  Allowed
        System.out.println("Name: " + s.name ); //  Allowed
        System.out.println("Roll No is : "+ s.roll_no);  //  Allowed
    }
}