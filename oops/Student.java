package oops;

public class Student {
	private int rollno;
	private String sname;
	private String course;
	private int totfee;
	private int feepaid;
	public Student(int rollno, String sname, String course, int totfee, int feepaid) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.totfee = totfee;
		this.feepaid = feepaid;
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
	public int getTotfee() {
		return totfee;
	}
	public void setTotfee(int totfee) {
		this.totfee = totfee;
	}
	public int getFeepaid() {
		return feepaid;
	}
	public void setFeepaid(int feepaid) {
		this.feepaid = feepaid;
	}
	public int getRollno() {
		return rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", totfee=" + totfee
				+ ", feepaid=" + feepaid + "]";
	}
	
	

}
