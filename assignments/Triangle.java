package assignments;

public class Triangle extends Shape {
	
	int base,height;
	public void triangle(int base,int height) {
		this.base = base;
		this.height = height;
	}
	
	void calculateArea() {
		
		System.out.println("Area of triangle is : " + 0.5*base*height);
	}

}
