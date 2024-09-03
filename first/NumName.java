package first;

import java.util.Scanner;

public class NumName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number between 1 and 10");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("one");
		break;
		case 2:
			System.out.println("two");
		break;
		case 3:
			System.out.println("three");
		break;
		case 4:
			System.out.println("four");
		break;
		case 5:
			System.out.println("five");
		break;
		case 6:
			System.out.println("six");
		break;
		case 7:
			System.out.println("seven");
		break;
		case 8:
			System.out.println("eight");
		break;
		case 9:
			System.out.println("nine");
		break;
		case 10:
			System.out.println("ten");
		break;
		default:
			System.out.println("not a didgit");
		
		}

	}

}
