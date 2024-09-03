package oops;

public class MyMain {

	public static void main(String[] args) {
        
		MyFirstClass obj = new MyFirstClass();
		
		MyFirstClass obj2 = new MyFirstClass();
		
		obj.readvalues();
		obj.increment();
		
		obj2.readvalues();
		obj2.decrement();
		
		obj.display();
		obj2.display();
	}

}
