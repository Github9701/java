package jay;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
        int sum = 0;
        int i = 1;
        
        while(i<=10) {
        	
        	sum = i + sum;
        	i++;
        }
        System.out.println("the sum is " + sum);
	}

}
