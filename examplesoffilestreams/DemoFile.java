package examplesoffilestreams;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		
		try {
		     File file = new File("D:/Jay/newfile.txt");
		     
	         boolean fvar = file.createNewFile();
	         
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }

	}

}
