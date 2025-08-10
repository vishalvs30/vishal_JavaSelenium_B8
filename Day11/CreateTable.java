package jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) throws ClassNotFoundException {
    String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=tiger";
    //create table
    String sql="create table Students("
    		+"rollno int,"
    		+ "name varchar(50),"
    		+ "per int,"
    		+ "email varchar(50))";
    //insert record
    String insertSQL="insert into students values(101,'Jhon',99,'abc@gmail.com'),"
    		+ "(102,'RAj',89,'xyz@gmail.com'),"
    		+ "(103,'Sam',90,'123@gmail.com'),"
    		+ "(104,'Sam',90,'vvs@gmail.com'),"
    		+ "(105,'Sam',90,'lmn@gmail.com')";
    
    try {
    	//driver connection
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url);
    	System.out.println("Connection established");
    	
    	//create statement for query exceution
    	Statement stmt=con.createStatement();
    	
    	//call create query using statement
    	stmt.executeLargeUpdate(sql);
    	System.out.println("Students Table created");
    	
    	//call insert query using Statment
    	int rowInserted=stmt.executeUpdate(insertSQL);
    	if(rowInserted>0) {
    		System.out.println("New Students Record Inserted");
    	}
    	//print table
    	ResultSet rs=stmt.executeQuery("Select * from Students");
    	System.out.println("rollno\t name\t percentage\t Email ");
    	
    	//while loop for fetching all the table record
    	while(rs.next()) {
        	int rollno=rs.getInt("rollno");
        	String name=rs.getString("name");
        	int per=rs.getInt("per");
        	String email=rs.getString("email");
            System.out.println(rollno+" "+name+" "+per+" "+email);	
        }
    	
    	stmt.close();
    	con.close();
    }
    catch(SQLException e) {
    	System.out.println(e);
    }
}
}
