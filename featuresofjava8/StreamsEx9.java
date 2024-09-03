package featuresofjava8;

import java.util.Arrays;
import java.util.List;

/*Given a list of integers, sort all the values in descending order present in it using Stream functions*/
public class StreamsEx9 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(23,32,12,11,1,4,76,89,56,62,31);
		
		List<Integer> sort = num.stream()
				                .sorted((a,b) -> b-a)
				                .toList();
		System.out.println(sort);
		

	}

}
