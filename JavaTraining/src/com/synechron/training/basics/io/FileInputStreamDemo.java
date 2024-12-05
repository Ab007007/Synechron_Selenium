package com.synechron.training.basics.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.synechron.training.basics.global.GlobalVariables;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(GlobalVariables.fileToRead));
			int num;

			while ((num = fis.read()) != -1) {
				System.out.print((char)num );

			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
