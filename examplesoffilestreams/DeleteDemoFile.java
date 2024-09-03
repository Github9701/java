package examplesoffilestreams;

import java.io.*;

public class DeleteDemoFile {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("d:/newfile.txt");
			
			if(file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			}else {
				System.out.println("delete failed : file didn't delete");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
