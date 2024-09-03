package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class UsingKeySetMethod {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Ferrari");
		ht.put(2, "Bugati");
		ht.put(3, "maserati");
		ht.put(4, "Honda");
		ht.put(5, "Maruthi Suzuki");
		
		Set<Integer> setOfKeys = ht.keySet();
		
		for(Integer key : setOfKeys) {
			System.out.println("Rank : " + key + "\t Name : " + ht.get(key));
		}
		
		
	}

}
