package featuresofjava8;

import java.util.*;

/*Given the list of integers, find the first element of the list using Stream functions.*/

public class StreamEx4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,23,34,45,56,67,78,98);
		
		Optional<Integer> firstElement = numbers .stream().findFirst();
		
		firstElement.ifPresentOrElse(
				element -> System.out.println("The first element is : " + element),
				() -> System.out.println("The list is empty") );

	}

}
