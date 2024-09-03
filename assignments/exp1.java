package assignments;

public class exp1 {

	public static void main(String[] args) {
		// backspace example
		String str1 = "jayaram";
		/*String str2= "";
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println(str2); */
		
		StringBuilder str2 = new StringBuilder(str1);
		String str3 = str2.reverse().toString();
		System.out.println(str3);

	}

}
