package oops;

public class EmpRandomIdMain {

	public static void main(String[] args) {
         EmpRandomId e1 = new EmpRandomId("jayaram", "tester", 23000);
         EmpRandomId e2 = new EmpRandomId("ram", "tester", 20000);
         
         e1.calculate();
         e2.calculate();
         
         System.out.println(e1);
         System.out.println();
         System.out.println(e2);
        		 
	}

}
