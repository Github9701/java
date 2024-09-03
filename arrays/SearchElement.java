package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("enter the array values");
		for(int i=0;i<size;i++) {
		array[i] = sc.nextInt();
		
		}
		
		System.out.println("enter the value you want to search");
		int val = sc.nextInt();
		int i;
		int pos = -1;
		for(i=0;i<size;i++) {
			if(val==array[i]) 
				pos = i+1;
			}
		if(pos>0)
			System.out.println("element found at " + pos);
		else
			System.out.println("element not found");
		
		
		
		
		}
        		

	}


