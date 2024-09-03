package progInCls;

public class EmpMain {

	public static void main(String[] args) {
		EmployeeSet empSet = new EmployeeSet();

		Employee e1 = new Employee(101, 22, "Jayaram", 30000);
		Employee e2 = new Employee(102, 24, "Mahesh", 25000);
		Employee e3 = new Employee(103, 32, "Abhiram", 28000);
		Employee e4 = new Employee(104, 25, "Ragava", 32000);
		
		empSet.addEmployee(e1);
		empSet.addEmployee(e2);
		empSet.addEmployee(e3);
		empSet.addEmployee(e4);
		
		System.out.println("Employees in Sorted order");
		
		for(Employee emp : empSet.empTreeSet) {
			System.out.println(emp);
		}

	}

}
