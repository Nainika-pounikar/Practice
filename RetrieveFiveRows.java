package JDBC;
import java.sql.*;

public class RetrieveFiveRows {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded & Registered Successfully");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Nainika@2000");
        System.out.println("Connection established Succcessfully");
        Statement st = con.createStatement();
        System.out.println("Statement Object Created Successfully");
        ResultSet rs = st.executeQuery("select * from employeedetails");
        rs.next();
        int id = rs.getInt("employeeId");
        String name=rs.getString("employeeName");
       System.out.println("Employee name is "+name);
        System.out.println("Employee id no is "+id);

        int id2 = rs.getInt("employeeId");
        String name2=rs.getString("employeeName");
        System.out.println("Employee name is "+name2);
        System.out.println("Employee id no is "+id2);

        rs.close();
        st.close();
        con.close();
    }
}
