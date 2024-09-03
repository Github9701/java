package oops;

public class EmpMain {

	public static void main(String[] args) {
         
		Employ obj = new Employ(1234,"Jayaram","Developer",70000);
		Employ obj2 = new Employ(1235,"Rajesh","tester",45000);
		
		obj.calculate();
		obj2.calculate();
		
		System.out.println(obj);
		System.out.println();
		System.out.println(obj2);
		
	}

}
