package jay;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ecnt = 0, ocnt = 0;
	int i = 1;
	
	System.out.println("enter the numbers");
	int cnt = sc.nextInt();
	while(i<=cnt)
	{
		System.out.println("enter the values");
		int val = sc.nextInt();
		i++;
	    if(val%2==0)
	    {
	    	 ecnt++;
	    	
	    }else {
	    	ocnt++;
	    	
	    }
	}
	System.out.println("even numbers count =" + ecnt);
	System.out.println("odd numbers count =" + ocnt);
	}

}
