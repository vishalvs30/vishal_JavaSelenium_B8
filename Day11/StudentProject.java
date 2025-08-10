package jdbc_conn;

import java.sql.*;

public class StudentProject {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=tiger";
       

        Connection con = DriverManager.getConnection(url);
        Statement st = con.createStatement();

        // 1. Create table
        st.executeUpdate("CREATE TABLE Student (id INT PRIMARY KEY, name VARCHAR(30), city VARCHAR(20), percentage DOUBLE)");

        // 2. Insert records
        st.executeUpdate("INSERT INTO Student VALUES (1, 'Ram', 'Delhi', 85.5)");
        st.executeUpdate("INSERT INTO Student VALUES (2, 'Shyam', 'Delhi', 78.9)");
        st.executeUpdate("INSERT INTO Student VALUES (3, 'Maya', 'Pune', 91.2)");
        st.executeUpdate("INSERT INTO Student VALUES (4, 'Riya', 'Mumbai', 67.5)");

        // 3. Print table
        ResultSet rs = st.executeQuery("SELECT * FROM Student");
        System.out.println("All Students:");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
                               rs.getString(3) + " " + rs.getDouble(4));
        }

        // 4. Update table
        st.executeUpdate("UPDATE Student SET percentage=88.8 WHERE id=2");

        // 5. Highest percentage student
        rs = st.executeQuery("SELECT * FROM Student ORDER BY percentage DESC LIMIT 1");
        System.out.println("\nTopper:");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getDouble("percentage"));
        }

        // 6. Ascending order
        rs = st.executeQuery("SELECT * FROM Student ORDER BY name ASC");
        System.out.println("\nSorted by name:");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // 7. Same city
        rs = st.executeQuery("SELECT * FROM Student WHERE city='Delhi'");
        System.out.println("\nStudents from Delhi:");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // 8. Add new column
        st.executeUpdate("ALTER TABLE Student ADD age INT");

        // 9. Modify column datatype
        st.executeUpdate("ALTER TABLE Student MODIFY age VARCHAR(3)");

        // 10. Rename table
        st.executeUpdate("RENAME TABLE Student TO StudentData");

        // 11. Delete column
        st.executeUpdate("ALTER TABLE StudentData DROP COLUMN age");

        // 12. Delete single row
        st.executeUpdate("DELETE FROM StudentData WHERE id=4");

        // 13. Delete all records
        st.executeUpdate("DELETE FROM StudentData");

        // 14. Delete entire table
        st.executeUpdate("DROP TABLE StudentData");

        // 15. Create student and institute tables
        st.executeUpdate("CREATE TABLE Student (id INT PRIMARY KEY, name VARCHAR(30), inst_id INT)");
        st.executeUpdate("CREATE TABLE Institute (inst_id INT PRIMARY KEY, inst_name VARCHAR(50))");

        st.executeUpdate("INSERT INTO Student VALUES (1, 'Ram', 101), (2, 'Shyam', 102), (3, 'Maya', 103)");
        st.executeUpdate("INSERT INTO Institute VALUES (101, 'IIT Delhi'), (103, 'IIT Pune'), (104, 'IIT Chennai')");

        // 16. Inner Join (common)
        rs = st.executeQuery("SELECT s.name, i.inst_name FROM Student s INNER JOIN Institute i ON s.inst_id = i.inst_id");
        System.out.println("\nCommon Records (INNER JOIN):");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " - " + rs.getString(2));
        }

        // 17. Left Join
        rs = st.executeQuery("SELECT s.name, i.inst_name FROM Student s LEFT JOIN Institute i ON s.inst_id = i.inst_id");
        System.out.println("\nLeft Join Records:");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " - " + rs.getString(2));
        }

        // 18. Right Join
        rs = st.executeQuery("SELECT s.name, i.inst_name FROM Student s RIGHT JOIN Institute i ON s.inst_id = i.inst_id");
        System.out.println("\nRight Join Records:");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " - " + rs.getString(2));
        }

        // 19. Full Join using UNION (MySQL doesn't support FULL JOIN directly)
        rs = st.executeQuery(
            "(SELECT s.name, i.inst_name FROM Student s LEFT JOIN Institute i ON s.inst_id = i.inst_id) " +
            "UNION " +
            "(SELECT s.name, i.inst_name FROM Student s RIGHT JOIN Institute i ON s.inst_id = i.inst_id)"
        );
        System.out.println("\nFull Join Records:");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " - " + rs.getString(2));
        }

        con.close();
    }
}

