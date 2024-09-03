package examplesoffilestreams;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileInputStream fis = null;
		String myContent = null;
		File file;
		try {

			myContent = "We are writing the String to the File with the help of FileWriter and BufferedWriter";
			file = new File("d:/file1.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(myContent);

			System.out.println("file was written successfully \n");

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

		try {

			fis = new FileInputStream(new File(myContent));

			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
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
