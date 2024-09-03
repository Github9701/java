package assignments;

import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {
		int maths,physics,chemistry;
		maths = readvalues();
		physics = readvalues();
		chemistry = readvalues();
	    
		add(maths,physics,chemistry);

	}
	static int readvalues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		return marks;
		
	}
	static void add(int maths, int physics, int chemistry) {
		int total = maths + physics + chemistry;
		System.out.println("total marks are = " + total);
		
		int avg = total/3;
		System.out.println("average marks are " + avg);
	
		if(maths>=35 && physics>=35 && chemistry>=35) {
			if(avg>=60) {
				System.out.println("first class");
			}else if(avg>=50 && avg<60)
				System.out.println("second class");
			else
				System.out.println("third class");
		}else 
			System.out.println("failed");
		
	}
	
	
	   
}

	
	


