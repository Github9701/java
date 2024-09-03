package progInCls;

import java.util.TreeSet;

public class EmployeeSet {
	
	TreeSet<Employee> empTreeSet = new TreeSet<>(new EmpComparator());
	
	public int addEmployee(Employee emp) {
		
		if(emp==null) {
			return 1;
		}
		try {
			empTreeSet.add(emp);
			return 0;
		}catch (Exception e) {
			return 1;
		}
	}
	
//	public TreeSet<Employee> getEmpTreeSet(){
//		return empTreeSet;
//	}


}
