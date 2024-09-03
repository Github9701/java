package assignments;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>=b && a>=c) {
			System.out.println(a + " is the greatest number");
		}else if(b>=a && b>=c) {
			System.out.println(b + " is the greatest number");
		}else
			System.out.println(c + " is the greatest number ");

		
	}

}
