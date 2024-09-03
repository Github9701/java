package jay;

import java.util.Scanner;

public class SumOfNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int sum = 0;
        int i = 1;
        System.out.println("enter how many you want sum");
        int cnt = sc.nextInt();
        while(i<=cnt) {
        	System.out.println("enter the number");
        	int val = sc.nextInt();
        	sum = val + sum;
        	i++;
        }
        System.out.println("the sum is " + sum);
	}

}
