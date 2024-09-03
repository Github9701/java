package first;

import java.util.Scanner;

public class DisplayGrade {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the maths marks");
	    int maths = sc.nextInt();
	    
	    System.out.println("enter the physics marks");
	    int physics = sc.nextInt();
	    
	    System.out.println("enter the chemistry marks");
	    int chemistry = sc.nextInt();
	    
	    System.out.println("marks = " + maths + "\t" + physics + "\t" + chemistry);
	    
	    int total = maths + physics + chemistry;
	    System.out.println("total is =" + total);
	    
	    double avg = total/3.0;
	    System.out.println("average is =" + avg);
	    if(maths>=35 && physics>=35 && chemistry>=35) {
	    if(avg>=60) {
	    	System.out.println("first class");
	    }else if(avg>=50 && avg<60) {
	    	System.out.println("second class");
	    }else if(avg>=35 && avg<50) {
	    	System.out.println("third class");
	    }

	}else {
		System.out.println("failed");
	}

	}
}

