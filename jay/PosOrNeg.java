package jay;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number");
	    
	    int num = sc.nextInt();
	    if(num<0) {
	    	System.out.println(num +"  is a negetive number");
	    }else {
	    	System.out.println(num +"  is a positive number");
	    }
		

	}

}
