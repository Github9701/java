package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class UsingKeySetMethodAndIterator {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "Ferrari");
		ht.put(2, "Bugati");
		ht.put(3, "maserati");
		ht.put(4, "Honda");
		ht.put(5, "Maruthi Suzuki");

		Set<Integer> setOfKeys = ht.keySet();

		Iterator<Integer> itr = setOfKeys.iterator();

		while (itr.hasNext()) {
			int key = itr.next();

			System.out.println("Rank : " + key + "\t Name : " + ht.get(key));
		}

	}

}
