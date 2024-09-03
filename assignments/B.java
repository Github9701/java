package assignments;

public class B extends A{
	
	float x, y;

	
	

	public B(int a, int b, float x, float y) {
		super(a, b);
		this.x = x;
		this.y = y;
	}




	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + "]";
	}
	
	

	

}
