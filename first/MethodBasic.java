package first;

import java.util.Scanner;

public class MethodBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value");
		int a = sc.nextInt();
		System.out.println("enter the second value");
		int b = sc.nextInt();
		add(a,b);
		subtraction(a,b);
		multiplication(a,b);

	}
	static void add(int x, int y)
	{
		
		int sum = x+y;
		System.out.println("sum is =" + sum);
	
	}
	static void subtraction(int x, int y) {
			
	    int diff = x-y;
	    System.out.println("difference is =" + diff);
	}
	static void multiplication(int x, int y)
	{
		
		int product = x*y;
		System.out.println("product is =" + product);
	}

}
