package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
             FileWriter w=null;
		try {
			w=new FileWriter("sample.txt");
			//BufferedWriter w = new BufferedWriter(new FileWriter("sample.txt"));
			//FileWriter w = new FileWriter("sample.txt");
			w.write("Hello\r");
			//w.newLine();
			w.write("Welcome to Java Learning sessions");
			w.flush();
			w.close();
			System.out.println("Write file successfull");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
