package first;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter principle =");
		double principle = sc.nextDouble();
		System.out.println("enter time period");
		double timeperiod = sc.nextDouble();
		System.out.println("enter rate of ineterst");
		double rateofinterest = sc.nextDouble();
		
		double simpleinterest = (principle*timeperiod*rateofinterest)/100;
		System.out.println("simple ineterest is =" + simpleinterest);
		
		

	}

}
