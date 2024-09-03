package practiceprograms;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		String dirName = "d:/test";
		
		File f = new File(dirName,"work.txt");
		File f3 = new File(dirName,"renfile.txt");
		
		System.out.println("File name is : " + f.getName());
		System.out.println("Path of File is : " + f.getPath());
		System.out.println("File name is : " + f.getParent());
		
		System.out.println("List of the cintents of the directory :");
		File f1 = new File(dirName);
		String s1[] = f1.list();
		
		for (int i=0;i<s1.length;i++) {
			
			File f2 = new File("\t" + dirName + "/" + s1[i]);
			if (f2.isDirectory())
				System.out.println("\t"+s1[i]+" is a Directory");
			else
				System.out.println("\t"+s1[i]+" is a File");
		}
		
	  f.renameTo(f3);
	  f.delete();

	}

}
