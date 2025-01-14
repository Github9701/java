package examplesoffilestreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDemoFile {

	public static void main(String[] args) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		try {
			br1 = new BufferedReader(new FileReader("D:/Jay/newfile.txt"));

			System.out.println("Reading the file using readLine() method:");
			String contentLine = br1.readLine();

			while (contentLine != null) {

				System.out.println(contentLine);
				contentLine = br1.readLine();
			}

			br2 = new BufferedReader(new FileReader("D:/Jay/newfile.txt"));

			System.out.println();
			System.out.println("Reading the file using read() method:");

			int num = 0;

			char ch;

			while ((num = br2.read()) != -1) {

				ch = (char) num;
				System.out.print(ch);
			}

		} catch (IOException ioe) {

			ioe.printStackTrace();

		} finally {
			try {
				if (br1 != null)
					br1.close();
				if (br2 != null)
					br2.close();
			} catch (IOException ioe) {
				System.out.println("Error in closing the BufferedReader");
			}
		}

	}

}
