package jay;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int sum = 0;
        int i = 1;
        while(i<=10) {
        	System.out.println("enter the number");
        	int val = sc.nextInt();
        	sum = val + sum;
        	i++;
        }
        System.out.println("the sum is " + sum);
	}

}
