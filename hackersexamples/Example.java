package hackersexamples;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		
		System.out.println("string : " + s);
		System.out.println("double : " + b);
		System.out.println("int : " + a);
		
	}

}
