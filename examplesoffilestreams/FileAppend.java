package examplesoffilestreams;

import java.io.*;

public class FileAppend {

	public static void main(String[] args) {
		 FileInputStream fis = null;
		 String content = null;
		 BufferedWriter bw = null;
	
		try {
			content = "\nThis is my content which would be appended at the end of the specified file";
			File file = new File("d:/file1.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file,true);
			
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			System.out.println("Data successfully appended at the end of the file");
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {

			fis = new FileInputStream(new File("d:/file1.txt"));

			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}
		
	}
}	
	


