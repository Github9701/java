package featuresofjava8;

import java.util.Arrays;
import java.util.List;

/*Given a list of integers, sort all the values present in it using Stream functions*/
public class StreamsEx8 {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,34,54,32,3,12,23,9,56,87,98,65);
		
		List<Integer> sortNum = num.stream().sorted().toList();
		
		System.out.println(sortNum);
		

	}

}
