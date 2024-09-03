package jdbcexamples;

import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		JdbcOperations jo = new JdbcOperations();
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter the employ details \n Name \n desig \n salary \n deptno ");
		jo.insertEmploy( sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextInt());
		jo.updateEmploy(102, "naveen", "tester", 15000, 20,104);
		jo.getEmploy(104);
		jo.deleteEmploy(102);

	}

}
