package cricinfo;

import java.util.Scanner;

public class EspnMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EspnCricInfo obj = new EspnCricInfo();
		int count = obj.getNoOfBatsmen();
		int choice;
		
       
        System.out.println("1.Add Batsman \n 2.Update Batsman \n 3.Search Batsman \n 4.Display All Batsmen \n 5.Quit");
       
        for(int j=0;j<100;j++) {
      
        System.out.println("\n \n Enter your choice(1-5) : ");
        choice = sc.nextInt();
        
        if(choice==1) {
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
			
			
			obj.addBatsmen(name, noOfRuns, centuries, halfCenturies);
			System.out.println("Do you want to continue y/n: ");
			ch = sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
        
        }else if(choice==2) {
        	System.out.println("Enter the Batsman Id you want to update : ");
    		int batsmanId = sc.nextInt();
    		Batsman batsman = obj.getBatsman(batsmanId);
    		
    		if(batsman!=null) {
    			System.out.println("Enter runs scored : ");
    			int runsScored = sc.nextInt();
    			System.out.println("Enter updated centuries : ");
    			int centuries = sc.nextInt();
    			System.out.println("Enter updated half centuries : ");
    			int halfCenturies = sc.nextInt();
    			
    			batsman = obj.updateBatsmanStats(batsman.getBatsmanId(), centuries, halfCenturies, runsScored);
    			System.out.println("Updated Batsman details : ");
    			System.out.println(batsman);
    		}
        	
        }else if(choice==3) {
        	System.out.println("Enter the Batsman Id you want : ");
    		int batsmanId = sc.nextInt();
    		
    		Batsman batsman = obj.getBatsman(batsmanId);
    		if(batsman!=null)
    			System.out.println(batsman.toString());
    		else
    			System.out.println("Batsman not found with that Id");
        }else if(choice==4) {
        	
        
        
		
		System.out.println("Displaying all batsmen");
		
		count = obj.getNoOfBatsmen();
		
		Batsman batsmen[] = obj.getBatsmen();
		
		
		for(int i = 0;i<count; i++) {
			System.out.println("Batsman Id : " + batsmen[i].getBatsmanId());
			System.out.println("Batsman Name : " + batsmen[i].getName());
			System.out.println("no of runs scored : " + batsmen[i].getRunsScored());
			
			System.out.println("Centuries : " + batsmen[i].getCenturies());
			System.out.println("Half Centuries : " + batsmen[i].getHalfCenturies());
			
		}
            System.out.println("No of Batsmen :" + count);
        }else if(choice==5) {
        	System.out.println("Quit");
        	break;
        }
        else
        	System.out.println("invalid choice");
        }
	}
       
}
		/*System.out.println("Enter the Batsman Id you want : ");
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
			
			batsman = obj.updateBatsmanStats(batsman.getBatsmanId(), centuries, halfCenturies, runsScored);
			System.out.println("Updated Batsman details : ");
			System.out.println(batsman);
		}*/
		
		

	


