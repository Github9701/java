package jay;

import java.util.Scanner;

public class OddEvencnt {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int esum = 0, osum = 0;
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
	    	 esum= esum + val;
	    	
	    }else {
	    	osum = osum + val;
	    	
	    }
	}
	System.out.println("sum of even numbers are =" + esum);
	System.out.println("sum of odds =" + osum);
	}

}
