package examplesoffilestreams;

import java.io.*;

public class FileRename {

	public static void main(String[] args) {
		
		File oldFile = new File("d:/demofile");
		
		File newFile = new File("d:/newdemofile");
		
		System.out.println(oldFile.getName());
		
		boolean flag = oldFile.renameTo(newFile);
		
		if(!flag) {
			System.out.println("File renamed successfully");
		}else {
			System.out.println("Rename operation failed");
		}
		
		System.out.println(newFile.getName());

	}

}
