package stringexamples;

public class NoOfWords {

	public static void main(String[] args) {
		String s1 = "Happy 76th independence day";
		int i=0;
		int count = 0;
		int l = s1.length();
		for (i=0;i<l;i++) {
			char ch = s1.charAt(i);
			if(ch != ' ') {
				count++;
			}
		}	
				System.out.println(count);
	} 
}
