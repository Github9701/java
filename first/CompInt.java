package first;

import java.util.Scanner;

public class CompInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p , r , n, t;
		System.out.println("enter principle");
		p = sc.nextInt();
		System.out.println("enter rate of interest");
		r = sc.nextInt();
		System.out.println("enter number of times the interest is compounded annually");
		n = sc.nextInt();
		System.out.println("enter time period");
		t = sc.nextInt();
		double ci = p*(Math.pow((1+(r/n)),(n*t))) - p;
		System.out.println("amount is = " + ci);
		
		

	}

}
