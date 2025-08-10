package fileIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialData {

	public static void main(String[] args) {

		//Employee emp = new Employee(101,"manish");
		Employee emp = new Employee();
        emp.setData(101, "manish");
		try {
			//FileOutputStream fos = new FileOutputStream("employee.txt");
			//ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileWriter fw = new FileWriter("employee.txt");
			BufferedWriter bf = new BufferedWriter(fw);
			
			bf.write(emp.toString());
			
			bf.close();
			fw.close();
			System.out.println("Done");
		}
		catch(IOException e) {
			System.out.println("Failed");
			System.out.println(e);
		}
	}

}
