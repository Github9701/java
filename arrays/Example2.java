package arrays;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int x[] = {23,4,32,54,65};
		int y[];
		y = new int[8];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<y.length;i++) {
			System.out.println("enter the value");
			y[i] = sc.nextInt();
		}
		System.out.println("length of x array is " + x.length);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
			System.out.println("length of x array is " + y.length);
			for(int i=0;i<y.length;i++) {
				System.out.println(y[i]);
		}
	
	}
}


