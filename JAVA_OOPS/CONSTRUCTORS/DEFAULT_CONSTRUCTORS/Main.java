package DEFAULT_CONSTRUCTORS;
import java.util.*;

class Student {
	public
	String name = "Susmita";
	int roll_no = 89;

	// DEFAULT CONSTRUCTORS
	Student()
	{
		System.out.println("Hello I am a Default Constructors");
	}

	void display() {
		System.out.println("Name: " + name + " & Roll No is : "+ roll_no);
	}
}

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
// 		System.out.println("Name: " + s.name ); //  Allowed
// 		System.out.println("Roll No is : "+ s.roll_no);  //  Allowed
	}
}