package practiceprograms;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[] = {1,2,3,6,8,10,14};
		
		int l = a.length;
		
		for(int i=0;i<l-1;i++) {
			if(a[i+1]-a[i] != 1) {
				for(int j=a[i]+1;j<a[i+1];j++)
					System.out.println(j);
			}
		}

	}

}
