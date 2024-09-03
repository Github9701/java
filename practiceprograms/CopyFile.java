package practiceprograms;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			
			try {
			
			fis = new FileInputStream(args[0]);
			
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found");
			return;
		}
		
		try {
			
			fos = new FileOutputStream(args[1]);
		} catch (FileNotFoundException e) {
			System.out.println("error opening file");
			return;
		}
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Should give two files");
		return;
	}
		
		try {
			do {
				i = fis.read();
				if(i!= -1)
					fos.write(i);
				}while(i != -1);
			
		} catch (IOException e) {
			System.out.println("file error");
			
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
