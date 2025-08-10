package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readFile {

	public static void main(String[] args)throws IOException {

		BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
		String line;
		if((line=r.readLine())!=null) {
			
			System.out.println(line);
		}
		else {
			System.out.println("File is null");
		}
		r.close();
	}

}
