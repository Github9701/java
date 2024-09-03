package first;

import java.util.Scanner;

public class MethodBasic2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first value");
		a = sc.nextInt();
		System.out.println("enter the second value");
		 b = sc.nextInt();
		int sum = a+b;
		
		System.out.println("enter the first value");
		a = sc.nextInt();
		System.out.println("enter the second value");
		b = sc.nextInt();	
	    int diff = a-b;
	    
		System.out.println("enter the first value");
		a = sc.nextInt();
		System.out.println("enter the second value");
		b = sc.nextInt();
		int product = a*b;
		
		System.out.println("addition of two numbers is =" + sum);
		System.out.println("subtraction of two numbers is =" + diff);
		System.out.println("multiplication  of two numbers is =" + product);

	}

}
