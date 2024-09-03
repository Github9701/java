package assignments;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		rect.ractangle(45, 30);
		tri.triangle(45, 50);
		
		rect.calculateArea();
		tri.calculateArea();
	}

}
