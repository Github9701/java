package first;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("upper case");
		}else if(ch>='a' && ch<='z'){
			System.out.println("lower case");
		}else {
			System.out.println("not an alphabet");
		}
		

	}

}
