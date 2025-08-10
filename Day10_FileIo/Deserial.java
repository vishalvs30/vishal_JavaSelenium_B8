package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Deserial {

	public static void main(String[] args) throws IOException {

		Student st = new Student(101,"Naveen");
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.close();
		fos.close();
		System.out.println("Done");
	}

}
