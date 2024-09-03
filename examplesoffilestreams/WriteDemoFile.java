package examplesoffilestreams;

import java.io.*;

public class WriteDemoFile {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;
		File file;
		String myContent = "We would be using write() method of FileOutputStream to write the content to the specified file";
		
		try {
			file = new File("d:/demofile.txt");
			fos = new FileOutputStream(file);
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			byte[] bytesArray = myContent.getBytes();
			
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(fos != null) {
					fos.close();				}
			}
			catch (IOException e) {
				System.out.println("Error In Closing the File");
			}
		}
		
		try {
		br = new BufferedReader(new FileReader("d:/demofile.txt"));
		String contentLine = br.readLine();
		while(contentLine != null) {
			System.out.println("\n" + contentLine);
			contentLine = br.readLine();
		}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
			if (br != null) {
				br.close();
			}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
