package com.synechron.training.basics.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.synechron.training.basics.global.GlobalVariables;

public class FileOutputStreamDemo {
	
	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		String data = "hello, i'm from java program\n";
		try
		{
			File f = new File(GlobalVariables.fileToWrite);
			if(!f.exists())
			{
				System.out.println("Creating a new File!!!!");
				f.createNewFile();
			}

			fos = new FileOutputStream(f, true);
			fos.write(data.getBytes());
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
