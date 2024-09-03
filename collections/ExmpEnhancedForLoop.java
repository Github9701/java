package collections;

import java.util.ArrayList;

public class ExmpEnhancedForLoop {

	public static void main(String[] args) {
		//for (datatype variable : collection_used)
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(23);
		a1.add(443);
		a1.add(9009);
		a1.add(657344);
		
		for(Integer list : a1)
			System.out.println(list);
		
		

	}

}
