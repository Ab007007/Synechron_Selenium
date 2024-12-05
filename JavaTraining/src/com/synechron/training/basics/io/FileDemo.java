package com.synechron.training.basics.io;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File f = new File("c:\\");
		
		System.out.println("Can Read : " + f.canRead());
		System.out.println("Can Execute : " + f.canExecute());
		System.out.println("Can Write : " + f.canWrite());
		
		System.out.println("Absolute Path : " + f.getAbsolutePath());
		
		System.out.println("IS file is a Directory : " + f.isDirectory());
		System.out.println("IS file is a Directory : " + f.isFile());
		
		
		System.out.println("Print all Folder and files Names ");
		String[] folderAndFiles = f.list();
		for(String file:folderAndFiles)
		{
			System.out.println(file);
		}
		
		System.out.println("*******Print all Folder and Files Details********* ");
		File[] details = f.listFiles();
		
		for(File f1:details)
		{
			System.out.println("*****printing file information for " + f1.getName());
			System.out.println("Absolute Path : " + f1.getAbsolutePath());
			
			System.out.println("Can Read : " + f1.canRead());
			System.out.println("Can Execute : " + f1.canExecute());
			System.out.println("Can Write : " + f1.canWrite());
			System.out.println("IS file is a Directory : " + f1.isDirectory());
			System.out.println("IS file is a Directory : " + f1.isFile());
			System.out.println("-------------------------------------------------------");
			
			
		}
		
		
		
	}

}
