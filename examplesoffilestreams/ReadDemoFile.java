package examplesoffilestreams;

import java.io.*;

public class ReadDemoFile {

	public static void main(String[] args) {
		
		File file = new File("D:/Jay/newfile.txt");
		
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			bis = new BufferedInputStream(fis);
			
			while(bis.available() > 0) {
				System.out.println((char)bis.read());
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("specified file not found" + fnfe);
		}catch(IOException ioe) {
			System.out.println("I/O Exception : " + ioe);
		}finally {
			
			try {
				 if(bis != null && fis!=null)
	               {
	       	          fis.close();
	                  bis.close();
	               }      
	             }catch(IOException ioe)
	              {
	                  System.out.println("Error in InputStream close(): " + ioe);
			
		}
		}
	}
}
 
	


