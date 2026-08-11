import java.util.*;

class Student {

	public String name = "Susmita";
	int roll_no = 89;

	// DEFAULT CONSTRUCTOR
	Student() {
		System.out.println("Hello, I am a Default Constructor");
	}

	// PARAMETERIZED CONSTRUCTOR - 1 parameter
	Student(String name) {
		System.out.println("Hello, I am a Parameterized Constructor");
		this.name = name ;
		System.out.println("Name: " + name);
	}

	// PARAMETERIZED CONSTRUCTOR - 2 parameters
	Student(String name, int roll_no) {
		System.out.println("Hello, I am a Parameterized Constructor");
		this.name = name;
		this.roll_no= roll_no;
		System.out.println("Name: " + name + " & Roll No is: " + roll_no);
	}

	void display() {
		System.out.println("Name: " + name + " & Roll No is: " + roll_no);
	}
}

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.display();

		Student s2 = new Student("Sumit");
		Student s3 = new Student("Sumit", 56);
	}
}