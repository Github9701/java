package examples;

public class FindTotNoOfEvenOdd {
/*find total no of even numbers ,odd numbers and prime numbers from the static array*/
	public static void main(String[] args) {
		int[] arr = {67,8,90,35,64,2,5,17};
		int l = arr.length;
		int evenCount = 0;
		int oddCount = 0;
		int primeCount = 0;
		for(int i =0;i<l;i++) {
			if(arr[i]%2==0) {
				evenCount++;
				}
		}
		for(int i = 0;i<l;i++) {
		   if(arr[i]%2 !=0) {
				oddCount++;
				}
		}
		for(int i=0;i<l;i++) {
			if(arr[i] < 2 ) {
				System.out.println(arr[i] + " is not a prime number");
			}else if(arr[i]==2 && arr[i]==3) {
				primeCount++;
			}
		}
		System.out.println("No of even numbers are : " + evenCount);
		System.out.println("No of odd numbers are : " + oddCount);
	}

}
