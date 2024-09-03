package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpIterator {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Nag Ashwin");
		a1.add("750 Crores");
		a1.add("Kalki 2898AD");
		a1.add("209007");
		
		System.out.println("Using while loop : ");
		
		Iterator<String> i = a1.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("\nUsing for Loop : ");
		
		for(Iterator<String> name = a1.iterator();name.hasNext();)
			
			System.out.println(name.next());
		

	}

}
