package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3;
		
		System.out.println("enter the size of the first array");
		s1 = sc.nextInt();
		System.out.println("enter first array");
		int arr1[] = new int[s1];
		
		for(int i=0;i<s1;i++) {
			System.out.println("enter the value");
		    arr1[i] = sc.nextInt();
		}
		System.out.println("enter the size of the second array");
		s2 = sc.nextInt();
		System.out.println("enter second array");
		int arr2[] = new int[s2];
		
		for(int i=0;i<s1;i++) {
			System.out.println("enter the value");
		    arr2[i] = sc.nextInt();
		}
		s3 = s1 + s2;
		int arr3[] = new int[s3];
		
		for(int i=0;i<s1;i++) {
			arr3[i] = arr1[i];
			}
		int pos=s1;
		for(int i=0;i<s2;i++)
		 arr3[i+pos] = arr2[i];
		
		System.out.println("concatenated array is");
		
		for(int i=0;i<s3;i++)
			System.out.println(arr3[i]);
		
	}

}
