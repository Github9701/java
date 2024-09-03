package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employdb","root","root");
			st = con.createStatement();
			String select = "select ename,desig,salary,deptno from emp";
			boolean value = st.execute(select);
			if(value) {
				ResultSet rs = st.getResultSet();
				while(rs.next()) {
					System.out.print("Employ name : " + rs.getString("ename"));
					System.out.print("\tDesignation : " + rs.getString("desig"));
					System.out.print("\tSalary : " + rs.getFloat("salary"));
					System.out.println("\tDepartment no : " + rs.getInt("deptno"));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
}
