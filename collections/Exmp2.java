package collections;

import java.util.ArrayList;

public class Exmp2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		
	    a1.add(0, 10);
	    a1.add(1, 20);
	    a1.add(2, "Jayaram");
	    a1.add(3, 'A');
	    a1.add(4, 22.6);

	    System.out.println("ArrayList1 : " + a1);

	   
	    a2.add(10);
	    a2.add("Srikanth");
	    a2.add(30.56);
	    a2.add('J');

	    a1.addAll(1, a2);
	    
	    System.out.println("After adding a2 to a1 : " + a1);

	    
	    System.out.println("ArrayList2 : " + a2);

	   
	    a1.remove(1);
	    System.out.println("ArrayList1 after removing an element: " + a1);

	    
	    System.out.println("ArrayList1 using get() : " + a1.get(2));

	    
	    a1.set(0, 50);

	    
	    System.out.println("ArrayList1 : " + a1);
		

	}

}
