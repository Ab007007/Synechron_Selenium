package com.synechron.training.basics.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import com.synechron.training.basics.conditional.Multiplication;
import com.synechron.training.basics.global.GlobalVariables;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(GlobalVariables.fileToWrite)));
		
		for (int i = 10; i <= 20; i++) {
			System.out.println("started loop");
			bw.write("Generating Table for " + i);
			bw.newLine();
			bw.write("*****************************************");
			bw.newLine();
			bw.write(Multiplication.generateTable(i));
			bw.newLine();
			bw.flush();
			
		}
		
	}
}
