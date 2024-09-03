package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UsingEntrySetMethodAndIterator {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Bentley");
		ht.put(2, "Mahindra");
		ht.put(3, "Chevrolet");
		ht.put(4, "Jaguar");
		ht.put(5, "Audi");
		
		Set<Entry<Integer,String> > entrySet = ht.entrySet();
		
		Iterator<Entry<Integer,String> > itr = entrySet.iterator();
		
		while (itr.hasNext()) {
			
			Entry<Integer,String> entry = itr.next();
			
			System.out.println("Rank : " + entry.getKey() + "\t Car-Name : " + entry.getValue());
			
		}
		

	}

}
