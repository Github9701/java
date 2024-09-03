package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class UsingEnumInterface {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Jayaram");
		ht.put(2, "Mahesh");
		ht.put(3, "Naveen");
		ht.put(4, "Raghava");
		
		Enumeration<Integer> e = ht.keys();
		
		while(e.hasMoreElements()) {
			
			int key = e.nextElement();
			
			System.out.println("Rank : " + key + "\tname : " + ht.get(key));
		}

	}

}
