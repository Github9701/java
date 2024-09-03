package practiceprograms;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int number = sc.nextInt();
		
		String no = Integer.toString(number);
		
		for(int i=no.length()-1;i>=0;i--)
			
		System.out.println(no.charAt(i));

	}

}
