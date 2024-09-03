package first;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' ||
        		ch=='O' || ch=='o' || ch=='U' || ch=='u') {
        	System.out.println("it is a vowel");
        }else {
        	System.out.println("it is not a vowel");
        }
	}

}
