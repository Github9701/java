package exception;

import java.util.*;

public class ReadingInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the First Value : ");
			int a = sc.nextInt();
			System.out.print("Enter the Second Value : ");
			int b = sc.nextInt();
			
			System.out.println("Result is : " + (a/b));
		}catch (InputMismatchException e) {
			System.out.println("Invalid Input, Enter proper Integer Values");
		}catch (ArithmeticException e) {
			System.out.println("Division by Zero is not accepted");
		}
		
		System.out.println("Have a good day...!");
		

	}

}
