package first;

public class SwapOfNums {

	public static void main(String[] args) {
		int x = 10;
		int y = 22;
		System.out.println("numbers before swapping");
        System.out.println("x = " + x + '\n' + "y =" + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("numbers after swapping = ");
		System.out.println("x = " + x + '\n' + "y =" + y);
		
	}

}
