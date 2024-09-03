package featuresofjava8;

import java.util.Arrays;
import java.util.List;

/*Given a list of integers, find the total number of elements present in the list using Stream functions*/

public class StreamsEx5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,25,32,56,5,89,54,56,44,5,2,85);
		
		System.out.println("Total number of elements : " + numbers.stream().count());

	}

}
