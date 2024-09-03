package collections;

import java.util.ArrayList;

public class ExmpForeach {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();

		name.add("Jayaram");
		name.add("Java");
		name.add("Full Stack");
		name.add("Cars");

		for (String obj : name)
			System.out.println(obj);

		System.out.println();

		name.forEach(System.out::println);

	}

}
