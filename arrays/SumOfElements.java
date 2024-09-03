package arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[];
		System.out.println("enter the array size");
		int size = sc.nextInt();
		x = new int[size];
		
		int sum=0;
		for(int i=0;i<x.length;i++) {
		    System.out.println("enter the value");
		    x[i] = sc.nextInt();
		    sum = sum + x[i];
		}
		System.out.println("the length of the array is " + x.length);
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
		System.out.println("sum of elements is " + sum );
	}

}
