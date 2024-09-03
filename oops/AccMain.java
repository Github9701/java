package oops;

public class AccMain {

	public static void main(String[] args) {
        
		Account obj = new Account(1001,"Jayaram","savings",10000);
		Account obj2 = new Account(1002,"Jayaram yalla","savings",40000);
		
		obj.withdrawl(10000);
		obj2.withdrawl(12000);
		
		obj.deposit(20000);
		obj2.deposit(13000);
		
		System.out.println(obj);
		System.out.println(obj2);
		
	}

}
