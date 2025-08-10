package fileIO;

import java.io.File;

public class newFile {
 public static void main(String[] args) {
	
	 File f=new File("C:\\users\\swami\\wipro\\sample.txt");
	 try {
		 f.createNewFile();
		 //System.out.println(f.setWritable(true));
	 }catch(Exception e) {
		e.printStackTrace();
	 }
	 boolean result=f.exists();
	 System.out.println("Result is: "+result);
}
}
