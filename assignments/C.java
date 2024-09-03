package assignments;

public class C extends B{
	
	char ch1, ch2;
	
	public C(int a,int b,float x,float y,char ch1, char ch2) {
		super(a,b,x,y);
		this.ch1 = ch1;
		this.ch2 = ch2;
	}
	@Override
	public String toString() {
		return "C [ch1=" + ch1 + ", ch2=" + ch2 + ", x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + "]";
	}
	

}
