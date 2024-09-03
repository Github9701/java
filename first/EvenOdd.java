package first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value");
		int val = sc.nextInt();
		if (val%2==0) {
			System.out.println("even number");
		} else {
            System.out.println("odd number");
		}

	}

}
