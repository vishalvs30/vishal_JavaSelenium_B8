package jdbc_conn;
import java.sql.*;

public class Update {

	public static void main(String[] args) {
   
		
		String qry="update mydb.Students set name='krish'where rollno=102";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?user=root&password=tiger");
			Statement  stmt=con.createStatement();
			stmt.executeUpdate(qry);
			System.out.println("Record Updated");
			
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
		}catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
		}
	}

}
