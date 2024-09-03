package collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class UsingIterableForEachMethod {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Audi");
		ht.put(2, "Bugati");
		ht.put(3, "maserati");
		ht.put(4, "Benteley");
		ht.put(5, "chevrolet");
		
		ht.forEach((key,value) 
				-> System.out.println("Rank : " + key + "\t Name : " + value));
		
		

	}

}
