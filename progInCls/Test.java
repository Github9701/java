package progInCls;

public class Test extends Student {
	
	 int maths, physics, chemistry;
	

	public Test(int rollno, String sname, String course, int maths, int physics, int chemistry) {
		super(rollno, sname, course);
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
	}


	public int getMaths() {
		return maths;
	}


	public int getPhysics() {
		return physics;
	}


	public int getChemistry() {
		return chemistry;
	}

	

	
	
	

}
