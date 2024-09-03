package oops;

import java.util.Scanner;

public class EspnCricInfoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Espncricinfo obj = new Espncricinfo();
		int count = obj.getNoOfBatsmen();
		System.out.println("No of Batsmen " + count);
		
		char ch;
		do {
			System.out.print("Enter the batsman name :");
			String name = sc.next();
			System.out.print("Number of runs scored :");
			int noOfRuns = sc.nextInt();
			System.out.print("Number of centuries :");
			int centuries = sc.nextInt();
			System.out.print("Number of halfcenturies :");
			int halfCenturies = sc.nextInt();
			System.out.print("Number of ballsfaced :");
			int ballsFaced = sc.nextInt();
			System.out.print("Number of fours :");
			int fours = sc.nextInt();
			System.out.print("Number of sixes :");
			int sixes = sc.nextInt();
			
			obj.addBatsman(name, noOfRuns, centuries, halfCenturies, ballsFaced, fours, sixes);
			System.out.println("Do you want to continue y/n: ");
			ch = sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
		
		System.out.println("Display all batsmen");
		
		count = obj.getNoOfBatsmen();
		
		Batsman batsmen[] = obj.getBatsmen();
		
		
		for(int i = 0;i<count; i++) {
			System.out.print("Batsman Id : " + batsmen[i].getBatsmanId());
			System.out.print("Batsman Name : " + batsmen[i].getName());
			System.out.print("no of runs scored : " + batsmen[i].getRunsScored());
			System.out.print("Balls Faced : " + batsmen[i].getBallsFaced());
			System.out.print("Centuries : " + batsmen[i].getCenturies());
			System.out.print("Half Centuries : " + batsmen[i].getHalfCenturies());
			System.out.println("Fours : " + batsmen[i].getFours());
			System.out.println("sixes : " + batsmen[i].getSixes());
		}
		
		System.out.println("No of Batsmen :" + count);
		
		System.out.println("Enter the Batsman Id you want : ");
		int batsmanId = sc.nextInt();
		
		Batsman batsman = obj.getBatsman(batsmanId);
		if(batsman!=null)
			System.out.println(batsman.toString());
		else
			System.out.println("Batsman not found with that Id");
		
		
		System.out.println("Enter the Batsman Id you want to update : ");
		batsmanId = sc.nextInt();
		batsman = obj.getBatsman(batsmanId);
		
		if(batsman!=null) {
			System.out.println("Enter runs scored : ");
			int runsScored = sc.nextInt();
			System.out.println("Enter updated centuries : ");
			int centuries = sc.nextInt();
			System.out.println("Enter updated half centuries : ");
			int halfCenturies = sc.nextInt();
			
			batsman = obj.updateBatsmanStats(batsman.getBatsmanId(), runsScored, runsScored, centuries, halfCenturies);
			System.out.println("Updated Batsman details : ");
			System.out.println(batsman);
		}
		
		

	}

}
