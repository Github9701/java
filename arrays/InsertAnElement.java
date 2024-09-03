package arrays;

import java.util.Scanner;

public class InsertAnElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter the value");
			arr[i] = sc.nextInt();
			
		}
		    System.out.println("enter the value you want to insert");
			int val = sc.nextInt();
			
			System.out.println("enter the position");
			int pos = sc.nextInt();
			
			for(int i=size;i>=pos-1;i--) {
				arr[i+1] = arr[i];
				}
			arr[pos-1] = val;
			size++;
			for(int i=0;i<size;i++)
				System.out.println(arr[i]);
			
		
		
		
		

	}

}
