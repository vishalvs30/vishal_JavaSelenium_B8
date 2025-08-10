package jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Preapared {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	String url="jdbc:mysql://localhost:3306/mydb?user=root&password=tiger";
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	Connection con = DriverManager.getConnection(url);
//	System.out.println("Connection created");
//	String query="Insert into mydb.Student values (?,?,?)";
//	PreparedStatement ps=con.prepareStatement(query);
//	ps.setInt(1, 101);
//	ps.setString(2, "Nevva");
//	ps.setInt(3, 20);
//	ps.executeUpdate();
//	
//	ps.setInt(1, 102);
//	ps.setString(2, "sharma");
//	ps.setInt(3, 20);
//	ps.executeUpdate();
//	
//	ps.setInt(1, 103);
//	ps.setString(2, "Raj");
//	ps.setInt(3, 20);
//	ps.executeUpdate();
//	
//	System.out.println("Records Inserted");
//	//int rows=ps.executeUpdate();
//	//System.out.println(rows+" = Updated rows");
	String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=tiger";
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(url);
    System.out.println("Connection created");

    String query = "INSERT INTO mydb.Student VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(query);

    // Create list of Student objects
    List<Student> students = new ArrayList<>();
    students.add(new Student(101, "Nevva", 20));
    students.add(new Student(102, "Sharma", 20));
    students.add(new Student(103, "Raj", 20));

    // Insert each student
    for (Student s : students) {
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setInt(3, s.getAge());
        ps.executeUpdate();
    }

    System.out.println("Records Inserted");
 // After inserting records
    System.out.println("\nFetching all records:");
    String selectQuery = "SELECT * FROM mydb.Student";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(selectQuery);

    System.out.println("ID\tName\tAge");
    while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        int age = rs.getInt(3);
        System.out.println(id + "\t" + name + "\t" + age);
    }


    ps.close();
    con.close();
}
}
