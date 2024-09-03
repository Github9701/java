package assignments;

public class Employee {
	
	private String name;
	private int employId;
	private double salary;
	
	public Employee(String name, int employId, double salary) {
		super();
		this.name = name;
		this.employId = employId;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public double getSalary() {
		return salary;
	}
	public double setSalary(double salary) {
		return this.salary = salary;
	}
	
	

}
