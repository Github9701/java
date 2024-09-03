package inheritanceExmp;

public class B extends A {
	
	float m, n;
	void getdata(float m, float n) {
		this.m = m;
		this.n = n;
	}
	void show() {
		System.out.println("m : " + m + "\t" + "n : " + n);	
		}
	

}
