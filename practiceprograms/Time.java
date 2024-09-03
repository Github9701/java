package practiceprograms;

public class Time {
	    private int hours;
	    private int minutes;
	    private int seconds;

	    public Time(int hours, int minutes, int seconds) {
	        this.hours = hours;
	        this.minutes = minutes;
	        this.seconds = seconds;
	    }

	    public Time difference(Time other) {
	        int totalSeconds1 = this.toSeconds();
	        int totalSeconds2 = other.toSeconds();
	        int diffSeconds = Math.abs(totalSeconds1 - totalSeconds2);
	        
	        System.out.println(totalSeconds1);
	        System.out.println(totalSeconds2);
	        
	        System.out.println(diffSeconds);

	        int hours = diffSeconds / 3600;
	        int minutes = (diffSeconds % 3600)  / 60;
	        int seconds = diffSeconds % 60;
	        
	        
	        
	        System.out.println(minutes);
	        System.out.println(seconds);

	        return new Time(hours, minutes, seconds);
	    }

	    private int toSeconds() {
	        return hours * 3600 + minutes * 60 + seconds;
	    }

	    @Override
	    public String toString() {
	        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	    }

	    
}
