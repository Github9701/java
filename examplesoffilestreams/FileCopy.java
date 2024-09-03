package examplesoffilestreams;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			File f1 = new File("d:/file1.txt");
			File f2 = new File("d:/file2.txt");
			
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(f2);
			
			byte[] b = new byte[1024];
			
			int length;
			
			while ((length = fis.read(b)) > 0) {
				fos.write(b, 0, length);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("File copied successfully");
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			
			fis = new FileInputStream(new File("d:/file2.txt"));

			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
	
