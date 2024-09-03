package collections;

import java.util.HashSet;
import java.util.Iterator;

public class UsingForEachHashSet {

	public static void main(String[] args) {
		
		HashSet<String> ht = new HashSet<String>();
		
		ht.add("Skoda");
		ht.add("Volkswagen");
		ht.add("Toyota");
		ht.add("Volvo");
		ht.add("Nissan");
		ht.add("Land Rover");
		
		System.out.println("Iterate HashSet using forEach Loop : ");
		
		ht.forEach(System.out::println);
		

	}

}
