package stringexamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("enter the string");
		s1 = sc.nextLine();
		System.out.println("enter the string");
		s2 = sc.nextLine();
		
        System.out.println(s1.concat(s2));		
		
	}
	
}
