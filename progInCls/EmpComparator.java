package progInCls;

import java.util.*;

public class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if (e1.getSalary() != e2.getSalary()) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        } else if (!e1.getName().equals(e2.getName())) {
            return e1.getName().compareTo(e2.getName());
        } else {
            return Integer.compare(e2.getAge(), e1.getAge());
        }
	}
	
	 

}
