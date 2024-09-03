package practiceprograms;

import java.util.Scanner;

public class PalindrOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int rev=0;
		while(num>0)
		{
			int d = num%10;
			num = num/10;
			rev = rev*10 + d;
		
		}
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		

	}

}
