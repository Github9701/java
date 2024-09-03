package arrays;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[50];
		
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("enter the value");
			arr[i] = sc.nextInt();
		
		}
		System.out.println("enter the position you want to delete");
		int pos = sc.nextInt();
		
		for(int i=pos-1;i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		System.out.println("\n after deleting");
		
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}

}
