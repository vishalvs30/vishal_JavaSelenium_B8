package fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class PathDemo {

	public static void main(String[] args) {

		Path p=Paths.get("sample.txt");
		System.out.println("Name of the file: "+p.getFileName());
		System.out.println("Absolute Path: "+p.toAbsolutePath());
		System.out.println("Parent directory: "+p.getParent());
		System.out.println("current path: "+Files.exists(p));
	}

}
//Write a program to write data into a file using Files.write() and append
//using StandardOpenOption.APPEND.