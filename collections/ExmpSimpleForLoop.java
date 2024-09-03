package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExmpSimpleForLoop {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("Jayaram");
		a1.add(50000);
		a1.add("Nirmala");
		a1.add(75000);
		
		System.out.println(a1);
		
		System.out.println();
		System.out.println("Iteration through simple for loop");
		
		for(int i=0;i<a1.size();i++)
			System.out.println(a1.get(i));
	}

}
