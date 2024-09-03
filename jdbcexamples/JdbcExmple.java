package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExmple {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employdb","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select empid,ename,salary,deptno from emp");
			while(rs.next()) {
				System.out.println("Employ ID : " + rs.getInt("empid"));
				System.out.println("Employ Name : " + rs.getString("ename"));
				System.out.println("Salary : " + rs.getFloat("salary"));
				System.out.println("Department Number : " + rs.getInt("deptno"));	
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
