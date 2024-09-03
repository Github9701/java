package collections;

import java.util.ArrayList;

public class Exmp3 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
       
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");      
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);
	      
	      a1.remove(1);
	      
	      System.out.println("\n ArrayList Elements");
	      System.out.print("\t" + a1);
		

	}

}
