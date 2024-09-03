package examples;

import java.util.Scanner;

public class Exmp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("Numbers are divisible with each other");
		}else {
			System.out.println("Numbers are not divisible with each other");
		}

	}

}
