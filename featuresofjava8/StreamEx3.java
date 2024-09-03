package featuresofjava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Find duplicate elements in a given integers list in java using Stream functions.*/

public class StreamEx3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,23,25,25,41,45,41,23,21,22,14,12);
		
		List<Integer> duplicates = findDuplicates(numbers);
		
		System.out.println(" Duplicate elements : " + duplicates);
		

	}
	
	public static List<Integer> findDuplicates(List<Integer> numbers) {
		
		Set<Integer> s = new HashSet<Integer>();
		return numbers.stream()
				.filter(num -> !s.add(num))
				.collect(Collectors.toList())
				.stream()
				.collect(Collectors.toList());
				
	}

}
