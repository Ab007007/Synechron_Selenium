package com.synechron.training.basics.exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsDemo {
	public static void main(String[] args) {
		File f = new File("data/test.txt");
		try {
			f.createNewFile();	
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception while creating a file");
			System.out.println(e.getMessage());
		}
		
		System.out.println("***************Creating file using custom function**");
		try {
			createFile("newfile.txt");
	
		}catch(IOException ex)
		{
			System.out.println("Please use proper file name");
		}
	}
	public static void createFile(String fileName) throws IOException
	{
		File f = new File("data/" + fileName);
		f.createNewFile();
	}

}
