package jdbcexamples;
import java.sql.*;
public class JdbcOperations {
	private static final String URL = "jdbc:mysql://localhost:3306/employdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertEmploy(String name, String desig, double salary, int deptno) {
		String query = "insert into emp(ename,desig,salary,deptno) values (?,?,?,?)";
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pst = con.prepareStatement(query)) {
			pst.setString(1, name);
			pst.setString(2, desig);
			pst.setDouble(3, salary);
			pst.setInt(4, deptno);
			pst.executeUpdate();
		} catch (SQLException E) {
			E.printStackTrace();
		}
	}

	public void updateEmploy(int empid, String name, String desig, double salary, int deptno, int managerid) {
		String query = "update emp set ename = ?,desig = ?,salary = ?,deptno = ?,managerid = ? where empid = ?";
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pst = con.prepareStatement(query)) {
			pst.setString(1, name);
			pst.setString(2, desig);
			pst.setDouble(3, salary);
			pst.setInt(4, deptno);
			pst.setInt(5, managerid);
			pst.setInt(6, empid);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmploy(int empid) {
		String query = "delete from emp where empid = ?";
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pst = con.prepareStatement(query)) {
			pst.setInt(1, empid);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getEmploy(int empid) {
		String select = "select * from emp where empid = ?";
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pst = con.prepareStatement(select)) {
			pst.setInt(1, empid);
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					System.out.println("Employ ID : " + rs.getInt("empid"));
					System.out.println("Employ name : " + rs.getString("ename"));
					System.out.println("Designation : " + rs.getString("desig"));
					System.out.println("Salary : " + rs.getFloat("salary"));
					System.out.println("Department no : " + rs.getInt("deptno"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
