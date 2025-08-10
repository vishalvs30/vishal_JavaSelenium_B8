package jdbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connec {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		String url="jdbc:mysql://localhost:3306/mydb";
//		String user="root";
//		String password="tiger";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection(url,user,password);
		

		        String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=tiger";
		        
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(url);

		        System.out.println("Connection established successfully!");
		        Statement stmt=con.createStatement();
		        ResultSet rs=stmt.executeQuery("Select * from emp");
		        System.out.println("id\tname\tsalary\tDept\t");
		        while(rs.next()) {
		        	int id=rs.getInt("id");
		        	String name=rs.getString("name");
		        	int salary=rs.getInt("salary");
		        	System.out.println(id+" "+name+" "+ salary);	
		        }
		        rs.close();
		        stmt.close();
		        con.close();
		    }
		

	}



