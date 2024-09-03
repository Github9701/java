package progInCls;

public class StudentMain {

	public static void main(String[] args) {
		Results result = new Results(101, "Jayaram", "MPC", 95, 80, 90);
		
		result.displaySportsInfo();
		System.out.println();
		result.calTot();
		
	
		System.out.println("Student Roll No : " + result.getRollno() );
		System.out.println("Student Name : " + result.getSname() );
		System.out.println("Course : " + result.getCourse() );
		System.out.println("Maths Marks : " + result.maths);
		System.out.println("Physics Marks : " + result.physics );
		System.out.println("Chemistry Marks : " + result.chemistry );
		System.out.println("Sports Marks : " + result.getSportsMarks() );
		System.out.println("Total Marks : " + result.getTotal() );
			
			
		

	}

}
