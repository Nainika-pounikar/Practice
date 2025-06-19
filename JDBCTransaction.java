package JDBC;
import java.sql.*;
public class JDBCTransaction {

    public static void main(String[] args) throws Exception {
        System.out.println("Driver loaded & Registered Successfully");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Nainika@2000");
        System.out.println("Connection established Succcessfully");
        Statement st = conn.createStatement();
        System.out.println("Statement Object Created Successfully");

        // Step 3: Disable auto-commit for transaction control
        conn.setAutoCommit(false);
    }
}
