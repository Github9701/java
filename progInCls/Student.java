package progInCls;

public class Student {
	private int rollno;
	private String sname,course;
	
	public Student(int rollno, String sname, String course) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
	}
	

	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getRollno() {
		return rollno;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + "]";
	}
	
	
	

}
