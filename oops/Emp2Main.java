package oops;

public class Emp2Main {

	public static void main(String[] args) {
         
		Employ2 obj = new Employ2("Jayaram","developer",78000);
		Employ2 obj2 = new Employ2("ram","developer",70000);
		Employ2 obj3 = new Employ2("Jay","developer",90000);
		
		obj2.calculate();
		obj.calculate();
		obj3.calculate();
		
		System.out.println(obj);
		System.out.println();
		System.out.println(obj2);
		System.out.println();
		System.out.println(obj3);
		
		
	}

}
