package fileIO;

import java.io.*;
import java.util.*;

public class FileOperations {
    public static void main(String[] args) {
        File file = new File("sample1.txt");

        
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter w = null;
        try {
            w = new FileWriter("sample.txt");
            
            w.write("Hello\r");
            w.write("Welcome to Java Learning sessions");
            w.close();
            System.out.println("Write file successful");
            System.out.println("----------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        List<String> lines = new ArrayList<String>();
        try {
            BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = r.readLine()) != null) {
                lines.add(line);
            }
            for (String l : lines) {
                System.out.println(l);
            }
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (file.exists()) {
            System.out.println("--------------------");
            System.out.println("File name: " + file.getName());
            System.out.println("Location: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File not found.");
        }
    }
}
