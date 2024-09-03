package featuresofjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/

public class StreamEx {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,22,53,64,22,10,52,26,47,80,49,29);
		
		Set<Integer> evenNumbers = numbers.stream().filter(number -> number%2 == 0).collect(Collectors.toSet());
		
		//numbers.stream().filter(n -> n%2 == 0)
			//			.forEach(System.out::println);
		
		System.out.println("Even Numbers are : " + evenNumbers);

	}

}
