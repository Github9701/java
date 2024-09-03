package first;

import java.util.Scanner;

public class TotAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the maths marks");
		double maths = sc.nextDouble();
		System.out.println("enter physics marks");
		double physics = sc.nextDouble();
		System.out.println("enter chemistry marks");
		double chemistry = sc.nextDouble();
		
		double total = maths + physics + chemistry;
		System.out.println("total marks are =" + total);
		double average = total/3;
		System.out.println("average of 3 subjects is =" + average);
		
		
		
		
	}

}
