package fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDocx {

	public static void main(String[] args) throws IOException {

		List<String> lines=new ArrayList<String>();
		FileInputStream r = new FileInputStream("C:\\Users\\swami\\Downloads\\MCQ_WEEK1.docx");
		int line;
		while((line=r.read())!=-1) {
			System.out.println((char)line);
		}
		for(String l:lines) {
			System.out.println(l);
		}
		r.close();
	}

}
