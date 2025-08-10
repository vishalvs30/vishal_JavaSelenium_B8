package fileIO;

import java.io.Serializable;

public class Student implements Serializable {

	int rollno;
	String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	void display() {
		System.out.println("RollNo: "+rollno+"  "+"Name: "+name);
	}
	
	
}
