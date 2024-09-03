package arrays;

import java.util.Scanner;

public class OddEvenSum2 {

	public static void main(String[] args) {
       
       int esum = 0 , osum= 0;
       int x[];
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of an array");
       int size = sc.nextInt();
       x = new int[size];
       
       for(int i=0;i<x.length;i++) {
    	   System.out.println("enter the values");
    	   x[i] = sc.nextInt();
    	   
    	   
    	   if(x[i]%2==0) {
    		   esum = esum + x[i];
    		  
    	   }else {
    		   osum = osum + x[i];
    		  
    	   }
    	   
       }
       System.out.println("even number sum is = " + esum);
	   System.out.println("odd numbers sum is = " + osum);

	}

}
