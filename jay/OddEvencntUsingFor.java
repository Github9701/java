package jay;

import java.util.Scanner;

public class OddEvencntUsingFor {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,esum = 0, osum = 0;
	
	System.out.println("enter the numbers");
	
	for(i=1;i<=10;i++)
	{
		System.out.println("enter the values");
		int val = sc.nextInt();
		
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
