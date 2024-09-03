package examples;

import java.util.Scanner;

public class SwappingWithout3rdVariable {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("numbers before swapping\n" + "x : " + x + "\ny : " + y );
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("numbers after swapping\n" + "x : " + x +"\ny : " + y);
	}
}
