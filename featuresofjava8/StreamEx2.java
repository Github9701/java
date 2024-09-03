package featuresofjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Finding all the numbers starting with 1 using Stream functions */

public class StreamEx2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,21,26,28,15,114,125,214,147);
		
		List<Integer> numbersStartingWith1 = numbers.stream().filter(num -> num.toString().startsWith("1")).collect(Collectors.toList());
		
		System.out.println("Numbers Stsrting with 1 are : " + numbersStartingWith1);
		
		
		

	}

}
