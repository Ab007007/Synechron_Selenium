package com.synechron.training.basics.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import com.synechron.training.basics.global.GlobalVariables;

public class BufferedInputStreamDemo {
	
	
	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new FileReader(new File(GlobalVariables.fileToRead)));
		
		String line = null;
		
		while((line = br.readLine()) !=null)
		{
			System.out.println(line);
		}
	}
	

}
