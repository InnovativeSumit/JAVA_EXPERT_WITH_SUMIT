import java.util.*;
// If no access modifier (public, private, or protected) is specified
// Java uses the default (package-private) access modifier.

class Student{
  String name = "Susmita";
  int roll_no = 67;

  void display(){
    this.name = name ;
    this.roll_no = roll_no;
    System.out.println("Name: " + name + " &  Roll No: " + roll_no);
  }
  
}
public class main {
  public static void main(String[] args) {
    Student s = new Student();
    System.out.println("Name: " + s.name + " &  Roll No: " + s.roll_no);
    s.display();
  }
}
