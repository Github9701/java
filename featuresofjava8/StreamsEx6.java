package featuresofjava8;

import java.util.Arrays;
import java.util.List;

/*Given a list of integers, find the maximum value element present in it using Stream functions?*/

public class StreamsEx6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,52,58,65,95,98,45,73,29,35,55);
		
		int max = numbers.stream().max(Integer::compare).get();
		
		System.out.println("Maximum value element is : " + max);

	}

}
