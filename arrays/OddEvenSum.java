package arrays;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
       
       int esum = 0 , osum= 0;
       int x[] = {1,2,3,4,5,6,4,2,11,445,12,45,5};
       
       for(int i=0;i<x.length;i++) {
    	   
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
