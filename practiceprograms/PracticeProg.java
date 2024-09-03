package practiceprograms;

public class PracticeProg {

	public static void main(String[] args) {
		boolean car = false ;
		
		if(car = true)
			System.out.println("this is not a car");
		
		int cost = 23;
		if(cost == 23)
			System.out.println(cost);
		
		
		double firstValue = 20.00;
		double secondValue = 80.00;
		
		double total = firstValue + secondValue*100.00;
		
		System.out.println("total value = " + total);
		double reminder = total%40.00;
		System.out.println("The reminder is = " + reminder);
		
		boolean isNoReminder = (reminder ==0)?true:false;
		
		System.out.println("isNoReminder = " + isNoReminder);
		
		if(!isNoReminder)
			System.out.println("got some reminder");
		
		
		

	}

}
