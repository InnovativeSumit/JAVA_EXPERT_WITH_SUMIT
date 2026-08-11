import java.util.*;
// PRIVATE IS ALLOWED ONLY WITHIN THE CLASS. IT IS NOT ALLOWED OUTSIDE THE CLASS OR THE INHERITED CLASS.
// PRIVATE MEMBERS ARE NOT VISIBLE OUTSIDE THE CLASS. PRIVATE MEMBERS ARE NOT INHERITED BY SUBCLASSES[CHILD-CLASSES].

class Student {
    private 
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
        // System.out.println("Name: " + s.name );  //  ERROR
        // System.out.println("Roll No is : "+ s.roll_no);  // ERROR
    }
}