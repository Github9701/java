package sorting;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		
		System.out.println("enter the size of the array you want : ");
		
		int s1 = sc.nextInt();
		
		for(int i=0;i<s1;i++) {
			System.out.println("enter the value : ");
			arr[i] = sc.nextInt();
		}
		
	}

}
