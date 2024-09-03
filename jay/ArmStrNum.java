package jay;

import java.util.Scanner;

public class ArmStrNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the number");
		int no = sc.nextInt();
		
		while(no!=0) {
			
			int r = no%10;
			sum = sum + r;
			no = no/10;
			
		}
		System.out.println("armstrong number is " + sum);

	}

}
