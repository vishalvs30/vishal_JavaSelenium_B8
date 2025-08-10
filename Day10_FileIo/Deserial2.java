package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserial2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fos = new FileInputStream("student.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Student st=(Student)oos.readObject();
		st.display();
		oos.close();
		fos.close();
		System.out.println("deserialization Done");
	}

}
