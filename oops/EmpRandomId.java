package oops;

import java.util.Random;

public class EmpRandomId {
	
	static int id;
	private int empId;
	private String empName;
	private String desig;
	private double sal,ta,da,hra,grosSal,lic,pf,netSal;
	
	
	public EmpRandomId(String empName, String desig, double sal) {
		Random num = new Random();
		id = num.nextInt();
		empId = id;
		this.empName = empName;
		this.desig = desig;
		this.sal = sal;
		id++;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void calculate() {
		ta = sal*0.1;
		da = sal*0.15;
		hra = sal*0.3;
		lic = sal*0.1;
		pf = sal*0.2;
		
		grosSal = ta + da + hra + sal;
		netSal = grosSal - lic - pf;
		
		
	}
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", desig=" + desig + ", sal=" + sal + ", ta=" + ta
				+ ", da=" + da + ", hra=" + hra + ", grosSal=" + grosSal + ", lic=" + lic + ", pf=" + pf + ", netSal="
				+ netSal + "]";
	}
	
	

}
