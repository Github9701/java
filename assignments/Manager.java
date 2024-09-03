package assignments;

public class Manager extends Employee {
	
	private ManagerType managerType;
	
	

	public Manager(String name, int employId, double salary, ManagerType managerType) {
		super(name, employId, salary);
		this.managerType = managerType;
	}

	public ManagerType getManagerType() {
		return managerType;
	}

	public void setManagerType(ManagerType managerType) {
		this.managerType = managerType;
	}
	
	@Override
	public double setSalary(double salary) {
		
		switch (managerType) {
		
		case HR:
			return salary + 10000;
		case SALES:
			return salary + 5000;
		default:
			return salary;
			
		}
		
	}
	
	

}
