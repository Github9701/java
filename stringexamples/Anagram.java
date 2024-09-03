package stringexamples;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		  
	    Scanner input = new Scanner(System.in);

	    
	    System.out.print("Enter first String: ");
	    String s1 = input.nextLine();
	    System.out.print("Enter second String: ");
	    String s2 = input.nextLine();

	    
	    if(s1.length() == s2.length()) {

	      
	      char arr1[] = s1.toCharArray();
	      char arr2[] = s2.toCharArray();

	      
	      Arrays.sort(arr1);
	      Arrays.sort(arr2);

	      
	      boolean result = Arrays.equals(arr1, arr2);

	      if(result) {
	        System.out.println(s1 + " and " + s2 + " are anagram");
	      }
	      else {
	        System.out.println(s1 + " and " + s2 + " are not anagram");
	      }
	    }
	    else {
	      System.out.println(s1 + " and " + s2 + " are not anagram.");
	    }

	}

}
