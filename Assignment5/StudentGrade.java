package Assignment5;

class Student {
	private String name;
	private int rollno;
	private int marks;

	public Student(String name, int rollno, int marks) {
		this.name = name;
		this.rollno = rollno;

		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			this.marks = 0; // invalid marks reset to 0
		}
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public int getMarks() {
		return marks;
	}

	// Display method
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollno);
		System.out.println("Marks: " + marks);
	}

}

public class StudentGrade {
	public static void main(String[] args) {

		Student s1 = new Student("John", 109, 89);

		s1.displayDetails();
		System.out.println("----------");
}
}
