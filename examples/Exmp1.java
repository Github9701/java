package examples;

import java.util.Scanner;

public class Exmp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value ");
		
		int value = sc.nextInt();
		
		int absoluteValue = Math.abs(value);
		
		System.out.println("Absolute value is : " + absoluteValue);

	}

}
