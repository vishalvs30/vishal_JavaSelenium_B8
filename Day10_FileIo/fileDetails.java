package fileIO;

import java.io.File;

public class fileDetails {

	public static void main(String[] args) {
		
		

		File f=new File("sample.txt");
		
		
		if(f.exists()) {
			System.out.println("File name: "+f.getName());
			System.out.println("File Location:"+f.getAbsolutePath());
			System.out.println("File size:"+f.length());
			System.out.println("File readable:"+f.canRead());
			System.out.println("File Writable:"+f.canWrite());
		}
		else {
			System.out.println("File Not found");
		}
	}

}
