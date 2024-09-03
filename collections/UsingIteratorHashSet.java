package collections;

import java.util.HashSet;
import java.util.Iterator;

public class UsingIteratorHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> ht = new HashSet<Integer>();
		
		ht.add(10);
		ht.add(233);
		ht.add(32);
		ht.add(65);
		ht.add(10);
		ht.add(32);
		
		Iterator<Integer> itr = ht.iterator();
		
		System.out.println("Iterate HashSet using iterator : ");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
