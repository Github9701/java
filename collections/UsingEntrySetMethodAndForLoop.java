package collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class UsingEntrySetMethodAndForLoop {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "Ferrari");
		ht.put(2, "Bugati");
		ht.put(3, "maserati");
		ht.put(4, "Honda");
		ht.put(5, "Maruthi Suzuki");
		
		Set<Entry<Integer,String> > entrySet = ht.entrySet();
		
		for(Entry<Integer,String> entry : entrySet) {
			System.out.println("Rank : " + entry.getKey() + "\t Name : " + entry.getValue());
		}

	}

}
