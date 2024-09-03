package practiceprograms;

public class TimeMain {

	public static void main(String[] args) {
        Time time1 = new Time(10, 59, 15);
        Time time2 = new Time(7, 45, 54);

        Time difference = time1.difference(time2);
        System.out.println("Time Difference: " + difference);
    }


}
