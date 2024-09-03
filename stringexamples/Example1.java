package stringexamples;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("enter the string");
		s1 = sc.next();
		System.out.println("string you entered is : ");
		System.out.println(s1);
		System.out.println("length is : " + s1.length());
		
	}
	
}
