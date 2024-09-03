package progInCls;

public class Results extends Test implements Sports {
	
	int total ;
	
	
	public Results(int rollno, String sname, String course, int maths, int physics, int chemistry) {
		super(rollno, sname, course, maths, physics, chemistry);
		
	}
	public void calTot() {
		this.total =  maths + physics + chemistry + sportsMarks;
	}


	@Override
	public void displaySportsInfo() {
		System.out.println("Total Sports Marks : " + sportsMarks);
		
	}
	
	public int getSportsMarks() {
		return sportsMarks;
	}
	public int getTotal() {
		return total;
	}
	
	




	
	

}
