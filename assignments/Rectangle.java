package assignments;



public class Rectangle extends Shape {
	
	int length,breadth;
    public void ractangle(int length,int breadth) {
    this.length = length;
    this.breadth = breadth;
    }
    @Override
    void calculateArea() {
    	
    	
    	System.out.println("Area of rectangle is : " + length*breadth );
    	
    }
}
