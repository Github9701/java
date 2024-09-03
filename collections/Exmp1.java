package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Exmp1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();

		a1.add(24);
		a1.add("Jayaram");
		a1.add(44.564);
		a1.add("Raghava");
		a1.add("Kalki");
		a1.add("Maths");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);

		LinkedList l1 = new LinkedList();
		
		l1.add("Jayaram");
		l1.add("Mahesh");
		l1.add("Kohli");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);

		HashSet s1 = new HashSet();
		
		s1.add("Jayaram");
		s1.add("M2414");
		s1.add("65.23");
		System.out.println();
		System.out.println(" Set Elements");
		System.out.print("\t" + s1);

		HashMap m1 = new HashMap();
		
		m1.put("Dhoni", "7");
		m1.put("Jayaram", "29");
		m1.put("Kalki", "12");
		m1.put("Kohli", "8");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}

}
