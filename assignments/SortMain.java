package assignments;

public class SortMain {

	public static void main(String[] args) {
		
		int[] array = {32,43,55,36,71,29,42};
		BubbleSort bs = new BubbleSort();
		
		int n = array.length;
		
		System.out.println("Array before sorting");
		
		for(int i=0;i<n;i++)
			System.out.println(array[i]);
		
		bs.sort(array);
		
		for(int i=0;i<n;i++)
		System.out.println(array[i]);
		
		

	}

}
