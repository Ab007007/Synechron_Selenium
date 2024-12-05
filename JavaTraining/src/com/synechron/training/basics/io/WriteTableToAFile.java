package com.synechron.training.basics.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.synechron.training.basics.conditional.Multiplication;
import com.synechron.training.basics.global.GlobalVariables;

public class WriteTableToAFile {
	
	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number for which you want to generate the table!!!");
		int num = sc.nextInt();
		String fileName  = "Table_For_"+num+".txt";
		try
		{
			File f = new File("data/" + fileName);
			if(!f.exists())
			{
				System.out.println("Creating a new File : " + f.getAbsolutePath());
				f.createNewFile();
			}

			fos = new FileOutputStream(f, true);
			fos.write(Multiplication.generateTable(num).getBytes());
			System.out.println("writing successful");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos = null;
		}
	}

}
