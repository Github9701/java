package oops;

import java.util.Scanner;

public class MyFirstClass {

     private int a , b;
        
     public void readvalues()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two values");
        a = sc.nextInt();
        b = sc.nextInt();
        
     }
     
     public void increment() {
    	 a++;
    	 b++;
     }
     
     public void decrement() {
    	 a--;
    	 b--;
     }
     
     public void display() {
    	 System.out.println(a);
    	 System.out.println(b);
     }
		
		
	

}
