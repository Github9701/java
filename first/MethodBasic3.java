package first;

import java.util.Scanner;

public class MethodBasic3 {

	public static void main(String[] args) {
		int a = readvalues();
		int b = readvalues();
		add(a,b);
		
	    a = readvalues();
		b = readvalues();
		subtraction(a,b);
		
		a = readvalues();
		b = readvalues();
		multiplication(a,b);
		
	}
	    static int readvalues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value");
		int val = sc.nextInt();
		return val;
		
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
